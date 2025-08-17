package com.google.android.gms.internal.atv_ads_framework;

import a2.C5559a;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10212e {
    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(1:4)(1:5)|6|(1:8)|9|(6:(1:(0))(2:14|(1:16)(1:17))|64|26|(5:39|36|40|(1:42)(4:43|(3:46|65|44)|69|50)|51)(5:(1:(3:30|(1:37)|51)(0))(1:38)|36|40|(0)(0)|51)|59|60)(2:18|(1:20)(1:21))|22|(1:24)(1:25)|64|26|(0)(0)|59|60|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0143, code lost:
    
        r2.add(com.google.android.gms.internal.atv_ads_framework.z2.SIGNAL_COLLECTION_ERROR_NULL_CONTENT_PROVIDER_DATA);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9 A[Catch: zzax -> 0x0143, TryCatch #1 {zzax -> 0x0143, blocks: (B:26:0x00b1, B:40:0x00dc, B:42:0x00ee, B:51:0x0124, B:43:0x00f3, B:50:0x011d, B:57:0x0142, B:37:0x00d1, B:38:0x00d6, B:39:0x00d9, B:44:0x0102, B:46:0x0108), top: B:64:0x00b1, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee A[Catch: zzax -> 0x0143, TryCatch #1 {zzax -> 0x0143, blocks: (B:26:0x00b1, B:40:0x00dc, B:42:0x00ee, B:51:0x0124, B:43:0x00f3, B:50:0x011d, B:57:0x0142, B:37:0x00d1, B:38:0x00d6, B:39:0x00d9, B:44:0x0102, B:46:0x0108), top: B:64:0x00b1, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3 A[Catch: zzax -> 0x0143, TRY_LEAVE, TryCatch #1 {zzax -> 0x0143, blocks: (B:26:0x00b1, B:40:0x00dc, B:42:0x00ee, B:51:0x0124, B:43:0x00f3, B:50:0x011d, B:57:0x0142, B:37:0x00d1, B:38:0x00d6, B:39:0x00d9, B:44:0x0102, B:46:0x0108), top: B:64:0x00b1, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.atv_ads_framework.I c(android.content.Context r14) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, android.content.pm.PackageManager.NameNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.atv_ads_framework.C10212e.c(android.content.Context):com.google.android.gms.internal.atv_ads_framework.I");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String d() {
        /*
            java.lang.String r0 = android.os.Build.FINGERPRINT
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L21
            r1 = 58
            com.google.android.gms.internal.atv_ads_framework.v r1 = com.google.android.gms.internal.atv_ads_framework.C10262v.b(r1)
            java.util.List r0 = r1.c(r0)
            int r1 = r0.size()
            r2 = 3
            if (r1 != r2) goto L21
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L23
        L21:
            java.lang.String r0 = ""
        L23:
            java.lang.String r0 = com.google.android.gms.internal.atv_ads_framework.C10218g.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.atv_ads_framework.C10212e.d():java.lang.String");
    }

    private static String e(String str, Context context) throws PackageManager.NameNotFoundException {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                return Long.toString(C5559a.a(packageInfo));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return "";
    }

    public static EnumC10198a a(Context context) {
        if (context.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE")) {
            return EnumC10198a.LAUNCHER_X;
        }
        if (context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")) {
            return EnumC10198a.FIRE_TV;
        }
        if (context.getPackageManager().hasSystemFeature("com.google.android.tv.custom_launcher") && g(context, "com.google.android.tvrecommendations")) {
            return EnumC10198a.CUSTOM;
        }
        if (context.getPackageManager().hasSystemFeature("android.software.leanback") && g(context, "com.google.android.tvlauncher")) {
            return EnumC10198a.TV_LAUNCHER;
        }
        if (context.getPackageManager().hasSystemFeature("android.software.leanback") && g(context, "com.google.android.leanbacklauncher")) {
            return EnumC10198a.LEANBACK;
        }
        return EnumC10198a.UNKNOWN;
    }

    public static C10206c b(Context context) throws PackageManager.NameNotFoundException {
        String strE;
        String strE2;
        v2 v2VarQ = w2.q();
        v2VarQ.g(context.getApplicationContext().getPackageName());
        String strE3 = e(context.getApplicationContext().getPackageName(), context);
        if (!strE3.isEmpty()) {
            v2VarQ.i(strE3);
        }
        l2 l2VarQ = m2.q();
        l2VarQ.g(d());
        l2VarQ.i(f(context));
        m2 m2Var = (m2) l2VarQ.c();
        t2 t2VarQ = u2.q();
        t2VarQ.g("1.0.0");
        u2 u2Var = (u2) t2VarQ.c();
        EnumC10198a enumC10198aA = a(context);
        q2 q2VarQ = r2.q();
        EnumC10198a enumC10198a = EnumC10198a.TV_LAUNCHER;
        int iOrdinal = enumC10198aA.ordinal();
        if (iOrdinal != 0) {
            strE = "";
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            if (iOrdinal == 5) {
                                q2VarQ.j(1);
                            }
                        } else {
                            q2VarQ.j(6);
                        }
                    } else {
                        q2VarQ.j(5);
                    }
                    strE2 = "";
                } else {
                    q2VarQ.j(4);
                    strE2 = e("com.google.android.tvrecommendations", context);
                }
            } else {
                q2VarQ.j(3);
                strE = e("com.google.android.apps.tv.launcherx", context);
                strE2 = "";
            }
        } else {
            q2VarQ.j(2);
            strE = e("com.google.android.tvlauncher", context);
            strE2 = e("com.google.android.tvrecommendations", context);
        }
        if (!strE.isEmpty()) {
            q2VarQ.i(strE);
        }
        if (!strE2.isEmpty()) {
            q2VarQ.g(strE2);
        }
        C10206c c10206cQ = C10209d.q();
        c10206cQ.k(v2VarQ);
        c10206cQ.g(m2Var);
        c10206cQ.l(u2Var);
        c10206cQ.j(q2VarQ);
        return c10206cQ;
    }

    private static boolean f(Context context) {
        return context.getPackageManager().hasSystemFeature("com.google.android.tv.operator_tier");
    }

    private static boolean g(Context context, String str) {
        if ((context.getPackageManager().getApplicationInfo(str, 0).flags & 1) == 0) {
            return false;
        }
        return true;
    }
}
