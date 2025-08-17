package com.meijer.mobile.mperks.ux;

import android.content.Context;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
public abstract class Hilt_MperksDashBoardActivity extends MperksFeatureActivity {

    /* renamed from: C, reason: collision with root package name */
    private boolean f113604C = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_MperksDashBoardActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.mperks.ux.Hilt_MperksFeatureActivity
    protected void inject() {
        if (this.f113604C) {
            return;
        }
        this.f113604C = true;
        ((S) ((Au.c) Au.f.a(this)).generatedComponent()).Q((MperksDashBoardActivity) Au.f.a(this));
    }

    Hilt_MperksDashBoardActivity() {
        _initHiltInternal();
    }
}
