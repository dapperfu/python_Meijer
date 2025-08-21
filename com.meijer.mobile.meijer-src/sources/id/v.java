package id;

import java.util.Arrays;

/* loaded from: classes4.dex */
final class v extends u {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f137551b;

    v(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f137551b = bArr;
    }

    @Override // id.u
    final byte[] I2() {
        return this.f137551b;
    }
}
