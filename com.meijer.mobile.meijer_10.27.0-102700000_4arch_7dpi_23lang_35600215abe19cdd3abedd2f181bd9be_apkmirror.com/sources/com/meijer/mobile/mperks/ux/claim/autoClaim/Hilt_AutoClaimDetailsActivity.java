package com.meijer.mobile.mperks.ux.claim.autoClaim;

import android.content.Context;
import com.meijer.mobile.mperks.ux.MperksFeatureActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
public abstract class Hilt_AutoClaimDetailsActivity extends MperksFeatureActivity {

    /* renamed from: C, reason: collision with root package name */
    private boolean f113915C = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_AutoClaimDetailsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.mperks.ux.Hilt_MperksFeatureActivity
    protected void inject() {
        if (this.f113915C) {
            return;
        }
        this.f113915C = true;
        ((w) ((Au.c) Au.f.a(this)).generatedComponent()).w((AutoClaimDetailsActivity) Au.f.a(this));
    }

    Hilt_AutoClaimDetailsActivity() {
        _initHiltInternal();
    }
}
