package com.ieee.events.ui.BookEvent

import android.app.AlertDialog
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.ieee.events.R
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.ieee.events.data.Models.Particepent
import com.ieee.events.databinding.FragmentBookEventBinding
import com.ieee.events.ui.BookEvent.adapter.ParticipantAdapter


class BookEventFragment : Fragment() {

    var n:String = ""
    var e:String=""
    var p:String=""

    private var _binding:FragmentBookEventBinding? = null
    private val  binding get() = _binding!!
    private lateinit var particeList : ArrayList<Particepent>
    private lateinit var parAdapter: ParticipantAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBookEventBinding.inflate(layoutInflater, container, false)
        particeList = ArrayList()
        parAdapter = ParticipantAdapter(particeList)
        binding.particepentRv.layoutManager = LinearLayoutManager(requireContext())
        binding.particepentRv.adapter = parAdapter

        binding.addpart.setOnClickListener {
            addpart()
        }
        binding.confirm.setOnClickListener {
            confirmDialoge()
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
    private fun addpart(){
        val inflater = LayoutInflater.from(requireContext())
        val v = inflater.inflate(R.layout.add_participant_layout,null)

        val builder = Dialog(requireContext())
        builder.setContentView(v)
        builder.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        builder.show()
        val name = v.findViewById<EditText>(R.id.add_name)
        val email = v.findViewById<EditText>(R.id.add_email)
        val phone = v.findViewById<EditText>(R.id.add_phone)
        val addbtn = v.findViewById<Button>(R.id.add_btn)
        val cancelbtn = v.findViewById<Button>(R.id.cancel_button)

        addbtn.setOnClickListener{

            n = name.text.toString()
            e = email.text.toString()
             p = phone.text.toString()
            if (n.isEmpty()) {
                name.setError("enter name")
            }else if (e.isEmpty()){
                email.setError("enter email")
            }else if (p.isEmpty()){
                phone.setError("enter phone number")
            }else{
                particeList.add(Particepent(name = n , email = e , phoneNumber = p))
                parAdapter.notifyDataSetChanged()
            }


            builder.dismiss()
        }
        cancelbtn.setOnClickListener{

            builder.dismiss()
        }

    }
    private fun confirmDialoge(){
        val inflater = LayoutInflater.from(requireContext())
        val v = inflater.inflate(R.layout.get_ticket_dialog_layout,null)
        val builder = Dialog(requireContext())
       builder.setContentView(v)
        //builder.setCancelable(true)
        builder.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        builder.show()
        val goHome = v.findViewById<Button>(R.id.go_home_btn)
        val getTicket =v.findViewById<Button>(R.id.view_ticket_btn)
        goHome.setOnClickListener {
            // use nav to go to home fragment
            builder.dismiss()
        }
        getTicket.setOnClickListener {
            // use nave ti go to ticket fragment
            builder.dismiss()
        }



    }

}