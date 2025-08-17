package com.google.android.gms.internal.pal;

import Ic.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.pal.q4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10853q4 extends L4 {
    public C10853q4(X3 x32, String str, String str2, Ya ya2, int i10, int i11) {
        super(x32, "ysEnh8zkgcN8WwINs5FP7vGybZW2TtVSX36HO6emvdUrcCkVbC9hrF5Pe5ZSZx3i", "3LpdW89cIASEFv5WvS5ZDEWsiVGQitP33SL3WZgJ6zE=", ya2, i10, 24);
    }

    private final void c() throws ExecutionException, InterruptedException, TimeoutException {
        Ic.a aVarH = this.f82740b.h();
        if (aVarH == null) {
            return;
        }
        try {
            a.C0217a c0217aB = aVarH.b();
            String strD = C10592a4.d(c0217aB.a());
            if (strD != null) {
                synchronized (this.f82743e) {
                    this.f82743e.t0(strD);
                    this.f82743e.s0(c0217aB.b());
                    this.f82743e.V(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws ExecutionException, IllegalAccessException, InterruptedException, TimeoutException, InvocationTargetException {
        if (this.f82740b.q()) {
            c();
            return;
        }
        synchronized (this.f82743e) {
            this.f82743e.t0((String) this.f82744f.invoke(null, this.f82740b.b()));
        }
    }

    @Override // com.google.android.gms.internal.pal.L4
    public final Void b() throws Exception {
        if (this.f82740b.r()) {
            super.b();
            return null;
        }
        if (this.f82740b.q()) {
            c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.pal.L4, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        b();
        return null;
    }
}
