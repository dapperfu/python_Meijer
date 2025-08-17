package com.meijer.mobile.meijer.activity.coupons;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_SpecialOffersActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f105380r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_SpecialOffersActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f105380r) {
            return;
        }
        this.f105380r = true;
        ((r) ((Au.c) Au.f.a(this)).generatedComponent()).a1((SpecialOffersActivity) Au.f.a(this));
    }

    Hilt_SpecialOffersActivity() {
        _initHiltInternal();
    }
}
