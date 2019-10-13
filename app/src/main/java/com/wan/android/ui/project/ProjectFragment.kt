package com.wan.android.ui.project

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.wan.android.R

/**
 * @author wangzhichao
 * @date 2019/10/13
 */
class ProjectFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.project_fragment, container, false)
        val controller = findNavController()
        Log.d("wzc", " project, controller=$controller")
        return view
    }
}