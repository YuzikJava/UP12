package nmedia.repository

import androidx.lifecycle.LiveData
import nmedia.dto.Post

interface PostRepository {
    fun getAll(): LiveData<List<Post>>
    fun likeById(id: Long)
    fun save(post: Post)
    fun removeById(id: Long): Any
    fun shar(id: Long)
}