package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.bz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7757bz {

    /* renamed from: a, reason: collision with root package name */
    private static final String f73886a = Integer.toString(0, 36);

    /* renamed from: b, reason: collision with root package name */
    private static final String f73887b = Integer.toString(1, 36);

    /* renamed from: c, reason: collision with root package name */
    private static final String f73888c = Integer.toString(2, 36);

    /* renamed from: d, reason: collision with root package name */
    private static final String f73889d = Integer.toString(3, 36);

    /* renamed from: e, reason: collision with root package name */
    private static final String f73890e = Integer.toString(4, 36);

    public static ArrayList a(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (C7780cA c7780cA : (C7780cA[]) spanned.getSpans(0, spanned.length(), C7780cA.class)) {
            arrayList.add(b(spanned, c7780cA, 1, c7780cA.a()));
        }
        for (C7995eB c7995eB : (C7995eB[]) spanned.getSpans(0, spanned.length(), C7995eB.class)) {
            arrayList.add(b(spanned, c7995eB, 2, c7995eB.a()));
        }
        for (C6736Bz c6736Bz : (C6736Bz[]) spanned.getSpans(0, spanned.length(), C6736Bz.class)) {
            arrayList.add(b(spanned, c6736Bz, 3, null));
        }
        for (FB fb2 : (FB[]) spanned.getSpans(0, spanned.length(), FB.class)) {
            arrayList.add(b(spanned, fb2, 4, fb2.a()));
        }
        return arrayList;
    }

    private static Bundle b(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f73886a, spanned.getSpanStart(obj));
        bundle2.putInt(f73887b, spanned.getSpanEnd(obj));
        bundle2.putInt(f73888c, spanned.getSpanFlags(obj));
        bundle2.putInt(f73889d, i10);
        if (bundle != null) {
            bundle2.putBundle(f73890e, bundle);
        }
        return bundle2;
    }
}
