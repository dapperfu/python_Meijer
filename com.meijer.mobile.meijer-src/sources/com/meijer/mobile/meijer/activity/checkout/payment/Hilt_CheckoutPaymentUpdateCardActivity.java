package com.meijer.mobile.meijer.activity.checkout.payment;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_CheckoutPaymentUpdateCardActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f104545r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_CheckoutPaymentUpdateCardActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f104545r) {
            return;
        }
        this.f104545r = true;
        ((h0) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).a0((CheckoutPaymentUpdateCardActivity) wu.f.a(this));
    }

    Hilt_CheckoutPaymentUpdateCardActivity() {
        _initHiltInternal();
    }
}
