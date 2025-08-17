package Lc;

import Mc.A;
import Pc.p0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC7593bf;
import com.google.android.gms.internal.ads.C6908Kq;
import com.google.android.gms.internal.ads.C7009Nq;
import com.google.android.gms.internal.ads.C7498al;
import com.google.android.gms.internal.ads.C7818dl;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.C9643uq;
import com.google.android.gms.internal.ads.C9705vN;
import com.google.android.gms.internal.ads.C9812wN;
import com.google.android.gms.internal.ads.InterfaceC7173Sk;
import com.google.android.gms.internal.ads.InterfaceC7339Xk;
import com.google.android.gms.internal.ads.InterfaceC9416sj0;
import com.google.android.gms.internal.ads.J80;
import com.google.android.gms.internal.ads.K80;
import com.google.android.gms.internal.ads.Mj0;
import com.google.android.gms.internal.ads.Xj0;
import com.google.android.gms.internal.ads.Z80;
import org.json.JSONException;
import org.json.JSONObject;
import qd.C16519f;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private Context f17982a;

    /* renamed from: b, reason: collision with root package name */
    private long f17983b = 0;

    public final void a(Context context, Qc.a aVar, String str, Runnable runnable, Z80 z80, C9812wN c9812wN, Long l10) throws JSONException {
        b(context, aVar, true, null, str, null, runnable, z80, c9812wN, l10);
    }

    static final /* synthetic */ com.google.common.util.concurrent.q d(Long l10, C9812wN c9812wN, Z80 z80, K80 k80, JSONObject jSONObject) throws Exception {
        boolean zOptBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (zOptBoolean) {
            v.s().j().A(jSONObject.getString("appSettingsJson"));
            if (l10 != null) {
                f(c9812wN, "cld_s", v.c().c() - l10.longValue());
            }
        }
        k80.r0(zOptBoolean);
        z80.b(k80.zzm());
        return Mj0.h(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C9812wN c9812wN, String str, long j10) {
        if (c9812wN != null) {
            if (((Boolean) A.c().a(C8659lf.f76612zc)).booleanValue()) {
                C9705vN c9705vNA = c9812wN.a();
                c9705vNA.b("action", "lat_init");
                c9705vNA.b(str, Long.toString(j10));
                c9705vNA.g();
            }
        }
    }

    public final void c(Context context, Qc.a aVar, String str, C9643uq c9643uq, Z80 z80) throws JSONException {
        b(context, aVar, false, c9643uq, c9643uq != null ? c9643uq.b() : null, str, null, z80, null, null);
    }

    final void b(Context context, Qc.a aVar, boolean z10, C9643uq c9643uq, String str, String str2, Runnable runnable, final Z80 z80, final C9812wN c9812wN, final Long l10) throws JSONException {
        K80 k80;
        Exception exc;
        JSONObject jSONObject;
        PackageInfo packageInfoF;
        if (v.c().c() - this.f17983b < 5000) {
            Qc.p.g("Not retrying to fetch app settings");
            return;
        }
        this.f17983b = v.c().c();
        if (c9643uq != null && !TextUtils.isEmpty(c9643uq.c())) {
            if (v.c().a() - c9643uq.a() <= ((Long) A.c().a(C8659lf.f76380j4)).longValue() && c9643uq.i()) {
                return;
            }
        }
        if (context == null) {
            Qc.p.g("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            Qc.p.g("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f17982a = applicationContext;
        final K80 k80A = J80.a(context, 4);
        k80A.zzi();
        C7818dl c7818dlA = v.j().a(this.f17982a, aVar, z80);
        InterfaceC7339Xk interfaceC7339Xk = C7498al.f72486b;
        InterfaceC7173Sk interfaceC7173SkA = c7818dlA.a("google.afma.config.fetchAppSettings", interfaceC7339Xk, interfaceC7339Xk);
        try {
            jSONObject = new JSONObject();
        } catch (Exception e10) {
            e = e10;
            k80 = k80A;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z10);
            jSONObject.put("pn", context.getPackageName());
            AbstractC7593bf abstractC7593bf = C8659lf.f76249a;
            jSONObject.put("experiment_ids", TextUtils.join(",", A.a().a()));
            jSONObject.put("js", aVar.f29929a);
            try {
                ApplicationInfo applicationInfo = this.f17982a.getApplicationInfo();
                if (applicationInfo != null && (packageInfoF = C16519f.a(context).f(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", packageInfoF.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                p0.k("Error fetching PackageInfo.");
            }
            com.google.common.util.concurrent.q qVarZzb = interfaceC7173SkA.zzb(jSONObject);
            try {
                InterfaceC9416sj0 interfaceC9416sj0 = new InterfaceC9416sj0(this) { // from class: Lc.d
                    @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
                    public final com.google.common.util.concurrent.q zza(Object obj) {
                        return f.d(l10, c9812wN, z80, k80A, (JSONObject) obj);
                    }
                };
                k80 = k80A;
                try {
                    Xj0 xj0 = C6908Kq.f68180g;
                    com.google.common.util.concurrent.q qVarN = Mj0.n(qVarZzb, interfaceC9416sj0, xj0);
                    if (runnable != null) {
                        qVarZzb.addListener(runnable, xj0);
                    }
                    if (l10 != null) {
                        qVarZzb.addListener(new Runnable(this) { // from class: Lc.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                f.f(c9812wN, "cld_r", v.c().c() - l10.longValue());
                            }
                        }, xj0);
                    }
                    if (((Boolean) A.c().a(C8659lf.f75922C7)).booleanValue()) {
                        C7009Nq.b(qVarN, "ConfigLoader.maybeFetchNewAppSettings");
                    } else {
                        C7009Nq.a(qVarN, "ConfigLoader.maybeFetchNewAppSettings");
                    }
                } catch (Exception e11) {
                    e = e11;
                    exc = e;
                    Qc.p.e("Error requesting application settings", exc);
                    k80.e(exc);
                    k80.r0(false);
                    z80.b(k80.zzm());
                }
            } catch (Exception e12) {
                e = e12;
                k80 = k80A;
            }
        } catch (Exception e13) {
            exc = e13;
            k80 = k80A;
            Qc.p.e("Error requesting application settings", exc);
            k80.e(exc);
            k80.r0(false);
            z80.b(k80.zzm());
        }
    }
}
