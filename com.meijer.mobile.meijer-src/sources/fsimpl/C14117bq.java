package fsimpl;

/* renamed from: fsimpl.bq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C14117bq {

    /* renamed from: a, reason: collision with root package name */
    final boolean f133116a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f133117b;

    /* renamed from: c, reason: collision with root package name */
    final byte[] f133118c;

    /* renamed from: d, reason: collision with root package name */
    final byte[] f133119d;

    C14117bq(boolean z10, boolean z11, byte[] bArr) {
        this.f133116a = z10;
        this.f133117b = z11;
        this.f133118c = bArr;
        byte[] bArr2 = new byte[bArr.length];
        this.f133119d = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        C14116bp.b(bArr2);
    }
}
