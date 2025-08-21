package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    private static final s f89068b = new s();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Ke.x> f89069a = new HashMap();

    public synchronized Ke.x a(String str) throws GeneralSecurityException {
        if (!this.f89069a.containsKey(str)) {
            throw new GeneralSecurityException("Name " + str + " does not exist");
        }
        return this.f89069a.get(str);
    }

    public synchronized void c(String str, Ke.x xVar) throws GeneralSecurityException {
        try {
            if (!this.f89069a.containsKey(str)) {
                this.f89069a.put(str, xVar);
                return;
            }
            if (this.f89069a.get(str).equals(xVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + this.f89069a.get(str) + "), cannot insert " + xVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void d(Map<String, Ke.x> map) throws GeneralSecurityException {
        for (Map.Entry<String, Ke.x> entry : map.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }

    public static s b() {
        return f89068b;
    }

    s() {
    }
}
