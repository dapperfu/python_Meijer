package com.meijer.mobile.mperks.ux;

import android.content.Context;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
public abstract class Hilt_MperksDashBoardActivity extends MperksFeatureActivity {

    /* renamed from: C, reason: collision with root package name */
    private boolean f114550C = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_MperksDashBoardActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.mperks.ux.Hilt_MperksFeatureActivity
    protected void inject() {
        if (this.f114550C) {
            return;
        }
        this.f114550C = true;
        ((S) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).Q((MperksDashBoardActivity) wu.f.a(this));
    }

    Hilt_MperksDashBoardActivity() {
        _initHiltInternal();
    }
}
