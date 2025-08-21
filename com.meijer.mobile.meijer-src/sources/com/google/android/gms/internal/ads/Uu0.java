package com.google.android.gms.internal.ads;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes6.dex */
final class Uu0 extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    private Iterator f71549a;

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f71550b;

    /* renamed from: c, reason: collision with root package name */
    private int f71551c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f71552d;

    /* renamed from: e, reason: collision with root package name */
    private int f71553e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f71554f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f71555g;

    /* renamed from: h, reason: collision with root package name */
    private int f71556h;

    /* renamed from: i, reason: collision with root package name */
    private long f71557i;

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f71552d == this.f71551c) {
            return -1;
        }
        if (this.f71554f) {
            int i10 = this.f71555g[this.f71553e + this.f71556h] & 255;
            a(1);
            return i10;
        }
        int i11 = C7753bw0.i(this.f71553e + this.f71557i) & 255;
        a(1);
        return i11;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    private final void a(int i10) {
        int i11 = this.f71553e + i10;
        this.f71553e = i11;
        if (i11 == this.f71550b.limit()) {
            b();
        }
    }

    private final boolean b() {
        this.f71552d++;
        if (!this.f71549a.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f71549a.next();
        this.f71550b = byteBuffer;
        this.f71553e = byteBuffer.position();
        if (this.f71550b.hasArray()) {
            this.f71554f = true;
            this.f71555g = this.f71550b.array();
            this.f71556h = this.f71550b.arrayOffset();
        } else {
            this.f71554f = false;
            this.f71557i = C7753bw0.m(this.f71550b);
            this.f71555g = null;
        }
        return true;
    }

    Uu0(Iterable iterable) {
        this.f71549a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f71551c++;
        }
        this.f71552d = -1;
        if (!b()) {
            this.f71550b = Tu0.f71314c;
            this.f71552d = 0;
            this.f71553e = 0;
            this.f71557i = 0L;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f71552d == this.f71551c) {
            return -1;
        }
        int iLimit = this.f71550b.limit();
        int i12 = this.f71553e;
        int i13 = iLimit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.f71554f) {
            System.arraycopy(this.f71555g, i12 + this.f71556h, bArr, i10, i11);
            a(i11);
            return i11;
        }
        int iPosition = this.f71550b.position();
        this.f71550b.position(this.f71553e);
        this.f71550b.get(bArr, i10, i11);
        this.f71550b.position(iPosition);
        a(i11);
        return i11;
    }
}
