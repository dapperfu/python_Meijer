package com.google.android.libraries.places.internal;

import java.io.IOException;

/* loaded from: classes6.dex */
public enum zzbyw {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");

    private final String zze;

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }

    public static zzbyw zza(String str) throws IOException {
        zzbyw zzbywVar = HTTP_1_0;
        if (str.equals(zzbywVar.zze)) {
            return zzbywVar;
        }
        zzbyw zzbywVar2 = HTTP_1_1;
        if (str.equals(zzbywVar2.zze)) {
            return zzbywVar2;
        }
        zzbyw zzbywVar3 = HTTP_2;
        if (str.equals(zzbywVar3.zze)) {
            return zzbywVar3;
        }
        zzbyw zzbywVar4 = SPDY_3;
        if (str.equals(zzbywVar4.zze)) {
            return zzbywVar4;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    zzbyw(String str) {
        this.zze = str;
    }
}
