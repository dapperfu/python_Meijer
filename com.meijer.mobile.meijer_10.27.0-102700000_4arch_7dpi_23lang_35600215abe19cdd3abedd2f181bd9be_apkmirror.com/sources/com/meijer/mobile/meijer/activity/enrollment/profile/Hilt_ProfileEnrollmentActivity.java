package com.meijer.mobile.meijer.activity.enrollment.profile;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_ProfileEnrollmentActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f106053r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_ProfileEnrollmentActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f106053r) {
            return;
        }
        this.f106053r = true;
        ((n) ((Au.c) Au.f.a(this)).generatedComponent()).J((ProfileEnrollmentActivity) Au.f.a(this));
    }

    Hilt_ProfileEnrollmentActivity() {
        _initHiltInternal();
    }
}
