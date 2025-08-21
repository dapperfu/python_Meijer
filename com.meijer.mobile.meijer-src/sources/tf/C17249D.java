package tf;

import tf.AbstractC17252G;

/* renamed from: tf.D, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C17249D extends AbstractC17252G.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f162646a;

    /* renamed from: b, reason: collision with root package name */
    private final String f162647b;

    /* renamed from: c, reason: collision with root package name */
    private final int f162648c;

    /* renamed from: d, reason: collision with root package name */
    private final long f162649d;

    /* renamed from: e, reason: collision with root package name */
    private final long f162650e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f162651f;

    /* renamed from: g, reason: collision with root package name */
    private final int f162652g;

    /* renamed from: h, reason: collision with root package name */
    private final String f162653h;

    /* renamed from: i, reason: collision with root package name */
    private final String f162654i;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17252G.b) {
            AbstractC17252G.b bVar = (AbstractC17252G.b) obj;
            if (this.f162646a == bVar.a() && this.f162647b.equals(bVar.g()) && this.f162648c == bVar.b() && this.f162649d == bVar.j() && this.f162650e == bVar.d() && this.f162651f == bVar.e() && this.f162652g == bVar.i() && this.f162653h.equals(bVar.f()) && this.f162654i.equals(bVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // tf.AbstractC17252G.b
    public int a() {
        return this.f162646a;
    }

    @Override // tf.AbstractC17252G.b
    public int b() {
        return this.f162648c;
    }

    @Override // tf.AbstractC17252G.b
    public long d() {
        return this.f162650e;
    }

    @Override // tf.AbstractC17252G.b
    public boolean e() {
        return this.f162651f;
    }

    @Override // tf.AbstractC17252G.b
    public String f() {
        return this.f162653h;
    }

    @Override // tf.AbstractC17252G.b
    public String g() {
        return this.f162647b;
    }

    @Override // tf.AbstractC17252G.b
    public String h() {
        return this.f162654i;
    }

    public int hashCode() {
        int iHashCode = (((((this.f162646a ^ 1000003) * 1000003) ^ this.f162647b.hashCode()) * 1000003) ^ this.f162648c) * 1000003;
        long j10 = this.f162649d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f162650e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f162651f ? 1231 : 1237)) * 1000003) ^ this.f162652g) * 1000003) ^ this.f162653h.hashCode()) * 1000003) ^ this.f162654i.hashCode();
    }

    @Override // tf.AbstractC17252G.b
    public int i() {
        return this.f162652g;
    }

    @Override // tf.AbstractC17252G.b
    public long j() {
        return this.f162649d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f162646a + ", model=" + this.f162647b + ", availableProcessors=" + this.f162648c + ", totalRam=" + this.f162649d + ", diskSpace=" + this.f162650e + ", isEmulator=" + this.f162651f + ", state=" + this.f162652g + ", manufacturer=" + this.f162653h + ", modelClass=" + this.f162654i + "}";
    }

    C17249D(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f162646a = i10;
        if (str != null) {
            this.f162647b = str;
            this.f162648c = i11;
            this.f162649d = j10;
            this.f162650e = j11;
            this.f162651f = z10;
            this.f162652g = i12;
            if (str2 != null) {
                this.f162653h = str2;
                if (str3 != null) {
                    this.f162654i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }
}
