package com.meijer.mobile.meijer.activity.personalized.modals;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_PersonalizedShoppingListActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f111808r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_PersonalizedShoppingListActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f111808r) {
            return;
        }
        this.f111808r = true;
        ((InterfaceC12603m0) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).K((PersonalizedShoppingListActivity) wu.f.a(this));
    }

    Hilt_PersonalizedShoppingListActivity() {
        _initHiltInternal();
    }
}
