package com.example.newhomework5.vmmv.presentation.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newhomework5.vmmv.domain.model.DomainPost
import com.example.newhomework5.vmmv.domain.use_cases.GetPostInfoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class AboutNewViewModel @Inject constructor(
    private val getPostInfoUseCase : GetPostInfoUseCase
)  : ViewModel() {

    private val _postInfo = MutableLiveData<DomainPost>()
    val postInfo: LiveData<DomainPost> = _postInfo

    init {
        getPostInfo()
    }

    private fun getPostInfo() {
//        _paymentInfo.value = getPostInfoUseCase.getPaymentInfo()
    }
}