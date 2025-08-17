package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes6.dex */
public final class M9 {

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f68550d = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a, reason: collision with root package name */
    private final String f68551a = "ad.doubleclick.net";

    /* renamed from: b, reason: collision with root package name */
    private final String[] f68552b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: c, reason: collision with root package name */
    private final G9 f68553c;

    @Deprecated
    public M9(G9 g92) {
        this.f68553c = g92;
    }

    @Deprecated
    public final G9 c() {
        return this.f68553c;
    }

    private final Uri g(Uri uri, String str) throws zzavb {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals(this.f68551a)) {
                    if (uri.getPath().contains(";")) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new zzavb("Parameter already exists: dc_ms");
                        }
                        String string = uri.toString();
                        int iIndexOf = string.indexOf(";adurl");
                        if (iIndexOf != -1) {
                            int i10 = iIndexOf + 1;
                            return Uri.parse(string.substring(0, i10) + "dc_ms=" + str + ";" + string.substring(i10));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int iIndexOf2 = string.indexOf(encodedPath);
                        return Uri.parse(string.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms=" + str + ";" + string.substring(iIndexOf2 + encodedPath.length()));
                    }
                }
            } catch (NullPointerException unused) {
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
            return Uri.parse(string2.substring(0, i11) + "ms=" + str + "&" + string2.substring(i11));
        } catch (UnsupportedOperationException unused2) {
            throw new zzavb("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri a(Uri uri, Context context, View view, Activity activity) throws zzavb {
        try {
            return g(uri, this.f68553c.zze(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzavb("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri b(Uri uri, Context context) throws zzavb {
        return g(uri, this.f68553c.zzf(context));
    }

    @Deprecated
    public final void d(MotionEvent motionEvent) {
        this.f68553c.zzk(motionEvent);
    }

    public final boolean e(Uri uri) {
        if (f(uri)) {
            String[] strArr = f68550d;
            for (int i10 = 0; i10 < 3; i10++) {
                if (uri.getPath().endsWith(strArr[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.f68552b;
            for (int i10 = 0; i10 < 3; i10++) {
                if (host.endsWith(strArr[i10])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
