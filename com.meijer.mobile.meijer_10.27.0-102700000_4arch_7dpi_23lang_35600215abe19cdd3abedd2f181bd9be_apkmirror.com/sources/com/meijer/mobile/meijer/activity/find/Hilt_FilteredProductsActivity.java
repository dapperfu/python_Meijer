package com.meijer.mobile.meijer.activity.find;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_FilteredProductsActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f106459r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_FilteredProductsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f106459r) {
            return;
        }
        this.f106459r = true;
        ((K) ((Au.c) Au.f.a(this)).generatedComponent()).q0((FilteredProductsActivity) Au.f.a(this));
    }

    Hilt_FilteredProductsActivity() {
        _initHiltInternal();
    }
}
