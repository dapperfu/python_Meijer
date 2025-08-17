package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9931xZ implements InterfaceC8377iy0 {
    public static C9931xZ a() {
        return C9717vZ.f79078a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* synthetic */ Object zzb() {
        List arrayList = new ArrayList();
        AbstractC7593bf abstractC7593bf = C8659lf.f75954Eb;
        if (!((String) Mc.A.c().a(abstractC7593bf)).isEmpty()) {
            arrayList = Arrays.asList(((String) Mc.A.c().a(abstractC7593bf)).split(","));
        }
        C9233qy0.b(arrayList);
        return arrayList;
    }
}
