package com.meijer.mobile.meijer.activity.rewards;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_AvailableMccDetailsActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f111602r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_AvailableMccDetailsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f111602r) {
            return;
        }
        this.f111602r = true;
        ((c) ((Au.c) Au.f.a(this)).generatedComponent()).h1((AvailableMccDetailsActivity) Au.f.a(this));
    }

    Hilt_AvailableMccDetailsActivity() {
        _initHiltInternal();
    }
}
