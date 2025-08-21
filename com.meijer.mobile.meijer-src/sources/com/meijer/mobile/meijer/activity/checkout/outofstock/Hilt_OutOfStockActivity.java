package com.meijer.mobile.meijer.activity.checkout.outofstock;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_OutOfStockActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f104316r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_OutOfStockActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f104316r) {
            return;
        }
        this.f104316r = true;
        ((i) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).R0((OutOfStockActivity) wu.f.a(this));
    }

    Hilt_OutOfStockActivity() {
        _initHiltInternal();
    }
}
