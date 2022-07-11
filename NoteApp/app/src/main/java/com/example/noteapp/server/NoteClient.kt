package com.example.noteapp.server

import com.example.noteapp.model.Image
import com.example.noteapp.model.Note
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.*

interface NoteClient {
    @GET("/note")
    fun getAllNote(): Call<List<Note>>

    @Multipart
    @POST("/upload")
    fun uploadImage(@Part image:MultipartBody.Part):Call<Image>
}