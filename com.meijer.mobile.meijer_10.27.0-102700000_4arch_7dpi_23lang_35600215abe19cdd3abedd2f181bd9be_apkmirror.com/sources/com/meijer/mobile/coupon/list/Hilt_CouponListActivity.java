package com.meijer.mobile.coupon.list;

import android.content.Context;
import com.meijer.mobile.coupon.di.CouponFeatureActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
public abstract class Hilt_CouponListActivity extends CouponFeatureActivity {

    /* renamed from: B, reason: collision with root package name */
    private boolean f96576B = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_CouponListActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.coupon.di.Hilt_CouponFeatureActivity
    protected void inject() {
        if (this.f96576B) {
            return;
        }
        this.f96576B = true;
        ((InterfaceC11622n) ((Au.c) Au.f.a(this)).generatedComponent()).N0((CouponListActivity) Au.f.a(this));
    }

    Hilt_CouponListActivity() {
        _initHiltInternal();
    }
}
