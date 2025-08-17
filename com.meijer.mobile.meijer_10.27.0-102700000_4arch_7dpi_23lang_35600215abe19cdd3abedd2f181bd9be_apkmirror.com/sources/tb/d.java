package tb;

import java.util.UUID;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public UUID f161546a;

    /* renamed from: b, reason: collision with root package name */
    public int f161547b;

    /* renamed from: c, reason: collision with root package name */
    public int f161548c;

    /* renamed from: d, reason: collision with root package name */
    public int f161549d;

    public final String toString() {
        return "IBeaconAdvertisementData [uuid=" + this.f161546a + ", major=" + this.f161547b + ", minor=" + this.f161548c + ", measuredPower=" + this.f161549d + "]";
    }

    public d(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 9, bArr2, 0, 16);
        StringBuilder sb2 = new StringBuilder();
        String strA = Sb.a.a(bArr2);
        sb2.append(strA.substring(0, 8));
        sb2.append("-");
        sb2.append(strA.substring(8, 12));
        sb2.append("-");
        sb2.append(strA.substring(12, 16));
        sb2.append("-");
        sb2.append(strA.substring(16, 20));
        sb2.append("-");
        sb2.append(strA.substring(20, 32));
        this.f161546a = UUID.fromString(sb2.toString());
        this.f161547b = Integer.parseInt(Sb.a.a(new byte[]{bArr[25], bArr[26]}), 16);
        this.f161548c = Integer.parseInt(Sb.a.a(new byte[]{bArr[27], bArr[28]}), 16);
        this.f161549d = Integer.parseInt(Sb.a.a(new byte[]{bArr[29]}), 16);
    }
}
