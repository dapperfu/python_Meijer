package e7;

import X6.c;
import p7.k;

/* loaded from: classes4.dex */
public class b implements c<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f128634a;

    @Override // X6.c
    public void a() {
    }

    @Override // X6.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f128634a;
    }

    @Override // X6.c
    public Class<byte[]> c() {
        return byte[].class;
    }

    @Override // X6.c
    public int getSize() {
        return this.f128634a.length;
    }

    public b(byte[] bArr) {
        this.f128634a = (byte[]) k.d(bArr);
    }
}
