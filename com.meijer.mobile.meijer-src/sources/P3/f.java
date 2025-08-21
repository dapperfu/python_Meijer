package P3;

import d3.D;
import java.io.IOException;
import x3.InterfaceC18078q;

/* loaded from: classes4.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final D f25426a = new D(8);

    /* renamed from: b, reason: collision with root package name */
    private int f25427b;

    private long a(InterfaceC18078q interfaceC18078q) throws IOException {
        int i10 = 0;
        interfaceC18078q.m(this.f25426a.e(), 0, 1);
        int i11 = this.f25426a.e()[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        interfaceC18078q.m(this.f25426a.e(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f25426a.e()[i10] & 255) + (i14 << 8);
        }
        this.f25427b += i13 + 1;
        return i14;
    }

    public boolean b(InterfaceC18078q interfaceC18078q) throws IOException {
        long length = interfaceC18078q.getLength();
        long j10 = 1024;
        if (length != -1 && length <= 1024) {
            j10 = length;
        }
        int i10 = (int) j10;
        interfaceC18078q.m(this.f25426a.e(), 0, 4);
        long J10 = this.f25426a.J();
        this.f25427b = 4;
        while (J10 != 440786851) {
            int i11 = this.f25427b + 1;
            this.f25427b = i11;
            if (i11 == i10) {
                return false;
            }
            interfaceC18078q.m(this.f25426a.e(), 0, 1);
            J10 = ((J10 << 8) & (-256)) | (this.f25426a.e()[0] & 255);
        }
        long jA = a(interfaceC18078q);
        long j11 = this.f25427b;
        if (jA != Long.MIN_VALUE && (length == -1 || j11 + jA < length)) {
            while (true) {
                int i12 = this.f25427b;
                long j12 = j11 + jA;
                if (i12 < j12) {
                    if (a(interfaceC18078q) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jA2 = a(interfaceC18078q);
                    if (jA2 < 0 || jA2 > 2147483647L) {
                        break;
                    }
                    if (jA2 != 0) {
                        int i13 = (int) jA2;
                        interfaceC18078q.i(i13);
                        this.f25427b += i13;
                    }
                } else if (i12 == j12) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
