package androidx.media3.exoplayer;

import d3.C13599a;
import java.util.Objects;

/* renamed from: androidx.media3.exoplayer.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6203l0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f56548a;

    /* renamed from: b, reason: collision with root package name */
    public final float f56549b;

    /* renamed from: c, reason: collision with root package name */
    public final long f56550c;

    /* renamed from: androidx.media3.exoplayer.l0$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private long f56551a;

        /* renamed from: b, reason: collision with root package name */
        private float f56552b;

        /* renamed from: c, reason: collision with root package name */
        private long f56553c;

        public b g(float f10) {
            C13599a.a(f10 > 0.0f || f10 == -3.4028235E38f);
            this.f56552b = f10;
            return this;
        }

        public b() {
            this.f56551a = -9223372036854775807L;
            this.f56552b = -3.4028235E38f;
            this.f56553c = -9223372036854775807L;
        }

        public C6203l0 d() {
            return new C6203l0(this);
        }

        public b e(long j10) {
            C13599a.a(j10 >= 0 || j10 == -9223372036854775807L);
            this.f56553c = j10;
            return this;
        }

        public b f(long j10) {
            this.f56551a = j10;
            return this;
        }

        private b(C6203l0 c6203l0) {
            this.f56551a = c6203l0.f56548a;
            this.f56552b = c6203l0.f56549b;
            this.f56553c = c6203l0.f56550c;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6203l0)) {
            return false;
        }
        C6203l0 c6203l0 = (C6203l0) obj;
        return this.f56548a == c6203l0.f56548a && this.f56549b == c6203l0.f56549b && this.f56550c == c6203l0.f56550c;
    }

    private C6203l0(b bVar) {
        this.f56548a = bVar.f56551a;
        this.f56549b = bVar.f56552b;
        this.f56550c = bVar.f56553c;
    }

    public b a() {
        return new b();
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f56548a), Float.valueOf(this.f56549b), Long.valueOf(this.f56550c));
    }
}
