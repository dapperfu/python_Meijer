package com.meijer.mobile.meijer.activity.orders;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_EditPhoneNumberActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f110242r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_EditPhoneNumberActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f110242r) {
            return;
        }
        this.f110242r = true;
        ((InterfaceC12393a) ((Au.c) Au.f.a(this)).generatedComponent()).x0((EditPhoneNumberActivity) Au.f.a(this));
    }

    Hilt_EditPhoneNumberActivity() {
        _initHiltInternal();
    }
}
