package com.meijer.mobile.meijer.activity.checkout.confirmation;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_OrderConfirmationActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f102014r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_OrderConfirmationActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f102014r) {
            return;
        }
        this.f102014r = true;
        ((InterfaceC11793n) ((Au.c) Au.f.a(this)).generatedComponent()).H0((OrderConfirmationActivity) Au.f.a(this));
    }

    Hilt_OrderConfirmationActivity() {
        _initHiltInternal();
    }
}
