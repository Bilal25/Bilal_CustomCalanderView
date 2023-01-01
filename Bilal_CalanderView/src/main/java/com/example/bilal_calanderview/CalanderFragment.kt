//package com.example.bilal_calanderview
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.fragment.app.Fragment
//import androidx.lifecycle.Observer
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import java.text.ParseException
//import java.text.SimpleDateFormat
//import java.util.*
//
//
//class CalanderFragment  : Fragment(){
//    var recyclerView: RecyclerView? = null
//    var categoryadapter: Calanderadapter? = null
//
//
//   // var calendarView: CalendarView? = null
//
//
//    private val dates: ArrayList<Date>? = null
//    private val date: Date = Date()
//    var cal: Calendar = Calendar.getInstance()
//     var userId: String? = null
//     var mView: CalendarCustomView? = null
//
//    companion object {
//        @kotlin.jvm.JvmField
//        var not_detail: CalanderFragment? = null
//
//        @kotlin.jvm.JvmField
//        var setmonth: Boolean = false
//
//        fun newInstance() = CalanderFragment()
//    }
//
//
//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        val view = inflater.inflate(R.layout.calanderfragment_fragment, container, false)
//        recyclerView = view.findViewById<View?>(R.id.recycler) as RecyclerView
//        //calendarView = view.findViewById<View?>(R.id.calendarView) as CalendarView
//        //textViewnext
//        mView = view.findViewById(R.id.custom_calendar) as CalendarCustomView
//        val formatterdate = SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)
//        val dates = formatterdate.format(cal.time)
//        initializeCalendar()
//
//
//
////        calendarView?.pager?.setBackgroundColor(resources.getColor(R.color.text_c))
////
////
////        calendarView!!.setOnDayClickListener(object : OnDayClickListener {
////            override fun onDayClick(eventDay: EventDay) {
////                var month : Int = eventDay.calendar.time.month + 1
////                Toast.makeText(activity,month.toString(), Toast.LENGTH_LONG).show()
////                viewModel!!.Images.observe(mainActivity!!, FeedObserver())
////                viewModel!!.getdata(userId, "2020"+"-"+month.toString()+"-"+eventDay.calendar.time.date.toString(), "day")
////            }
////        })
////
////
////
//////        calendarView!!.setOnDateChangedListener{ widget, date, selected ->
//////            Toast.makeText(activity, date.toString(), Toast.LENGTH_LONG).show()
//////            ///viewModel!!.getdata(userId, date.year.toString() + "-" + date.month.toString() + "-" + date.day.toString(),"day")
//////        }
////
////
////        calendarView!!.setOnPreviousPageChangeListener(object : OnCalendarPageChangeListener {
////            override fun onChange() {
////                //Toast.makeText(activity,calendarView!!.currentPageDate.time.month.toString(), Toast.LENGTH_LONG).show()
////                var month : Int = calendarView!!.currentPageDate.time.month + 1
////                viewModel!!.Images.observe(mainActivity!!, FeedObserver())
////                viewModel!!.getdata(userId, "2020"+"-"+month.toString()+"-"+"01", "month")
////
////            }
////
////
////        });
////
////        calendarView!!.setOnForwardPageChangeListener(object : OnCalendarPageChangeListener {
////            override fun onChange() {
////                var month : Int = calendarView!!.currentPageDate.time.month + 1
////                viewModel!!.getdata(userId, "2020"+"-"+month.toString()+"-"+"01", "month")
////            }
////
////
////        });
//
//        not_detail = this
//
//        return view
//    }
//
//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//
//    }
//
////    private inner class LoadingObserver : Observer<Boolean?> {
////        override fun onChanged(isLoading: Boolean?) {
////            if (isLoading == null) return
////            if (isLoading) UIHelper.showDilog(mainActivity) else UIHelper.hidedailog()
////        }
////    }
//
//    private fun initializeCalendar() {
//
//
//
//
////
//
//
////
//
////        calendarView?.setHeaderColor([color]);
////        calendarView?.setHeaderLabelColor([color]);
////        calendarView?.setForwardButtonImage([drawable]);
////        calendarView?.setPreviousButtonImage([drawable]);
//
////        val events1 = ArrayList<EventDay>()
////        events1.add(EventDay(calendar1, R.drawable.sample_icon))
////        val events2 = ArrayList<EventDay>()
////        events2.add(EventDay(calendar2, R.drawable.sample_icon))
//
//
//
//
//
//
//
//
//
//        // Removes onClick functionality
////        cal.add(Calendar.DATE, -1)
//
////
////        calendarView!!.selectionMode = SELECTION_MODE_SINGLE
//    }
//
//
//
//
//
//
//
//
//
//
//    override fun onDestroyView() {
//        setmonth = false
//        super.onDestroyView()
//    }
//
//    fun callservices(dates: String) {
//        //viewModel!!.Images.observe(mainActivity!!, FeedObserver())
//        viewModel!!.getdata(userId, dates, "month")
//    }
//
//    fun calldata(dates: String) {
//        viewModel!!.getdata(userId, dates, "day")
//    }
//
//
//    internal inner class FeedObserver : Observer<ArrayList<Calandermodel>?> {
//        override fun onChanged(feedmodels: ArrayList<Calandermodel>?) {
//            if(feedmodels == null)return
//            newdatalist = java.util.ArrayList<Calandermodel>()
//            var allEvents = java.util.ArrayList<EventObjects>()
//
//
//            val events = ArrayList<EventDay>()
//            newdatalist = feedmodels
//
//           //  feedmodels.contains("")
//
//
//
//            for (i in newdatalist!!.indices) {
//                var jdb = EventObjects()
//
//                val sdf = SimpleDateFormat("yyyy-mm-dd")
//                try {
//                    val seperatedTime: Array<String> = newdatalist.get(i).cdate_date?.split("-")!!.toTypedArray()
//                    val year = seperatedTime[0].toInt()
//                    val month = seperatedTime[1].toInt() - 1
//                    val day = seperatedTime[2].toInt()
//                    val calendar = Calendar.getInstance()
//                    calendar.set(year, month, day);
//
//
//                    jdb.id = day
//                    events.add(EventDay(calendar, R.drawable.sample_icon))
//                    allEvents.add(jdb)
//
//                } catch (e: ParseException) {
//                    e.stackTrace
//                }
//                //calendarView?.setEvents(events)
//
//
//            }
//            mView?.setallevent(allEvents)
//
//            categoryadapter = Calanderadapter(mainActivity, newdatalist, userId)
//            recyclerView!!.layoutManager = LinearLayoutManager(mainActivity)
//            recyclerView!!.adapter = categoryadapter
//        }
//    }
//
//
//}