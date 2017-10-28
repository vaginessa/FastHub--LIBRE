package com.fastaccess.ui.modules.main.premium

import com.fastaccess.ui.base.mvp.presenter.BasePresenter


/**
 * Created by kosh on 15/07/2017.
 */
class PremiumPresenter : BasePresenter<PremiumMvp.View>(), PremiumMvp.Presenter {
    override fun onCheckPromoCode(promo: String) {
        sendToView { it.onSuccessfullyActivated() }
    }
}