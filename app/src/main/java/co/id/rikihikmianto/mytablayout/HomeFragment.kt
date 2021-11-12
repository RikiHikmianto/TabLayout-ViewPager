package co.id.rikihikmianto.mytablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import co.id.rikihikmianto.mytablayout.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    companion object {
        private const val ARG_SECTION_NUMBER = "section_number"

        fun newInstance(index: Int) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, index)
                }
            }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvLabel: TextView = binding.sectionLabel
        val index = arguments?.getInt(ARG_SECTION_NUMBER, 0)

        tvLabel.text = getString(R.string.content_tab_text, index)
    }
}