package com.meijer.mobile.meijer.activity.checkout.confirmation;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_OrderConfirmationActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f102869r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_OrderConfirmationActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f102869r) {
            return;
        }
        this.f102869r = true;
        ((InterfaceC11918n) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).H0((OrderConfirmationActivity) wu.f.a(this));
    }

    Hilt_OrderConfirmationActivity() {
        _initHiltInternal();
    }
}
