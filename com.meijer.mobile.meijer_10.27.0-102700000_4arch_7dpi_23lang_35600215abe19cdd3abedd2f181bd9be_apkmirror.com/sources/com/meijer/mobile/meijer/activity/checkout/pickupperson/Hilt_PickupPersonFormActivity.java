package com.meijer.mobile.meijer.activity.checkout.pickupperson;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_PickupPersonFormActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f104160r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_PickupPersonFormActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f104160r) {
            return;
        }
        this.f104160r = true;
        ((InterfaceC11926j) ((Au.c) Au.f.a(this)).generatedComponent()).t0((PickupPersonFormActivity) Au.f.a(this));
    }

    Hilt_PickupPersonFormActivity() {
        _initHiltInternal();
    }
}
