package com.meijer.mobile.shoppinglist.activity;

import android.content.Context;
import com.meijer.mobile.shoppinglist.di.ShoppingListFeatureActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;
import wu.f;

/* loaded from: classes12.dex */
abstract class Hilt_ShoppingListActivity extends ShoppingListFeatureActivity {

    /* renamed from: z, reason: collision with root package name */
    private boolean f117978z = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_ShoppingListActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.shoppinglist.di.Hilt_ShoppingListFeatureActivity
    protected void inject() {
        if (this.f117978z) {
            return;
        }
        this.f117978z = true;
        ((d) ((InterfaceC17928c) f.a(this)).generatedComponent()).N((ShoppingListActivity) f.a(this));
    }

    Hilt_ShoppingListActivity() {
        _initHiltInternal();
    }
}
