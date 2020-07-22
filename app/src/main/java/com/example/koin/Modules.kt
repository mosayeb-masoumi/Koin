package com.example.koin

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val appModule:Module = module {

    //define singleton of school
    single { School() }

    //define a factory (create new instance every time)
    factory { Friend() }

    factory { Student(get() , get()) }
}

val viewModelModule:Module = module {
    viewModel { MainViewModel(get(),get()) }
}