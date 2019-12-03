public class Calculator {
   static int add(int num1, int num2){
        return num1 + num2;
    }
   static int add(int...num){
        int answer = 0;
        for (int i = 0;i < num.length; ++i){
            answer = answer + num[i];
        }
        return answer;
    }
   static int mutliply(int num1, int num2){
        return num1 * num2;
    }
   static int multiply(int...num){
        int product = 0,
                size = num.length-1,
                updatedNum = num[size];
        for(int i = 0; i < num.length-1; ++i){
            product = updatedNum*num[size-1];
            updatedNum = product;
            size--;
        }
            return product;
    }

}
