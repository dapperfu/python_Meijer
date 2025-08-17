package com.meijer.mobile.meijer.activity.coupons;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_CouponFilterActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f105378r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_CouponFilterActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f105378r) {
            return;
        }
        this.f105378r = true;
        ((l) ((Au.c) Au.f.a(this)).generatedComponent()).e0((CouponFilterActivity) Au.f.a(this));
    }

    Hilt_CouponFilterActivity() {
        _initHiltInternal();
    }
}
