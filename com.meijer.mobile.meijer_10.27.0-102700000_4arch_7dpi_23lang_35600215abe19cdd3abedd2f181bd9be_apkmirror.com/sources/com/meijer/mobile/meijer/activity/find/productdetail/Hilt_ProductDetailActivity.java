package com.meijer.mobile.meijer.activity.find.productdetail;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
public abstract class Hilt_ProductDetailActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f107058r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_ProductDetailActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f107058r) {
            return;
        }
        this.f107058r = true;
        ((S) ((Au.c) Au.f.a(this)).generatedComponent()).z0((ProductDetailActivity) Au.f.a(this));
    }

    Hilt_ProductDetailActivity() {
        _initHiltInternal();
    }
}
