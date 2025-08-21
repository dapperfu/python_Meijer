package androidx.media3.exoplayer;

import androidx.media3.exoplayer.source.r;
import d3.C13599a;
import java.util.Objects;

/* renamed from: androidx.media3.exoplayer.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6207n0 {

    /* renamed from: a, reason: collision with root package name */
    public final r.b f56737a;

    /* renamed from: b, reason: collision with root package name */
    public final long f56738b;

    /* renamed from: c, reason: collision with root package name */
    public final long f56739c;

    /* renamed from: d, reason: collision with root package name */
    public final long f56740d;

    /* renamed from: e, reason: collision with root package name */
    public final long f56741e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f56742f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f56743g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f56744h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f56745i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f56746j;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6207n0.class == obj.getClass()) {
            C6207n0 c6207n0 = (C6207n0) obj;
            if (this.f56738b == c6207n0.f56738b && this.f56739c == c6207n0.f56739c && this.f56740d == c6207n0.f56740d && this.f56741e == c6207n0.f56741e && this.f56742f == c6207n0.f56742f && this.f56743g == c6207n0.f56743g && this.f56744h == c6207n0.f56744h && this.f56745i == c6207n0.f56745i && this.f56746j == c6207n0.f56746j && Objects.equals(this.f56737a, c6207n0.f56737a)) {
                return true;
            }
        }
        return false;
    }

    C6207n0(r.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        C13599a.a(!z14 || z12);
        C13599a.a(!z13 || z12);
        if (z11 && (z12 || z13 || z14)) {
            z15 = false;
        }
        C13599a.a(z15);
        this.f56737a = bVar;
        this.f56738b = j10;
        this.f56739c = j11;
        this.f56740d = j12;
        this.f56741e = j13;
        this.f56742f = z10;
        this.f56743g = z11;
        this.f56744h = z12;
        this.f56745i = z13;
        this.f56746j = z14;
    }

    public C6207n0 a(long j10) {
        return j10 == this.f56739c ? this : new C6207n0(this.f56737a, this.f56738b, j10, this.f56740d, this.f56741e, this.f56742f, this.f56743g, this.f56744h, this.f56745i, this.f56746j);
    }

    public C6207n0 b(long j10) {
        return j10 == this.f56738b ? this : new C6207n0(this.f56737a, j10, this.f56739c, this.f56740d, this.f56741e, this.f56742f, this.f56743g, this.f56744h, this.f56745i, this.f56746j);
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f56737a.hashCode()) * 31) + ((int) this.f56738b)) * 31) + ((int) this.f56739c)) * 31) + ((int) this.f56740d)) * 31) + ((int) this.f56741e)) * 31) + (this.f56742f ? 1 : 0)) * 31) + (this.f56743g ? 1 : 0)) * 31) + (this.f56744h ? 1 : 0)) * 31) + (this.f56745i ? 1 : 0)) * 31) + (this.f56746j ? 1 : 0);
    }
}
