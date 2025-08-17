package com.meijer.mobile.meijer.activity.cart.entrynote;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_EntryNoteActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f101781r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_EntryNoteActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f101781r) {
            return;
        }
        this.f101781r = true;
        ((f) ((Au.c) Au.f.a(this)).generatedComponent()).B0((EntryNoteActivity) Au.f.a(this));
    }

    Hilt_EntryNoteActivity() {
        _initHiltInternal();
    }
}
