package Ff;

import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public interface d {
    <T> void a(Class<T> cls, b<? super T> bVar);

    <T> void b(Class<T> cls, Executor executor, b<? super T> bVar);

    <T> void c(Class<T> cls, b<? super T> bVar);
}
