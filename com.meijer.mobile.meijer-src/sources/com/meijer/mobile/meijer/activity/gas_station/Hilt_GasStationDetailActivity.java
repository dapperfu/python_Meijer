package com.meijer.mobile.meijer.activity.gas_station;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_GasStationDetailActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f109965r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_GasStationDetailActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f109965r) {
            return;
        }
        this.f109965r = true;
        ((d) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).c((GasStationDetailActivity) wu.f.a(this));
    }

    Hilt_GasStationDetailActivity() {
        _initHiltInternal();
    }
}
