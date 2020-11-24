package gaur.himanshu.august.navigationcomponenets.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation

import gaur.himanshu.august.navigationcomponenets.R
import gaur.himanshu.august.navigationcomponenets.SendMyData

class FirstFragment : Fragment() {

    lateinit var navController: NavController

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


        val button = view.findViewById<Button>(R.id.send)
        val firstName = view.findViewById<EditText>(R.id.first_name)
        val middleName = view.findViewById<EditText>(R.id.middle_name)
        val lastName = view.findViewById<EditText>(R.id.last_name)

        button.setOnClickListener {
            val firstNameButton = firstName.text.toString()
            val middleNameButton = middleName.text.toString()
            val lastNameButton = lastName.text.toString()
            val sendData = SendMyData(firstNameButton, middleNameButton, lastNameButton)

            val action= FirstFragmentDirections.actionFirstFragmentToSecondFragment()
            action.myData = sendData

            navController.navigate(action)

// Part 2
//            val bundle = bundleOf("data" to sendData)
//            navController.navigate(R.id.action_firstFragment_to_secondFragment, bundle)
        }

    }

}