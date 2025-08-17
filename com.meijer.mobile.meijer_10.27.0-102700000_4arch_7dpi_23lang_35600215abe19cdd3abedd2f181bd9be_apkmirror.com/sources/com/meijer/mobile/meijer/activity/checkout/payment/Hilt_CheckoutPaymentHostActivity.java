package com.meijer.mobile.meijer.activity.checkout.payment;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_CheckoutPaymentHostActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f103686r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_CheckoutPaymentHostActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f103686r) {
            return;
        }
        this.f103686r = true;
        ((InterfaceC11893b) ((Au.c) Au.f.a(this)).generatedComponent()).Z((CheckoutPaymentHostActivity) Au.f.a(this));
    }

    Hilt_CheckoutPaymentHostActivity() {
        _initHiltInternal();
    }
}
