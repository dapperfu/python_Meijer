package com.meijer.mobile.meijer.activity.checkout.review;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_CheckoutActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f104533r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_CheckoutActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f104533r) {
            return;
        }
        this.f104533r = true;
        ((InterfaceC11942b0) ((Au.c) Au.f.a(this)).generatedComponent()).C((CheckoutActivity) Au.f.a(this));
    }

    Hilt_CheckoutActivity() {
        _initHiltInternal();
    }
}
