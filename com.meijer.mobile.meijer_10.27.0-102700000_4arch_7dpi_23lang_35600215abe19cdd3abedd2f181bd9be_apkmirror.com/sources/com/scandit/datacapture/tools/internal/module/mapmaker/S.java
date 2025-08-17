package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes11.dex */
public abstract class S {
    public static void a(boolean z10, String str, t tVar) {
        String strValueOf;
        if (z10) {
            return;
        }
        int i10 = 0;
        Object[] objArr = {tVar};
        try {
            strValueOf = String.valueOf(tVar);
        } catch (Exception e10) {
            String str2 = tVar.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(tVar));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e10);
            strValueOf = "<" + str2 + " threw " + e10.getClass().getName() + ">";
        }
        objArr[0] = strValueOf;
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        int i11 = 0;
        while (i10 < 1) {
            int iIndexOf = str.indexOf("%s", i11);
            if (iIndexOf == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, iIndexOf);
            sb2.append(objArr[i10]);
            i11 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i10 < 1) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i12 = i10 + 1; i12 < 1; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        throw new IllegalStateException(sb2.toString());
    }
}
