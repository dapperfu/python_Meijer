package com.meijer.mobile.meijer.activity.orders;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_EditPhoneNumberActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f111103r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_EditPhoneNumberActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f111103r) {
            return;
        }
        this.f111103r = true;
        ((InterfaceC12518a) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).x0((EditPhoneNumberActivity) wu.f.a(this));
    }

    Hilt_EditPhoneNumberActivity() {
        _initHiltInternal();
    }
}
