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
    private Iterator f70709a;

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f70710b;

    /* renamed from: c, reason: collision with root package name */
    private int f70711c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f70712d;

    /* renamed from: e, reason: collision with root package name */
    private int f70713e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f70714f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f70715g;

    /* renamed from: h, reason: collision with root package name */
    private int f70716h;

    /* renamed from: i, reason: collision with root package name */
    private long f70717i;

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f70712d == this.f70711c) {
            return -1;
        }
        if (this.f70714f) {
            int i10 = this.f70715g[this.f70713e + this.f70716h] & 255;
            a(1);
            return i10;
        }
        int i11 = C7628bw0.i(this.f70713e + this.f70717i) & 255;
        a(1);
        return i11;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    private final void a(int i10) {
        int i11 = this.f70713e + i10;
        this.f70713e = i11;
        if (i11 == this.f70710b.limit()) {
            b();
        }
    }

    private final boolean b() {
        this.f70712d++;
        if (!this.f70709a.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f70709a.next();
        this.f70710b = byteBuffer;
        this.f70713e = byteBuffer.position();
        if (this.f70710b.hasArray()) {
            this.f70714f = true;
            this.f70715g = this.f70710b.array();
            this.f70716h = this.f70710b.arrayOffset();
        } else {
            this.f70714f = false;
            this.f70717i = C7628bw0.m(this.f70710b);
            this.f70715g = null;
        }
        return true;
    }

    Uu0(Iterable iterable) {
        this.f70709a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f70711c++;
        }
        this.f70712d = -1;
        if (!b()) {
            this.f70710b = Tu0.f70474c;
            this.f70712d = 0;
            this.f70713e = 0;
            this.f70717i = 0L;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f70712d == this.f70711c) {
            return -1;
        }
        int iLimit = this.f70710b.limit();
        int i12 = this.f70713e;
        int i13 = iLimit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.f70714f) {
            System.arraycopy(this.f70715g, i12 + this.f70716h, bArr, i10, i11);
            a(i11);
            return i11;
        }
        int iPosition = this.f70710b.position();
        this.f70710b.position(this.f70713e);
        this.f70710b.get(bArr, i10, i11);
        this.f70710b.position(iPosition);
        a(i11);
        return i11;
    }
}
