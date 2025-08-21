package com.meijer.mobile.meijer.activity.shoppinglist;

import android.content.Context;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_LegacyShoppingListActivity extends ShoppingListBaseActivity {

    /* renamed from: v, reason: collision with root package name */
    private boolean f113205v = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_LegacyShoppingListActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.Hilt_ShoppingListBaseActivity, com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f113205v) {
            return;
        }
        this.f113205v = true;
        ((b) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).l0((LegacyShoppingListActivity) wu.f.a(this));
    }

    Hilt_LegacyShoppingListActivity() {
        _initHiltInternal();
    }
}
