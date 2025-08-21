package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class zzyw extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzyw(Throwable th2) {
        String strConcat;
        String simpleName = th2.getClass().getSimpleName();
        if (th2.getMessage() != null) {
            strConcat = ": ".concat(String.valueOf(th2.getMessage()));
        } else {
            strConcat = "";
        }
        super("Unexpected " + simpleName + strConcat, th2);
    }
}
