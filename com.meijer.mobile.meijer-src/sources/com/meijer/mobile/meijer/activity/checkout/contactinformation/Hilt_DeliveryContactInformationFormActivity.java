package com.meijer.mobile.meijer.activity.checkout.contactinformation;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_DeliveryContactInformationFormActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f103269r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_DeliveryContactInformationFormActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f103269r) {
            return;
        }
        this.f103269r = true;
        ((z) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).y0((DeliveryContactInformationFormActivity) wu.f.a(this));
    }

    Hilt_DeliveryContactInformationFormActivity() {
        _initHiltInternal();
    }
}
