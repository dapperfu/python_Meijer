package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.bb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7711bb0 extends C8030eb0 {

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static final C7711bb0 f73675d = new C7711bb0();

    private C7711bb0() {
    }

    public static C7711bb0 i() {
        return f73675d;
    }

    @Override // com.google.android.gms.internal.ads.C8030eb0
    public final void b(boolean z10) {
        Iterator it = C7817cb0.a().c().iterator();
        while (it.hasNext()) {
            ((C7010Ka0) it.next()).g().k(z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.C8030eb0
    public final boolean c() {
        Iterator it = C7817cb0.a().b().iterator();
        while (it.hasNext()) {
            View viewF = ((C7010Ka0) it.next()).f();
            if (viewF != null && viewF.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
