package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class Ay0 extends androidx.browser.customtabs.e {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f65376b;

    @Override // androidx.browser.customtabs.e
    public final void a(ComponentName componentName, androidx.browser.customtabs.c cVar) {
        C6961Mf c6961Mf = (C6961Mf) this.f65376b.get();
        if (c6961Mf != null) {
            c6961Mf.c(cVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C6961Mf c6961Mf = (C6961Mf) this.f65376b.get();
        if (c6961Mf != null) {
            c6961Mf.d();
        }
    }

    public Ay0(C6961Mf c6961Mf) {
        this.f65376b = new WeakReference(c6961Mf);
    }
}
