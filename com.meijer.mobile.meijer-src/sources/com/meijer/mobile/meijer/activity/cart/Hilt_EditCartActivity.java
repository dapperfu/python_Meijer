package com.meijer.mobile.meijer.activity.cart;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_EditCartActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f102460r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_EditCartActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f102460r) {
            return;
        }
        this.f102460r = true;
        ((g1) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).E((EditCartActivity) wu.f.a(this));
    }

    Hilt_EditCartActivity() {
        _initHiltInternal();
    }
}
