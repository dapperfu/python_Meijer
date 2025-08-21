package com.meijer.mobile.meijer.activity.checkout.fulfillmentslots;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_FulfillmentSlotsActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f103511r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_FulfillmentSlotsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f103511r) {
            return;
        }
        this.f103511r = true;
        ((InterfaceC11973i0) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).Q0((FulfillmentSlotsActivity) wu.f.a(this));
    }

    Hilt_FulfillmentSlotsActivity() {
        _initHiltInternal();
    }
}
