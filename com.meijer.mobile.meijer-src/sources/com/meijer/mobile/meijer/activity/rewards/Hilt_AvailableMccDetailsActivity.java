package com.meijer.mobile.meijer.activity.rewards;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_AvailableMccDetailsActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f112471r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_AvailableMccDetailsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f112471r) {
            return;
        }
        this.f112471r = true;
        ((c) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).h1((AvailableMccDetailsActivity) wu.f.a(this));
    }

    Hilt_AvailableMccDetailsActivity() {
        _initHiltInternal();
    }
}
