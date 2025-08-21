package fsimpl;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* loaded from: classes15.dex */
class aR extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FileOutputStream f132766a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MessageDigest f132767b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ aP f132768c;

    aR(aP aPVar, FileOutputStream fileOutputStream, MessageDigest messageDigest) {
        this.f132768c = aPVar;
        this.f132766a = fileOutputStream;
        this.f132767b = messageDigest;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f132766a.write(i10);
        this.f132767b.update((byte) i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f132766a.write(bArr);
        this.f132767b.update(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f132766a.write(bArr, i10, i11);
        this.f132767b.update(bArr, i10, i11);
    }
}
