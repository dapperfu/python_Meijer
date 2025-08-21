package com.meijer.mobile.meijer.activity.home;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
public abstract class Hilt_HomeActivity extends MeijerActivity {
    private boolean injected = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
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
        ((HomeActivity_GeneratedInjector) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).injectHomeActivity((HomeActivity) wu.f.a(this));
    }

    Hilt_HomeActivity() {
        _initHiltInternal();
    }
}
