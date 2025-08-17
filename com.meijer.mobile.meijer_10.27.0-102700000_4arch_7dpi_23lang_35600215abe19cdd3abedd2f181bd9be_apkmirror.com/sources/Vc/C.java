package Vc;

import Mc.Y1;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.C7026Od0;
import com.google.android.gms.internal.ads.C7162Sd0;
import com.google.android.gms.internal.ads.C7196Td0;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.C8788mq;
import com.google.android.gms.internal.ads.EnumC7889eN;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final Context f37141a;

    /* renamed from: b, reason: collision with root package name */
    private final a0 f37142b;

    /* renamed from: c, reason: collision with root package name */
    private final long f37143c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f37144d;

    /* renamed from: e, reason: collision with root package name */
    private final PackageInfo f37145e;

    public static String b(String str) {
        if (str == null) {
            return "";
        }
        char[] charArray = str.toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            charArray[i10] = (char) (charArray[i10] ^ "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2".charAt(i10 % 555));
        }
        return new String(charArray);
    }

    private final boolean e() {
        return this.f37142b.f().size() >= ((Integer) Mc.A.c().a(C8659lf.f76551v7)).intValue();
    }

    private static final void f(Bundle bundle, EnumC7889eN enumC7889eN) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76565w7)).booleanValue()) {
            bundle.putLong(enumC7889eN.a(), Lc.v.c().a());
        }
    }

    private static final void g(Bundle bundle, int i10) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i10 - 1);
    }

    public final N a(C8788mq c8788mq, final BinderC5385w binderC5385w, Bundle bundle) throws JSONException {
        long j10;
        f(bundle, EnumC7889eN.SIGNAL_ON_DISK_VALIDATION_START);
        if (Lc.v.s().j().zzN()) {
            this.f37142b.g();
            g(bundle, 7);
        } else {
            if (this.f37145e != null) {
                a0 a0Var = this.f37142b;
                Context context = this.f37141a;
                String strE = a0Var.e();
                int iB = a0Var.b();
                String strD = a0Var.d();
                int iA = a0Var.a();
                if (TextUtils.equals(context.getApplicationInfo().packageName, strE) && iB == this.f37145e.versionCode && TextUtils.equals(Build.MODEL, strD) && iA == Build.VERSION.SDK_INT) {
                    for (Map.Entry entry : this.f37142b.f().entrySet()) {
                        try {
                            j10 = new JSONObject((String) entry.getValue()).getLong("ts_ms");
                        } catch (IOException | JSONException unused) {
                        }
                        if (Lc.v.c().a() - j10 <= ((Long) Mc.A.c().a(C8659lf.f76537u7)).longValue()) {
                            C7026Od0 c7026Od0I = C7162Sd0.k(this.f37141a).i(((Long) Mc.A.c().a(C8659lf.f76463p3)).longValue(), Lc.v.s().j().zzN());
                            C7026Od0 c7026Od0I2 = C7196Td0.j(this.f37141a).i(((Long) Mc.A.c().a(C8659lf.f76477q3)).longValue(), Lc.v.s().j().zzN());
                            if ((c7026Od0I.a() == -1 || c7026Od0I.a() <= j10) && (c7026Od0I2.a() == -1 || c7026Od0I2.a() <= j10)) {
                            }
                        }
                        this.f37142b.c((String) entry.getKey());
                    }
                } else {
                    this.f37142b.g();
                    this.f37142b.i(this.f37141a.getApplicationInfo().packageName, this.f37145e.versionCode, Build.MODEL, Build.VERSION.SDK_INT);
                }
                f(bundle, EnumC7889eN.SIGNAL_ON_DISK_VALIDATION_END);
                if (Lc.v.c().a() - this.f37143c > ((Long) Mc.A.c().a(C8659lf.f76495r7)).longValue()) {
                    g(bundle, 2);
                    return null;
                }
                f(bundle, EnumC7889eN.SIGNAL_ON_DISK_CACHE_KEY_START);
                String str = c8788mq.f76907a;
                String str2 = c8788mq.f76908b;
                String string = c8788mq.f76910d.f19180n.toString();
                String string2 = c8788mq.f76910d.f19169c.toString();
                Y1 y12 = c8788mq.f76910d;
                final String strI = Qc.g.i(str + str2 + string + string2 + y12.f19175i + y12.f19182p + String.valueOf(y12.f19181o));
                if (TextUtils.isEmpty(strI)) {
                    g(bundle, 3);
                    return null;
                }
                f(bundle, EnumC7889eN.SIGNAL_ON_DISK_CACHE_KEY_END);
                f(bundle, EnumC7889eN.SIGNAL_ON_DISK_READ_AND_REMOVE_START);
                String strC = this.f37142b.c(strI);
                f(bundle, EnumC7889eN.SIGNAL_ON_DISK_READ_AND_REMOVE_END);
                if (!e()) {
                    final C8788mq c8788mq2 = new C8788mq(c8788mq.f76907a, c8788mq.f76908b, c8788mq.f76909c, c8788mq.f76910d, 2, strI);
                    this.f37144d.schedule(new Runnable() { // from class: Vc.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f37218a.c(strI, binderC5385w, c8788mq2);
                        }
                    }, ((Long) Mc.A.c().a(C8659lf.f76523t7)).longValue(), TimeUnit.MILLISECONDS);
                }
                if (TextUtils.isEmpty(strC)) {
                    g(bundle, 4);
                    return null;
                }
                f(bundle, EnumC7889eN.SIGNAL_ON_DISK_DECODE_START);
                try {
                    JSONObject jSONObject = new JSONObject(strC);
                    String string3 = jSONObject.getString("sr");
                    if (TextUtils.isEmpty(string3)) {
                        g(bundle, 8);
                        return null;
                    }
                    String string4 = jSONObject.getString("rs");
                    if (TextUtils.isEmpty(string4)) {
                        g(bundle, 9);
                        return null;
                    }
                    String strB = b(new String(Base64.decode(string4, 10), StandardCharsets.UTF_8));
                    f(bundle, EnumC7889eN.SIGNAL_ON_DISK_DECODE_END);
                    try {
                        N n10 = new N(new JsonReader(new StringReader(string3)), null);
                        n10.f37169c = strB;
                        n10.f37171e = bundle;
                        bundle.putBoolean("sod_h", true);
                        return n10;
                    } catch (IOException e10) {
                        g(bundle, 6);
                        Lc.v.s().x(e10, "DiskCachingManager.getSignalResponse");
                        return null;
                    }
                } catch (JSONException e11) {
                    g(bundle, 5);
                    Lc.v.s().x(e11, "DiskCachingManager.getSignalResponse");
                    return null;
                }
            }
            this.f37142b.g();
            g(bundle, 10);
        }
        return null;
    }

    final /* synthetic */ void c(String str, BinderC5385w binderC5385w, C8788mq c8788mq) {
        if (this.f37142b.j(str) || e()) {
            return;
        }
        binderC5385w.N4(com.google.android.gms.dynamic.d.F2(this.f37141a), c8788mq, null);
    }

    C(Context context, long j10, PackageInfo packageInfo, a0 a0Var, ScheduledExecutorService scheduledExecutorService) {
        this.f37141a = context;
        this.f37143c = j10;
        this.f37145e = packageInfo;
        this.f37142b = a0Var;
        this.f37144d = scheduledExecutorService;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r6, Vc.N r7) throws org.json.JSONException {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L7a
            boolean r0 = r5.e()
            if (r0 == 0) goto Ld
            goto L7a
        Ld:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3d
            r1.<init>()     // Catch: org.json.JSONException -> L3d
            java.lang.String r2 = "params"
            java.lang.String r3 = r7.f37167a     // Catch: org.json.JSONException -> L3d
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L3d
            java.lang.String r2 = "signal_dictionary"
            Qc.g r3 = Mc.C4169y.b()     // Catch: org.json.JSONException -> L3d
            android.os.Bundle r4 = r7.f37172f     // Catch: org.json.JSONException -> L3d
            org.json.JSONObject r3 = r3.k(r4)     // Catch: org.json.JSONException -> L3d
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L3d
            java.lang.String r2 = "sr"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L3d
            java.lang.String r7 = r7.f37169c     // Catch: org.json.JSONException -> L3d
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: org.json.JSONException -> L3d
            if (r1 == 0) goto L3f
            java.lang.String r7 = ""
            goto L6f
        L3d:
            r7 = move-exception
            goto L62
        L3f:
            java.lang.String r7 = b(r7)     // Catch: org.json.JSONException -> L3d
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: org.json.JSONException -> L3d
            byte[] r7 = r7.getBytes(r1)     // Catch: org.json.JSONException -> L3d
            r1 = 10
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r1)     // Catch: org.json.JSONException -> L3d
            java.lang.String r1 = "rs"
            r0.put(r1, r7)     // Catch: org.json.JSONException -> L3d
            java.lang.String r7 = "ts_ms"
            com.google.android.gms.common.util.f r1 = Lc.v.c()     // Catch: org.json.JSONException -> L3d
            long r1 = r1.a()     // Catch: org.json.JSONException -> L3d
            r0.put(r7, r1)     // Catch: org.json.JSONException -> L3d
            goto L6b
        L62:
            java.lang.String r1 = "DiskCachingManager.createStringToWrite"
            com.google.android.gms.internal.ads.Aq r2 = Lc.v.s()
            r2.x(r7, r1)
        L6b:
            java.lang.String r7 = r0.toString()
        L6f:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L7a
            Vc.a0 r0 = r5.f37142b
            r0.h(r6, r7)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Vc.C.d(java.lang.String, Vc.N):void");
    }
}
