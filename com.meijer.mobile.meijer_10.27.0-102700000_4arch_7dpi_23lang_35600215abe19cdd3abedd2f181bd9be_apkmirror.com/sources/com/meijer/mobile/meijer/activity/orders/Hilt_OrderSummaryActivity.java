package com.meijer.mobile.meijer.activity.orders;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_OrderSummaryActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f110250r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_OrderSummaryActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f110250r) {
            return;
        }
        this.f110250r = true;
        ((r0) ((Au.c) Au.f.a(this)).generatedComponent()).l((OrderSummaryActivity) Au.f.a(this));
    }

    Hilt_OrderSummaryActivity() {
        _initHiltInternal();
    }
}
