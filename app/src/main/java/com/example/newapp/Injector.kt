package com.example.newapp

class Injector{

    companion object{

        fun getPresenter(): Presenter{
            return Presenter()
        }

        fun getModel(): Model{
            return Model()
        }

    }

}