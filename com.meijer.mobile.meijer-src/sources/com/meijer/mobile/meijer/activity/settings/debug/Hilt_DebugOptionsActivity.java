package com.meijer.mobile.meijer.activity.settings.debug;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_DebugOptionsActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f112877r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_DebugOptionsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f112877r) {
            return;
        }
        this.f112877r = true;
        ((InterfaceC12638i) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).S((DebugOptionsActivity) wu.f.a(this));
    }

    Hilt_DebugOptionsActivity() {
        _initHiltInternal();
    }
}
