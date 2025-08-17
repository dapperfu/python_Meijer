package com.meijer.mobile.meijer.activity.coupons;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_CouponActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f105376r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_CouponActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f105376r) {
            return;
        }
        this.f105376r = true;
        ((e) ((Au.c) Au.f.a(this)).generatedComponent()).I((CouponActivity) Au.f.a(this));
    }

    Hilt_CouponActivity() {
        _initHiltInternal();
    }
}
