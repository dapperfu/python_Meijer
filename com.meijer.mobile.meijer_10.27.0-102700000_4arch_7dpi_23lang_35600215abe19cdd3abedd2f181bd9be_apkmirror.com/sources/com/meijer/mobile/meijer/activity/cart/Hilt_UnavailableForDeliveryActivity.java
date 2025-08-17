package com.meijer.mobile.meijer.activity.cart;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_UnavailableForDeliveryActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f101607r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_UnavailableForDeliveryActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f101607r) {
            return;
        }
        this.f101607r = true;
        ((p1) ((Au.c) Au.f.a(this)).generatedComponent()).C0((UnavailableForDeliveryActivity) Au.f.a(this));
    }

    Hilt_UnavailableForDeliveryActivity() {
        _initHiltInternal();
    }
}
