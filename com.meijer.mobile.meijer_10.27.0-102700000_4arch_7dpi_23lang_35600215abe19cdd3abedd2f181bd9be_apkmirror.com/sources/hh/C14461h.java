package hh;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: hh.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C14461h {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f134963a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f134964b;

    /* renamed from: c, reason: collision with root package name */
    private int f134965c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f134966d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f134967e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f134968f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f134969g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f134970h = false;

    private boolean f() throws IOException {
        int i10 = this.f134965c;
        byte[] bArr = this.f134964b;
        if (i10 == bArr.length) {
            return false;
        }
        int i11 = this.f134963a.read(bArr, i10, bArr.length - i10);
        if (i11 < 0) {
            this.f134970h = true;
            return false;
        }
        this.f134965c += i11;
        return true;
    }

    private boolean g() {
        int i10;
        int i11;
        byte b10;
        if (this.f134969g) {
            this.f134969g = false;
            byte[] bArr = this.f134964b;
            int i12 = this.f134966d;
            if (bArr[i12] == 10) {
                this.f134966d = i12 + 1;
                this.f134967e++;
            }
        }
        while (true) {
            i10 = this.f134966d;
            i11 = this.f134965c;
            if (i10 >= i11 || (b10 = this.f134964b[i10]) == 10 || b10 == 13) {
                break;
            }
            this.f134966d = i10 + 1;
        }
        this.f134968f = i10;
        if (i10 == i11) {
            return false;
        }
        int i13 = i10 + 1;
        this.f134966d = i13;
        byte[] bArr2 = this.f134964b;
        if (bArr2[i10] == 13) {
            if (i13 == i11) {
                this.f134969g = true;
            } else if (bArr2[i13] == 10) {
                this.f134966d = i10 + 2;
            }
        }
        return true;
    }

    public byte[] a() {
        return this.f134964b;
    }

    public int b() {
        return this.f134967e;
    }

    public int c() {
        return this.f134968f - this.f134967e;
    }

    public boolean d() {
        return this.f134970h;
    }

    public boolean e() throws IOException {
        int i10;
        int i11 = this.f134966d;
        if (i11 > 0 && (i10 = this.f134965c) > i11) {
            byte[] bArr = this.f134964b;
            System.arraycopy(bArr, i11, bArr, 0, i10 - i11);
        }
        this.f134965c -= this.f134966d;
        this.f134968f = 0;
        this.f134967e = 0;
        this.f134966d = 0;
        do {
            if (this.f134966d < this.f134965c && g()) {
                return true;
            }
        } while (f());
        return false;
    }

    public C14461h(InputStream inputStream, int i10) {
        this.f134963a = inputStream;
        this.f134964b = new byte[i10];
    }
}
