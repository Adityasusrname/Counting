package com.afterclass.counting

import androidx.lifecycle.ViewModel

class NumberViewModel: ViewModel() {
    var number=0
    var word="Zero"
    fun plus(){
        if(number<=99) {
            number++;
            giveWord(number)
        }
    }
    fun minus(){
        if(number>0) {
            number--;
            giveWord(number)
        }
    }
    fun giveWord(number:Int){
        val distinct= arrayOf("Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen")
        val tens= arrayOf("Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety","Hundred")
        if(number<=19){
            word=distinct[number]
        }
        else{
            var n=number
            var second=""
            if(n%10!=0) {
                 second = distinct[n % 10]
                n = n / 10
            }
            val first=when(n){
                2->tens[0]
                3->tens[1]
                4->tens[2]
                5->tens[3]
                6->tens[4]
                7->tens[5]
                8->tens[6]
                9->tens[7]
                20->tens[0]
                30->tens[1]
                40->tens[2]
                50->tens[3]
                60->tens[4]
                70->tens[5]
                80->tens[6]
                90->tens[7]
                100->tens[8]
                else->"Null"
            }
            word="$first $second"

        }

    }

}