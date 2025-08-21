package com.meijer.mobile.singlepagecheckout;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes12.dex */
abstract class Hilt_SinglePageCheckoutActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f118731r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_SinglePageCheckoutActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f118731r) {
            return;
        }
        this.f118731r = true;
        ((InterfaceC13047f2) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).k0((SinglePageCheckoutActivity) wu.f.a(this));
    }

    Hilt_SinglePageCheckoutActivity() {
        _initHiltInternal();
    }
}
