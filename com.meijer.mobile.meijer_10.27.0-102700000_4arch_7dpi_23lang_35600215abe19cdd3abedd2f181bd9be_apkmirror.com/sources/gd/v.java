package gd;

import java.util.Arrays;

/* loaded from: classes4.dex */
final class v extends u {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f133335b;

    v(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f133335b = bArr;
    }

    @Override // gd.u
    final byte[] F2() {
        return this.f133335b;
    }
}
