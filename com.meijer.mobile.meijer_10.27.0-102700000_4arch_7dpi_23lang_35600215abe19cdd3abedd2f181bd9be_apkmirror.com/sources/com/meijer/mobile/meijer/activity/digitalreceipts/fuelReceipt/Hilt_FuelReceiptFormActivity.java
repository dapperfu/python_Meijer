package com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt;

import android.content.Context;
import com.meijer.mobile.mperks.ux.MperksFeatureActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
public abstract class Hilt_FuelReceiptFormActivity extends MperksFeatureActivity {

    /* renamed from: C, reason: collision with root package name */
    private boolean f105657C = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_FuelReceiptFormActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.mperks.ux.Hilt_MperksFeatureActivity
    protected void inject() {
        if (this.f105657C) {
            return;
        }
        this.f105657C = true;
        ((InterfaceC12030h) ((Au.c) Au.f.a(this)).generatedComponent()).d1((FuelReceiptFormActivity) Au.f.a(this));
    }

    Hilt_FuelReceiptFormActivity() {
        _initHiltInternal();
    }
}
