package com.meijer.mobile.meijer.activity.orderoptions.fulfillmentslots;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_OrderOptionsFulfillmentSlotsActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f110742r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_OrderOptionsFulfillmentSlotsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f110742r) {
            return;
        }
        this.f110742r = true;
        ((e) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).v((OrderOptionsFulfillmentSlotsActivity) wu.f.a(this));
    }

    Hilt_OrderOptionsFulfillmentSlotsActivity() {
        _initHiltInternal();
    }
}
