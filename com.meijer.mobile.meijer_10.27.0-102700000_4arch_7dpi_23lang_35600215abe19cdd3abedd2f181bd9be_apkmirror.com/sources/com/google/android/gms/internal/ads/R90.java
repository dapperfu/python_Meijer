package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class R90 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f69792a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f69793b;

    /* renamed from: c, reason: collision with root package name */
    private final Yj0 f69794c;

    /* renamed from: d, reason: collision with root package name */
    private final Qc.u f69795d;

    /* renamed from: e, reason: collision with root package name */
    private final H90 f69796e;

    /* renamed from: f, reason: collision with root package name */
    private final Z80 f69797f;

    final /* synthetic */ Qc.t a(String str) throws Exception {
        return this.f69795d.zza(str);
    }

    final com.google.common.util.concurrent.q c(final String str, Qc.v vVar) {
        if (vVar == null) {
            return this.f69794c.i0(new Callable() { // from class: com.google.android.gms.internal.ads.N90
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f68824a.a(str);
                }
            });
        }
        return new G90(vVar.b(), this.f69795d, this.f69794c, this.f69796e).d(str);
    }

    R90(Context context, Executor executor, Yj0 yj0, Qc.u uVar, H90 h90, Z80 z80) {
        this.f69792a = context;
        this.f69793b = executor;
        this.f69794c = yj0;
        this.f69795d = uVar;
        this.f69796e = h90;
        this.f69797f = z80;
    }

    public final void d(final String str, final Qc.v vVar, W80 w80) {
        if (Z80.a() && ((Boolean) C8021fg.f74137d.e()).booleanValue()) {
            K80 k80A = J80.a(this.f69792a, 14);
            k80A.zzi();
            Mj0.r(c(str, vVar), new P90(this, k80A, w80), this.f69793b);
            return;
        }
        this.f69793b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.O90
            @Override // java.lang.Runnable
            public final void run() {
                this.f69015a.c(str, vVar);
            }
        });
    }

    public final void e(List list, Qc.v vVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d((String) it.next(), vVar, null);
        }
    }
}
