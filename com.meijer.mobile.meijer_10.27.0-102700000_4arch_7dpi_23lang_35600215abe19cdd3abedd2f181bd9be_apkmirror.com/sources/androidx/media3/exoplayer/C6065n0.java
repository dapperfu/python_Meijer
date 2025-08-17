package androidx.media3.exoplayer;

import androidx.media3.exoplayer.source.r;
import d3.C13466a;
import java.util.Objects;

/* renamed from: androidx.media3.exoplayer.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6065n0 {

    /* renamed from: a, reason: collision with root package name */
    public final r.b f56513a;

    /* renamed from: b, reason: collision with root package name */
    public final long f56514b;

    /* renamed from: c, reason: collision with root package name */
    public final long f56515c;

    /* renamed from: d, reason: collision with root package name */
    public final long f56516d;

    /* renamed from: e, reason: collision with root package name */
    public final long f56517e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f56518f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f56519g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f56520h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f56521i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f56522j;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6065n0.class == obj.getClass()) {
            C6065n0 c6065n0 = (C6065n0) obj;
            if (this.f56514b == c6065n0.f56514b && this.f56515c == c6065n0.f56515c && this.f56516d == c6065n0.f56516d && this.f56517e == c6065n0.f56517e && this.f56518f == c6065n0.f56518f && this.f56519g == c6065n0.f56519g && this.f56520h == c6065n0.f56520h && this.f56521i == c6065n0.f56521i && this.f56522j == c6065n0.f56522j && Objects.equals(this.f56513a, c6065n0.f56513a)) {
                return true;
            }
        }
        return false;
    }

    C6065n0(r.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        C13466a.a(!z14 || z12);
        C13466a.a(!z13 || z12);
        if (z11 && (z12 || z13 || z14)) {
            z15 = false;
        }
        C13466a.a(z15);
        this.f56513a = bVar;
        this.f56514b = j10;
        this.f56515c = j11;
        this.f56516d = j12;
        this.f56517e = j13;
        this.f56518f = z10;
        this.f56519g = z11;
        this.f56520h = z12;
        this.f56521i = z13;
        this.f56522j = z14;
    }

    public C6065n0 a(long j10) {
        return j10 == this.f56515c ? this : new C6065n0(this.f56513a, this.f56514b, j10, this.f56516d, this.f56517e, this.f56518f, this.f56519g, this.f56520h, this.f56521i, this.f56522j);
    }

    public C6065n0 b(long j10) {
        return j10 == this.f56514b ? this : new C6065n0(this.f56513a, j10, this.f56515c, this.f56516d, this.f56517e, this.f56518f, this.f56519g, this.f56520h, this.f56521i, this.f56522j);
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f56513a.hashCode()) * 31) + ((int) this.f56514b)) * 31) + ((int) this.f56515c)) * 31) + ((int) this.f56516d)) * 31) + ((int) this.f56517e)) * 31) + (this.f56518f ? 1 : 0)) * 31) + (this.f56519g ? 1 : 0)) * 31) + (this.f56520h ? 1 : 0)) * 31) + (this.f56521i ? 1 : 0)) * 31) + (this.f56522j ? 1 : 0);
    }
}
