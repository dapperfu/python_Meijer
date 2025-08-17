package com.meijer.mobile.meijer.activity.digitalreceipts;

import android.content.Context;
import com.meijer.mobile.mperks.ux.MperksFeatureActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
public abstract class Hilt_AddReceiptActivity extends MperksFeatureActivity {

    /* renamed from: C, reason: collision with root package name */
    private boolean f105463C = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_AddReceiptActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.mperks.ux.Hilt_MperksFeatureActivity
    protected void inject() {
        if (this.f105463C) {
            return;
        }
        this.f105463C = true;
        ((InterfaceC12021e) ((Au.c) Au.f.a(this)).generatedComponent()).T((AddReceiptActivity) Au.f.a(this));
    }

    Hilt_AddReceiptActivity() {
        _initHiltInternal();
    }
}
