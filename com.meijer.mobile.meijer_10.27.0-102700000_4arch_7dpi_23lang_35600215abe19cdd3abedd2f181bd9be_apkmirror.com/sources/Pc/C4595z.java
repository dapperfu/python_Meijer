package Pc;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.YO;
import com.google.android.gms.internal.ads.ZO;
import com.google.maps.internal.HttpHeaders;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Pc.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4595z {

    /* renamed from: a, reason: collision with root package name */
    private final Object f25248a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private String f25249b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f25250c = "";

    /* renamed from: d, reason: collision with root package name */
    private boolean f25251d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f25252e = false;

    /* renamed from: f, reason: collision with root package name */
    protected String f25253f = "";

    /* renamed from: g, reason: collision with root package name */
    private ZO f25254g;

    /* JADX WARN: Multi-variable type inference failed */
    protected static final String o(Context context, String str, String str2) throws IOException {
        HashMap map = new HashMap();
        map.put(HttpHeaders.USER_AGENT, Lc.v.t().H(context, str2));
        com.google.common.util.concurrent.q qVarB = new P(context).b(0, str, map, null);
        try {
            return (String) qVarB.get(((Integer) Mc.A.c().a(C8659lf.f76087O4)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            Qc.p.e("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e10);
            qVarB.cancel(true);
            return null;
        } catch (TimeoutException e11) {
            Qc.p.e("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e11);
            qVarB.cancel(true);
            return null;
        } catch (Exception e12) {
            Qc.p.e("Error retrieving a response from: ".concat(String.valueOf(str)), e12);
            return null;
        }
    }

    public final ZO a() {
        return this.f25254g;
    }

    public final String b() {
        String str;
        synchronized (this.f25248a) {
            str = this.f25250c;
        }
        return str;
    }

    public final void c(Context context) {
        ZO zo2;
        if (!((Boolean) Mc.A.c().a(C8659lf.f76301d9)).booleanValue() || (zo2 = this.f25254g) == null) {
            return;
        }
        zo2.i(new BinderC4592w(this, context), YO.DEBUG_MENU);
    }

    public final void e(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = p(context, (String) Mc.A.c().a(C8659lf.f76073N4), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        Lc.v.t();
        D0.m(context, str, builderBuildUpon.build().toString());
    }

    public final void f(boolean z10) {
        synchronized (this.f25248a) {
            try {
                this.f25252e = z10;
                if (((Boolean) Mc.A.c().a(C8659lf.f76301d9)).booleanValue()) {
                    Lc.v.s().j().I(z10);
                    ZO zo2 = this.f25254g;
                    if (zo2 != null) {
                        zo2.m(z10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g(ZO zo2) {
        this.f25254g = zo2;
    }

    public final void h(boolean z10) {
        synchronized (this.f25248a) {
            this.f25251d = z10;
        }
    }

    protected final void i(Context context, String str, boolean z10, boolean z11) {
        if (context instanceof Activity) {
            D0.f25081l.post(new RunnableC4594y(this, context, str, z10, z11));
        } else {
            Qc.p.f("Can not create dialog without Activity Context");
        }
    }

    public final boolean j(Context context, String str, String str2) throws IOException {
        String strO = o(context, p(context, (String) Mc.A.c().a(C8659lf.f76059M4), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strO)) {
            Qc.p.b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strO.trim()).optString("debug_mode"));
            f(zEquals);
            if (((Boolean) Mc.A.c().a(C8659lf.f76301d9)).booleanValue()) {
                r0 r0VarJ = Lc.v.s().j();
                if (true != zEquals) {
                    str = "";
                }
                r0VarJ.C(str);
            }
            return zEquals;
        } catch (JSONException e10) {
            Qc.p.h("Fail to get debug mode response json.", e10);
            return false;
        }
    }

    final boolean k(Context context, String str, String str2) throws IOException {
        String strO = o(context, p(context, (String) Mc.A.c().a(C8659lf.f76045L4), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strO)) {
            Qc.p.b("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strO.trim());
            String strOptString = jSONObject.optString("gct");
            this.f25253f = jSONObject.optString("status");
            if (((Boolean) Mc.A.c().a(C8659lf.f76301d9)).booleanValue()) {
                boolean z10 = "0".equals(this.f25253f) || "2".equals(this.f25253f);
                f(z10);
                r0 r0VarJ = Lc.v.s().j();
                if (!z10) {
                    str = "";
                }
                r0VarJ.C(str);
            }
            synchronized (this.f25248a) {
                this.f25250c = strOptString;
            }
            return true;
        } catch (JSONException e10) {
            Qc.p.h("Fail to get in app preview response json.", e10);
            return false;
        }
    }

    public final boolean l() {
        boolean z10;
        synchronized (this.f25248a) {
            z10 = this.f25252e;
        }
        return z10;
    }

    public final boolean m() {
        boolean z10;
        synchronized (this.f25248a) {
            z10 = this.f25251d;
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[Catch: all -> 0x0029, TryCatch #1 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0018, B:12:0x0032, B:14:0x003a, B:16:0x004f, B:19:0x0061, B:11:0x002b, B:20:0x0066, B:21:0x0068), top: B:28:0x000b, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.net.Uri p(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            java.lang.Object r0 = r4.f25248a
            monitor-enter(r0)
            java.lang.String r1 = r4.f25249b     // Catch: java.lang.Throwable -> L29
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L66
            Lc.v.t()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "debug_signals_id.txt"
            java.io.FileInputStream r1 = r5.openFileInput(r1)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            r3 = 1
            byte[] r1 = com.google.android.gms.common.util.l.d(r1, r3)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            goto L32
        L29:
            r5 = move-exception
            goto L7d
        L2b:
            java.lang.String r1 = "Error reading from internal storage."
            Qc.p.b(r1)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = ""
        L32:
            r4.f25249b = r2     // Catch: java.lang.Throwable -> L29
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L66
            Lc.v.t()     // Catch: java.lang.Throwable -> L29
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L29
            r4.f25249b = r1     // Catch: java.lang.Throwable -> L29
            Lc.v.t()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r4.f25249b     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "debug_signals_id.txt"
            r3 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r2, r3)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L60
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L60
            r5.write(r1)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L60
            r5.close()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L60
            goto L66
        L60:
            r5 = move-exception
            java.lang.String r1 = "Error writing to file in internal storage."
            Qc.p.e(r1, r5)     // Catch: java.lang.Throwable -> L29
        L66:
            java.lang.String r5 = r4.f25249b     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = "linkedDeviceId"
            r6.appendQueryParameter(r0, r5)
            java.lang.String r5 = "adSlotPath"
            r6.appendQueryParameter(r5, r7)
            java.lang.String r5 = "afmaVersion"
            r6.appendQueryParameter(r5, r8)
            android.net.Uri r5 = r6.build()
            return r5
        L7d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Pc.C4595z.p(android.content.Context, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }

    public final void d(Context context, String str, String str2) {
        Lc.v.t();
        D0.u(context, p(context, (String) Mc.A.c().a(C8659lf.f76031K4), str, str2));
    }

    public final boolean n(Context context, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && m()) {
            Qc.p.b("Sending troubleshooting signals to the server.");
            e(context, str, str2, str3);
            return true;
        }
        return false;
    }
}
