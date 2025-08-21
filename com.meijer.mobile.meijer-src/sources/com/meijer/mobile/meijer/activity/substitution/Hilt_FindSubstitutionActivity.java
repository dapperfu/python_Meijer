package com.meijer.mobile.meijer.activity.substitution;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_FindSubstitutionActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f113647r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_FindSubstitutionActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f113647r) {
            return;
        }
        this.f113647r = true;
        ((r) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).f((FindSubstitutionActivity) wu.f.a(this));
    }

    Hilt_FindSubstitutionActivity() {
        _initHiltInternal();
    }
}
