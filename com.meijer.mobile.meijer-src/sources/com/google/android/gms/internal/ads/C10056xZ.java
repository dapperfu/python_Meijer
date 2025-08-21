package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10056xZ implements InterfaceC8502iy0 {
    public static C10056xZ a() {
        return C9842vZ.f79918a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* synthetic */ Object zzb() {
        List arrayList = new ArrayList();
        AbstractC7718bf abstractC7718bf = C8784lf.f76794Eb;
        if (!((String) Oc.A.c().a(abstractC7718bf)).isEmpty()) {
            arrayList = Arrays.asList(((String) Oc.A.c().a(abstractC7718bf)).split(","));
        }
        C9358qy0.b(arrayList);
        return arrayList;
    }
}
