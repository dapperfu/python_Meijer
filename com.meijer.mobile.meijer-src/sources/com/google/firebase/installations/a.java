package com.google.firebase.installations;

import com.google.firebase.installations.f;

/* loaded from: classes8.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f89569a;

    /* renamed from: b, reason: collision with root package name */
    private final long f89570b;

    /* renamed from: c, reason: collision with root package name */
    private final long f89571c;

    static final class b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f89572a;

        /* renamed from: b, reason: collision with root package name */
        private Long f89573b;

        /* renamed from: c, reason: collision with root package name */
        private Long f89574c;

        @Override // com.google.firebase.installations.f.a
        public f a() {
            String str = "";
            if (this.f89572a == null) {
                str = " token";
            }
            if (this.f89573b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f89574c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f89572a, this.f89573b.longValue(), this.f89574c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.f.a
        public f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f89572a = str;
            return this;
        }

        b() {
        }

        @Override // com.google.firebase.installations.f.a
        public f.a c(long j10) {
            this.f89574c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.f.a
        public f.a d(long j10) {
            this.f89573b = Long.valueOf(j10);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f89569a.equals(fVar.b()) && this.f89570b == fVar.d() && this.f89571c == fVar.c()) {
                return true;
            }
        }
        return false;
    }

    private a(String str, long j10, long j11) {
        this.f89569a = str;
        this.f89570b = j10;
        this.f89571c = j11;
    }

    @Override // com.google.firebase.installations.f
    public String b() {
        return this.f89569a;
    }

    @Override // com.google.firebase.installations.f
    public long c() {
        return this.f89571c;
    }

    @Override // com.google.firebase.installations.f
    public long d() {
        return this.f89570b;
    }

    public int hashCode() {
        int iHashCode = (this.f89569a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f89570b;
        long j11 = this.f89571c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f89569a + ", tokenExpirationTimestamp=" + this.f89570b + ", tokenCreationTimestamp=" + this.f89571c + "}";
    }
}
