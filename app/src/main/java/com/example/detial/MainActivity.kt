package com.example.detial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //addLinearLayout()
        addLinearLayoutKotlin()
    }
    fun addLinearLayoutjava(){
        //1.创建工程
        val linearLayout = LinearLayout(this)
        //2.给容器设置宽 高
        linearLayout.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT)
        //3.设置布局方向
        linearLayout.orientation = LinearLayout.VERTICAL
        //4.修改背景颜色
        linearLayout.background = getDrawable(R.color.colorAccent)
        //5.添加容器到Activity
        setContentView(linearLayout)
    }
    private fun addLinearLayoutKotlin(){
        //创建容器
        val container = LinearLayout(this).apply {
            //设置宽 高
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
            )
            //方向
            orientation = LinearLayout.VERTICAL
            //背景颜色
            background = getDrawable(R.color.colorAccent)
            setContentView(this)
        }
        //创建第一个子控件
        LinearLayout(this).apply {
            //设置宽 高
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                dp2x(100)
            )
            //方向
            orientation = LinearLayout.HORIZONTAL
            //背景颜色
            background = getDrawable(R.color.colorPrimary)
            container.addView(this)
        }
    }
    fun dp2x(dp:Int):Int{
        return (resources.displayMetrics.density * dp).toInt()
    }
}
