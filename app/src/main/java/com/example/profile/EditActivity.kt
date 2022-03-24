package com.example.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class EditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)
    }

//    Inflamos el menu de la palomita que estara en el editActivy
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_edit, menu)
        return super.onCreateOptionsMenu(menu)
    }

//    si el item seleccionado es el que creamos entonces finish() esto matara la actividad en la
//    que estmos, mas adelante se llenaran aqui los datos o se editaran y se enviaran a la actividad
//    principal
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_save){
            finish()
        }
        return super.onContextItemSelected(item)
    }
}