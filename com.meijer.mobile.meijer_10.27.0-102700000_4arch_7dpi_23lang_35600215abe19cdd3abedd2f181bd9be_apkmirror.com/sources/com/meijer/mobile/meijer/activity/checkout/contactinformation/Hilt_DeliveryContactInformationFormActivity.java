package com.meijer.mobile.meijer.activity.checkout.contactinformation;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_DeliveryContactInformationFormActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f102415r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_DeliveryContactInformationFormActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f102415r) {
            return;
        }
        this.f102415r = true;
        ((z) ((Au.c) Au.f.a(this)).generatedComponent()).y0((DeliveryContactInformationFormActivity) Au.f.a(this));
    }

    Hilt_DeliveryContactInformationFormActivity() {
        _initHiltInternal();
    }
}
