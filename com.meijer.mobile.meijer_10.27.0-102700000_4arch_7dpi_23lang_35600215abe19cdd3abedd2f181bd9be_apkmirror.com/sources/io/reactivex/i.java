package io.reactivex;

/* loaded from: classes9.dex */
public interface i<T> {
    void onComplete();

    void onError(Throwable th2);

    void onSubscribe(Nu.b bVar);

    void onSuccess(T t10);
}
