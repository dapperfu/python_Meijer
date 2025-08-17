package f3;

import d3.C13466a;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: f3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13840e extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC13839d f130632a;

    /* renamed from: b, reason: collision with root package name */
    private final g f130633b;

    /* renamed from: f, reason: collision with root package name */
    private long f130637f;

    /* renamed from: d, reason: collision with root package name */
    private boolean f130635d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f130636e = false;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f130634c = new byte[1];

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f130634c) == -1) {
            return -1;
        }
        return this.f130634c[0] & 255;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    private void a() throws IOException {
        if (this.f130635d) {
            return;
        }
        this.f130632a.h(this.f130633b);
        this.f130635d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f130636e) {
            return;
        }
        this.f130632a.close();
        this.f130636e = true;
    }

    public C13840e(InterfaceC13839d interfaceC13839d, g gVar) {
        this.f130632a = interfaceC13839d;
        this.f130633b = gVar;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        C13466a.g(!this.f130636e);
        a();
        int i12 = this.f130632a.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f130637f += i12;
        return i12;
    }
}
