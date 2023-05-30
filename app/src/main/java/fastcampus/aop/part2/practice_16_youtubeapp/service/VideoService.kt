package fastcampus.aop.part2.practice_16_youtubeapp.service

import fastcampus.aop.part2.practice_16_youtubeapp.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {
    @GET("v3/a6a7c8ac-0b8f-4b6a-8f42-9da2173b1ccf")
    fun listVideos(): Call<VideoDto>
}