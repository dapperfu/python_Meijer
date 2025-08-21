package Hf;

import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public interface d {
    <T> void a(Class<T> cls, b<? super T> bVar);

    <T> void b(Class<T> cls, b<? super T> bVar);

    <T> void c(Class<T> cls, Executor executor, b<? super T> bVar);
}
