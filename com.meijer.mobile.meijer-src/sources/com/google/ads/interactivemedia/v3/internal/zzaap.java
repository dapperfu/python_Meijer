package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;

/* loaded from: classes4.dex */
final class zzaap extends zzwj {
    zzaap() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        Locale locale = (Locale) obj;
        zzaceVar.zzl(locale == null ? null : locale.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        String strNextToken;
        String strNextToken2;
        String strNextToken3 = null;
        if (zzaccVar.zzr() == 9) {
            zzaccVar.zzm();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(zzaccVar.zzh(), "_");
        if (stringTokenizer.hasMoreElements()) {
            strNextToken = stringTokenizer.nextToken();
        } else {
            strNextToken = null;
        }
        if (stringTokenizer.hasMoreElements()) {
            strNextToken2 = stringTokenizer.nextToken();
        } else {
            strNextToken2 = null;
        }
        if (stringTokenizer.hasMoreElements()) {
            strNextToken3 = stringTokenizer.nextToken();
        }
        if (strNextToken2 == null && strNextToken3 == null) {
            return new Locale(strNextToken);
        }
        if (strNextToken3 == null) {
            return new Locale(strNextToken, strNextToken2);
        }
        return new Locale(strNextToken, strNextToken2, strNextToken3);
    }
}
