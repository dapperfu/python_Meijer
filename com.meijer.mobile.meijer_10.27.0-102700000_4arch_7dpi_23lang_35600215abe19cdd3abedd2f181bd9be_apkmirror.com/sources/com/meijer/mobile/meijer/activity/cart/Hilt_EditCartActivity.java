package com.meijer.mobile.meijer.activity.cart;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_EditCartActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f101605r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_EditCartActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f101605r) {
            return;
        }
        this.f101605r = true;
        ((g1) ((Au.c) Au.f.a(this)).generatedComponent()).E((EditCartActivity) Au.f.a(this));
    }

    Hilt_EditCartActivity() {
        _initHiltInternal();
    }
}
