package G;

import com.medallia.digital.mobilesdk.l3;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
class b extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    final OutputStream f11069a;

    /* renamed from: b, reason: collision with root package name */
    private ByteOrder f11070b;

    public void g(long j10) throws IOException {
        c((int) j10);
    }

    public void h(int i10) throws IOException {
        d((short) i10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f11069a.write(bArr);
    }

    public void a(ByteOrder byteOrder) {
        this.f11070b = byteOrder;
    }

    public void b(int i10) throws IOException {
        this.f11069a.write(i10);
    }

    public void c(int i10) throws IOException {
        ByteOrder byteOrder = this.f11070b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f11069a.write(i10 & l3.f93323c);
            this.f11069a.write((i10 >>> 8) & l3.f93323c);
            this.f11069a.write((i10 >>> 16) & l3.f93323c);
            this.f11069a.write((i10 >>> 24) & l3.f93323c);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f11069a.write((i10 >>> 24) & l3.f93323c);
            this.f11069a.write((i10 >>> 16) & l3.f93323c);
            this.f11069a.write((i10 >>> 8) & l3.f93323c);
            this.f11069a.write(i10 & l3.f93323c);
        }
    }

    public void d(short s10) throws IOException {
        ByteOrder byteOrder = this.f11070b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f11069a.write(s10 & 255);
            this.f11069a.write((s10 >>> 8) & l3.f93323c);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f11069a.write((s10 >>> 8) & l3.f93323c);
            this.f11069a.write(s10 & 255);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f11069a.write(bArr, i10, i11);
    }

    b(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f11069a = outputStream;
        this.f11070b = byteOrder;
    }
}
