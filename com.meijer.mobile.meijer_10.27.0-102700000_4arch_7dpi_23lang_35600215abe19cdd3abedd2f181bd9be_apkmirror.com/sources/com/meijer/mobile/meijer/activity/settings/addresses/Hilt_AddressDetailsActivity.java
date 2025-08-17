package com.meijer.mobile.meijer.activity.settings.addresses;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_AddressDetailsActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f111794r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_AddressDetailsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f111794r) {
            return;
        }
        this.f111794r = true;
        ((m) ((Au.c) Au.f.a(this)).generatedComponent()).p((AddressDetailsActivity) Au.f.a(this));
    }

    Hilt_AddressDetailsActivity() {
        _initHiltInternal();
    }
}
