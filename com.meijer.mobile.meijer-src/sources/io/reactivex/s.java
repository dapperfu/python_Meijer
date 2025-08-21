package io.reactivex;

/* loaded from: classes10.dex */
public interface s<T> {
    void onComplete();

    void onError(Throwable th2);

    void onNext(T t10);

    void onSubscribe(Ju.b bVar);
}
