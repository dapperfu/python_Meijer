package com.google.android.gms.internal.pal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class X8 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f83804a = Logger.getLogger(X8.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f83805b = new AtomicBoolean(false);

    private X8() {
    }

    static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f83804a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return f83805b.get();
    }
}
