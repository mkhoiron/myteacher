package com.khoiron.myteacher.guru.lest.privates.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import com.khoiron.myteacher.guru.lest.privates.base.BaseFragment
import com.khoiron.myteacher.guru.lest.privates.layout.fragmentlayout.GaleryFragmentUi
import com.khoiron.myteacher.guru.lest.privates.layout.fragmentlayout.ProfileFragmentUi
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.support.v4.ctx

/**
 * Created by khoiron on 22/06/18.
 */
class GaleryFragment: BaseFragment() {
    override fun layoutFragment(): View {
        return GaleryFragmentUi<Fragment>().createView(AnkoContext.create(ctx, this))
    }

    override fun onViewCreatedListener(view: View?, savedInstanceState: Bundle?) {

    }

}