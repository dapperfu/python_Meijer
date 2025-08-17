package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.fo0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8038fo0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f74177a = Logger.getLogger(C8038fo0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f74178b = new AtomicBoolean(false);

    private C8038fo0() {
    }

    static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f74177a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return f74178b.get();
    }
}
