package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes6.dex */
public final class A3 {

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f82470f = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a, reason: collision with root package name */
    private String f82471a = "googleads.g.doubleclick.net";

    /* renamed from: b, reason: collision with root package name */
    private String f82472b = "/pagead/ads";

    /* renamed from: c, reason: collision with root package name */
    private final String f82473c = "ad.doubleclick.net";

    /* renamed from: d, reason: collision with root package name */
    private String[] f82474d = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC10931v3 f82475e;

    @Deprecated
    public A3(InterfaceC10931v3 interfaceC10931v3) {
        this.f82475e = interfaceC10931v3;
    }

    public final void d(String str, String str2) {
        this.f82471a = str;
        this.f82472b = str2;
    }

    private final Uri h(Uri uri, String str) throws zzcw {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals(this.f82473c)) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new zzcw("Parameter already exists: dc_ms");
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
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new zzcw("Query parameter already exists: ms");
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
            throw new zzcw("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri a(Uri uri, Context context, View view, Activity activity) throws zzcw {
        try {
            return h(uri, this.f82475e.d(context, uri.getQueryParameter("ai"), null, null));
        } catch (UnsupportedOperationException unused) {
            throw new zzcw("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri b(Uri uri, Context context) throws zzcw {
        return h(uri, this.f82475e.a(context));
    }

    @Deprecated
    public final void c(MotionEvent motionEvent) {
        this.f82475e.f(motionEvent);
    }

    public final void e(String str) {
        this.f82474d = str.split(",");
    }

    public final boolean f(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            for (String str : this.f82474d) {
                if (host.endsWith(str)) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final boolean g(Uri uri) {
        uri.getClass();
        try {
            if (uri.getHost().equals(this.f82471a)) {
                if (uri.getPath().equals(this.f82472b)) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
