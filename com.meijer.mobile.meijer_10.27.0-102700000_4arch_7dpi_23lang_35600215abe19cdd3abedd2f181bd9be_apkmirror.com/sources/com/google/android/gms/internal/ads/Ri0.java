package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class Ri0 {

    /* renamed from: b, reason: collision with root package name */
    static final Ri0 f69924b = new Ri0(new a("Failure occurred while trying to finish a future."));

    /* renamed from: a, reason: collision with root package name */
    final Throwable f69925a;

    class a extends Throwable {
        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }

        a(String str) {
            super("Failure occurred while trying to finish a future.");
        }
    }

    Ri0(Throwable th2) {
        th2.getClass();
        this.f69925a = th2;
    }
}
