package com.google.common.util.concurrent;

import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    private final Object f88104a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final String f88105b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Logger f88106c;

    Logger a() {
        Logger logger = this.f88106c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f88104a) {
            try {
                Logger logger2 = this.f88106c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f88105b);
                this.f88106c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    p(Class<?> cls) {
        this.f88105b = cls.getName();
    }
}
