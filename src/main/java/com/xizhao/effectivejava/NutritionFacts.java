package com.xizhao.effectivejava;

/**
 * User: xizhao.xsz
 * Time:2014-06-16 16:43
 * see effective java item2--Consider a builder when faced with many constructor parameters
 * 优点：1.容易阅读 2.set参数不易出错 3.初始化可以一次完成
 */
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        private final int servingSize;
        private final int servings;
        private  int calories;
        private  int fat;
        private  int sodium;
        private  int carbohydrate;
        public Builder(int servingSize,int servings){
              this.servingSize=servingSize;
            this.servings= servings;
        }
        public Builder calories(int val){
            calories=val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }
        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private   NutritionFacts(Builder builder){
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public static void main(String []args){
        Builder builder = new  Builder(1,2).calories(1).carbohydrate(2).fat(3).sodium(4);
        NutritionFacts nutritionFacts  = builder.build();
    }
}
