package com.meijer.mobile.meijer.activity.shoppinglist;

import android.content.Context;
import com.meijer.mobile.meijer.activity.MeijerActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_ShoppingListBaseActivity extends MeijerActivity {

    /* renamed from: r, reason: collision with root package name */
    private boolean f113207r = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_ShoppingListBaseActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity
    protected void inject() {
        if (this.f113207r) {
            return;
        }
        this.f113207r = true;
        ((c) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).l1((ShoppingListBaseActivity) wu.f.a(this));
    }

    Hilt_ShoppingListBaseActivity() {
        _initHiltInternal();
    }
}
