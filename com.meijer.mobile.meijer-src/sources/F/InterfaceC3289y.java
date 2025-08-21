package F;

import C.InterfaceC3029n;
import android.util.Size;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: F.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3289y extends InterfaceC3029n {
    String b();

    List<Size> c(int i10);

    l0 d();

    List<Size> e(int i10);

    void f(AbstractC3273h abstractC3273h);

    default InterfaceC3289y getImplementation() {
        return this;
    }

    void i(Executor executor, AbstractC3273h abstractC3273h);
}
