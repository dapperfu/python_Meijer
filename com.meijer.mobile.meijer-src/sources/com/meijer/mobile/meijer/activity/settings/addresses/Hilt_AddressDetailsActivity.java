package com.meijer.mobile.meijer.activity.settings.addresses;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_AddressDetailsActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f112663r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_AddressDetailsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f112663r) {
            return;
        }
        this.f112663r = true;
        ((m) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).p((AddressDetailsActivity) wu.f.a(this));
    }

    Hilt_AddressDetailsActivity() {
        _initHiltInternal();
    }
}
