package com.meijer.mobile.meijer.activity.rewards;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_MccOptOutActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f112478r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_MccOptOutActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f112478r) {
            return;
        }
        this.f112478r = true;
        ((j) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).A((MccOptOutActivity) wu.f.a(this));
    }

    Hilt_MccOptOutActivity() {
        _initHiltInternal();
    }
}
