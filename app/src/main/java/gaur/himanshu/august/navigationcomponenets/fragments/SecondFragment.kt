package gaur.himanshu.august.navigationcomponenets.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

import gaur.himanshu.august.navigationcomponenets.R

class SecondFragment : Fragment() {


    val args: SecondFragmentArgs by navArgs()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val views = inflater.inflate(R.layout.fragment_second, container, false)
        val data = args.myData

        // val data = requireArguments().get("data") as SendMyData
        val text = views.findViewById<TextView>(R.id.text_string)

    //    text.text = "${data!!.firstName}  ${data.middleName}  ${data.lastName}"


        // Inflate the layout for this fragment
        return views
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

}