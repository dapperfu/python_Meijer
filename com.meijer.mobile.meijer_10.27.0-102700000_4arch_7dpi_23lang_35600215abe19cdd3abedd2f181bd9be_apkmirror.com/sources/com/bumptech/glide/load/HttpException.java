package com.bumptech.glide.load;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class HttpException extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private final int f63747a;

    public HttpException(int i10) {
        this("Http request failed", i10);
    }

    public HttpException(String str, int i10) {
        this(str, i10, null);
    }

    public HttpException(String str, int i10, Throwable th2) {
        super(str + ", status code: " + i10, th2);
        this.f63747a = i10;
    }
}
