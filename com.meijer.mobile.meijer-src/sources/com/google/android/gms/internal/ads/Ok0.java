package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes6.dex */
public final class Ok0 {

    /* renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList f70005a = new CopyOnWriteArrayList();

    public static Nk0 a(String str) throws GeneralSecurityException {
        Iterator it = f70005a.iterator();
        while (it.hasNext()) {
            Nk0 nk0 = (Nk0) it.next();
            if (nk0.zza()) {
                return nk0;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
