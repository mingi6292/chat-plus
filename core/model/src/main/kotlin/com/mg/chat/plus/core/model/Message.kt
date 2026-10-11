package com.mg.chat.plus.core.model

data class Message(
    val id: Long,
    val channelId: Long,
    val text: String,
    val createdAt: Long,
    val type: MessageType,
    val previousId: Long?,
)

enum class MessageType { TEXT, LONG_TEXT, LINK, IMAGE }