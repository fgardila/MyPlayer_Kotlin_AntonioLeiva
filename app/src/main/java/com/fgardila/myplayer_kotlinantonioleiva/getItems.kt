package com.fgardila.myplayer_kotlinantonioleiva

import com.fgardila.myplayer_kotlinantonioleiva.MediaItem.Type

fun getItems(): List<MediaItem> = listOf(
    MediaItem("Title 1", "https://placekitten.com/200/200?image=1", Type.PHOTO),
    MediaItem("Title 2", "https://placekitten.com/200/200?image=2", Type.VIDEO),
    MediaItem("Title 3", "https://placekitten.com/200/200?image=3", Type.VIDEO),
    MediaItem("Title 4", "https://placekitten.com/200/200?image=4", Type.PHOTO),
    MediaItem("Title 5", "https://placekitten.com/200/200?image=5", Type.PHOTO),
    MediaItem("Title 6", "https://placekitten.com/200/200?image=6", Type.PHOTO),
)