package com.meijer.mobile.coupon.detail;

import android.content.Context;
import com.meijer.mobile.coupon.di.CouponFeatureActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
public abstract class Hilt_CouponDetailActivity extends CouponFeatureActivity {

    /* renamed from: B, reason: collision with root package name */
    private boolean f97084B = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_CouponDetailActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.coupon.di.Hilt_CouponFeatureActivity
    protected void inject() {
        if (this.f97084B) {
            return;
        }
        this.f97084B = true;
        ((q) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).z((CouponDetailActivity) wu.f.a(this));
    }

    Hilt_CouponDetailActivity() {
        _initHiltInternal();
    }
}
