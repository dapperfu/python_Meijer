package com.meijer.mobile.meijer.activity.checkout.payment;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_CheckoutPaymentHostActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f104541r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_CheckoutPaymentHostActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f104541r) {
            return;
        }
        this.f104541r = true;
        ((InterfaceC12018b) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).Z((CheckoutPaymentHostActivity) wu.f.a(this));
    }

    Hilt_CheckoutPaymentHostActivity() {
        _initHiltInternal();
    }
}
