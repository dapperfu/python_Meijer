package com.meijer.mobile.meijer.activity.orderoptions;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_OrderOptionsActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f110681r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_OrderOptionsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f110681r) {
            return;
        }
        this.f110681r = true;
        ((p) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).m0((OrderOptionsActivity) wu.f.a(this));
    }

    Hilt_OrderOptionsActivity() {
        _initHiltInternal();
    }
}
