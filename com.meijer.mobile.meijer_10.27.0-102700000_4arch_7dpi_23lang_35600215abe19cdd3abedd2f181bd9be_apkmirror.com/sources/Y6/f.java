package Y6;

/* loaded from: classes4.dex */
public final class f implements a<byte[]> {
    @Override // Y6.a
    public int b() {
        return 1;
    }

    @Override // Y6.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int c(byte[] bArr) {
        return bArr.length;
    }

    @Override // Y6.a
    public String a() {
        return "ByteArrayPool";
    }

    @Override // Y6.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i10) {
        return new byte[i10];
    }
}
