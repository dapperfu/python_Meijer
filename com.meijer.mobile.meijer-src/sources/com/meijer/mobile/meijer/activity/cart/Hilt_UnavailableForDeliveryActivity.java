package com.meijer.mobile.meijer.activity.cart;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_UnavailableForDeliveryActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f102462r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_UnavailableForDeliveryActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f102462r) {
            return;
        }
        this.f102462r = true;
        ((p1) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).C0((UnavailableForDeliveryActivity) wu.f.a(this));
    }

    Hilt_UnavailableForDeliveryActivity() {
        _initHiltInternal();
    }
}
