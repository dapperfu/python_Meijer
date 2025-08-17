package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class G90 {

    /* renamed from: a, reason: collision with root package name */
    private final Qc.x f67117a;

    /* renamed from: b, reason: collision with root package name */
    private final Qc.u f67118b;

    /* renamed from: c, reason: collision with root package name */
    private final Yj0 f67119c;

    /* renamed from: d, reason: collision with root package name */
    private final H90 f67120d;

    private final com.google.common.util.concurrent.q e(final String str, final long j10, final int i10) {
        final String str2;
        Qc.x xVar = this.f67117a;
        if (i10 > xVar.c()) {
            H90 h90 = this.f67120d;
            if (h90 == null || !xVar.d()) {
                return Mj0.h(Qc.t.RETRIABLE_FAILURE);
            }
            h90.a(str, "", 2);
            return Mj0.h(Qc.t.BUFFERED);
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76566w8)).booleanValue()) {
            Uri uri = Uri.parse(str);
            String encodedQuery = uri.getEncodedQuery();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            builderClearQuery.appendQueryParameter("pa", Integer.toString(i10));
            str2 = String.valueOf(builderClearQuery.build()) + "&" + encodedQuery;
        } else {
            str2 = str;
        }
        InterfaceC9416sj0 interfaceC9416sj0 = new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.F90
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f66751a.c(i10, j10, str, (Qc.t) obj);
            }
        };
        return j10 == 0 ? Mj0.n(this.f67119c.i0(new Callable() { // from class: com.google.android.gms.internal.ads.E90
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f66360a.a(str2);
            }
        }), interfaceC9416sj0, this.f67119c) : Mj0.n(this.f67119c.schedule(new Callable() { // from class: com.google.android.gms.internal.ads.D90
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f66178a.b(str2);
            }
        }, j10, TimeUnit.MILLISECONDS), interfaceC9416sj0, this.f67119c);
    }

    final /* synthetic */ Qc.t a(String str) throws Exception {
        return this.f67118b.zza(str);
    }

    final /* synthetic */ Qc.t b(String str) throws Exception {
        return this.f67118b.zza(str);
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(int i10, long j10, String str, Qc.t tVar) throws Exception {
        if (tVar != Qc.t.RETRIABLE_FAILURE) {
            return Mj0.h(tVar);
        }
        Qc.x xVar = this.f67117a;
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
            return Mj0.h(Qc.t.PERMANENT_FAILURE);
        }
    }

    public G90(Qc.x xVar, Qc.u uVar, Yj0 yj0, H90 h90) {
        this.f67117a = xVar;
        this.f67118b = uVar;
        this.f67119c = yj0;
        this.f67120d = h90;
    }
}
