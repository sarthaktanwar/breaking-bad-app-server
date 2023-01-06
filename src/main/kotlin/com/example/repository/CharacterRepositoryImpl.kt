package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Characters

const val NEXT_PAGE_KEY = "nextPage"
const val PREVIOUS_PAGE_KEY = "prevPage"

class CharacterRepositoryImpl : CharacterRepository {


    override val charactersMap: Map<Int, List<Characters>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5
        )
    }
//    val id:Int,
//    val name:String,
//    val image:String,
//    val designation:String,
//    val tags : List<String>,
//    val about:String,
//    val rating:Double,
//    val power:Int,
    //val famousDialogue:String,
//    val intelligence:Int,
//    val abilities:List<String>,
//    val kills:Int

    override val page1 = listOf(
        Characters(
            id = 1,
            name = "walter white",
            image = "/images/walter_white.jpg",
            about = "Walter was a skilled chemist and co-founder of a technology firm before he accepted a buy-out from his partners. Walt became a high-school chemistry teacher in Albuquerque, and barely making ends meet with his family with wife Skyler  and son Walt Jr. . At the start of the series, the day after his 50th birthday, Walt is diagnosed with Stage III lung cancer. After this discovery, Walt resorts to manufacturing and selling methamphetamine with a former student, Jesse Pinkman , to ensure his family's financial security after his death. Due to his chemistry training and production route, Walt's \"blue meth\" is purer than any other on the market, and he is pulled deeper into the illicit drug trade.",
            rating = 9.5,
            power = 87,
            kills =  29,
            famousDialogue = "Say My Name",
            designation = "meth kingpin",
            intelligence = 90,
            tags = listOf(
                "drug-lord",
                "Heisenberg",
                "blue meth",
                "Ruthless",

            ),
            abilities = listOf(
                "cunning",
                "chemistry",
                "intelligence"
            )

        ),
        Characters(
            id = 2,
            name = "Jesse Pinkman",
            image = "/images/jesse_pinkman.jpg",
            about = " Jesse Bruce Pinkman, also known by his clandestine pseudonym and business moniker Cap'n Cook, is a former chemist, manufacturer, and distributor who worked in Albuquerque, New Mexico, currently residing in Haines, Alaska. Originally a low-level methamphetamine dealer who worked with his friend and fellow meth cook Emilio Koyama, Jesse is best known as the former business and meth cook partner of his former chemistry teacher Walter White",
            rating = 9.2,
            power =  69,
            kills = 9,
            famousDialogue = "Say My Name",
            designation = "Meth Kingpin(Junior Partner)",
            intelligence = 55,
            tags = listOf(
                "crystal meth cook",
                "dealer",
                "sympathetic",

                ),
            abilities = listOf(
                "Innovative",
                "Can take good beating",


            )
        ),
        Characters(
            id = 3,
            name = "Skyler white",
            image = "/images/skyler_white.jpg",
            about = "Skyler  White  is the wife of Walter White and the sister of Marie Schrader. She and Walter have a teenage son, Walter White Jr. She has had several meager sources of income: writing short stories, selling items on eBay, working as a bookkeeper, and ultimately helping her husband launder money. Skyler cares for Walter very much, but their marriage becomes increasingly strained due to his unexplained absences and bizarre behavior, ultimately leading to their separation.",
            rating = 4.0,
            power = 25,
            kills = 0,
            famousDialogue = "When I Put Everything Into Quicken, Nothing Flashed Red, So That's Gotta Mean It's Ok, Right?",
            designation = "Walter White wife",
            intelligence = 25,
            tags = listOf(
                "annoying",
                "bookkeeper",
                "eBay",
                ),
            abilities = listOf(
                "cunning",
                "chemistry",
                "intelligence"

            )

        )
    )

    override val page2 = listOf(
        Characters(
            id = 4,
            name = "Gustavo Fring",
            image = "/images/gustavo_fring.jpg",
            about = "Gustavo  Fring, also referred to as the Chicken Man and the Chilean, is a Chilean-American restaurant entrepreneur and major narcotics distributor who primarily worked in Albuquerque, New Mexico. Originally collaborating with the Mexican drug cartel to distribute cartel cocaine, Gus eliminated his dependence on the cartel and began distributing methamphetamine himself, and eventually became the kingpin of his solo drug empire, which was the most successful drug operation in United States history until his former employee Walter White surpassed it with his own drug empire.",
            rating = 8.4,
            power = 93,
            kills = 13,
            famousDialogue = "A dog who bites every owner he's had can only be disciplined with a firm hand ",
            designation = "drug lord",
            intelligence = 92,
            tags = listOf(
                "drug-lord",
                "Chicken Man",
                " Los Pollos Hermanos",
                "meth distributor",

                ),
            abilities = listOf(
                "cold-blooded",
                "soft-spoken businessman",
                "intelligence"

            )

        ),
        Characters(
            id = 5,
            name = "Hector Salamanca",
            image = "/images/Hector_Salamanca.jpg",
            about = "Hector Salamanca, also known as Don Hector and referred to as Tío by his nephews, is the elderly don of the Cartel, and an associate of cartel boss Don Eladio Vuente and don Juan Bolsa. A member of the Salamanca family, Hector is the son of Abuelita, the uncle of twins Marco and Leonel, Lalo, and Tuco, and is the grandfather of Joaquin. He raised Tuco as a son, and taught him and his other nephews that family is everything, living by the creed himself. He is the second Salamanca family member to run their drug operation, following his nephew Tuco and was succeeded by his nephew Lalo. Though brutal, Hector is very loyal to his family and the cartel.",
            rating = 8.0,
            power = 1,
            kills = 2,
            famousDialogue = "Don Eladio, look into Fring's eyes. There you will see the truth. The Chicken Man hates you. He is our enemy. He plots against us. I demand blood for blood. - Found at: https://www.thyquotes.com/hector-salamanca/",
            designation = "meth kingpin",
            intelligence = 67,
            tags = listOf(
                "Ting ting",
                "DrugLord",
                "Disabled"

                ),
            abilities = listOf(
                "skilled strategist",
                "Not a rat",
                "planner"

            )
        ),
        Characters(
            id = 6,
            name = "walter white Jr",
            image = "/images/walter_white.jpg",
            about = "Walter White Jr. is a complex and multifaceted character who struggles with a number of personal challenges, including cerebral palsy and drug addiction. Despite these challenges, he is a loyal and loving son who is deeply affected by the events of the series, and is forced to grow up and become more independent as a result of his father's criminal activities.",
            rating = 5.0,
            power = 11,
            kills = 0,
            famousDialogue = "I don't care about your pride. You're my father, I'm your son. I need you.",
            designation = "Walter White Son",
            intelligence = 47,
            tags = listOf(
                "Flynn",
                "Son",
                "High school Student",
                "CerebralPalsy",

                ),
            abilities = listOf(
                "Persistence",
                "Loyalty",
                "Empathy"

            )
        )
    )
    override val page3 = listOf(

        Characters(
            id = 7,
            name = "Saul Goodman",
            image = "/images/Saul_Goodman.jpeg",
            about = "Saul Goodman is a criminal lawyer who represents many of the characters involved in the methamphetamine trade in Albuquerque, New Mexico. Despite his shady reputation and questionable ethics, Saul is a clever and resourceful character who is able to navigate the dangerous world of the drug trade with a combination of wit, cunning, and legal expertise.",
            rating = 9.3,
            power = 82,
            kills = 0,
            famousDialogue = "You know how I feel about criminal lawyers, Jimmy? They're like vampires. They only come out at night, and they only come out when there's blood in the water.",
            designation = "Criminal lawyer",
            intelligence = 92,
            tags = listOf(
               "Criminal lawyer",
                "Unpredictable",
                "resourceful"

                ),
            abilities = listOf(
                "Legal expertise",
                "Persuasion",
                "Adaptability",
                "Resourcefulness"

            )

        ),
        Characters(
            id = 8,
            name = "Tuco Salamanca",
            image = "/images/tuco_salamanca.jpg",
            about = "Tuco Salamanca is a member of the Salamanca family, a powerful and influential Mexican drug cartel, and is portrayed by actor Raymond Cruz.Tuco is the leader of a methamphetamine distribution operation, and is known for his volatile and aggressive behavior. He is a member of the Salamanca family, a powerful and influential criminal organization in Mexico, and is the nephew of Hector Salamanca, another prominent character in the series." ,
            rating = 6.5,
            power = 80,
            kills = 32,
            famousDialogue = "blue yellow pink whatever man just keep bringing me that",
            designation = "leader of a methamphetamine distribution operation",
            intelligence = 50,
            tags = listOf(
                "Salamanca family",
                "loyalty",
                "family obligations"
                ),
            abilities = listOf(
                "ruthless",
                "Physical strength",
                "Intimidation"
            )

        ),

        Characters(
            id = 9,
            name = "walter white",
            image = "/images/walter_white.jpg",
            about = "Walter was a skilled chemist and co-founder of a technology firm before he accepted a buy-out from his partners. Walt became a high-school chemistry teacher in Albuquerque, and barely making ends meet with his family with wife Skyler (Anna Gunn) and son Walt Jr. (RJ Mitte). At the start of the series, the day after his 50th birthday, Walt is diagnosed with Stage III lung cancer. After this discovery, Walt resorts to manufacturing and selling methamphetamine with a former student, Jesse Pinkman (Aaron Paul), to ensure his family's financial security after his death. Due to his chemistry training and production route, Walt's \"blue meth\" is purer than any other on the market, and he is pulled deeper into the illicit drug trade.",
            rating = 9.0,
            power = 50,
            kills = 300,
            famousDialogue = "Say My Name",
            designation = "meth kingpin",
            intelligence = 95,
            tags = listOf(
                "drug-lord",
                "Heisenberg",
                "blue meth",
                "99.1 purity of meth",

                ),
            abilities = listOf(
                "cunning",
                "chemistry",
                "intelligence"

            )
        )
    )
    override val page4 = listOf(
        Characters(
            id = 10,
            name = "Don Eladio Vuente",
            image = "/images/don_eladio.jpg",
            about = "Don Eladio is the leader of the Juárez Cartel, a powerful and influential criminal organization based in Mexico, and is a major antagonist in the series.He is a wealthy and influential figure who is feared and respected by his associates, and is involved in a range of illegal activities including drug trafficking, extortion, and murder.",
            rating = 8.2,
            power = 89,
            kills =180,
            famousDialogue = "He who controls the blue, controls the world.",
            designation = "leader of the Juárez Cartel",
            intelligence = 79,
            tags = listOf(
                "Juárez Cartel",
                "wealthy"
                ),
            abilities = listOf(
                "Leadership",
                "Wealth and resources",
                "charm"

            )
        ),
        Characters(
            id = 11,
            name = "Mike ehrmantruat",
            image = "/images/walter_white.jpg",
            about = "",
            rating = 9.0,
            power = 50,
            kills = 300,
            famousDialogue = "Say My Name",
            designation = "meth kingpin",
            intelligence = 95,
            tags = listOf(
                "drug-lord",
                "Heisenberg",
                "blue meth",
                "99.1 purity of meth",

                ),
            abilities = listOf(
                "cunning",
                "chemistry",
                "intelligence"

            )
        ),
        Characters(
            id = 12,
            name = "walter white",
            image = "/images/walter_white.jpg",
            about = "Walter was a skilled chemist and co-founder of a technology firm before he accepted a buy-out from his partners. Walt became a high-school chemistry teacher in Albuquerque, and barely making ends meet with his family with wife Skyler (Anna Gunn) and son Walt Jr. (RJ Mitte). At the start of the series, the day after his 50th birthday, Walt is diagnosed with Stage III lung cancer. After this discovery, Walt resorts to manufacturing and selling methamphetamine with a former student, Jesse Pinkman (Aaron Paul), to ensure his family's financial security after his death. Due to his chemistry training and production route, Walt's \"blue meth\" is purer than any other on the market, and he is pulled deeper into the illicit drug trade.",
            rating = 9.0,
            power = 50,
            kills = 300,
            famousDialogue = "Say My Name",
            designation = "meth kingpin",
            intelligence = 95,
            tags = listOf(
                "drug-lord",
                "Heisenberg",
                "blue meth",
                "99.1 purity of meth",

                ),
            abilities = listOf(
                "cunning",
                "chemistry",
                "intelligence"

            )
        )
    )
    override val page5 = listOf(
        Characters(
            id = 13,
            name = "walter white",
            image = "/images/walter_white.jpg",
            about = "Walter was a skilled chemist and co-founder of a technology firm before he accepted a buy-out from his partners. Walt became a high-school chemistry teacher in Albuquerque, and barely making ends meet with his family with wife Skyler (Anna Gunn) and son Walt Jr. (RJ Mitte). At the start of the series, the day after his 50th birthday, Walt is diagnosed with Stage III lung cancer. After this discovery, Walt resorts to manufacturing and selling methamphetamine with a former student, Jesse Pinkman (Aaron Paul), to ensure his family's financial security after his death. Due to his chemistry training and production route, Walt's \"blue meth\" is purer than any other on the market, and he is pulled deeper into the illicit drug trade.",
            rating = 9.0,
            power = 50,
            kills = 300,
            famousDialogue = "Say My Name",
            designation = "meth kingpin",
            intelligence = 95,
            tags = listOf(
                "drug-lord",
                "Heisenberg",
                "blue meth",
                "99.1 purity of meth",

                ),
            abilities = listOf(
                "cunning",
                "chemistry",
                "intelligence"

            )

        ),
        Characters(
            id = 14,
            name = "walter white",
            image = "/images/walter_white.jpg",
            about = "Walter was a skilled chemist and co-founder of a technology firm before he accepted a buy-out from his partners. Walt became a high-school chemistry teacher in Albuquerque, and barely making ends meet with his family with wife Skyler (Anna Gunn) and son Walt Jr. (RJ Mitte). At the start of the series, the day after his 50th birthday, Walt is diagnosed with Stage III lung cancer. After this discovery, Walt resorts to manufacturing and selling methamphetamine with a former student, Jesse Pinkman (Aaron Paul), to ensure his family's financial security after his death. Due to his chemistry training and production route, Walt's \"blue meth\" is purer than any other on the market, and he is pulled deeper into the illicit drug trade.",
            rating = 9.0,
            power = 50,
            kills = 300,
            famousDialogue = "Say My Name",
            designation = "meth kingpin",
            intelligence = 95,
            tags = listOf(
                "drug-lord",
                "Heisenberg",
                "blue meth",
                "99.1 purity of meth",

                ),
            abilities = listOf(
                "cunning",
                "chemistry",
                "intelligence"

            )
        ),
        Characters(
            id = 15,
            name = "walter white",
            image = "/images/walter_white.jpg",
            about = "Walter was a skilled chemist and co-founder of a technology firm before he accepted a buy-out from his partners. Walt became a high-school chemistry teacher in Albuquerque, and barely making ends meet with his family with wife Skyler (Anna Gunn) and son Walt Jr. (RJ Mitte). At the start of the series, the day after his 50th birthday, Walt is diagnosed with Stage III lung cancer. After this discovery, Walt resorts to manufacturing and selling methamphetamine with a former student, Jesse Pinkman (Aaron Paul), to ensure his family's financial security after his death. Due to his chemistry training and production route, Walt's \"blue meth\" is purer than any other on the market, and he is pulled deeper into the illicit drug trade.",
            rating = 9.0,
            power = 50,
            kills = 300,
            famousDialogue = "Say My Name",
            designation = "meth kingpin",
            intelligence = 95,
            tags = listOf(
                "drug-lord",
                "Heisenberg",
                "blue meth",
                "99.1 purity of meth",

                ),
            abilities = listOf(
                "cunning",
                "chemistry",
                "intelligence"

            )
        )
    )

    override suspend fun getAllCharacter(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page = page)[PREVIOUS_PAGE_KEY],
            nextPage = calculatePage(page = page)[NEXT_PAGE_KEY],
            characters = charactersMap[page]!!

        )

    }
    private fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage: Int? = page
        var nextPage: Int? = page
        if (page in 1..4) {
            nextPage = nextPage?.plus(1)
        }
        if (page in 2..5) {
            prevPage = prevPage?.minus(1)
        }
        if (page == 1) {
            prevPage = null
        }
        if (page == 5) {
            nextPage = null
        }
        return mapOf(PREVIOUS_PAGE_KEY to prevPage, NEXT_PAGE_KEY to nextPage)
    }

    override suspend fun searchCharacters(name: String? ): ApiResponse {
        return ApiResponse(
            success = true,
             message = "oK",
            characters =findCharacters(query = name)

        )


    }
    private fun findCharacters(query: String?): List<Characters> {
        val founded = mutableListOf<Characters>()
        return if (!query.isNullOrEmpty()) {
            charactersMap.forEach { (_, heroes) ->
                heroes.forEach { hero ->
                    if (hero.name.lowercase().contains(query.lowercase())) {
                        founded.add(hero)
                    }
                }
            }
            founded
        } else {
            emptyList()
        }
    }


}


