package F;

import C.InterfaceC2971n;
import android.util.Size;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface r0 {

    public interface a {
    }

    void a();

    int b(x0 x0Var, a aVar);

    default int c(androidx.camera.core.impl.k kVar, x0 x0Var, a aVar) {
        return -1;
    }

    void d(m0 m0Var);

    void e();

    void f();

    void h(androidx.camera.core.impl.k kVar);

    androidx.camera.core.impl.w i(InterfaceC2971n interfaceC2971n, f0 f0Var);

    int j(boolean z10, x0 x0Var, a aVar);

    default Map<Integer, List<Size>> g(Size size) {
        return Collections.EMPTY_MAP;
    }
}
