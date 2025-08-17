package F;

import C.InterfaceC2971n;
import android.util.Size;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: F.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3627y extends InterfaceC2971n {
    String b();

    List<Size> c(int i10);

    l0 d();

    List<Size> e(int i10);

    void f(AbstractC3611h abstractC3611h);

    default InterfaceC3627y getImplementation() {
        return this;
    }

    void i(Executor executor, AbstractC3611h abstractC3611h);
}
