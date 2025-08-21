package com.google.gson.stream;

import java.io.IOException;

/* loaded from: classes8.dex */
public final class MalformedJsonException extends IOException {
    private static final long serialVersionUID = 1;

    public MalformedJsonException(String str) {
        super(str);
    }

    public MalformedJsonException(String str, Throwable th2) {
        super(str, th2);
    }

    public MalformedJsonException(Throwable th2) {
        super(th2);
    }
}
