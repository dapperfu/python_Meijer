package com.meijer.mobile.mperks.ux.transactionHistory;

import android.content.Context;
import com.meijer.mobile.mperks.ux.MperksFeatureActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
public abstract class Hilt_TransactionHistoryActivity extends MperksFeatureActivity {

    /* renamed from: C, reason: collision with root package name */
    private boolean f114678C = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_TransactionHistoryActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.mperks.ux.Hilt_MperksFeatureActivity
    protected void inject() {
        if (this.f114678C) {
            return;
        }
        this.f114678C = true;
        ((InterfaceC12688f) ((Au.c) Au.f.a(this)).generatedComponent()).s0((TransactionHistoryActivity) Au.f.a(this));
    }

    Hilt_TransactionHistoryActivity() {
        _initHiltInternal();
    }
}
