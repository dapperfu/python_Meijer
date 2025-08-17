package com.meijer.mobile.meijer.activity.checkout.termsandconditions;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_TermsAndConditionsActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f105305r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_TermsAndConditionsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f105305r) {
            return;
        }
        this.f105305r = true;
        ((d) ((Au.c) Au.f.a(this)).generatedComponent()).e1((TermsAndConditionsActivity) Au.f.a(this));
    }

    Hilt_TermsAndConditionsActivity() {
        _initHiltInternal();
    }
}
