package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class XR implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f72164a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ YR f72165b;

    XR(YR yr2, boolean z10) {
        this.f72164a = z10;
        this.f72165b = yr2;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        Sc.p.d("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    @Override // com.google.android.gms.internal.ads.Ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.YR r0 = r7.f72165b
            com.google.android.gms.internal.ads.AB r8 = (com.google.android.gms.internal.ads.AB) r8
            boolean r0 = r0.a()
            if (r0 == 0) goto Lb
            return
        Lb:
            android.os.Bundle r8 = r8.f65928a
            java.lang.String r0 = "ad_types"
            java.lang.Object r0 = r8.get(r0)
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L1a
            java.util.List r0 = (java.util.List) r0
            goto L24
        L1a:
            boolean r1 = r0 instanceof java.lang.String[]
            if (r1 == 0) goto L4a
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
        L24:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L31:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L31
            java.lang.String r2 = (java.lang.String) r2
            r1.add(r2)
            goto L31
        L45:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            goto L4c
        L4a:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
        L4c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L55:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Laf
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            r3 = 2
            r5 = 3
            r6 = 1
            switch(r2) {
                case -1396342996: goto L8a;
                case -1052618729: goto L80;
                case -239580146: goto L76;
                case 604727084: goto L6c;
                default: goto L6b;
            }
        L6b:
            goto L94
        L6c:
            java.lang.String r2 = "interstitial"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L94
            r1 = r6
            goto L95
        L76:
            java.lang.String r2 = "rewarded"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L94
            r1 = r5
            goto L95
        L80:
            java.lang.String r2 = "native"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L94
            r1 = r3
            goto L95
        L8a:
            java.lang.String r2 = "banner"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L94
            r1 = 0
            goto L95
        L94:
            r1 = -1
        L95:
            if (r1 == 0) goto La9
            if (r1 == r6) goto La6
            if (r1 == r3) goto La3
            if (r1 == r5) goto La0
            com.google.android.gms.internal.ads.qe r1 = com.google.android.gms.internal.ads.EnumC9317qe.AD_FORMAT_TYPE_UNSPECIFIED
            goto Lab
        La0:
            com.google.android.gms.internal.ads.qe r1 = com.google.android.gms.internal.ads.EnumC9317qe.REWARD_BASED_VIDEO_AD
            goto Lab
        La3:
            com.google.android.gms.internal.ads.qe r1 = com.google.android.gms.internal.ads.EnumC9317qe.NATIVE_APP_INSTALL
            goto Lab
        La6:
            com.google.android.gms.internal.ads.qe r1 = com.google.android.gms.internal.ads.EnumC9317qe.INTERSTITIAL
            goto Lab
        La9:
            com.google.android.gms.internal.ads.qe r1 = com.google.android.gms.internal.ads.EnumC9317qe.BANNER
        Lab:
            r4.add(r1)
            goto L55
        Laf:
            com.google.android.gms.internal.ads.YR r0 = r7.f72165b
            com.google.android.gms.internal.ads.vd r6 = com.google.android.gms.internal.ads.YR.c(r0, r8)
            com.google.android.gms.internal.ads.YR r0 = r7.f72165b
            com.google.android.gms.internal.ads.pd r5 = com.google.android.gms.internal.ads.YR.b(r0, r8)
            com.google.android.gms.internal.ads.YR r8 = r7.f72165b
            boolean r3 = r7.f72164a
            com.google.android.gms.internal.ads.WR r1 = new com.google.android.gms.internal.ads.WR
            r2 = r7
            r1.<init>()
            com.google.android.gms.internal.ads.MR r8 = r8.f73009b
            r8.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.XR.zzb(java.lang.Object):void");
    }
}
