package com.meijer.mobile.coupon.detail;

import android.content.Context;
import com.meijer.mobile.coupon.di.CouponFeatureActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
public abstract class Hilt_CouponDetailActivity extends CouponFeatureActivity {

    /* renamed from: B, reason: collision with root package name */
    private boolean f96226B = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_CouponDetailActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.coupon.di.Hilt_CouponFeatureActivity
    protected void inject() {
        if (this.f96226B) {
            return;
        }
        this.f96226B = true;
        ((q) ((Au.c) Au.f.a(this)).generatedComponent()).z((CouponDetailActivity) Au.f.a(this));
    }

    Hilt_CouponDetailActivity() {
        _initHiltInternal();
    }
}
