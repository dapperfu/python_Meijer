package com.meijer.mobile.meijer.activity.orders;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_OrderDetailActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f111107r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_OrderDetailActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f111107r) {
            return;
        }
        this.f111107r = true;
        ((L) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).B((OrderDetailActivity) wu.f.a(this));
    }

    Hilt_OrderDetailActivity() {
        _initHiltInternal();
    }
}
