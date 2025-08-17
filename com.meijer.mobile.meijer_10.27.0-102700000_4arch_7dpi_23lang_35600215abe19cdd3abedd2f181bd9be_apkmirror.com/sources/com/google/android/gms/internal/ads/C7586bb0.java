package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.bb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7586bb0 extends C7905eb0 {

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static final C7586bb0 f72835d = new C7586bb0();

    private C7586bb0() {
    }

    public static C7586bb0 i() {
        return f72835d;
    }

    @Override // com.google.android.gms.internal.ads.C7905eb0
    public final void b(boolean z10) {
        Iterator it = C7692cb0.a().c().iterator();
        while (it.hasNext()) {
            ((C6885Ka0) it.next()).g().k(z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.C7905eb0
    public final boolean c() {
        Iterator it = C7692cb0.a().b().iterator();
        while (it.hasNext()) {
            View viewF = ((C6885Ka0) it.next()).f();
            if (viewF != null && viewF.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
