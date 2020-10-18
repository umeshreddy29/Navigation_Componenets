package gaur.himanshu.august.navigationcomponenets

import android.content.ContentValues.TAG
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation

class FirstFragment : Fragment() {

    lateinit var navController:NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        navController = Navigation.findNavController(view)


        val button=view.findViewById<Button>(R.id.send)
        val editText=view.findViewById<EditText>(R.id.edit_text)



        button.setOnClickListener {
            val bundle= bundleOf("data" to editText.text.toString())
            navController.navigate(R.id.action_firstFragment_to_secondFragment,bundle)
        }

    }

}