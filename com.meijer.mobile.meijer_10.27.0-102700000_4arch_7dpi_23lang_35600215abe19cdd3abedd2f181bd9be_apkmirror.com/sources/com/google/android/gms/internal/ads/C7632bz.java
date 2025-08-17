package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.bz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7632bz {

    /* renamed from: a, reason: collision with root package name */
    private static final String f73046a = Integer.toString(0, 36);

    /* renamed from: b, reason: collision with root package name */
    private static final String f73047b = Integer.toString(1, 36);

    /* renamed from: c, reason: collision with root package name */
    private static final String f73048c = Integer.toString(2, 36);

    /* renamed from: d, reason: collision with root package name */
    private static final String f73049d = Integer.toString(3, 36);

    /* renamed from: e, reason: collision with root package name */
    private static final String f73050e = Integer.toString(4, 36);

    public static ArrayList a(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (C7655cA c7655cA : (C7655cA[]) spanned.getSpans(0, spanned.length(), C7655cA.class)) {
            arrayList.add(b(spanned, c7655cA, 1, c7655cA.a()));
        }
        for (C7870eB c7870eB : (C7870eB[]) spanned.getSpans(0, spanned.length(), C7870eB.class)) {
            arrayList.add(b(spanned, c7870eB, 2, c7870eB.a()));
        }
        for (C6611Bz c6611Bz : (C6611Bz[]) spanned.getSpans(0, spanned.length(), C6611Bz.class)) {
            arrayList.add(b(spanned, c6611Bz, 3, null));
        }
        for (FB fb2 : (FB[]) spanned.getSpans(0, spanned.length(), FB.class)) {
            arrayList.add(b(spanned, fb2, 4, fb2.a()));
        }
        return arrayList;
    }

    private static Bundle b(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f73046a, spanned.getSpanStart(obj));
        bundle2.putInt(f73047b, spanned.getSpanEnd(obj));
        bundle2.putInt(f73048c, spanned.getSpanFlags(obj));
        bundle2.putInt(f73049d, i10);
        if (bundle != null) {
            bundle2.putBundle(f73050e, bundle);
        }
        return bundle2;
    }
}
