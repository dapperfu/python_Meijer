package fsimpl;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* loaded from: classes14.dex */
class aR extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FileOutputStream f131516a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MessageDigest f131517b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ aP f131518c;

    aR(aP aPVar, FileOutputStream fileOutputStream, MessageDigest messageDigest) {
        this.f131518c = aPVar;
        this.f131516a = fileOutputStream;
        this.f131517b = messageDigest;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f131516a.write(i10);
        this.f131517b.update((byte) i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f131516a.write(bArr);
        this.f131517b.update(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f131516a.write(bArr, i10, i11);
        this.f131517b.update(bArr, i10, i11);
    }
}
