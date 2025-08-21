package com.meijer.mobile.mperks.ux.rewardDetail;

import android.content.Context;
import com.meijer.mobile.mperks.ux.MperksFeatureActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
public abstract class Hilt_RewardsDetailsActivity extends MperksFeatureActivity {

    /* renamed from: C, reason: collision with root package name */
    private boolean f115271C = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_RewardsDetailsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.mperks.ux.Hilt_MperksFeatureActivity
    protected void inject() {
        if (this.f115271C) {
            return;
        }
        this.f115271C = true;
        ((g) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).c0((RewardsDetailsActivity) wu.f.a(this));
    }

    Hilt_RewardsDetailsActivity() {
        _initHiltInternal();
    }
}
