package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class NameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
            val rootView = inflater.inflate(R.layout.fragment_name, container, false)
            val displayTextView = rootView.findViewById<TextView>(R.id.displayTextView)
            val nameEditText = rootView.findViewById<EditText>(R.id.nameEditText)
            val changeButton = rootView.findViewById<Button>(R.id.changeButton)

                changeButton.setOnClickListener {
                    val name = nameEditText.text

                    displayTextView.text = if (name.isNotBlank()) {
                        "Hello, $name!"
                    } else {
                        "Please enter your name"
                    }
                }
        return rootView

    }
}