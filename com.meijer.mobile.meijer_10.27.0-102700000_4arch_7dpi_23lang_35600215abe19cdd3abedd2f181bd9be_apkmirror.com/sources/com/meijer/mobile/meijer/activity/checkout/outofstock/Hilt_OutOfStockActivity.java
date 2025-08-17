package com.meijer.mobile.meijer.activity.checkout.outofstock;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_OutOfStockActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f103461r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_OutOfStockActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f103461r) {
            return;
        }
        this.f103461r = true;
        ((i) ((Au.c) Au.f.a(this)).generatedComponent()).R0((OutOfStockActivity) Au.f.a(this));
    }

    Hilt_OutOfStockActivity() {
        _initHiltInternal();
    }
}
