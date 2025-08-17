package com.meijer.mobile.meijer.activity.enrollment;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_StoreActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f105900r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_StoreActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f105900r) {
            return;
        }
        this.f105900r = true;
        ((D) ((Au.c) Au.f.a(this)).generatedComponent()).q((StoreActivity) Au.f.a(this));
    }

    Hilt_StoreActivity() {
        _initHiltInternal();
    }
}
