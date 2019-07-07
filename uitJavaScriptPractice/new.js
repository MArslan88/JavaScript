var num1 = 5;
        var num2 = 10;
        var ans1 = num1 + num2;
        //alert(ans1);

        var num3 = "5";
        var num4 = 6;
        var ans2 = num4 + 2+ num3 +1 +"1";
        // 8511
        // when it will get integer at the start two or more then
        // will add them and all the rest will be concatenate but
        // whenever it will get any String in the expression all the
        // values after that will be concatenate, but will not add...

        //alert(ans2);

        var ans7 = 8 - "2";
        //alert(ans7);
        
        var ans8 = 8 -"a";
        // here 'a' is not a number so subtriction is not possible
        //alert(ans8); // NaN "Not a Number"

        var ans9 = 19 %2; // Modulus is use for taking the remender 
        //alert(ans9)

        var ans10 = 19/2;
        //alert(ans10);

        var totalCost = 1 + 3 * 4;
        //alert(totalCost); // 13

        //var a = a+1;
        //alert(a); // Nan

        //var b=4;
        //var b=b+1;
        //alert(b); // 5

        //b++; // b=b+1
       // b+=2; // b=b+2

        //alert(b++); // post increment
        //alert(++b); // pre increment

        var a = 5;
        var b = ++a + a++; // b = 6 + 6 = 12

        // now a=7

        alert(a); //7
        alert(b); //12

        var a = 4;
        var b = a++ + ++a; // b = 4 + 6 = 10

        // now a=6

        alert(a); //6
        alert(b); //10