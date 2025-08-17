package fsimpl;

/* renamed from: fsimpl.bq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C13992bq {

    /* renamed from: a, reason: collision with root package name */
    final boolean f131866a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f131867b;

    /* renamed from: c, reason: collision with root package name */
    final byte[] f131868c;

    /* renamed from: d, reason: collision with root package name */
    final byte[] f131869d;

    C13992bq(boolean z10, boolean z11, byte[] bArr) {
        this.f131866a = z10;
        this.f131867b = z11;
        this.f131868c = bArr;
        byte[] bArr2 = new byte[bArr.length];
        this.f131869d = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        C13991bp.b(bArr2);
    }
}
