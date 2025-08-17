package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
final class X6 {

    /* renamed from: b, reason: collision with root package name */
    static final X6 f82960b = new X6(new a("Failure occurred while trying to finish a future."));

    /* renamed from: a, reason: collision with root package name */
    final Throwable f82961a;

    class a extends Throwable {
        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }

        a(String str) {
            super("Failure occurred while trying to finish a future.");
        }
    }

    X6(Throwable th2) {
        th2.getClass();
        this.f82961a = th2;
    }
}
