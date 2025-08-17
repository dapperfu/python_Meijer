package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class To0 {

    /* renamed from: b, reason: collision with root package name */
    private static final To0 f70461b = new To0();

    /* renamed from: a, reason: collision with root package name */
    private final Map f70462a = new HashMap();

    public static To0 b() {
        return f70461b;
    }

    public final synchronized Qk0 a(String str) throws GeneralSecurityException {
        if (!this.f70462a.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (Qk0) this.f70462a.get("AES128_GCM");
    }

    public final synchronized void c(String str, Qk0 qk0) throws GeneralSecurityException {
        try {
            if (!this.f70462a.containsKey(str)) {
                this.f70462a.put(str, qk0);
                return;
            }
            if (((Qk0) this.f70462a.get(str)).equals(qk0)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.f70462a.get(str)) + "), cannot insert " + String.valueOf(qk0));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d(Map map) throws GeneralSecurityException {
        for (Map.Entry entry : map.entrySet()) {
            c((String) entry.getKey(), (Qk0) entry.getValue());
        }
    }

    To0() {
    }
}
