package com.google.android.gms.ads;

import Ec.l;
import Ec.m;
import Mc.C4169y;
import Mc.Q0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.BinderC10061yl;

/* loaded from: classes4.dex */
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Q0 q0F = C4169y.a().f(this, new BinderC10061yl());
        if (q0F == null) {
            finish();
            return;
        }
        setContentView(m.f7789a);
        LinearLayout linearLayout = (LinearLayout) findViewById(l.f7788a);
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
            q0F.O3(stringExtra, com.google.android.gms.dynamic.d.F2(this), com.google.android.gms.dynamic.d.F2(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
