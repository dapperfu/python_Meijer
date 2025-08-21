package f3;

import d3.C13599a;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: f3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13950e extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC13949d f131466a;

    /* renamed from: b, reason: collision with root package name */
    private final g f131467b;

    /* renamed from: f, reason: collision with root package name */
    private long f131471f;

    /* renamed from: d, reason: collision with root package name */
    private boolean f131469d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f131470e = false;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f131468c = new byte[1];

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f131468c) == -1) {
            return -1;
        }
        return this.f131468c[0] & 255;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    private void a() throws IOException {
        if (this.f131469d) {
            return;
        }
        this.f131466a.h(this.f131467b);
        this.f131469d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f131470e) {
            return;
        }
        this.f131466a.close();
        this.f131470e = true;
    }

    public C13950e(InterfaceC13949d interfaceC13949d, g gVar) {
        this.f131466a = interfaceC13949d;
        this.f131467b = gVar;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        C13599a.g(!this.f131470e);
        a();
        int i12 = this.f131466a.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f131471f += i12;
        return i12;
    }
}
