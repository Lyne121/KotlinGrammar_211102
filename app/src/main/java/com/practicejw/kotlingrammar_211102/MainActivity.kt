package com.practicejw.kotlingrammar_211102

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnVariable01.setOnClickListener {
//            기본적인 변수 만들고, 대입하고, 활용 (로그찍기)

//            1. 변수 공간만 만들기
            val myName : String
            var myHeight : Double

//            2. 변수에 데이터 대입
            myName = "마이네임"
            myHeight = 153.5

//            변수의 데이터 변경
//            myName = "변경한 네임" // val 변수는 변경 불가능
            myHeight = 172.9 // var 은 변경 가능. 이전 것을 덮어쓰기함

//            3. 데이터 활용
            Log.d("이름", myName)
            Log.d("키", myHeight.toString()) // Log의 재료는 String만 대입 가능 => 변수를 쓸 때 자료형을 신경써야함

//            참고 - 모든 변수는 '참조형 변수' 이며, 부가 기능들이 있다
//              공통 기능 : String으로 변환 가능 => toString()
        }

        btnVariable02.setOnClickListener {
//            변수를 만들고 > 바로 데이터 대입
//            보통은 val로 만든다
            val myBirthYear = 1993 // 대입한 값의 형태가 정수(Int). 즉, 대입할 때 자동으로 Int로 결정된다.

            Log.d("출생연도", myBirthYear.toString())

//            2021년 나이는 몇 살?
            val myKoreanAge = 2021 - myBirthYear + 1 //변수를 대입할 때, 기능 실행(ex.계산식)의 결과를 바로 대입 가능

            Log.d("나이", myKoreanAge.toString())
        }

        btnCondition01.setOnClickListener {

            val myAge = 15

            if ( myAge >= 20 ) {

//                질문 내용이 맞으면 실행될 코드
                Log.d("나이 검사" , "성인입니다" )

            }

            else if ( myAge >= 17 ) {
                Log.d("나이 검사" , "고등학생입니다")
            }

            else if ( myAge >= 14 ) {
                Log.d("나이 검사", "중학생입니다")
            }

            else {
                Log.d("나이 검사", "초등학생 이하 입니다")

            }
        }

        btnCondition02.setOnClickListener {

//            장기 근속의 3대 요소 1. 연봉 2. 통근 거리 3. 워라밸

            val aCompanySalary = 5800
            val aCompanyMinute = 5.8
            val aCompanyWLB = true

//            Q . 지원자들은 A 회사에 취업할까?
//            1번 지원자는 연봉만 5천 이상이면 OK

            if ( aCompanySalary >= 5000 ) {
                Log.d("1번 지원자","취업 OK")
            }
            else {
                Log.d("1번 지원자", "다른 회사")
            }
            
//            2번 지원자는 출퇴근이 10분 이내면 OK
            if ( aCompanyMinute <= 10 ) {
                Log.d("2번 지원자","취업 OK")
            }
            else {
                Log.d("2번 지원자", "다른 회사")
            }
            
//            3번 지원자는 워라밸 좋으면 OK   - 굳이 ==true 적을 필요 없다
            if ( aCompanyWLB ) {
                Log.d("3번 지원자", "취업 OK")
            }
            else {
                Log.d("3번 지원자", "다른 회사")
            }

//            4번 지원자는 연봉이 4천 이상, 거리도 10분 이내
            if ( aCompanySalary >= 4000 && aCompanyMinute <= 10 ) {
                Log.d("4번 지원자", "취업 OK")
            }
            else {
                Log.d("4번 지원자", "다른 회사")
            }

//            5번 지원자는 거리가 20분 이내거나, 칼퇴하거나
            if ( aCompanyMinute <= 20 || aCompanyWLB ) {
                Log.d("5번 지원자", "취업 OK")
            }
            else {
                Log.d("5번 지원자", "다른 회사")
            }



        }

    }
}