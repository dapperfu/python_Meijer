package com.meijer.mobile.meijer.activity.find.filter;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_FilterActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f107559r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_FilterActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f107559r) {
            return;
        }
        this.f107559r = true;
        ((f) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).b0((FilterActivity) wu.f.a(this));
    }

    Hilt_FilterActivity() {
        _initHiltInternal();
    }
}
