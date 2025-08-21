package F;

import android.view.Surface;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface S {

    public interface a {
        void a(S s10);
    }

    androidx.camera.core.n b();

    int c();

    void close();

    void d();

    int e();

    void f(a aVar, Executor executor);

    androidx.camera.core.n g();

    int getHeight();

    Surface getSurface();

    int getWidth();
}
