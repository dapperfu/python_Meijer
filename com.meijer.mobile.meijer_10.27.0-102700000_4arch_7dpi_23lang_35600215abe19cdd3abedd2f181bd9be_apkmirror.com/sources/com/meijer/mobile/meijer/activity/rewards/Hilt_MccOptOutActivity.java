package com.meijer.mobile.meijer.activity.rewards;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_MccOptOutActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f111609r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_MccOptOutActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f111609r) {
            return;
        }
        this.f111609r = true;
        ((j) ((Au.c) Au.f.a(this)).generatedComponent()).A((MccOptOutActivity) Au.f.a(this));
    }

    Hilt_MccOptOutActivity() {
        _initHiltInternal();
    }
}
