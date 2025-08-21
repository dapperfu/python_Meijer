package com.meijer.mobile.meijer.activity.enrollment.storeLocation;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_StoreListActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f107048r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_StoreListActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f107048r) {
            return;
        }
        this.f107048r = true;
        ((j) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).r0((StoreListActivity) wu.f.a(this));
    }

    Hilt_StoreListActivity() {
        _initHiltInternal();
    }
}
