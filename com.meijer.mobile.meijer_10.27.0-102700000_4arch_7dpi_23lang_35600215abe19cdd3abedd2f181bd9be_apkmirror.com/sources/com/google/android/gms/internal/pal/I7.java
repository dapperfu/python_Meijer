package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes6.dex */
public final class I7 {

    /* renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList f82659a = new CopyOnWriteArrayList();

    public static H7 a(String str) throws GeneralSecurityException {
        Iterator it = f82659a.iterator();
        while (it.hasNext()) {
            H7 h72 = (H7) it.next();
            if (h72.zza()) {
                return h72;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
