package com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_MperksInCartActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f103257r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_MperksInCartActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f103257r) {
            return;
        }
        this.f103257r = true;
        ((A) ((Au.c) Au.f.a(this)).generatedComponent()).F0((MperksInCartActivity) Au.f.a(this));
    }

    Hilt_MperksInCartActivity() {
        _initHiltInternal();
    }
}
