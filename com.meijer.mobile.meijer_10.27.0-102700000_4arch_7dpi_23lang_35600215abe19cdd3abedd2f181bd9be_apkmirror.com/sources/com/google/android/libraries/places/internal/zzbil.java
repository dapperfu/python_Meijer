package com.google.android.libraries.places.internal;

import Be.p;
import com.medallia.digital.mobilesdk.l3;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

/* loaded from: classes6.dex */
public abstract class zzbil {
    public static final /* synthetic */ int zza = 0;
    private static final BitSet zzb;
    private final String zzc;
    private final String zzd;
    private final byte[] zze;

    abstract byte[] zza(Object obj);

    abstract Object zzb(byte[] bArr);

    public final String zzd() {
        return this.zzd;
    }

    final byte[] zze() {
        return this.zze;
    }

    static {
        BitSet bitSet = new BitSet(l3.f92485d);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c10 = '0'; c10 <= '9'; c10 = (char) (c10 + 1)) {
            bitSet.set(c10);
        }
        for (char c11 = 'a'; c11 <= 'z'; c11 = (char) (c11 + 1)) {
            bitSet.set(c11);
        }
        zzb = bitSet;
    }

    public static zzbil zzc(String str, zzbik zzbikVar) {
        return new zzbij(str, false, zzbikVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zzd.equals(((zzbil) obj).zzd);
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }

    public final String toString() {
        String str = this.zzd;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
        sb2.append("Key{name='");
        sb2.append(str);
        sb2.append("'}");
        return sb2.toString();
    }

    /* synthetic */ zzbil(String str, boolean z10, Object obj, byte[] bArr) {
        String str2 = (String) p.r(str, "name");
        this.zzc = str2;
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        p.r(lowerCase, "name");
        p.e(!lowerCase.isEmpty(), "token must have at least 1 tchar");
        if (lowerCase.equals("connection")) {
            zzbik zzbikVar = zzbip.zza;
            zzbip.zzc.logp(Level.WARNING, "io.grpc.Metadata$Key", "validateName", "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        int i10 = 0;
        while (i10 < lowerCase.length()) {
            char cCharAt = lowerCase.charAt(i10);
            if (z10 && cCharAt == ':') {
                if (i10 == 0) {
                    i10 = 0;
                } else {
                    cCharAt = ':';
                    p.g(zzb.get(cCharAt), "Invalid character '%s' in key name '%s'", cCharAt, lowerCase);
                }
            } else {
                p.g(zzb.get(cCharAt), "Invalid character '%s' in key name '%s'", cCharAt, lowerCase);
            }
            i10++;
        }
        this.zzd = lowerCase;
        this.zze = lowerCase.getBytes(StandardCharsets.US_ASCII);
    }
}
