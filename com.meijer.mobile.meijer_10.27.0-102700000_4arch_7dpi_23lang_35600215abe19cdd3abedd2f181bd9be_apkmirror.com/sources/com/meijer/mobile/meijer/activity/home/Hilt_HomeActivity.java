package com.meijer.mobile.meijer.activity.home;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
public abstract class Hilt_HomeActivity extends MeijerActivity {
    private boolean injected = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_HomeActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((HomeActivity_GeneratedInjector) ((Au.c) Au.f.a(this)).generatedComponent()).injectHomeActivity((HomeActivity) Au.f.a(this));
    }

    Hilt_HomeActivity() {
        _initHiltInternal();
    }
}
