package com.simsekselim.fragment

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class SecondFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val secondButton : Button = view.findViewById(R.id.secondButton)
        secondButton.setOnClickListener{
            val alert = AlertDialog.Builder(activity)
            alert.setTitle("Fragments")
            alert.setMessage("Second Fragment")
            alert.setPositiveButton("Yes"){dialog, which ->
                Toast.makeText(activity,"Worked",Toast.LENGTH_LONG).show()
            }
            alert.setNegativeButton("No"){dialog, which ->
                Toast.makeText(activity,"Nope",Toast.LENGTH_LONG).show()
            }
            alert.show()

        }
        return view
    }

}