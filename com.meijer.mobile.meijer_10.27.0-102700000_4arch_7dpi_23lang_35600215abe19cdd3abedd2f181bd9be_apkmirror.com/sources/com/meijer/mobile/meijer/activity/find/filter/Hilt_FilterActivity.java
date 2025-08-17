package com.meijer.mobile.meijer.activity.find.filter;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_FilterActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f106703r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_FilterActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f106703r) {
            return;
        }
        this.f106703r = true;
        ((f) ((Au.c) Au.f.a(this)).generatedComponent()).b0((FilterActivity) Au.f.a(this));
    }

    Hilt_FilterActivity() {
        _initHiltInternal();
    }
}
