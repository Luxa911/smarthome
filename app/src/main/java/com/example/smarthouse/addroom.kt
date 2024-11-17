package com.example.smarthouse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.storage.storage
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class addroom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addroom)
    val roomTypesRecView : RecyclerView = findViewById(R.id.roomTypeadd)
        val addRoomButton : Button = findViewById(R.id.addRoomb)
val supabase = createSupabaseClient(
    supabaseUrl = "https://xsbncskzfmtkbdvereuu.supabase.co",
    supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InhzYm5jc2t6Zm10a2JkdmVyZXV1Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3MzEwNTgwOTIsImV4cCI6MjA0NjYzNDA5Mn0.1z-Fe4aZYhrIIbiOwC5Wd3etlSiVBqLDf7klCvsw_xM"
){
install(Postgrest)
}
        suspend fun getPublicImageUrl(path:String) : String? {
            val storage = supabase.storage.from("RoomsImage")
        }

        roomTypesRecView.layoutManager = GridLayoutManager(this,3 )
        val roomTypesAdapter = RoomTypesAdapter {
            selectedRoomType ->

        }





    }
}