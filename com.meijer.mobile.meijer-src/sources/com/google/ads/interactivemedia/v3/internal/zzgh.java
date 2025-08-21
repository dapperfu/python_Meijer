package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzgh {
    public static Uri zza(ImaSdkSettings imaSdkSettings, String str) {
        return zzb((imaSdkSettings == null || !imaSdkSettings.isDebugMode()) ? com.google.ads.interactivemedia.v3.impl.zzav.zza : com.google.ads.interactivemedia.v3.impl.zzav.zzb, imaSdkSettings, str);
    }

    public static Map zzc(Uri uri) {
        if (uri == null || uri.isOpaque()) {
            throw new UnsupportedOperationException("This isn't a hierarchical URI.");
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null || encodedQuery.length() == 0) {
            return Collections.EMPTY_MAP;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iIndexOf = encodedQuery.indexOf(35);
        int i10 = 0;
        if (iIndexOf == -1) {
            iIndexOf = encodedQuery.length();
        }
        do {
            int iIndexOf2 = encodedQuery.indexOf(38, i10);
            if (iIndexOf2 == -1) {
                iIndexOf2 = iIndexOf;
            }
            int iIndexOf3 = encodedQuery.indexOf(61, i10);
            if (iIndexOf3 > iIndexOf2 || iIndexOf3 == -1) {
                iIndexOf3 = iIndexOf2;
            }
            linkedHashMap.put(encodedQuery.substring(i10, iIndexOf3), iIndexOf3 < iIndexOf2 ? encodedQuery.substring(iIndexOf3 + 1, iIndexOf2) : "");
            i10 = iIndexOf2 + 1;
        } while (i10 < iIndexOf);
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public static Uri zzb(Uri uri, ImaSdkSettings imaSdkSettings, String str) {
        String str2;
        Uri.Builder builderAppendQueryParameter = uri.buildUpon().appendQueryParameter("sdk_version", "a.3.35.1").appendQueryParameter("hl", imaSdkSettings.getLanguage()).appendQueryParameter("omv", "1.4.10-google_20240110").appendQueryParameter("app", str);
        if (true != M4.f.a("WEB_MESSAGE_LISTENER")) {
            str2 = "0";
        } else {
            str2 = "4";
        }
        builderAppendQueryParameter.appendQueryParameter("mt", str2);
        if (imaSdkSettings.getTestingConfig() != null) {
            zzvs zzvsVar = new zzvs();
            zzvsVar.zzc(new zzpu());
            zzvsVar.zze(new zzpt());
            builderAppendQueryParameter.appendQueryParameter(TestingConfiguration.PARAMETER_KEY, zzvsVar.zza().zzf(imaSdkSettings.getTestingConfig()));
        }
        return builderAppendQueryParameter.build();
    }
}
