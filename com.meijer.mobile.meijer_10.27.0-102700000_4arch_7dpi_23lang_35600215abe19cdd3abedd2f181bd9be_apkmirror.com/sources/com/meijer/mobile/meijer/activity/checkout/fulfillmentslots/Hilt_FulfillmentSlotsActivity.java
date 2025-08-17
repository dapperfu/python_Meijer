package com.meijer.mobile.meijer.activity.checkout.fulfillmentslots;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_FulfillmentSlotsActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f102656r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_FulfillmentSlotsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f102656r) {
            return;
        }
        this.f102656r = true;
        ((InterfaceC11848i0) ((Au.c) Au.f.a(this)).generatedComponent()).Q0((FulfillmentSlotsActivity) Au.f.a(this));
    }

    Hilt_FulfillmentSlotsActivity() {
        _initHiltInternal();
    }
}
