package com.google.android.libraries.places.internal;

import De.C3106c;
import Ee.O;
import Ee.y0;
import io.constructor.BuildConfig;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class zzuh {
    public static final /* synthetic */ int zza = 0;
    private static final O zzb = O.C("http", BuildConfig.SERVICE_SCHEME, "mailto", "ftp");
    private static final O zzc = O.E("audio/3gpp2", "audio/3gpp", "audio/aac", "audio/midi", "audio/mp3", "audio/mp4", "audio/mpeg", "audio/oga", "audio/ogg", "audio/opus", "audio/x-m4a", "audio/x-matroska", "audio/x-wav", "audio/wav", "audio/webm", "image/bmp", "image/gif", "image/jpeg", "image/jpg", "image/png", "image/svg+xml", "image/tiff", "image/webp", "image/x-icon", "video/mpeg", "video/mp4", "video/ogg", "video/webm", "video/x-matroska", "font/ttf");
    private static final O zzd = O.x();

    /* JADX WARN: Multi-variable type inference failed */
    public static zzug zza(String str, zzug zzugVar) {
        char cCharAt;
        int i10;
        char cCharAt2;
        char cCharAt3;
        O o10 = zzd;
        String strE = C3106c.e(str);
        y0 it = zzb.iterator();
        while (true) {
            if (!it.hasNext()) {
                if (strE.startsWith("data:")) {
                    String strE2 = C3106c.e(str);
                    if (strE2.startsWith("data:") && strE2.length() > 5) {
                        int i11 = 5;
                        while (i11 < strE2.length() && (cCharAt3 = strE2.charAt(i11)) != ';' && cCharAt3 != ',') {
                            i11++;
                        }
                        if (zzc.contains(strE2.substring(5, i11)) && strE2.startsWith(";base64,", i11) && (i10 = i11 + 8) < strE2.length()) {
                            while (i10 < strE2.length() && (cCharAt2 = strE2.charAt(i10)) != '=') {
                                if ((cCharAt2 < 'a' || cCharAt2 > 'z') && !((cCharAt2 >= '0' && cCharAt2 <= '9') || cCharAt2 == '+' || cCharAt2 == '/')) {
                                    break;
                                }
                                i10++;
                            }
                            while (i10 < strE2.length()) {
                                if (strE2.charAt(i10) == '=') {
                                    i10++;
                                }
                            }
                        }
                    }
                    return zzugVar;
                }
                Iterator<E> it2 = o10.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (strE.startsWith(String.valueOf(C3106c.e(((zzuc) it2.next()).name()).replace('_', '-')).concat(":"))) {
                            break;
                        }
                    } else {
                        for (int i12 = 0; i12 < str.length() && (cCharAt = str.charAt(i12)) != '#' && cCharAt != '/'; i12++) {
                            if (cCharAt != ':') {
                                if (cCharAt == '?') {
                                    break;
                                }
                            }
                        }
                    }
                }
            } else {
                if (strE.startsWith(String.valueOf((String) it.next()).concat(":"))) {
                    break;
                }
            }
        }
        return new zzug(str);
    }
}
