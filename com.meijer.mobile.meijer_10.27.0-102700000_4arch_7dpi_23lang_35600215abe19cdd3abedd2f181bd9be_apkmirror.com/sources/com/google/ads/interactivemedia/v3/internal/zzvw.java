package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes4.dex */
public class zzvw {
    @Deprecated
    public zzvw() {
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            zzace zzaceVar = new zzace(stringWriter);
            zzaceVar.zzr(zzwg.LENIENT);
            zzabh.zzV.write(zzaceVar, this);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
