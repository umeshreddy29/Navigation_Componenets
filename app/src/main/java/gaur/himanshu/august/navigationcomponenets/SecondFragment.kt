package gaur.himanshu.august.navigationcomponenets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class SecondFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
val views=inflater.inflate(R.layout.fragment_second, container, false)
        val data = requireArguments().get("data")
        val text = views.findViewById<TextView>(R.id.text_string)
        text.text = data.toString()
        // Inflate the layout for this fragment
        return views
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

}