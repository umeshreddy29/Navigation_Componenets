package gaur.himanshu.august.navigationcomponenets.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import gaur.himanshu.august.navigationcomponenets.R

class MainActivity : AppCompatActivity() {


    lateinit var navController: NavController
    lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    navController= findNavController(R.id.container_fragment)
    bottomNavigationView= findViewById(R.id.bottom_navigation_view)

        bottomNavigationView.setupWithNavController(navController)



    }




}