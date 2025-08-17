package com.google.android.gms.internal.ads;

import Td.AbstractC5232j;
import Td.C5233k;
import Td.InterfaceC5225c;
import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.cc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7694cc0 {

    /* renamed from: e, reason: collision with root package name */
    private static volatile int f73211e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f73212f = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Context f73213a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f73214b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC5232j f73215c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f73216d;

    static void g(int i10) {
        f73211e = i10;
    }

    public final AbstractC5232j b(int i10, String str) {
        return h(i10, 0L, null, null, null, str);
    }

    public final AbstractC5232j c(int i10, long j10, Exception exc) {
        return h(i10, j10, exc, null, null, null);
    }

    public final AbstractC5232j d(int i10, long j10) {
        return h(i10, j10, null, null, null, null);
    }

    public final AbstractC5232j e(int i10, long j10, String str) {
        return h(i10, j10, null, null, null, str);
    }

    public final AbstractC5232j f(int i10, long j10, String str, Map map) {
        return h(i10, j10, null, str, null, null);
    }

    public static C7694cc0 a(final Context context, Executor executor, boolean z10) {
        final C5233k c5233k = new C5233k();
        if (z10) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ac0
                @Override // java.lang.Runnable
                public final void run() {
                    c5233k.c(C7803dd0.b(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.bc0
                @Override // java.lang.Runnable
                public final void run() {
                    c5233k.c(C7803dd0.c());
                }
            });
        }
        return new C7694cc0(context, executor, c5233k.a(), z10);
    }

    private final AbstractC5232j h(final int i10, long j10, Exception exc, String str, Map map, String str2) {
        if (!this.f73216d) {
            return this.f73215c.j(this.f73214b, new InterfaceC5225c() { // from class: com.google.android.gms.internal.ads.Yb0
                @Override // Td.InterfaceC5225c
                public final Object then(AbstractC5232j abstractC5232j) {
                    return Boolean.valueOf(abstractC5232j.r());
                }
            });
        }
        Context context = this.f73213a;
        final Q7 q7B0 = U7.b0();
        q7B0.u(context.getPackageName());
        q7B0.y(j10);
        q7B0.D(f73211e);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            q7B0.z(stringWriter.toString());
            q7B0.x(exc.getClass().getName());
        }
        if (str2 != null) {
            q7B0.v(str2);
        }
        if (str != null) {
            q7B0.w(str);
        }
        return this.f73215c.j(this.f73214b, new InterfaceC5225c() { // from class: com.google.android.gms.internal.ads.Zb0
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j) {
                int i11 = C7694cc0.f73212f;
                if (!abstractC5232j.r()) {
                    return Boolean.FALSE;
                }
                int i12 = i10;
                C7590bd0 c7590bd0A = ((C7803dd0) abstractC5232j.n()).a(((U7) q7B0.p()).j());
                c7590bd0A.a(i12);
                c7590bd0A.c();
                return Boolean.TRUE;
            }
        });
    }

    public C7694cc0(Context context, Executor executor, AbstractC5232j abstractC5232j, boolean z10) {
        this.f73213a = context;
        this.f73214b = executor;
        this.f73215c = abstractC5232j;
        this.f73216d = z10;
    }
}
