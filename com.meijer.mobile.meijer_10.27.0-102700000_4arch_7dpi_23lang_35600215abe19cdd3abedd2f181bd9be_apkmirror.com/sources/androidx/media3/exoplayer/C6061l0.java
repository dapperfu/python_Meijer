package androidx.media3.exoplayer;

import d3.C13466a;
import java.util.Objects;

/* renamed from: androidx.media3.exoplayer.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6061l0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f56324a;

    /* renamed from: b, reason: collision with root package name */
    public final float f56325b;

    /* renamed from: c, reason: collision with root package name */
    public final long f56326c;

    /* renamed from: androidx.media3.exoplayer.l0$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private long f56327a;

        /* renamed from: b, reason: collision with root package name */
        private float f56328b;

        /* renamed from: c, reason: collision with root package name */
        private long f56329c;

        public b g(float f10) {
            C13466a.a(f10 > 0.0f || f10 == -3.4028235E38f);
            this.f56328b = f10;
            return this;
        }

        public b() {
            this.f56327a = -9223372036854775807L;
            this.f56328b = -3.4028235E38f;
            this.f56329c = -9223372036854775807L;
        }

        public C6061l0 d() {
            return new C6061l0(this);
        }

        public b e(long j10) {
            C13466a.a(j10 >= 0 || j10 == -9223372036854775807L);
            this.f56329c = j10;
            return this;
        }

        public b f(long j10) {
            this.f56327a = j10;
            return this;
        }

        private b(C6061l0 c6061l0) {
            this.f56327a = c6061l0.f56324a;
            this.f56328b = c6061l0.f56325b;
            this.f56329c = c6061l0.f56326c;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6061l0)) {
            return false;
        }
        C6061l0 c6061l0 = (C6061l0) obj;
        return this.f56324a == c6061l0.f56324a && this.f56325b == c6061l0.f56325b && this.f56326c == c6061l0.f56326c;
    }

    private C6061l0(b bVar) {
        this.f56324a = bVar.f56327a;
        this.f56325b = bVar.f56328b;
        this.f56326c = bVar.f56329c;
    }

    public b a() {
        return new b();
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f56324a), Float.valueOf(this.f56325b), Long.valueOf(this.f56326c));
    }
}
