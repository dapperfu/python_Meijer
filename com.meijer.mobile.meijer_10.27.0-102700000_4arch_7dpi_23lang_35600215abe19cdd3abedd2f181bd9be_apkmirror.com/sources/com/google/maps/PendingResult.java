package com.google.maps;

import com.google.maps.errors.ApiException;
import java.io.IOException;

/* loaded from: classes7.dex */
public interface PendingResult<T> {

    public interface Callback<T> {
        void onFailure(Throwable th2);

        void onResult(T t10);
    }

    T await() throws InterruptedException, ApiException, IOException;

    T awaitIgnoreError();

    void cancel();

    void setCallback(Callback<T> callback);
}
