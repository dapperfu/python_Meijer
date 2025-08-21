package com.google.firebase.analytics.connector.internal;

import Ee.L;
import Ee.O;
import Qd.y;
import android.os.Bundle;
import com.scandit.datacapture.core.source.CameraSettings;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final O f89451a = O.E("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b, reason: collision with root package name */
    private static final L f89452b = L.D("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c, reason: collision with root package name */
    private static final L f89453c = L.B(CameraSettings.FOCUS_STRATEGY_AUTO, "app", "am");

    /* renamed from: d, reason: collision with root package name */
    private static final L f89454d = L.z("_r", "_dbg");

    /* renamed from: e, reason: collision with root package name */
    private static final L f89455e = new L.a().i(y.f28082a).i(y.f28083b).k();

    /* renamed from: f, reason: collision with root package name */
    private static final L f89456f = L.z("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f89457g = 0;

    public static boolean a(String str) {
        return !f89453c.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(String str, Bundle bundle) {
        if (f89452b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        L l10 = f89454d;
        int size = l10.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zContainsKey = bundle.containsKey((String) l10.get(i10));
            i10++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str) {
        return !f89451a.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f89455e.contains(str2)) {
            return false;
        }
        L l10 = f89456f;
        int size = l10.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zMatches = str2.matches((String) l10.get(i10));
            i10++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
        /*
            java.lang.String r0 = "_cmp"
            boolean r6 = r0.equals(r6)
            r0 = 1
            if (r6 != 0) goto La
            return r0
        La:
            boolean r6 = a(r5)
            r1 = 0
            if (r6 != 0) goto L12
            return r1
        L12:
            if (r7 != 0) goto L15
            return r1
        L15:
            Ee.L r6 = com.google.firebase.analytics.connector.internal.b.f89454d
            int r2 = r6.size()
            r3 = r1
        L1c:
            if (r3 >= r2) goto L2d
            java.lang.Object r4 = r6.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r7.containsKey(r4)
            int r3 = r3 + 1
            if (r4 == 0) goto L1c
            return r1
        L2d:
            int r6 = r5.hashCode()
            r2 = 101200(0x18b50, float:1.41811E-40)
            r3 = 2
            if (r6 == r2) goto L56
            r2 = 101230(0x18b6e, float:1.41853E-40)
            if (r6 == r2) goto L4c
            r2 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r6 == r2) goto L42
            goto L60
        L42:
            java.lang.String r6 = "fiam"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L60
            r5 = r3
            goto L61
        L4c:
            java.lang.String r6 = "fdl"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L60
            r5 = r0
            goto L61
        L56:
            java.lang.String r6 = "fcm"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L60
            r5 = r1
            goto L61
        L60:
            r5 = -1
        L61:
            java.lang.String r6 = "_cis"
            if (r5 == 0) goto L76
            if (r5 == r0) goto L70
            if (r5 == r3) goto L6a
            return r1
        L6a:
            java.lang.String r5 = "fiam_integration"
            r7.putString(r6, r5)
            return r0
        L70:
            java.lang.String r5 = "fdl_integration"
            r7.putString(r6, r5)
            return r0
        L76:
            java.lang.String r5 = "fcm_integration"
            r7.putString(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.analytics.connector.internal.b.e(java.lang.String, java.lang.String, android.os.Bundle):boolean");
    }
}
