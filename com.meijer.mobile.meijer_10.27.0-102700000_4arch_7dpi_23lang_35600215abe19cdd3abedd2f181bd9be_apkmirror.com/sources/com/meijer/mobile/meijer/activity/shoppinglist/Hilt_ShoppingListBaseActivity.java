package com.meijer.mobile.meijer.activity.shoppinglist;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13782b;

/* loaded from: classes9.dex */
abstract class Hilt_ShoppingListBaseActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f112355r = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_ShoppingListBaseActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f112355r) {
            return;
        }
        this.f112355r = true;
        ((c) ((Au.c) Au.f.a(this)).generatedComponent()).l1((ShoppingListBaseActivity) Au.f.a(this));
    }

    Hilt_ShoppingListBaseActivity() {
        _initHiltInternal();
    }
}
