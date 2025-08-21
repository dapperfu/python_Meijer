package com.meijer.mobile.meijer.activity.checkout.payment.ebt;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_EbtPinPadActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f104753r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_EbtPinPadActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f104753r) {
            return;
        }
        this.f104753r = true;
        ((d) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).S0((EbtPinPadActivity) wu.f.a(this));
    }

    Hilt_EbtPinPadActivity() {
        _initHiltInternal();
    }
}
