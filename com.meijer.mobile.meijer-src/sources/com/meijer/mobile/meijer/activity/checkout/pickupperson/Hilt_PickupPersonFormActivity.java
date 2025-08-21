package com.meijer.mobile.meijer.activity.checkout.pickupperson;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_PickupPersonFormActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f105015r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_PickupPersonFormActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f105015r) {
            return;
        }
        this.f105015r = true;
        ((InterfaceC12051j) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).t0((PickupPersonFormActivity) wu.f.a(this));
    }

    Hilt_PickupPersonFormActivity() {
        _initHiltInternal();
    }
}
