package Dg;

/* loaded from: classes7.dex */
final class e extends g {

    /* renamed from: c, reason: collision with root package name */
    private final short f6437c;

    /* renamed from: d, reason: collision with root package name */
    private final short f6438d;

    @Override // Dg.g
    void c(Gg.a aVar, byte[] bArr) {
        aVar.c(this.f6437c, this.f6438d);
    }

    public String toString() {
        short s10 = this.f6437c;
        short s11 = this.f6438d;
        return '<' + Integer.toBinaryString((s10 & ((1 << s11) - 1)) | (1 << s11) | (1 << this.f6438d)).substring(1) + '>';
    }

    e(g gVar, int i10, int i11) {
        super(gVar);
        this.f6437c = (short) i10;
        this.f6438d = (short) i11;
    }
}
