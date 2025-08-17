package com.meijer.mobile.coupon.list;

import android.content.Context;
import com.meijer.mobile.coupon.di.CouponFeatureActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
public abstract class Hilt_CouponListTabsActivity extends CouponFeatureActivity {

    /* renamed from: B, reason: collision with root package name */
    private boolean f96578B = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_CouponListTabsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.coupon.di.Hilt_CouponFeatureActivity
    protected void inject() {
        if (this.f96578B) {
            return;
        }
        this.f96578B = true;
        ((H) ((Au.c) Au.f.a(this)).generatedComponent()).x((CouponListTabsActivity) Au.f.a(this));
    }

    Hilt_CouponListTabsActivity() {
        _initHiltInternal();
    }
}
