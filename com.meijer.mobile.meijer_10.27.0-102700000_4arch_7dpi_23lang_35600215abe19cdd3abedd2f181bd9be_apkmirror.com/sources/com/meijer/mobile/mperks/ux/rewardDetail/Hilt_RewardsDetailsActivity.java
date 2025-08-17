package com.meijer.mobile.mperks.ux.rewardDetail;

import android.content.Context;
import com.meijer.mobile.mperks.ux.MperksFeatureActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
public abstract class Hilt_RewardsDetailsActivity extends MperksFeatureActivity {

    /* renamed from: C, reason: collision with root package name */
    private boolean f114326C = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_RewardsDetailsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.mperks.ux.Hilt_MperksFeatureActivity
    protected void inject() {
        if (this.f114326C) {
            return;
        }
        this.f114326C = true;
        ((g) ((Au.c) Au.f.a(this)).generatedComponent()).c0((RewardsDetailsActivity) Au.f.a(this));
    }

    Hilt_RewardsDetailsActivity() {
        _initHiltInternal();
    }
}
