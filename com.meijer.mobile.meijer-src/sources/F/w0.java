package F;

import android.util.Size;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class w0 {
    public abstract Size b();

    public abstract Map<Integer, Size> d();

    public abstract Size e();

    public abstract Size f();

    public abstract Map<Integer, Size> h();

    public abstract Map<Integer, Size> j();

    public abstract Map<Integer, Size> l();

    public static w0 a(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4) {
        return new C3272g(size, map, size2, map2, size3, map3, map4);
    }

    w0() {
    }

    public Size c(int i10) {
        return d().get(Integer.valueOf(i10));
    }

    public Size g(int i10) {
        return h().get(Integer.valueOf(i10));
    }

    public Size i(int i10) {
        return j().get(Integer.valueOf(i10));
    }

    public Size k(int i10) {
        return l().get(Integer.valueOf(i10));
    }
}
