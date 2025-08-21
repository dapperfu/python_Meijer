package com.squareup.okhttp.internal.http;

import java.io.IOException;

/* loaded from: classes12.dex */
public final class RequestException extends Exception {
    @Override // java.lang.Throwable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public IOException getCause() {
        return (IOException) super.getCause();
    }
}
