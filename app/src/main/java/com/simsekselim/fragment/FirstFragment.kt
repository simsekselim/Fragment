package com.simsekselim.fragment


import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast




class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val alertButton : Button = view.findViewById(R.id.alertButton)
        alertButton.setOnClickListener{

            val alert = AlertDialog.Builder(activity)
            alert.setMessage("Fragments")
            alert.setTitle("First Fragment")
            alert.setPositiveButton("Yes"){dialog, which ->
                Toast.makeText(activity, "Worked", Toast.LENGTH_SHORT).show()
            }
            alert.setNegativeButton("No"){dialog, which ->
                Toast.makeText(activity,"Nope",Toast.LENGTH_LONG).show()
            }
            alert.show()

        }
        return view




        }







        /*


            val alert = AlertDialog.Builder(activity)
            alert.setMessage("Try")
            alert.setTitle("Fragment")
            alert.setPositiveButton("Yes"){dialog, which ->
                Toast.makeText(activity, "Worked", Toast.LENGTH_SHORT).show()
            }
            alert.setNegativeButton("No"){dialog, which ->
                //Nothing
            }
            alert.show()



         */


    }





        /*fun alert(view: View){
        val alert = AlertDialog.Builder(activity)
        alert.setMessage("Try")
        alert.setTitle("Fragment")
        alert.setPositiveButton("Yes"){dialog, which ->
            Toast.makeText(activity, "Worked", Toast.LENGTH_SHORT).show()
        }
        alert.setNegativeButton("No"){dialog, which ->
            //Nothing
        }
        alert.show()

         */












