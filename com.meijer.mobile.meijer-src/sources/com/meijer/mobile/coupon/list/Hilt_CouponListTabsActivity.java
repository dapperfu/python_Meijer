package com.meijer.mobile.coupon.list;

import android.content.Context;
import com.meijer.mobile.coupon.di.CouponFeatureActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
public abstract class Hilt_CouponListTabsActivity extends CouponFeatureActivity {

    /* renamed from: B, reason: collision with root package name */
    private boolean f97436B = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_CouponListTabsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.coupon.di.Hilt_CouponFeatureActivity
    protected void inject() {
        if (this.f97436B) {
            return;
        }
        this.f97436B = true;
        ((H) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).x((CouponListTabsActivity) wu.f.a(this));
    }

    Hilt_CouponListTabsActivity() {
        _initHiltInternal();
    }
}
