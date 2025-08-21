package com.meijer.mobile.meijer.activity.find.productdetail;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
public abstract class Hilt_ProductDetailActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f107914r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_ProductDetailActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f107914r) {
            return;
        }
        this.f107914r = true;
        ((S) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).z0((ProductDetailActivity) wu.f.a(this));
    }

    Hilt_ProductDetailActivity() {
        _initHiltInternal();
    }
}
