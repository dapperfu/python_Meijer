package com.meijer.mobile.meijer.activity.digitalreceipts;

import android.content.Context;
import com.meijer.mobile.mperks.ux.MperksFeatureActivity;
import f.InterfaceC13892b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
public abstract class Hilt_AddReceiptActivity extends MperksFeatureActivity {

    /* renamed from: C, reason: collision with root package name */
    private boolean f106318C = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_AddReceiptActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // com.meijer.mobile.mperks.ux.Hilt_MperksFeatureActivity
    protected void inject() {
        if (this.f106318C) {
            return;
        }
        this.f106318C = true;
        ((InterfaceC12146e) ((InterfaceC17928c) wu.f.a(this)).generatedComponent()).T((AddReceiptActivity) wu.f.a(this));
    }

    Hilt_AddReceiptActivity() {
        _initHiltInternal();
    }
}
