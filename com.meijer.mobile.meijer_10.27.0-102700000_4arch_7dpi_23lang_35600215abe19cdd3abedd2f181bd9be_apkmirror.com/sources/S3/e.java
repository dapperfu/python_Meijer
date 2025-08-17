package S3;

import d3.C13466a;
import d3.D;
import java.io.IOException;
import java.util.Arrays;
import x3.C18013s;
import x3.InterfaceC18012q;

/* loaded from: classes4.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final f f33175a = new f();

    /* renamed from: b, reason: collision with root package name */
    private final D f33176b = new D(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    private int f33177c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f33178d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f33179e;

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f33178d = 0;
        do {
            int i13 = this.f33178d;
            int i14 = i10 + i13;
            f fVar = this.f33175a;
            if (i14 >= fVar.f33186g) {
                break;
            }
            int[] iArr = fVar.f33189j;
            this.f33178d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public boolean d(InterfaceC18012q interfaceC18012q) throws IOException {
        int i10;
        C13466a.g(interfaceC18012q != null);
        if (this.f33179e) {
            this.f33179e = false;
            this.f33176b.S(0);
        }
        while (!this.f33179e) {
            if (this.f33177c < 0) {
                if (!this.f33175a.c(interfaceC18012q) || !this.f33175a.a(interfaceC18012q, true)) {
                    return false;
                }
                f fVar = this.f33175a;
                int iA = fVar.f33187h;
                if ((fVar.f33181b & 1) == 1 && this.f33176b.g() == 0) {
                    iA += a(0);
                    i10 = this.f33178d;
                } else {
                    i10 = 0;
                }
                if (!C18013s.e(interfaceC18012q, iA)) {
                    return false;
                }
                this.f33177c = i10;
            }
            int iA2 = a(this.f33177c);
            int i11 = this.f33177c + this.f33178d;
            if (iA2 > 0) {
                D d10 = this.f33176b;
                d10.c(d10.g() + iA2);
                if (!C18013s.d(interfaceC18012q, this.f33176b.e(), this.f33176b.g(), iA2)) {
                    return false;
                }
                D d11 = this.f33176b;
                d11.V(d11.g() + iA2);
                this.f33179e = this.f33175a.f33189j[i11 + (-1)] != 255;
            }
            if (i11 == this.f33175a.f33186g) {
                i11 = -1;
            }
            this.f33177c = i11;
        }
        return true;
    }

    public f b() {
        return this.f33175a;
    }

    public D c() {
        return this.f33176b;
    }

    public void e() {
        this.f33175a.b();
        this.f33176b.S(0);
        this.f33177c = -1;
        this.f33179e = false;
    }

    public void f() {
        if (this.f33176b.e().length == 65025) {
            return;
        }
        D d10 = this.f33176b;
        d10.U(Arrays.copyOf(d10.e(), Math.max(65025, this.f33176b.g())), this.f33176b.g());
    }

    e() {
    }
}
