package com.meijer.mobile.mperks.ux.transactionHistory;

import android.content.Context;
import com.meijer.mobile.mperks.ux.MperksFeatureActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
public abstract class Hilt_TransactionHistoryActivity extends MperksFeatureActivity {

    /* renamed from: C, reason: collision with root package name */
    private boolean f115623C = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_TransactionHistoryActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.mperks.ux.Hilt_MperksFeatureActivity
    protected void inject() {
        if (this.f115623C) {
            return;
        }
        this.f115623C = true;
        ((InterfaceC12814f) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).s0((TransactionHistoryActivity) wu.f.a(this));
    }

    Hilt_TransactionHistoryActivity() {
        _initHiltInternal();
    }
}
