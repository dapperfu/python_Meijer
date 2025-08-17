package com.meijer.mobile.meijer.activity.orders;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_OrderDetailActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f110246r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_OrderDetailActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f110246r) {
            return;
        }
        this.f110246r = true;
        ((L) ((Au.c) Au.f.a(this)).generatedComponent()).B((OrderDetailActivity) Au.f.a(this));
    }

    Hilt_OrderDetailActivity() {
        _initHiltInternal();
    }
}
