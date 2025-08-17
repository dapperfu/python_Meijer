package com.meijer.mobile.meijer.activity.personalized.modals;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_PersonalizedShoppingListActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f110947r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_PersonalizedShoppingListActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f110947r) {
            return;
        }
        this.f110947r = true;
        ((InterfaceC12477m0) ((Au.c) Au.f.a(this)).generatedComponent()).K((PersonalizedShoppingListActivity) Au.f.a(this));
    }

    Hilt_PersonalizedShoppingListActivity() {
        _initHiltInternal();
    }
}
