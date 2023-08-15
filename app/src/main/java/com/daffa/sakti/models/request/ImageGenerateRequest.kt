package com.daffa.sakti.models.request

data class ImageGenerateRequest(
    val n: Int,
    val prompt: String,
    val size: String
)