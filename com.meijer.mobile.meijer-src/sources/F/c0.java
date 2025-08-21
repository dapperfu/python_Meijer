package F;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface c0<T> {

    public interface a<T> {
        void a(T t10);

        void onError(Throwable th2);
    }

    void a(Executor executor, a<? super T> aVar);

    void b(a<? super T> aVar);
}
