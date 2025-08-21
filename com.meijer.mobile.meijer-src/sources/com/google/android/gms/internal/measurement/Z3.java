package com.google.android.gms.internal.measurement;

import Z.C5603a;
import android.net.Uri;

/* loaded from: classes6.dex */
public final class Z3 {

    /* renamed from: a, reason: collision with root package name */
    private static final C5603a f82954a = new C5603a();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f82955b = 0;

    public static synchronized Uri a(String str) {
        C5603a c5603a = f82954a;
        Uri uri = (Uri) c5603a.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        c5603a.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
