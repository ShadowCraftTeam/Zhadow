package io.github.shadowcreative.shadow.component.adapter

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonSerializationContext
import io.github.shadowcreative.shadow.component.JsonCompatibleSerializer
import java.io.File
import java.lang.reflect.Type

class FileAdapter : JsonCompatibleSerializer<File>()
{
    override fun serialize(src: File, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement
    {
        val obj = JsonObject()
        obj.addProperty("filePath", src.path)
        return obj
    }

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): File
    {
        return File((json as JsonObject).get("filePath").asString)
    }
}