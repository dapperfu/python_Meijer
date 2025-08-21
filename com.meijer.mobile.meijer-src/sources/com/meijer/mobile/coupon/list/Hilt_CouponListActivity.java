package com.meijer.mobile.coupon.list;

import android.content.Context;
import com.meijer.mobile.coupon.di.CouponFeatureActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
public abstract class Hilt_CouponListActivity extends CouponFeatureActivity {

    /* renamed from: B, reason: collision with root package name */
    private boolean f97434B = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_CouponListActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.coupon.di.Hilt_CouponFeatureActivity
    protected void inject() {
        if (this.f97434B) {
            return;
        }
        this.f97434B = true;
        ((InterfaceC11747n) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).N0((CouponListActivity) wu.f.a(this));
    }

    Hilt_CouponListActivity() {
        _initHiltInternal();
    }
}
