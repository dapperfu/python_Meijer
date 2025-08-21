package com.meijer.mobile.meijer.activity.settings.addresses;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_AddressSearchActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f112665r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_AddressSearchActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f112665r) {
            return;
        }
        this.f112665r = true;
        ((s) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).K0((AddressSearchActivity) wu.f.a(this));
    }

    Hilt_AddressSearchActivity() {
        _initHiltInternal();
    }
}
