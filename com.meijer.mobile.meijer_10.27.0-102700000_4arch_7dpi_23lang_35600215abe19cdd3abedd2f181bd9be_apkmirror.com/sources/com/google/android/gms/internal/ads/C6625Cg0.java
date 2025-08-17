package com.google.android.gms.internal.ads;

import java.util.Collection;

/* renamed from: com.google.android.gms.internal.ads.Cg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6625Cg0 {
    static boolean a(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
