package com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_MperksInCartActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f104112r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_MperksInCartActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f104112r) {
            return;
        }
        this.f104112r = true;
        ((A) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).F0((MperksInCartActivity) wu.f.a(this));
    }

    Hilt_MperksInCartActivity() {
        _initHiltInternal();
    }
}
