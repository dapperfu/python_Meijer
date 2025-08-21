package com.meijer.mobile.mperks.ux.claim.autoClaim;

import android.content.Context;
import com.meijer.mobile.mperks.ux.MperksFeatureActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
public abstract class Hilt_AutoClaimDetailsActivity extends MperksFeatureActivity {

    /* renamed from: C, reason: collision with root package name */
    private boolean f114861C = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_AutoClaimDetailsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.mperks.ux.Hilt_MperksFeatureActivity
    protected void inject() {
        if (this.f114861C) {
            return;
        }
        this.f114861C = true;
        ((w) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).w((AutoClaimDetailsActivity) wu.f.a(this));
    }

    Hilt_AutoClaimDetailsActivity() {
        _initHiltInternal();
    }
}
