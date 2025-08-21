package Fg;

/* loaded from: classes8.dex */
final class b extends g {

    /* renamed from: c, reason: collision with root package name */
    private final int f10460c;

    /* renamed from: d, reason: collision with root package name */
    private final int f10461d;

    @Override // Fg.g
    public void c(Ig.a aVar, byte[] bArr) {
        int i10 = this.f10461d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 == 0 || (i11 == 31 && i10 <= 62)) {
                aVar.c(31, 5);
                if (i10 > 62) {
                    aVar.c(i10 - 31, 16);
                } else if (i11 == 0) {
                    aVar.c(Math.min(i10, 31), 5);
                } else {
                    aVar.c(i10 - 31, 5);
                }
            }
            aVar.c(bArr[this.f10460c + i11], 8);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<");
        sb2.append(this.f10460c);
        sb2.append("::");
        sb2.append((this.f10460c + this.f10461d) - 1);
        sb2.append('>');
        return sb2.toString();
    }

    b(g gVar, int i10, int i11) {
        super(gVar);
        this.f10460c = i10;
        this.f10461d = i11;
    }
}
