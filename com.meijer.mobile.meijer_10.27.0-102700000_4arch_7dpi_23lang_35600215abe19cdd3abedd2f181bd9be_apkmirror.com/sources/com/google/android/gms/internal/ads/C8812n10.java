package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n10, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8812n10 implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private C7026Od0 f76978a;

    /* renamed from: b, reason: collision with root package name */
    private C7026Od0 f76979b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f76980c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f76981d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f76982e = false;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f76983f;

    public C8812n10(C7026Od0 c7026Od0, C7026Od0 c7026Od02, boolean z10, boolean z11, boolean z12) {
        this.f76978a = c7026Od0;
        this.f76979b = c7026Od02;
        this.f76980c = z10;
        this.f76981d = z11;
        this.f76983f = z12;
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
    }

    public C8812n10(boolean z10) {
        this.f76983f = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.google.android.gms.internal.ads.S10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.AB r6 = (com.google.android.gms.internal.ads.AB) r6
            android.os.Bundle r6 = r6.f65088a
            boolean r0 = r5.f76982e
            if (r0 == 0) goto La
            goto Lbb
        La:
            java.lang.String r0 = "pii"
            android.os.Bundle r1 = com.google.android.gms.internal.ads.H60.a(r6, r0)
            boolean r2 = r5.f76983f
            if (r2 != 0) goto L26
            com.google.android.gms.internal.ads.bf r2 = com.google.android.gms.internal.ads.C8659lf.f76309e3
            com.google.android.gms.internal.ads.jf r3 = Mc.A.c()
            java.lang.Object r2 = r3.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L3c
        L26:
            boolean r2 = r5.f76983f
            if (r2 == 0) goto L5a
            com.google.android.gms.internal.ads.bf r2 = com.google.android.gms.internal.ads.C8659lf.f76337g3
            com.google.android.gms.internal.ads.jf r3 = Mc.A.c()
            java.lang.Object r2 = r3.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L5a
        L3c:
            com.google.android.gms.internal.ads.Od0 r2 = r5.f76978a
            boolean r2 = r2.c()
            if (r2 == 0) goto L5a
            com.google.android.gms.internal.ads.Od0 r2 = r5.f76978a
            java.lang.String r2 = r2.b()
            java.lang.String r3 = "paidv1_id_android"
            r1.putString(r3, r2)
            com.google.android.gms.internal.ads.Od0 r2 = r5.f76978a
            long r2 = r2.a()
            java.lang.String r4 = "paidv1_creation_time_android"
            r1.putLong(r4, r2)
        L5a:
            boolean r2 = r5.f76983f
            if (r2 != 0) goto L70
            com.google.android.gms.internal.ads.bf r2 = com.google.android.gms.internal.ads.C8659lf.f76323f3
            com.google.android.gms.internal.ads.jf r3 = Mc.A.c()
            java.lang.Object r2 = r3.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L86
        L70:
            boolean r2 = r5.f76983f
            if (r2 == 0) goto Lb2
            com.google.android.gms.internal.ads.bf r2 = com.google.android.gms.internal.ads.C8659lf.f76351h3
            com.google.android.gms.internal.ads.jf r3 = Mc.A.c()
            java.lang.Object r2 = r3.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lb2
        L86:
            com.google.android.gms.internal.ads.Od0 r2 = r5.f76979b
            boolean r2 = r2.c()
            if (r2 == 0) goto La4
            com.google.android.gms.internal.ads.Od0 r2 = r5.f76979b
            java.lang.String r2 = r2.b()
            java.lang.String r3 = "paidv2_id_android"
            r1.putString(r3, r2)
            com.google.android.gms.internal.ads.Od0 r2 = r5.f76979b
            long r2 = r2.a()
            java.lang.String r4 = "paidv2_creation_time_android"
            r1.putLong(r4, r2)
        La4:
            boolean r2 = r5.f76980c
            java.lang.String r3 = "paidv2_pub_option_android"
            r1.putBoolean(r3, r2)
            boolean r2 = r5.f76981d
            java.lang.String r3 = "paidv2_user_option_android"
            r1.putBoolean(r3, r2)
        Lb2:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto Lbb
            r6.putBundle(r0, r1)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8812n10.zzb(java.lang.Object):void");
    }
}
