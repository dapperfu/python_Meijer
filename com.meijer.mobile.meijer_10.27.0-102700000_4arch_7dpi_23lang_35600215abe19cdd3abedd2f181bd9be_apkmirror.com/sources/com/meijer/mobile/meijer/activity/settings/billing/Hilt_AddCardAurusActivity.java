package com.meijer.mobile.meijer.activity.settings.billing;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_AddCardAurusActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f111892r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_AddCardAurusActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f111892r) {
            return;
        }
        this.f111892r = true;
        ((i) ((Au.c) Au.f.a(this)).generatedComponent()).D0((AddCardAurusActivity) Au.f.a(this));
    }

    Hilt_AddCardAurusActivity() {
        _initHiltInternal();
    }
}
