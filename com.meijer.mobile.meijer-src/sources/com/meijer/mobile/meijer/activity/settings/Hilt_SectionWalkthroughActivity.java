package com.meijer.mobile.meijer.activity.settings;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
public abstract class Hilt_SectionWalkthroughActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f112590r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_SectionWalkthroughActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f112590r) {
            return;
        }
        this.f112590r = true;
        ((x) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).Z0((SectionWalkthroughActivity) wu.f.a(this));
    }

    Hilt_SectionWalkthroughActivity() {
        _initHiltInternal();
    }
}
