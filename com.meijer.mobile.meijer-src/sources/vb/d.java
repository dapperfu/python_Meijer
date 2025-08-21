package vb;

import java.util.UUID;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public UUID f165724a;

    /* renamed from: b, reason: collision with root package name */
    public int f165725b;

    /* renamed from: c, reason: collision with root package name */
    public int f165726c;

    /* renamed from: d, reason: collision with root package name */
    public int f165727d;

    public final String toString() {
        return "IBeaconAdvertisementData [uuid=" + this.f165724a + ", major=" + this.f165725b + ", minor=" + this.f165726c + ", measuredPower=" + this.f165727d + "]";
    }

    public d(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 9, bArr2, 0, 16);
        StringBuilder sb2 = new StringBuilder();
        String strA = Ub.a.a(bArr2);
        sb2.append(strA.substring(0, 8));
        sb2.append("-");
        sb2.append(strA.substring(8, 12));
        sb2.append("-");
        sb2.append(strA.substring(12, 16));
        sb2.append("-");
        sb2.append(strA.substring(16, 20));
        sb2.append("-");
        sb2.append(strA.substring(20, 32));
        this.f165724a = UUID.fromString(sb2.toString());
        this.f165725b = Integer.parseInt(Ub.a.a(new byte[]{bArr[25], bArr[26]}), 16);
        this.f165726c = Integer.parseInt(Ub.a.a(new byte[]{bArr[27], bArr[28]}), 16);
        this.f165727d = Integer.parseInt(Ub.a.a(new byte[]{bArr[29]}), 16);
    }
}
