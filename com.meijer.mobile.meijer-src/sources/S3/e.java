package S3;

import d3.C13599a;
import d3.D;
import java.io.IOException;
import java.util.Arrays;
import x3.C18079s;
import x3.InterfaceC18078q;

/* loaded from: classes4.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final f f34354a = new f();

    /* renamed from: b, reason: collision with root package name */
    private final D f34355b = new D(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    private int f34356c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f34357d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f34358e;

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f34357d = 0;
        do {
            int i13 = this.f34357d;
            int i14 = i10 + i13;
            f fVar = this.f34354a;
            if (i14 >= fVar.f34365g) {
                break;
            }
            int[] iArr = fVar.f34368j;
            this.f34357d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public boolean d(InterfaceC18078q interfaceC18078q) throws IOException {
        int i10;
        C13599a.g(interfaceC18078q != null);
        if (this.f34358e) {
            this.f34358e = false;
            this.f34355b.S(0);
        }
        while (!this.f34358e) {
            if (this.f34356c < 0) {
                if (!this.f34354a.c(interfaceC18078q) || !this.f34354a.a(interfaceC18078q, true)) {
                    return false;
                }
                f fVar = this.f34354a;
                int iA = fVar.f34366h;
                if ((fVar.f34360b & 1) == 1 && this.f34355b.g() == 0) {
                    iA += a(0);
                    i10 = this.f34357d;
                } else {
                    i10 = 0;
                }
                if (!C18079s.e(interfaceC18078q, iA)) {
                    return false;
                }
                this.f34356c = i10;
            }
            int iA2 = a(this.f34356c);
            int i11 = this.f34356c + this.f34357d;
            if (iA2 > 0) {
                D d10 = this.f34355b;
                d10.c(d10.g() + iA2);
                if (!C18079s.d(interfaceC18078q, this.f34355b.e(), this.f34355b.g(), iA2)) {
                    return false;
                }
                D d11 = this.f34355b;
                d11.V(d11.g() + iA2);
                this.f34358e = this.f34354a.f34368j[i11 + (-1)] != 255;
            }
            if (i11 == this.f34354a.f34365g) {
                i11 = -1;
            }
            this.f34356c = i11;
        }
        return true;
    }

    public f b() {
        return this.f34354a;
    }

    public D c() {
        return this.f34355b;
    }

    public void e() {
        this.f34354a.b();
        this.f34355b.S(0);
        this.f34356c = -1;
        this.f34358e = false;
    }

    public void f() {
        if (this.f34355b.e().length == 65025) {
            return;
        }
        D d10 = this.f34355b;
        d10.U(Arrays.copyOf(d10.e(), Math.max(65025, this.f34355b.g())), this.f34355b.g());
    }

    e() {
    }
}
