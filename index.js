const express = require('express');
const app = express();
const http = require('http');
const socket = require("socket.io");
const mongoClient = require('mongodb').MongoClient;
const url = 'mongodb://localhost:27017';
app.use(express.json());
const server = app.listen(3000, () => {
    console.log("Listening on port 3000....");
});
const io = socket(server);

var count=0;
var roomOne="room";
var playerList =[];

io.on('connection', (socket) => {
    console.log('a user connected'+socket.id);

    socket.on('disconnect', () => {
        console.log('user disconnected');
    });

    

    socket.on('join',(userId)=>{
        console.log(roomOne);
        playerList.push(userId);
        socket.join(roomOne);
        io.sockets.in(roomOne).emit('player join');
        socket.once('ready',(userId)=>{
            count++;
            console.log("count:", count);
            if(count >= 2){
                console.log("game start");
                count=0;
                console.log(playerList[0],playerList[1]);
                io.sockets.in(roomOne).emit('start',playerList[0],playerList[1]);

            }
        })
    });

    socket.on('moving',(num1,num2,num2_kind,userId)=>{
        console.log('moving');
        console.log(num1,num2,num2_kind,userId);
        io.emit('changedCanvas',num1,num2,num2_kind,userId);
    });

    socket.on('blue',(num1,userId)=>{
    console.log('bluemove');
    console.log(num1,userId);
        io.emit('changedBlue',num1,userId);
    });

    socket.on('gameSet',(name,score)=>{
        console.log(score);
        console.log('winner');
        io.emit('winner',name);
    });

});

mongoClient.connect(url, (err, db) => {

    if (err) {
        console.log("Error while connecting mongo client")
    } else {
        console.log("Connected to mongo client");
        const myDb = db.db('myDb')
        const collection = myDb.collection('Users')

        app.post('/login', (req, res) => {
            console.log("Logging in");

            const newUser = {
                id: req.body.name
            }

            const query = { id: newUser.name }

            collection.findOne(query, (err, result) => {
                if (result == null) {
                    collection.insertOne(newUser, (err, result) => {
                        res.status(200).send()
                    })
                } else {
                    res.status(400).send()
                }
            })
            /*collection.insertOne(query, (err, result) => {
                res.status(200).send()
                console.log("send 200");
            })
            console.log("muyaho");*/
        })

        /*app.post('/direction', (req, res) => {
            const query = {
                direction: req.body.direction
            }

            collection.insertOne(query, (err, result) => {
                res.status(200).send()
            })
            console.log("muyaho");
        })*/
    }

})