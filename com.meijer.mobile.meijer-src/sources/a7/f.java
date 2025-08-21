package a7;

/* loaded from: classes4.dex */
public final class f implements InterfaceC5664a<byte[]> {
    @Override // a7.InterfaceC5664a
    public int b() {
        return 1;
    }

    @Override // a7.InterfaceC5664a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int c(byte[] bArr) {
        return bArr.length;
    }

    @Override // a7.InterfaceC5664a
    public String a() {
        return "ByteArrayPool";
    }

    @Override // a7.InterfaceC5664a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i10) {
        return new byte[i10];
    }
}
