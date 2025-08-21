package com.meijer.mobile.meijer.activity.cart;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_CartActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f102451r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_CartActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f102451r) {
            return;
        }
        this.f102451r = true;
        ((InterfaceC11863e0) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).J0((CartActivity) wu.f.a(this));
    }

    Hilt_CartActivity() {
        _initHiltInternal();
    }
}
