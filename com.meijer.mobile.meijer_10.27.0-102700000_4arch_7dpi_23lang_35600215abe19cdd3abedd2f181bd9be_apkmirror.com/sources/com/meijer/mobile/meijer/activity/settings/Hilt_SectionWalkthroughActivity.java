package com.meijer.mobile.meijer.activity.settings;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
public abstract class Hilt_SectionWalkthroughActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f111721r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_SectionWalkthroughActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f111721r) {
            return;
        }
        this.f111721r = true;
        ((x) ((Au.c) Au.f.a(this)).generatedComponent()).Z0((SectionWalkthroughActivity) Au.f.a(this));
    }

    Hilt_SectionWalkthroughActivity() {
        _initHiltInternal();
    }
}
