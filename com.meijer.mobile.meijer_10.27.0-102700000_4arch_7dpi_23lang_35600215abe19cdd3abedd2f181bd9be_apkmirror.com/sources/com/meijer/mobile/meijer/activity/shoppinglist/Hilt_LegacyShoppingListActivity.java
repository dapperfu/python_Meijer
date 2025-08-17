package com.meijer.mobile.meijer.activity.shoppinglist;

import android.content.Context;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_LegacyShoppingListActivity extends ShoppingListBaseActivity {

    /* renamed from: v, reason: collision with root package name */
    private boolean f112353v = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_LegacyShoppingListActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.Hilt_ShoppingListBaseActivity, com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f112353v) {
            return;
        }
        this.f112353v = true;
        ((b) ((Au.c) Au.f.a(this)).generatedComponent()).l0((LegacyShoppingListActivity) Au.f.a(this));
    }

    Hilt_LegacyShoppingListActivity() {
        _initHiltInternal();
    }
}
