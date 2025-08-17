package Ie;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList<t> f13868a = new CopyOnWriteArrayList<>();

    public static t a(String str) throws GeneralSecurityException {
        Iterator<t> it = f13868a.iterator();
        while (it.hasNext()) {
            t next = it.next();
            if (next.a(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
