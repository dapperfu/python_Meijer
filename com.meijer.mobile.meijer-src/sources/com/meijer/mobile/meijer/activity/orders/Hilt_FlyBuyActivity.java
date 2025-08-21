package com.meijer.mobile.meijer.activity.orders;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_FlyBuyActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f111105r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_FlyBuyActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f111105r) {
            return;
        }
        this.f111105r = true;
        ((InterfaceC12522c) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).G((FlyBuyActivity) wu.f.a(this));
    }

    Hilt_FlyBuyActivity() {
        _initHiltInternal();
    }
}
