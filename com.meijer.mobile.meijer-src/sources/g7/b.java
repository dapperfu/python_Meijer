package g7;

import Z6.c;
import r7.k;

/* loaded from: classes4.dex */
public class b implements c<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f134102a;

    @Override // Z6.c
    public void a() {
    }

    @Override // Z6.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f134102a;
    }

    @Override // Z6.c
    public Class<byte[]> c() {
        return byte[].class;
    }

    @Override // Z6.c
    public int getSize() {
        return this.f134102a.length;
    }

    public b(byte[] bArr) {
        this.f134102a = (byte[]) k.d(bArr);
    }
}
