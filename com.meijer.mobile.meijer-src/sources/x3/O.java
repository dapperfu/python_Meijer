package x3;

import a3.InterfaceC5654k;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public interface O {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f170182a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f170183b;

        /* renamed from: c, reason: collision with root package name */
        public final int f170184c;

        /* renamed from: d, reason: collision with root package name */
        public final int f170185d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f170182a == aVar.f170182a && this.f170184c == aVar.f170184c && this.f170185d == aVar.f170185d && Arrays.equals(this.f170183b, aVar.f170183b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f170182a * 31) + Arrays.hashCode(this.f170183b)) * 31) + this.f170184c) * 31) + this.f170185d;
        }

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f170182a = i10;
            this.f170183b = bArr;
            this.f170184c = i11;
            this.f170185d = i12;
        }
    }

    int a(InterfaceC5654k interfaceC5654k, int i10, boolean z10, int i11) throws IOException;

    void b(a3.t tVar);

    void c(long j10, int i10, int i11, int i12, a aVar);

    default void d(d3.D d10, int i10) {
        e(d10, i10, 0);
    }

    void e(d3.D d10, int i10, int i11);

    default void f(long j10) {
    }

    default int g(InterfaceC5654k interfaceC5654k, int i10, boolean z10) throws IOException {
        return a(interfaceC5654k, i10, z10, 0);
    }
}
