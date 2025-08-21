package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
abstract class B1 {

    /* renamed from: a, reason: collision with root package name */
    protected final X0 f66242a;

    protected B1(X0 x02) {
        this.f66242a = x02;
    }

    protected abstract boolean a(GQ gq2) throws zzbc;

    protected abstract boolean b(GQ gq2, long j10) throws zzbc;

    public final boolean c(GQ gq2, long j10) throws zzbc {
        if (a(gq2) && b(gq2, j10)) {
            return true;
        }
        return false;
    }
}
