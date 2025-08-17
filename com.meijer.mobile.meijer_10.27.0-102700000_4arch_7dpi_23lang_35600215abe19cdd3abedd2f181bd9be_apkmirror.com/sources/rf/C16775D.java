package rf;

import rf.AbstractC16778G;

/* renamed from: rf.D, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C16775D extends AbstractC16778G.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f158200a;

    /* renamed from: b, reason: collision with root package name */
    private final String f158201b;

    /* renamed from: c, reason: collision with root package name */
    private final int f158202c;

    /* renamed from: d, reason: collision with root package name */
    private final long f158203d;

    /* renamed from: e, reason: collision with root package name */
    private final long f158204e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f158205f;

    /* renamed from: g, reason: collision with root package name */
    private final int f158206g;

    /* renamed from: h, reason: collision with root package name */
    private final String f158207h;

    /* renamed from: i, reason: collision with root package name */
    private final String f158208i;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16778G.b) {
            AbstractC16778G.b bVar = (AbstractC16778G.b) obj;
            if (this.f158200a == bVar.a() && this.f158201b.equals(bVar.g()) && this.f158202c == bVar.b() && this.f158203d == bVar.j() && this.f158204e == bVar.d() && this.f158205f == bVar.e() && this.f158206g == bVar.i() && this.f158207h.equals(bVar.f()) && this.f158208i.equals(bVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // rf.AbstractC16778G.b
    public int a() {
        return this.f158200a;
    }

    @Override // rf.AbstractC16778G.b
    public int b() {
        return this.f158202c;
    }

    @Override // rf.AbstractC16778G.b
    public long d() {
        return this.f158204e;
    }

    @Override // rf.AbstractC16778G.b
    public boolean e() {
        return this.f158205f;
    }

    @Override // rf.AbstractC16778G.b
    public String f() {
        return this.f158207h;
    }

    @Override // rf.AbstractC16778G.b
    public String g() {
        return this.f158201b;
    }

    @Override // rf.AbstractC16778G.b
    public String h() {
        return this.f158208i;
    }

    public int hashCode() {
        int iHashCode = (((((this.f158200a ^ 1000003) * 1000003) ^ this.f158201b.hashCode()) * 1000003) ^ this.f158202c) * 1000003;
        long j10 = this.f158203d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f158204e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f158205f ? 1231 : 1237)) * 1000003) ^ this.f158206g) * 1000003) ^ this.f158207h.hashCode()) * 1000003) ^ this.f158208i.hashCode();
    }

    @Override // rf.AbstractC16778G.b
    public int i() {
        return this.f158206g;
    }

    @Override // rf.AbstractC16778G.b
    public long j() {
        return this.f158203d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f158200a + ", model=" + this.f158201b + ", availableProcessors=" + this.f158202c + ", totalRam=" + this.f158203d + ", diskSpace=" + this.f158204e + ", isEmulator=" + this.f158205f + ", state=" + this.f158206g + ", manufacturer=" + this.f158207h + ", modelClass=" + this.f158208i + "}";
    }

    C16775D(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f158200a = i10;
        if (str != null) {
            this.f158201b = str;
            this.f158202c = i11;
            this.f158203d = j10;
            this.f158204e = j11;
            this.f158205f = z10;
            this.f158206g = i12;
            if (str2 != null) {
                this.f158207h = str2;
                if (str3 != null) {
                    this.f158208i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }
}
