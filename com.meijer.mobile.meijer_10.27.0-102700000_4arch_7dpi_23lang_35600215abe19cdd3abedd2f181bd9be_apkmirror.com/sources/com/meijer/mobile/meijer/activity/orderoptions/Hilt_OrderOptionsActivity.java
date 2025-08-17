package com.meijer.mobile.meijer.activity.orderoptions;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_OrderOptionsActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f109820r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_OrderOptionsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f109820r) {
            return;
        }
        this.f109820r = true;
        ((p) ((Au.c) Au.f.a(this)).generatedComponent()).m0((OrderOptionsActivity) Au.f.a(this));
    }

    Hilt_OrderOptionsActivity() {
        _initHiltInternal();
    }
}
