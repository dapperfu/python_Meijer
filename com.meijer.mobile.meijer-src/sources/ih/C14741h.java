package ih;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: ih.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C14741h {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f137603a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f137604b;

    /* renamed from: c, reason: collision with root package name */
    private int f137605c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f137606d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f137607e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f137608f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f137609g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f137610h = false;

    private boolean f() throws IOException {
        int i10 = this.f137605c;
        byte[] bArr = this.f137604b;
        if (i10 == bArr.length) {
            return false;
        }
        int i11 = this.f137603a.read(bArr, i10, bArr.length - i10);
        if (i11 < 0) {
            this.f137610h = true;
            return false;
        }
        this.f137605c += i11;
        return true;
    }

    private boolean g() {
        int i10;
        int i11;
        byte b10;
        if (this.f137609g) {
            this.f137609g = false;
            byte[] bArr = this.f137604b;
            int i12 = this.f137606d;
            if (bArr[i12] == 10) {
                this.f137606d = i12 + 1;
                this.f137607e++;
            }
        }
        while (true) {
            i10 = this.f137606d;
            i11 = this.f137605c;
            if (i10 >= i11 || (b10 = this.f137604b[i10]) == 10 || b10 == 13) {
                break;
            }
            this.f137606d = i10 + 1;
        }
        this.f137608f = i10;
        if (i10 == i11) {
            return false;
        }
        int i13 = i10 + 1;
        this.f137606d = i13;
        byte[] bArr2 = this.f137604b;
        if (bArr2[i10] == 13) {
            if (i13 == i11) {
                this.f137609g = true;
            } else if (bArr2[i13] == 10) {
                this.f137606d = i10 + 2;
            }
        }
        return true;
    }

    public byte[] a() {
        return this.f137604b;
    }

    public int b() {
        return this.f137607e;
    }

    public int c() {
        return this.f137608f - this.f137607e;
    }

    public boolean d() {
        return this.f137610h;
    }

    public boolean e() throws IOException {
        int i10;
        int i11 = this.f137606d;
        if (i11 > 0 && (i10 = this.f137605c) > i11) {
            byte[] bArr = this.f137604b;
            System.arraycopy(bArr, i11, bArr, 0, i10 - i11);
        }
        this.f137605c -= this.f137606d;
        this.f137608f = 0;
        this.f137607e = 0;
        this.f137606d = 0;
        do {
            if (this.f137606d < this.f137605c && g()) {
                return true;
            }
        } while (f());
        return false;
    }

    public C14741h(InputStream inputStream, int i10) {
        this.f137603a = inputStream;
        this.f137604b = new byte[i10];
    }
}
