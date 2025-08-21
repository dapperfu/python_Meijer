package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class R90 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f70632a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f70633b;

    /* renamed from: c, reason: collision with root package name */
    private final Yj0 f70634c;

    /* renamed from: d, reason: collision with root package name */
    private final Sc.u f70635d;

    /* renamed from: e, reason: collision with root package name */
    private final H90 f70636e;

    /* renamed from: f, reason: collision with root package name */
    private final Z80 f70637f;

    final /* synthetic */ Sc.t a(String str) throws Exception {
        return this.f70635d.zza(str);
    }

    final com.google.common.util.concurrent.q c(final String str, Sc.v vVar) {
        if (vVar == null) {
            return this.f70634c.k0(new Callable() { // from class: com.google.android.gms.internal.ads.N90
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f69664a.a(str);
                }
            });
        }
        return new G90(vVar.b(), this.f70635d, this.f70634c, this.f70636e).d(str);
    }

    R90(Context context, Executor executor, Yj0 yj0, Sc.u uVar, H90 h90, Z80 z80) {
        this.f70632a = context;
        this.f70633b = executor;
        this.f70634c = yj0;
        this.f70635d = uVar;
        this.f70636e = h90;
        this.f70637f = z80;
    }

    public final void d(final String str, final Sc.v vVar, W80 w80) {
        if (Z80.a() && ((Boolean) C8146fg.f74977d.e()).booleanValue()) {
            K80 k80A = J80.a(this.f70632a, 14);
            k80A.zzi();
            Mj0.r(c(str, vVar), new P90(this, k80A, w80), this.f70633b);
            return;
        }
        this.f70633b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.O90
            @Override // java.lang.Runnable
            public final void run() {
                this.f69855a.c(str, vVar);
            }
        });
    }

    public final void e(List list, Sc.v vVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d((String) it.next(), vVar, null);
        }
    }
}
