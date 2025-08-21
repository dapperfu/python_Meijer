package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class G90 {

    /* renamed from: a, reason: collision with root package name */
    private final Sc.x f67957a;

    /* renamed from: b, reason: collision with root package name */
    private final Sc.u f67958b;

    /* renamed from: c, reason: collision with root package name */
    private final Yj0 f67959c;

    /* renamed from: d, reason: collision with root package name */
    private final H90 f67960d;

    private final com.google.common.util.concurrent.q e(final String str, final long j10, final int i10) {
        final String str2;
        Sc.x xVar = this.f67957a;
        if (i10 > xVar.c()) {
            H90 h90 = this.f67960d;
            if (h90 == null || !xVar.d()) {
                return Mj0.h(Sc.t.RETRIABLE_FAILURE);
            }
            h90.a(str, "", 2);
            return Mj0.h(Sc.t.BUFFERED);
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77406w8)).booleanValue()) {
            Uri uri = Uri.parse(str);
            String encodedQuery = uri.getEncodedQuery();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            builderClearQuery.appendQueryParameter("pa", Integer.toString(i10));
            str2 = String.valueOf(builderClearQuery.build()) + "&" + encodedQuery;
        } else {
            str2 = str;
        }
        InterfaceC9541sj0 interfaceC9541sj0 = new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.F90
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f67591a.c(i10, j10, str, (Sc.t) obj);
            }
        };
        return j10 == 0 ? Mj0.n(this.f67959c.k0(new Callable() { // from class: com.google.android.gms.internal.ads.E90
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f67200a.a(str2);
            }
        }), interfaceC9541sj0, this.f67959c) : Mj0.n(this.f67959c.schedule(new Callable() { // from class: com.google.android.gms.internal.ads.D90
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f67018a.b(str2);
            }
        }, j10, TimeUnit.MILLISECONDS), interfaceC9541sj0, this.f67959c);
    }

    final /* synthetic */ Sc.t a(String str) throws Exception {
        return this.f67958b.zza(str);
    }

    final /* synthetic */ Sc.t b(String str) throws Exception {
        return this.f67958b.zza(str);
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(int i10, long j10, String str, Sc.t tVar) throws Exception {
        if (tVar != Sc.t.RETRIABLE_FAILURE) {
            return Mj0.h(tVar);
        }
        Sc.x xVar = this.f67957a;
        long jB = xVar.b();
        if (i10 != 1) {
            jB = (long) (xVar.a() * j10);
        }
        return e(str, jB, i10 + 1);
    }

    public final com.google.common.util.concurrent.q d(String str) {
        try {
            return e(str, 0L, 1);
        } catch (NullPointerException | RejectedExecutionException unused) {
            return Mj0.h(Sc.t.PERMANENT_FAILURE);
        }
    }

    public G90(Sc.x xVar, Sc.u uVar, Yj0 yj0, H90 h90) {
        this.f67957a = xVar;
        this.f67958b = uVar;
        this.f67959c = yj0;
        this.f67960d = h90;
    }
}
