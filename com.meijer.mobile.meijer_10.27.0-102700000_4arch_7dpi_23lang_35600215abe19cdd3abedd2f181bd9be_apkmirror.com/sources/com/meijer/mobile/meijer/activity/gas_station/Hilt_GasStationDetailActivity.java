package com.meijer.mobile.meijer.activity.gas_station;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_GasStationDetailActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f109104r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_GasStationDetailActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f109104r) {
            return;
        }
        this.f109104r = true;
        ((d) ((Au.c) Au.f.a(this)).generatedComponent()).c((GasStationDetailActivity) Au.f.a(this));
    }

    Hilt_GasStationDetailActivity() {
        _initHiltInternal();
    }
}
