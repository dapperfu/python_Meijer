package com.meijer.mobile.meijer.activity.checkout.payment.ebt;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_EbtPinPadActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f103898r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_EbtPinPadActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f103898r) {
            return;
        }
        this.f103898r = true;
        ((d) ((Au.c) Au.f.a(this)).generatedComponent()).S0((EbtPinPadActivity) Au.f.a(this));
    }

    Hilt_EbtPinPadActivity() {
        _initHiltInternal();
    }
}
