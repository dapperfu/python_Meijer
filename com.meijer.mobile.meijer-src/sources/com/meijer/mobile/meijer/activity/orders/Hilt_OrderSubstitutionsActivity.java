package com.meijer.mobile.meijer.activity.orders;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_OrderSubstitutionsActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f111109r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_OrderSubstitutionsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f111109r) {
            return;
        }
        this.f111109r = true;
        ((InterfaceC12523c0) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).h0((OrderSubstitutionsActivity) wu.f.a(this));
    }

    Hilt_OrderSubstitutionsActivity() {
        _initHiltInternal();
    }
}
