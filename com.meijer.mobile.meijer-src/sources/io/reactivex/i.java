package io.reactivex;

/* loaded from: classes10.dex */
public interface i<T> {
    void onComplete();

    void onError(Throwable th2);

    void onSubscribe(Ju.b bVar);

    void onSuccess(T t10);
}
