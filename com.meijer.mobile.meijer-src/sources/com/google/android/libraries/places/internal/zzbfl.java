package com.google.android.libraries.places.internal;

import De.p;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class zzbfl {
    public static zzbfe zza(zzbfe zzbfeVar, List list) {
        p.r(zzbfeVar, "channel");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbfeVar = new zzbfk(zzbfeVar, (zzbfj) it.next(), null);
        }
        return zzbfeVar;
    }
}
