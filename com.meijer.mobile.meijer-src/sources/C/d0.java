package C;

import F.InterfaceC3290z;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;
import o2.InterfaceC16068a;

/* loaded from: classes.dex */
public interface d0 extends Closeable {

    public static abstract class a {
        public abstract InterfaceC3290z a();

        public abstract Rect b();

        public abstract Size c();

        public abstract boolean d();

        public abstract int e();

        public static a f(Size size, Rect rect, InterfaceC3290z interfaceC3290z, int i10, boolean z10) {
            return new C3020e(size, rect, interfaceC3290z, i10, z10);
        }
    }

    public static abstract class b {
        public abstract int a();

        public abstract d0 b();

        public static b c(int i10, d0 d0Var) {
            return new C3021f(i10, d0Var);
        }

        b() {
        }
    }

    void U1(float[] fArr, float[] fArr2);

    default void V(float[] fArr, float[] fArr2, boolean z10) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    Surface g0(Executor executor, InterfaceC16068a<b> interfaceC16068a);

    Size getSize();

    default int getFormat() {
        return 34;
    }
}
