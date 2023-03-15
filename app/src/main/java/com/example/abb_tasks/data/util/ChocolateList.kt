package com.example.abb_tasks.data.util

import com.example.abb_tasks.data.model.ChocolateModel

object ChocolateList {
    val list = mutableListOf(
        ChocolateModel(
            image = "bittersweet_chocolate",
            imagePng = "bitter_chocolate_png",
            type = "Bitter Chocolate",
            price = 22,
            description = "Bittersweet chocolate must contain at least 35 percent cocoa according to the FDA, but most bittersweet bars contain 50 percent, with others having as much as 80 percent cocoa."
        ),
        ChocolateModel(
            image = "dark_chocolate",
            imagePng = "dark_chocolate_png",
            type = "Dark Chocolate",
            price = 34,
            description = "Dark chocolate contains chocolate liquor, sugar, and cocoa butter. It also commonly includes lecithin as an emulsifier and vanilla for flavor. Dark chocolate does not contain any milk solids."
        ),
        ChocolateModel(
            image = "german_chocolate",
            imagePng = "german_chocolate_png",
            type = "German Chocolate",
            price = 27,
            description = "Sweet German chocolate is a dark baking chocolate created by a man named Samuel German, who gave it it’s name. He created this chocolate to be convenient for bakers and added sugar directly to it."
        ),
        ChocolateModel(
            image = "milk_chocolate_image",
            imagePng = "milk_chocolate_png",
            type = "Milk Chocolate",
            price = 16,
            description = "Milk chocolate is perhaps the most popular type of chocolate. It actually contains only ten to 40 percent cacao mixed with sugar and milk (either condensed milk or milk solids)."
        ),
        ChocolateModel(
            image = "white_chocolate",
            imagePng = "white_chocolate_png",
            type = "White Chocolate",
            price = 14,
            description = "White chocolate does not contain chocolate liquor or any other cocoa products besides cocoa butter.  White chocolate contains a minimum 20 percent cocoa butter, a maximum of 55 percent sugar, and about 15 percent milk solids."
        )
    )
}