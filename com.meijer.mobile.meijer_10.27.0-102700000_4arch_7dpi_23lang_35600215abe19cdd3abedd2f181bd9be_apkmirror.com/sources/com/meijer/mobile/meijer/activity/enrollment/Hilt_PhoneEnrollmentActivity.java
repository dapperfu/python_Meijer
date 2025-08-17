package com.meijer.mobile.meijer.activity.enrollment;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_PhoneEnrollmentActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f105898r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_PhoneEnrollmentActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f105898r) {
            return;
        }
        this.f105898r = true;
        ((k) ((Au.c) Au.f.a(this)).generatedComponent()).s((PhoneEnrollmentActivity) Au.f.a(this));
    }

    Hilt_PhoneEnrollmentActivity() {
        _initHiltInternal();
    }
}
