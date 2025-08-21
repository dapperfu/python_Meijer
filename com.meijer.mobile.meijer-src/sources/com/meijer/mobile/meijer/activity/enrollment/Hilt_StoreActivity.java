package com.meijer.mobile.meijer.activity.enrollment;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_StoreActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f106755r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_StoreActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f106755r) {
            return;
        }
        this.f106755r = true;
        ((D) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).q((StoreActivity) wu.f.a(this));
    }

    Hilt_StoreActivity() {
        _initHiltInternal();
    }
}
