package com.google.firebase.remoteconfig.internal;

/* loaded from: classes7.dex */
public class v implements dg.h {

    /* renamed from: a, reason: collision with root package name */
    private final long f89327a;

    /* renamed from: b, reason: collision with root package name */
    private final int f89328b;

    /* renamed from: c, reason: collision with root package name */
    private final dg.i f89329c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f89330a;

        /* renamed from: b, reason: collision with root package name */
        private int f89331b;

        /* renamed from: c, reason: collision with root package name */
        private dg.i f89332c;

        private b() {
        }

        public v a() {
            return new v(this.f89330a, this.f89331b, this.f89332c);
        }

        b b(dg.i iVar) {
            this.f89332c = iVar;
            return this;
        }

        b c(int i10) {
            this.f89331b = i10;
            return this;
        }

        public b d(long j10) {
            this.f89330a = j10;
            return this;
        }
    }

    private v(long j10, int i10, dg.i iVar) {
        this.f89327a = j10;
        this.f89328b = i10;
        this.f89329c = iVar;
    }

    static b b() {
        return new b();
    }

    @Override // dg.h
    public int a() {
        return this.f89328b;
    }
}
