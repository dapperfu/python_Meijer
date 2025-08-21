package com.meijer.mobile.meijer.activity.cart;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_ChangeFulfillmentPreviewActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f102458r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_ChangeFulfillmentPreviewActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f102458r) {
            return;
        }
        this.f102458r = true;
        ((M0) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).X0((ChangeFulfillmentPreviewActivity) wu.f.a(this));
    }

    Hilt_ChangeFulfillmentPreviewActivity() {
        _initHiltInternal();
    }
}
