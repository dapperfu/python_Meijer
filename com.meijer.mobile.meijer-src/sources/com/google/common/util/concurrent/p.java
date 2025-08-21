package com.google.common.util.concurrent;

import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    private final Object f88944a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final String f88945b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Logger f88946c;

    Logger a() {
        Logger logger = this.f88946c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f88944a) {
            try {
                Logger logger2 = this.f88946c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f88945b);
                this.f88946c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    p(Class<?> cls) {
        this.f88945b = cls.getName();
    }
}
