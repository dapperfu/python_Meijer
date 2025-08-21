package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class L90 {

    /* renamed from: a, reason: collision with root package name */
    private final C8022eV f69132a;

    /* renamed from: b, reason: collision with root package name */
    private final String f69133b;

    /* renamed from: c, reason: collision with root package name */
    private final String f69134c;

    /* renamed from: d, reason: collision with root package name */
    private final String f69135d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f69136e;

    /* renamed from: f, reason: collision with root package name */
    private final C8840m60 f69137f;

    /* renamed from: g, reason: collision with root package name */
    private final C8947n60 f69138g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f69139h;

    /* renamed from: i, reason: collision with root package name */
    private final M9 f69140i;

    private static String j(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public static final List f(int i10, int i11, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j((String) it.next(), "@gw_mpe@", "2." + i11));
        }
        return arrayList;
    }

    public static final List g(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    public static final List h(List list, long j10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j((String) it.next(), "@gw_ttr@", Long.toString(j10, 10)));
        }
        return arrayList;
    }

    public final List c(C8733l60 c8733l60, Z50 z50, List list) {
        return d(c8733l60, z50, false, "", "", list);
    }

    public final List d(C8733l60 c8733l60, Z50 z50, boolean z10, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z11 = true;
            String strJ = j(j(j((String) it.next(), "@gw_adlocid@", c8733l60.f76588a.f75445a.f79580f), "@gw_adnetrefresh@", true != z10 ? "0" : "1"), "@gw_sdkver@", this.f69133b);
            if (z50 != null) {
                strJ = C7502Yp.c(j(j(j(strJ, "@gw_qdata@", z50.f72909y), "@gw_adnetid@", z50.f72907x), "@gw_allocid@", z50.f72905w), this.f69136e, z50.f72857W, z50.f72906w0);
            }
            String strJ2 = j(j(j(j(strJ, "@gw_adnetstatus@", this.f69132a.g()), "@gw_ttr@", Long.toString(this.f69132a.a(), 10)), "@gw_seqnum@", this.f69134c), "@gw_sessid@", this.f69135d);
            boolean z12 = false;
            if (((Boolean) Oc.A.c().a(C8784lf.f76786E3)).booleanValue() && !TextUtils.isEmpty(str)) {
                z12 = true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean z13 = !zIsEmpty;
            if (z12) {
                z11 = z13;
            } else {
                if (!zIsEmpty) {
                }
                arrayList.add(strJ2);
            }
            if (this.f69140i.f(Uri.parse(strJ2))) {
                Uri.Builder builderBuildUpon = Uri.parse(strJ2).buildUpon();
                if (z12) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z11) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strJ2 = builderBuildUpon.build().toString();
            }
            arrayList.add(strJ2);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[LOOP:0: B:13:0x0060->B:15:0x0066, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List e(com.google.android.gms.internal.ads.Z50 r11, java.util.List r12, com.google.android.gms.internal.ads.InterfaceC6963Io r13) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.util.f r1 = r10.f69139h
            long r1 = r1.a()
            java.lang.String r3 = r13.zzc()     // Catch: android.os.RemoteException -> Lb1
            int r13 = r13.zzb()     // Catch: android.os.RemoteException -> Lb1
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch: android.os.RemoteException -> Lb1
            com.google.android.gms.internal.ads.bf r4 = com.google.android.gms.internal.ads.C8784lf.f76800F3
            com.google.android.gms.internal.ads.jf r5 = Oc.A.c()
            java.lang.Object r4 = r5.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L39
            com.google.android.gms.internal.ads.n60 r4 = r10.f69138g
            if (r4 != 0) goto L32
            com.google.android.gms.internal.ads.Bf0 r4 = com.google.android.gms.internal.ads.AbstractC6714Bf0.c()
            goto L3c
        L32:
            com.google.android.gms.internal.ads.m60 r4 = r4.f77839a
        L34:
            com.google.android.gms.internal.ads.Bf0 r4 = com.google.android.gms.internal.ads.AbstractC6714Bf0.d(r4)
            goto L3c
        L39:
            com.google.android.gms.internal.ads.m60 r4 = r10.f69137f
            goto L34
        L3c:
            com.google.android.gms.internal.ads.J90 r5 = new com.google.android.gms.internal.ads.J90
            r5.<init>()
            com.google.android.gms.internal.ads.Bf0 r5 = r4.a(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.b(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.K90 r7 = new com.google.android.gms.internal.ads.K90
            r7.<init>()
            com.google.android.gms.internal.ads.Bf0 r4 = r4.a(r7)
            java.lang.Object r4 = r4.b(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r12 = r12.iterator()
        L60:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto Lb0
            java.lang.Object r6 = r12.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = j(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = j(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = j(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = j(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = j(r6, r7, r13)
            java.lang.String r7 = r10.f69133b
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = j(r6, r8, r7)
            android.content.Context r7 = r10.f69136e
            boolean r8 = r11.f72857W
            java.util.Map r9 = r11.f72906w0
            java.lang.String r6 = com.google.android.gms.internal.ads.C7502Yp.c(r6, r7, r8, r9)
            r0.add(r6)
            goto L60
        Lb0:
            return r0
        Lb1:
            r11 = move-exception
            java.lang.String r12 = "Unable to determine award type and amount."
            Sc.p.e(r12, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.L90.e(com.google.android.gms.internal.ads.Z50, java.util.List, com.google.android.gms.internal.ads.Io):java.util.List");
    }

    public L90(C8022eV c8022eV, Sc.a aVar, String str, String str2, Context context, C8840m60 c8840m60, C8947n60 c8947n60, com.google.android.gms.common.util.f fVar, M9 m92) {
        this.f69132a = c8022eV;
        this.f69133b = aVar.f34479a;
        this.f69134c = str;
        this.f69135d = str2;
        this.f69136e = context;
        this.f69137f = c8840m60;
        this.f69138g = c8947n60;
        this.f69139h = fVar;
        this.f69140i = m92;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String i(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (Sc.m.k()) {
            return "fakeForAdDebugLog";
        }
        return str;
    }
}
