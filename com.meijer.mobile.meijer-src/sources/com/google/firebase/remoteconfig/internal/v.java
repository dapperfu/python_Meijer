package com.google.firebase.remoteconfig.internal;

/* loaded from: classes8.dex */
public class v implements fg.h {

    /* renamed from: a, reason: collision with root package name */
    private final long f90169a;

    /* renamed from: b, reason: collision with root package name */
    private final int f90170b;

    /* renamed from: c, reason: collision with root package name */
    private final fg.i f90171c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f90172a;

        /* renamed from: b, reason: collision with root package name */
        private int f90173b;

        /* renamed from: c, reason: collision with root package name */
        private fg.i f90174c;

        private b() {
        }

        public v a() {
            return new v(this.f90172a, this.f90173b, this.f90174c);
        }

        b b(fg.i iVar) {
            this.f90174c = iVar;
            return this;
        }

        b c(int i10) {
            this.f90173b = i10;
            return this;
        }

        public b d(long j10) {
            this.f90172a = j10;
            return this;
        }
    }

    private v(long j10, int i10, fg.i iVar) {
        this.f90169a = j10;
        this.f90170b = i10;
        this.f90171c = iVar;
    }

    static b b() {
        return new b();
    }

    @Override // fg.h
    public int a() {
        return this.f90170b;
    }
}
