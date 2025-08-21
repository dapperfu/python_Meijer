package com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt;

import android.content.Context;
import com.meijer.mobile.mperks.ux.MperksFeatureActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
public abstract class Hilt_FuelReceiptFormActivity extends MperksFeatureActivity {

    /* renamed from: C, reason: collision with root package name */
    private boolean f106512C = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_FuelReceiptFormActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.mperks.ux.Hilt_MperksFeatureActivity
    protected void inject() {
        if (this.f106512C) {
            return;
        }
        this.f106512C = true;
        ((InterfaceC12155h) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).d1((FuelReceiptFormActivity) wu.f.a(this));
    }

    Hilt_FuelReceiptFormActivity() {
        _initHiltInternal();
    }
}
