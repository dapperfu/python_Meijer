package Fg;

/* loaded from: classes8.dex */
final class e extends g {

    /* renamed from: c, reason: collision with root package name */
    private final short f10470c;

    /* renamed from: d, reason: collision with root package name */
    private final short f10471d;

    @Override // Fg.g
    void c(Ig.a aVar, byte[] bArr) {
        aVar.c(this.f10470c, this.f10471d);
    }

    public String toString() {
        short s10 = this.f10470c;
        short s11 = this.f10471d;
        return '<' + Integer.toBinaryString((s10 & ((1 << s11) - 1)) | (1 << s11) | (1 << this.f10471d)).substring(1) + '>';
    }

    e(g gVar, int i10, int i11) {
        super(gVar);
        this.f10470c = (short) i10;
        this.f10471d = (short) i11;
    }
}
