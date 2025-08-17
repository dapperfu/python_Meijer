package com.google.firebase.installations;

import com.google.firebase.installations.f;

/* loaded from: classes7.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f88729a;

    /* renamed from: b, reason: collision with root package name */
    private final long f88730b;

    /* renamed from: c, reason: collision with root package name */
    private final long f88731c;

    static final class b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f88732a;

        /* renamed from: b, reason: collision with root package name */
        private Long f88733b;

        /* renamed from: c, reason: collision with root package name */
        private Long f88734c;

        @Override // com.google.firebase.installations.f.a
        public f a() {
            String str = "";
            if (this.f88732a == null) {
                str = " token";
            }
            if (this.f88733b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f88734c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f88732a, this.f88733b.longValue(), this.f88734c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.f.a
        public f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f88732a = str;
            return this;
        }

        b() {
        }

        @Override // com.google.firebase.installations.f.a
        public f.a c(long j10) {
            this.f88734c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.f.a
        public f.a d(long j10) {
            this.f88733b = Long.valueOf(j10);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f88729a.equals(fVar.b()) && this.f88730b == fVar.d() && this.f88731c == fVar.c()) {
                return true;
            }
        }
        return false;
    }

    private a(String str, long j10, long j11) {
        this.f88729a = str;
        this.f88730b = j10;
        this.f88731c = j11;
    }

    @Override // com.google.firebase.installations.f
    public String b() {
        return this.f88729a;
    }

    @Override // com.google.firebase.installations.f
    public long c() {
        return this.f88731c;
    }

    @Override // com.google.firebase.installations.f
    public long d() {
        return this.f88730b;
    }

    public int hashCode() {
        int iHashCode = (this.f88729a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f88730b;
        long j11 = this.f88731c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f88729a + ", tokenExpirationTimestamp=" + this.f88730b + ", tokenCreationTimestamp=" + this.f88731c + "}";
    }
}
