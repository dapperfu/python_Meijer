package com.google.android.gms.internal.ads;

import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.InterfaceC5509c;
import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.cc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7819cc0 {

    /* renamed from: e, reason: collision with root package name */
    private static volatile int f74051e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f74052f = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Context f74053a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f74054b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC5516j f74055c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f74056d;

    static void g(int i10) {
        f74051e = i10;
    }

    public final AbstractC5516j b(int i10, String str) {
        return h(i10, 0L, null, null, null, str);
    }

    public final AbstractC5516j c(int i10, long j10, Exception exc) {
        return h(i10, j10, exc, null, null, null);
    }

    public final AbstractC5516j d(int i10, long j10) {
        return h(i10, j10, null, null, null, null);
    }

    public final AbstractC5516j e(int i10, long j10, String str) {
        return h(i10, j10, null, null, null, str);
    }

    public final AbstractC5516j f(int i10, long j10, String str, Map map) {
        return h(i10, j10, null, str, null, null);
    }

    public static C7819cc0 a(final Context context, Executor executor, boolean z10) {
        final C5517k c5517k = new C5517k();
        if (z10) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ac0
                @Override // java.lang.Runnable
                public final void run() {
                    c5517k.c(C7928dd0.b(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.bc0
                @Override // java.lang.Runnable
                public final void run() {
                    c5517k.c(C7928dd0.c());
                }
            });
        }
        return new C7819cc0(context, executor, c5517k.a(), z10);
    }

    private final AbstractC5516j h(final int i10, long j10, Exception exc, String str, Map map, String str2) {
        if (!this.f74056d) {
            return this.f74055c.j(this.f74054b, new InterfaceC5509c() { // from class: com.google.android.gms.internal.ads.Yb0
                @Override // Vd.InterfaceC5509c
                public final Object then(AbstractC5516j abstractC5516j) {
                    return Boolean.valueOf(abstractC5516j.r());
                }
            });
        }
        Context context = this.f74053a;
        final Q7 q7B0 = U7.b0();
        q7B0.u(context.getPackageName());
        q7B0.y(j10);
        q7B0.D(f74051e);
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
        return this.f74055c.j(this.f74054b, new InterfaceC5509c() { // from class: com.google.android.gms.internal.ads.Zb0
            @Override // Vd.InterfaceC5509c
            public final Object then(AbstractC5516j abstractC5516j) {
                int i11 = C7819cc0.f74052f;
                if (!abstractC5516j.r()) {
                    return Boolean.FALSE;
                }
                int i12 = i10;
                C7715bd0 c7715bd0A = ((C7928dd0) abstractC5516j.n()).a(((U7) q7B0.p()).j());
                c7715bd0A.a(i12);
                c7715bd0A.c();
                return Boolean.TRUE;
            }
        });
    }

    public C7819cc0(Context context, Executor executor, AbstractC5516j abstractC5516j, boolean z10) {
        this.f74053a = context;
        this.f74054b = executor;
        this.f74055c = abstractC5516j;
        this.f74056d = z10;
    }
}
