package com.meijer.mobile.meijer.activity.checkout.payment;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_CheckoutPaymentOptionsActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f104543r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_CheckoutPaymentOptionsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f104543r) {
            return;
        }
        this.f104543r = true;
        ((O) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).p0((CheckoutPaymentOptionsActivity) wu.f.a(this));
    }

    Hilt_CheckoutPaymentOptionsActivity() {
        _initHiltInternal();
    }
}
