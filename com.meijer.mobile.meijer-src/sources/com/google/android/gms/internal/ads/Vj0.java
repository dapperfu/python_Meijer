package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class Vj0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7721bg0 f71749a = new C7721bg0();

    /* renamed from: b, reason: collision with root package name */
    private final String f71750b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Logger f71751c;

    final Logger a() {
        Logger logger = this.f71751c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f71749a) {
            try {
                Logger logger2 = this.f71751c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f71750b);
                this.f71751c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    Vj0(Class cls) {
        this.f71750b = cls.getName();
    }
}
