package com.google.android.libraries.places.internal;

import Be.B;
import Be.C2957c;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes6.dex */
public final class zzbyp implements HostnameVerifier {
    public static final zzbyp zza = new zzbyp();
    private static final Pattern zzb = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private zzbyp() {
    }

    private static final boolean zzb(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str.concat(".");
            }
            if (!str2.endsWith(".")) {
                str2 = str2.concat(".");
            }
            String strE = C2957c.e(str2);
            if (!strE.contains("*")) {
                return str.equals(strE);
            }
            if (!strE.startsWith("*.") || strE.indexOf(42, 1) != -1 || str.length() < strE.length() || "*.".equals(strE)) {
                return false;
            }
            String strSubstring = strE.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length + (-1)) == -1;
        }
        return false;
    }

    private static List zza(X509Certificate x509Certificate, int i10) throws CertificateParsingException {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i10 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) throws CertificateParsingException {
        String strZza;
        if (B.a(str) == str.length()) {
            try {
                X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
                if (zzb.matcher(str).matches()) {
                    List listZza = zza(x509Certificate, 7);
                    int size = listZza.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (str.equalsIgnoreCase((String) listZza.get(i10))) {
                            return true;
                        }
                    }
                    return false;
                }
                String strE = C2957c.e(str);
                List listZza2 = zza(x509Certificate, 2);
                int size2 = listZza2.size();
                int i11 = 0;
                boolean z10 = false;
                while (i11 < size2) {
                    if (zzb(strE, (String) listZza2.get(i11))) {
                        return true;
                    }
                    i11++;
                    z10 = true;
                }
                if (!z10 && (strZza = new zzbym(x509Certificate.getSubjectX500Principal()).zza("cn")) != null) {
                    return zzb(strE, strZza);
                }
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
