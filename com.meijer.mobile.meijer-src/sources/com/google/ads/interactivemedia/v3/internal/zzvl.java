package com.google.ads.interactivemedia.v3.internal;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzvl {
    public static final zzvl zza = new zzvl("", "", false);
    private final String zzb;
    private final String zzc;
    private final boolean zzd;

    public final String zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzd;
    }

    static {
        new zzvl("\n", "  ", true);
    }

    private zzvl(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.zzb = str;
                this.zzc = str2;
                this.zzd = z10;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}
