package com.google.android.gms.internal.pal;

import Kc.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.pal.q4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10978q4 extends L4 {
    public C10978q4(X3 x32, String str, String str2, Ya ya2, int i10, int i11) {
        super(x32, "ysEnh8zkgcN8WwINs5FP7vGybZW2TtVSX36HO6emvdUrcCkVbC9hrF5Pe5ZSZx3i", "3LpdW89cIASEFv5WvS5ZDEWsiVGQitP33SL3WZgJ6zE=", ya2, i10, 24);
    }

    private final void c() throws ExecutionException, InterruptedException, TimeoutException {
        Kc.a aVarH = this.f83580b.h();
        if (aVarH == null) {
            return;
        }
        try {
            a.C0277a c0277aB = aVarH.b();
            String strD = C10717a4.d(c0277aB.a());
            if (strD != null) {
                synchronized (this.f83583e) {
                    this.f83583e.t0(strD);
                    this.f83583e.s0(c0277aB.b());
                    this.f83583e.V(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws ExecutionException, IllegalAccessException, InterruptedException, TimeoutException, InvocationTargetException {
        if (this.f83580b.q()) {
            c();
            return;
        }
        synchronized (this.f83583e) {
            this.f83583e.t0((String) this.f83584f.invoke(null, this.f83580b.b()));
        }
    }

    @Override // com.google.android.gms.internal.pal.L4
    public final Void b() throws Exception {
        if (this.f83580b.r()) {
            super.b();
            return null;
        }
        if (this.f83580b.q()) {
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
