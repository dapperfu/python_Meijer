package com.meijer.mobile.widget;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes11.dex */
abstract class Hilt_BarCodeActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f119500r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_BarCodeActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f119500r) {
            return;
        }
        this.f119500r = true;
        ((d) ((Au.c) Au.f.a(this)).generatedComponent()).U((BarCodeActivity) Au.f.a(this));
    }

    Hilt_BarCodeActivity() {
        _initHiltInternal();
    }
}
