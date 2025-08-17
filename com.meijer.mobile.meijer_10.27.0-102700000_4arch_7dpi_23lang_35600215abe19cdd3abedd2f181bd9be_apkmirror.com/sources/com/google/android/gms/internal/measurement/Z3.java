package com.google.android.gms.internal.measurement;

import Z.C5503a;
import android.net.Uri;

/* loaded from: classes6.dex */
public final class Z3 {

    /* renamed from: a, reason: collision with root package name */
    private static final C5503a f82114a = new C5503a();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f82115b = 0;

    public static synchronized Uri a(String str) {
        C5503a c5503a = f82114a;
        Uri uri = (Uri) c5503a.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        c5503a.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
