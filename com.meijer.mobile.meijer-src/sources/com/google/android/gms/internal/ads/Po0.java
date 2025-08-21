package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Po0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Po0 f70260b = new Po0();

    /* renamed from: a, reason: collision with root package name */
    private final Map f70261a = new HashMap();

    public static Po0 a() {
        return f70260b;
    }

    public final synchronized void b(Oo0 oo0, Class cls) throws GeneralSecurityException {
        try {
            Oo0 oo02 = (Oo0) this.f70261a.get(cls);
            if (oo02 != null && !oo02.equals(oo0)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f70261a.put(cls, oo0);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
