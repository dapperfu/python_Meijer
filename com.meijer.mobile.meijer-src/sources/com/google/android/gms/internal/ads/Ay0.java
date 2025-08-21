package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class Ay0 extends androidx.browser.customtabs.e {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f66216b;

    @Override // androidx.browser.customtabs.e
    public final void a(ComponentName componentName, androidx.browser.customtabs.c cVar) {
        C7086Mf c7086Mf = (C7086Mf) this.f66216b.get();
        if (c7086Mf != null) {
            c7086Mf.c(cVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C7086Mf c7086Mf = (C7086Mf) this.f66216b.get();
        if (c7086Mf != null) {
            c7086Mf.d();
        }
    }

    public Ay0(C7086Mf c7086Mf) {
        this.f66216b = new WeakReference(c7086Mf);
    }
}
