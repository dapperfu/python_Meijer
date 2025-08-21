package ub;

/* renamed from: ub.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17366b {

    /* renamed from: a, reason: collision with root package name */
    public int f163859a;

    /* renamed from: b, reason: collision with root package name */
    public String f163860b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f163861c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f163862d;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Successful: ");
        sb2.append(this.f163861c);
        sb2.append("  Status: ");
        sb2.append(this.f163859a);
        sb2.append("   Error Message: ");
        sb2.append(this.f163860b);
        sb2.append("  BodyLength: ");
        byte[] bArr = this.f163862d;
        sb2.append(bArr == null ? "(null)" : Integer.valueOf(bArr.length));
        return sb2.toString();
    }
}
