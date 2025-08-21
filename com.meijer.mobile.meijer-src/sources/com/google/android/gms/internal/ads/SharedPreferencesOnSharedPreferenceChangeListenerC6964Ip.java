package com.google.android.gms.internal.ads;

import Rc.C5185e;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Ip, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC6964Ip implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final Context f68522a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f68523b;

    /* renamed from: c, reason: collision with root package name */
    private final Rc.r0 f68524c;

    /* renamed from: d, reason: collision with root package name */
    private String f68525d = "-1";

    /* renamed from: e, reason: collision with root package name */
    private int f68526e = -1;

    private final void b() throws IOException {
        this.f68524c.x(true);
        C5185e.c(this.f68522a);
    }

    private final void c(String str, int i10) {
        Context context;
        boolean z10 = true;
        if (!((Boolean) Oc.A.c().a(C8784lf.f76853J0)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i10 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z10 = false;
        }
        this.f68524c.x(z10);
        if (((Boolean) Oc.A.c().a(C8784lf.f77110b6)).booleanValue() && z10 && (context = this.f68522a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    final void a() {
        this.f68523b.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.f68523b, "gad_has_consent_for_cookies");
        if (((Boolean) Oc.A.c().a(C8784lf.f76881L0)).booleanValue()) {
            onSharedPreferenceChanged(this.f68523b, "IABTCF_TCString");
        } else {
            onSharedPreferenceChanged(this.f68523b, "IABTCF_PurposeConsents");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "IABTCF_PurposeConsents"
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8784lf.f76881L0     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.ads.jf r2 = Oc.A.c()     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "-1"
            r3 = -1
            java.lang.String r4 = "gad_has_consent_for_cookies"
            if (r1 == 0) goto L59
            boolean r0 = java.util.Objects.equals(r10, r4)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L38
            int r9 = r9.getInt(r4, r3)     // Catch: java.lang.Throwable -> L2f
            Rc.r0 r10 = r8.f68524c     // Catch: java.lang.Throwable -> L2f
            int r10 = r10.zzb()     // Catch: java.lang.Throwable -> L2f
            if (r9 == r10) goto L32
            r8.b()     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r9 = move-exception
            goto Lbd
        L32:
            Rc.r0 r10 = r8.f68524c     // Catch: java.lang.Throwable -> L2f
            r10.p(r9)     // Catch: java.lang.Throwable -> L2f
            return
        L38:
            java.lang.String r0 = "IABTCF_TCString"
            boolean r0 = java.util.Objects.equals(r10, r0)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto Lbc
            java.lang.String r9 = r9.getString(r10, r2)     // Catch: java.lang.Throwable -> L2f
            Rc.r0 r10 = r8.f68524c     // Catch: java.lang.Throwable -> L2f
            java.lang.String r10 = r10.zzm()     // Catch: java.lang.Throwable -> L2f
            boolean r10 = java.util.Objects.equals(r9, r10)     // Catch: java.lang.Throwable -> L2f
            if (r10 != 0) goto L53
            r8.b()     // Catch: java.lang.Throwable -> L2f
        L53:
            Rc.r0 r10 = r8.f68524c     // Catch: java.lang.Throwable -> L2f
            r10.r(r9)     // Catch: java.lang.Throwable -> L2f
            return
        L59:
            java.lang.String r1 = r9.getString(r0, r2)     // Catch: java.lang.Throwable -> L2f
            int r9 = r9.getInt(r4, r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L2f
            int r5 = r10.hashCode()     // Catch: java.lang.Throwable -> L2f
            r6 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r7 = 1
            if (r5 == r6) goto L7d
            r0 = -527267622(0xffffffffe09288da, float:-8.447143E19)
            if (r5 == r0) goto L75
            goto L85
        L75:
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L85
            r10 = r7
            goto L86
        L7d:
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L85
            r10 = 0
            goto L86
        L85:
            r10 = r3
        L86:
            if (r10 == 0) goto La9
            if (r10 == r7) goto L8b
            goto Lbc
        L8b:
            com.google.android.gms.internal.ads.bf r10 = com.google.android.gms.internal.ads.C8784lf.f76853J0     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.internal.ads.jf r0 = Oc.A.c()     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r10 = r0.a(r10)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L2f
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L2f
            if (r10 == 0) goto Lbc
            if (r9 == r3) goto Lbc
            int r10 = r8.f68526e     // Catch: java.lang.Throwable -> L2f
            if (r10 == r9) goto Lbc
            r8.f68526e = r9     // Catch: java.lang.Throwable -> L2f
            r8.c(r1, r9)     // Catch: java.lang.Throwable -> L2f
            return
        La9:
            boolean r10 = r1.equals(r2)     // Catch: java.lang.Throwable -> L2f
            if (r10 != 0) goto Lbc
            java.lang.String r10 = r8.f68525d     // Catch: java.lang.Throwable -> L2f
            boolean r10 = r10.equals(r1)     // Catch: java.lang.Throwable -> L2f
            if (r10 != 0) goto Lbc
            r8.f68525d = r1     // Catch: java.lang.Throwable -> L2f
            r8.c(r1, r9)     // Catch: java.lang.Throwable -> L2f
        Lbc:
            return
        Lbd:
            java.lang.String r10 = "AdMobPlusIdlessListener.onSharedPreferenceChanged"
            com.google.android.gms.internal.ads.Aq r0 = Nc.v.s()
            r0.x(r9, r10)
            java.lang.String r10 = "onSharedPreferenceChanged, errorMessage = "
            Rc.p0.l(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC6964Ip.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }

    SharedPreferencesOnSharedPreferenceChangeListenerC6964Ip(Context context, Rc.r0 r0Var) {
        this.f68523b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f68524c = r0Var;
        this.f68522a = context;
    }
}
