package com.google.maps.internal;

import com.google.maps.errors.ApiException;

/* loaded from: classes8.dex */
public interface ApiResponse<T> {
    ApiException getError();

    T getResult();

    boolean successful();
}
