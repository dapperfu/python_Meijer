package x3;

import a3.InterfaceC5571k;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public interface O {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f169094a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f169095b;

        /* renamed from: c, reason: collision with root package name */
        public final int f169096c;

        /* renamed from: d, reason: collision with root package name */
        public final int f169097d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f169094a == aVar.f169094a && this.f169096c == aVar.f169096c && this.f169097d == aVar.f169097d && Arrays.equals(this.f169095b, aVar.f169095b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f169094a * 31) + Arrays.hashCode(this.f169095b)) * 31) + this.f169096c) * 31) + this.f169097d;
        }

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f169094a = i10;
            this.f169095b = bArr;
            this.f169096c = i11;
            this.f169097d = i12;
        }
    }

    int a(InterfaceC5571k interfaceC5571k, int i10, boolean z10, int i11) throws IOException;

    void b(a3.t tVar);

    void c(long j10, int i10, int i11, int i12, a aVar);

    default void d(d3.D d10, int i10) {
        e(d10, i10, 0);
    }

    void e(d3.D d10, int i10, int i11);

    default void f(long j10) {
    }

    default int g(InterfaceC5571k interfaceC5571k, int i10, boolean z10) throws IOException {
        return a(interfaceC5571k, i10, z10, 0);
    }
}
