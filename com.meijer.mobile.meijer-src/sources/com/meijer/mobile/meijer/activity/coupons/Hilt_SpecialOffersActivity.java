package com.meijer.mobile.meijer.activity.coupons;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_SpecialOffersActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f106235r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_SpecialOffersActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f106235r) {
            return;
        }
        this.f106235r = true;
        ((r) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).a1((SpecialOffersActivity) wu.f.a(this));
    }

    Hilt_SpecialOffersActivity() {
        _initHiltInternal();
    }
}
