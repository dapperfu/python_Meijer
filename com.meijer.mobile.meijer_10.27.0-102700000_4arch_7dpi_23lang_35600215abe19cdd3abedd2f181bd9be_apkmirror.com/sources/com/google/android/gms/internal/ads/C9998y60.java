package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.y60, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9998y60 {

    /* renamed from: a, reason: collision with root package name */
    private final M9 f79974a;

    public C9998y60(M9 m92) {
        this.f79974a = m92;
    }

    private static final Uri b(Uri uri, String str) throws zzavb {
        if (uri != null) {
            try {
                try {
                    String host = uri.getHost();
                    String path = uri.getPath();
                    if (host != null && host.equals("ad.doubleclick.net") && path != null) {
                        if (path.contains(";")) {
                            if (uri.toString().contains("dc_ms=")) {
                                throw new zzavb("Parameter already exists: dc_ms");
                            }
                            String string = uri.toString();
                            int iIndexOf = string.indexOf(";adurl");
                            if (iIndexOf != -1) {
                                int i10 = iIndexOf + 1;
                                StringBuilder sb2 = new StringBuilder(string.substring(0, i10));
                                sb2.append("dc_ms");
                                sb2.append("=");
                                sb2.append(str);
                                sb2.append(";");
                                sb2.append((CharSequence) string, i10, string.length());
                                return Uri.parse(sb2.toString());
                            }
                            String encodedPath = uri.getEncodedPath();
                            if (encodedPath == null) {
                                throw new UnsupportedOperationException();
                            }
                            int iIndexOf2 = string.indexOf(encodedPath);
                            StringBuilder sb3 = new StringBuilder(string.substring(0, encodedPath.length() + iIndexOf2));
                            sb3.append(";");
                            sb3.append("dc_ms");
                            sb3.append("=");
                            sb3.append(str);
                            sb3.append(";");
                            sb3.append((CharSequence) string, iIndexOf2 + encodedPath.length(), string.length());
                            return Uri.parse(sb3.toString());
                        }
                    }
                } catch (NullPointerException unused) {
                }
            } catch (UnsupportedOperationException unused2) {
                throw new zzavb("Provided Uri is not in a valid state");
            }
        }
        if (uri.getQueryParameter("ms") != null) {
            throw new zzavb("Query parameter already exists: ms");
        }
        String string2 = uri.toString();
        int iIndexOf3 = string2.indexOf("&adurl");
        if (iIndexOf3 == -1) {
            iIndexOf3 = string2.indexOf("?adurl");
        }
        if (iIndexOf3 == -1) {
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        int i11 = iIndexOf3 + 1;
        StringBuilder sb4 = new StringBuilder(string2.substring(0, i11));
        sb4.append("ms");
        sb4.append("=");
        sb4.append(str);
        sb4.append("&");
        sb4.append((CharSequence) string2, i11, string2.length());
        return Uri.parse(sb4.toString());
    }

    public final Uri a(Uri uri, Context context, View view, Activity activity) throws zzavb {
        try {
            return b(uri, this.f79974a.c().zze(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzavb("Provided Uri is not in a valid state");
        }
    }
}
