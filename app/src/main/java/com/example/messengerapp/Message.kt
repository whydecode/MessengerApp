package com.example.messengerapp

class Message {

    var message: String? = null
    var senderId: String? = null

    constructor()
    constructor(message: String?, senderId: String?){
        this.senderId = senderId
        this.message = message
    }
}