package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    private static final s f88228b = new s();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Ie.x> f88229a = new HashMap();

    public synchronized Ie.x a(String str) throws GeneralSecurityException {
        if (!this.f88229a.containsKey(str)) {
            throw new GeneralSecurityException("Name " + str + " does not exist");
        }
        return this.f88229a.get(str);
    }

    public synchronized void c(String str, Ie.x xVar) throws GeneralSecurityException {
        try {
            if (!this.f88229a.containsKey(str)) {
                this.f88229a.put(str, xVar);
                return;
            }
            if (this.f88229a.get(str).equals(xVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + this.f88229a.get(str) + "), cannot insert " + xVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void d(Map<String, Ie.x> map) throws GeneralSecurityException {
        for (Map.Entry<String, Ie.x> entry : map.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }

    public static s b() {
        return f88228b;
    }

    s() {
    }
}
