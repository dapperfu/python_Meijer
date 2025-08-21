package com.meijer.mobile.meijer.activity.find;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_SearchProductActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f107327r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_SearchProductActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f107327r) {
            return;
        }
        this.f107327r = true;
        ((e1) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).D((SearchProductActivity) wu.f.a(this));
    }

    Hilt_SearchProductActivity() {
        _initHiltInternal();
    }
}
