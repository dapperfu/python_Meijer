package com.meijer.mobile.singlepagecheckout;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes11.dex */
abstract class Hilt_SinglePageCheckoutActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f117740r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_SinglePageCheckoutActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f117740r) {
            return;
        }
        this.f117740r = true;
        ((InterfaceC12913d2) ((Au.c) Au.f.a(this)).generatedComponent()).k0((SinglePageCheckoutActivity) Au.f.a(this));
    }

    Hilt_SinglePageCheckoutActivity() {
        _initHiltInternal();
    }
}
