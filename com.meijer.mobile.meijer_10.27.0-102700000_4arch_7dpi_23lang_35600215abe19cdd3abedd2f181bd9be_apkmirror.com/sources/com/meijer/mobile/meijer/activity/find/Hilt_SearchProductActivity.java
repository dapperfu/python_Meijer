package com.meijer.mobile.meijer.activity.find;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_SearchProductActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f106471r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_SearchProductActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f106471r) {
            return;
        }
        this.f106471r = true;
        ((e1) ((Au.c) Au.f.a(this)).generatedComponent()).D((SearchProductActivity) Au.f.a(this));
    }

    Hilt_SearchProductActivity() {
        _initHiltInternal();
    }
}
