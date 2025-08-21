package com.meijer.mobile.meijer.activity.find.viewmodel;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_TierDepartmentsActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f108779r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_TierDepartmentsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f108779r) {
            return;
        }
        this.f108779r = true;
        ((U1) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).f0((TierDepartmentsActivity) wu.f.a(this));
    }

    Hilt_TierDepartmentsActivity() {
        _initHiltInternal();
    }
}
