package com.example.routes

import com.example.models.ApiResponse
import com.example.repository.CharacterRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject
import java.lang.IllegalArgumentException


fun Route.getAllCharacters(){

    val characterRepository:CharacterRepository by inject()
    get("/breakingbad/characters"){
        try{
            val page = call.request.queryParameters["page"]?.toInt()?:1

            require(page in 1..5)

            val apiResponse = characterRepository.getAllCharacter(page = page)
            call.respond(
                message  = apiResponse,
                status =  HttpStatusCode.OK
            )

        }
        catch (e:NumberFormatException) {
            call.respond(
                message = ApiResponse(success = false, message = "only numbers allowed."),
                status = HttpStatusCode.BadRequest
            )

        }catch (e:IllegalArgumentException){
            call.respond(
                message = ApiResponse(success = false, message = "character not found"),
                status = HttpStatusCode.NotFound
            )
        }

    }
}