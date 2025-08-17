package com.meijer.mobile.meijer.activity.cart;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_ChangeFulfillmentPreviewActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f101603r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_ChangeFulfillmentPreviewActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f101603r) {
            return;
        }
        this.f101603r = true;
        ((M0) ((Au.c) Au.f.a(this)).generatedComponent()).X0((ChangeFulfillmentPreviewActivity) Au.f.a(this));
    }

    Hilt_ChangeFulfillmentPreviewActivity() {
        _initHiltInternal();
    }
}
