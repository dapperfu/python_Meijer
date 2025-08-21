package com.meijer.mobile.meijer.activity.coupons;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_CouponActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f106231r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_CouponActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f106231r) {
            return;
        }
        this.f106231r = true;
        ((e) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).I((CouponActivity) wu.f.a(this));
    }

    Hilt_CouponActivity() {
        _initHiltInternal();
    }
}
