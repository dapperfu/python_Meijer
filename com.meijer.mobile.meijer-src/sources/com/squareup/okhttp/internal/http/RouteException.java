package com.squareup.okhttp.internal.http;

import java.lang.reflect.Method;

/* loaded from: classes12.dex */
public final class RouteException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private static final Method f127421a;

    static {
        Method declaredMethod;
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            declaredMethod = null;
        }
        f127421a = declaredMethod;
    }
}
