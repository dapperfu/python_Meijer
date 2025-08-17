package com.meijer.mobile.shoppinglist.activity;

import Au.f;
import android.content.Context;
import com.meijer.mobile.shoppinglist.di.ShoppingListFeatureActivity;
import f.InterfaceC13782b;

/* loaded from: classes11.dex */
abstract class Hilt_ShoppingListActivity extends ShoppingListFeatureActivity {

    /* renamed from: z, reason: collision with root package name */
    private boolean f117033z = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_ShoppingListActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.shoppinglist.di.Hilt_ShoppingListFeatureActivity
    protected void inject() {
        if (this.f117033z) {
            return;
        }
        this.f117033z = true;
        ((d) ((Au.c) f.a(this)).generatedComponent()).N((ShoppingListActivity) f.a(this));
    }

    Hilt_ShoppingListActivity() {
        _initHiltInternal();
    }
}
