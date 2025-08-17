package sb;

/* renamed from: sb.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16919b {

    /* renamed from: a, reason: collision with root package name */
    public int f160373a;

    /* renamed from: b, reason: collision with root package name */
    public String f160374b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f160375c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f160376d;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Successful: ");
        sb2.append(this.f160375c);
        sb2.append("  Status: ");
        sb2.append(this.f160373a);
        sb2.append("   Error Message: ");
        sb2.append(this.f160374b);
        sb2.append("  BodyLength: ");
        byte[] bArr = this.f160376d;
        sb2.append(bArr == null ? "(null)" : Integer.valueOf(bArr.length));
        return sb2.toString();
    }
}
