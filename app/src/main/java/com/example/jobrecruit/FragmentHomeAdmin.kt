package com.example.jobrecruit

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class FragmentHomeAdmin : Fragment(R.layout.fragment_home_admin) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //To change toolbar title manually
//        val toolbarTitle = view.findViewById<Toolbar>(R.id.toolbar2)
//        toolbarTitle.title = "Testing for title change"

        //To replace ContentContainerFragment with other fragment
        val fragmentManager = requireActivity().supportFragmentManager
        val contentFragment = AdminManageJobContent()
        val transaction = fragmentManager.beginTransaction()




        transaction.replace(R.id.content_fragment_container, contentFragment)
        transaction.commit()


    }




}