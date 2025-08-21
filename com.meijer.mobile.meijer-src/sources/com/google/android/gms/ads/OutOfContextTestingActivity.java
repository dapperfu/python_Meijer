package com.google.android.gms.ads;

import Gc.l;
import Gc.m;
import Oc.C4447y;
import Oc.Q0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.BinderC10186yl;

/* loaded from: classes4.dex */
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Q0 q0F = C4447y.a().f(this, new BinderC10186yl());
        if (q0F == null) {
            finish();
            return;
        }
        setContentView(m.f11341a);
        LinearLayout linearLayout = (LinearLayout) findViewById(l.f11340a);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            q0F.a4(stringExtra, com.google.android.gms.dynamic.d.I2(this), com.google.android.gms.dynamic.d.I2(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
