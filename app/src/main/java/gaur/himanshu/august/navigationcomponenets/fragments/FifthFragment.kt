package gaur.himanshu.august.navigationcomponenets.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import gaur.himanshu.august.navigationcomponenets.R
import kotlinx.android.synthetic.main.fragment_fifth.view.*

class FifthFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_fifth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.pop_up.setOnClickListener {
            findNavController().navigate(R.id.action_fifthFragment_to_sheetFragment)
        }
    }


}