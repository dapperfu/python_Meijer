package com.meijer.mobile.meijer.activity.cart.entrynote;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_EntryNoteActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f102636r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_EntryNoteActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f102636r) {
            return;
        }
        this.f102636r = true;
        ((f) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).B0((EntryNoteActivity) wu.f.a(this));
    }

    Hilt_EntryNoteActivity() {
        _initHiltInternal();
    }
}
