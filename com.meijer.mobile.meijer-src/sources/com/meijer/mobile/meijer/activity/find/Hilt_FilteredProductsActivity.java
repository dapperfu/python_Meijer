package com.meijer.mobile.meijer.activity.find;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_FilteredProductsActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f107315r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_FilteredProductsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f107315r) {
            return;
        }
        this.f107315r = true;
        ((K) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).q0((FilteredProductsActivity) wu.f.a(this));
    }

    Hilt_FilteredProductsActivity() {
        _initHiltInternal();
    }
}
