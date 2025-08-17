package com.meijer.mobile.meijer.activity.cart;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_CartActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f101596r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_CartActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f101596r) {
            return;
        }
        this.f101596r = true;
        ((InterfaceC11738e0) ((Au.c) Au.f.a(this)).generatedComponent()).J0((CartActivity) Au.f.a(this));
    }

    Hilt_CartActivity() {
        _initHiltInternal();
    }
}
