package com.example.dz7_3

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide

import com.example.dz7_3.databinding.FragmentMainBinding

class MainFragment :Fragment(),OnClick {

   private var data = ArrayList<Image>()
    private lateinit var binding: FragmentMainBinding
private lateinit var adapter: ImageAdapter
companion object{
    const val KFN:String="KEY_FOR_NAME"
    const val KFL:String="KEY_FOR_LIFE"
    const val KFP:String="KEY_FOR_PICTURE"
}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentMainBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)


        }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Data()
        adapter = ImageAdapter(data, this)
binding.rvMain.adapter = adapter
    }



    private fun Data(){
        data = ArrayList()
        data.apply {
            add(Image("Rick Sanchez" ,"Alive",  "https://static.wikia.nocookie.net/rickandmorty/images/a/a6/Rick_Sanchez.png/revision/latest?cb=20160923150728"))
            add(Image("Morty Smith" ,"Alive", "https://static.wikia.nocookie.net/rickandmorty/images/1/17/Mechanical_Morty.png/revision/latest?cb=20170731155031"))
            add(Image("Albert Einstein" ,"Dead", "https://static.wikia.nocookie.net/rickandmorty/images/b/bc/Albert_Einstein.png/revision/latest?cb=20150730213810"))
            add(Image("Jerry Smith" ,"Alive", "https://static.wikia.nocookie.net/rickandmorty/images/f/f1/Jerry_Smith.png/revision/latest?cb=20160923151111"))
        }

    }

    override fun onClick(model: Image) {

        val bundle =Bundle()
        bundle.putString(KFN,model.name)
        bundle.putString(KFL,model.text)
        bundle.putString(KFP,model.image)
        var secondFragment=SecondFragment()
        secondFragment.arguments=bundle

        findNavController().navigate(R.id.secondFragment,bundle)
    }

}