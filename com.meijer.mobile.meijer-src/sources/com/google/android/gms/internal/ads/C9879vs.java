package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.vs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9879vs implements InterfaceC7194Pi {
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void a(java.lang.Object r17, java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9879vs.a(java.lang.Object, java.util.Map):void");
    }

    private static final Integer b(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            Sc.p.g("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }
}
