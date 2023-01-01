//package com.example.bilal_calanderview
//
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//
//import java.util.ArrayList
//
//class Calanderadapter(context: Context?, private val arrayList: ArrayList<Calandermodel>, userId: String?) : RecyclerView.Adapter<com.technado.appsnado.karve.Adapters.Calanderadapter.CustomView?>() {
//    var count = 0
//    var con = context
//    var userid = userId
//
//
//
//    private var layoutInflater: LayoutInflater? = null
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):Calanderadapter.CustomView {
//        if (layoutInflater == null) {
//            layoutInflater = LayoutInflater.from(parent.context)
//        }
//        val categoryBinding = DataBindingUtil.inflate<Calanderadapterbind?>(layoutInflater!!, R.layout.recycler_item, parent, false)
//        categoryBinding!!.presentercalander = object : CategoryPresenter {
//            override fun onNavigator() {
//
////                if (CalanderFragment.not_detail != null) {
////                     CalanderFragment.not_detail!!.navigator(userid!!, categoryBinding?.calanderbind?.id,userid!!,"trainer")
////                }
//
//            }
//
//            override fun profile() {
//
//
//            }
//
//            override fun onsubscribe() {
//
//
//            }
//
//            override fun ondelet() {
//
//            }
//
//            override fun onrating() {
//
//            }
//
//        }
//
//
//        return CustomView(categoryBinding)
//    }
//
//
//    fun updateData(viewModels: ArrayList<Calandermodel>?) {
//        arrayList!!.clear()
//        arrayList.addAll(viewModels!!)
//        notifyDataSetChanged()
//    }
//
//    override fun onBindViewHolder(holder: Calanderadapter.CustomView, position: Int) {
//        val categoryViewModel = arrayList!!.get(position)
//        holder.bind(categoryViewModel)
//    }
//
//    override fun getItemCount(): Int {
//        return arrayList!!.size
//    }
//
//
//
//    inner class CustomView(private val categoryBinding: Calanderadapterbind?) : RecyclerView.ViewHolder(categoryBinding!!.getRoot()) {
//        fun bind(categoryViewModel: Calandermodel?) {
//            categoryBinding!!.setCalanderbind(categoryViewModel)
//            categoryBinding.executePendingBindings()
//
//
//        }
//
//        fun getCategoryBinding(): Calanderadapterbind? {
//            return categoryBinding
//        }
//
//        init {
//            ButterKnife.bind(this, categoryBinding!!.getRoot())
//        }
//    }
//
//
//
//}