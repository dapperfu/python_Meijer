package Nc;

import Oc.A;
import Rc.p0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC7718bf;
import com.google.android.gms.internal.ads.C7033Kq;
import com.google.android.gms.internal.ads.C7134Nq;
import com.google.android.gms.internal.ads.C7623al;
import com.google.android.gms.internal.ads.C7943dl;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.C9768uq;
import com.google.android.gms.internal.ads.C9830vN;
import com.google.android.gms.internal.ads.C9937wN;
import com.google.android.gms.internal.ads.InterfaceC7298Sk;
import com.google.android.gms.internal.ads.InterfaceC7464Xk;
import com.google.android.gms.internal.ads.InterfaceC9541sj0;
import com.google.android.gms.internal.ads.J80;
import com.google.android.gms.internal.ads.K80;
import com.google.android.gms.internal.ads.Mj0;
import com.google.android.gms.internal.ads.Xj0;
import com.google.android.gms.internal.ads.Z80;
import org.json.JSONException;
import org.json.JSONObject;
import sd.C17067f;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private Context f20802a;

    /* renamed from: b, reason: collision with root package name */
    private long f20803b = 0;

    public final void a(Context context, Sc.a aVar, String str, Runnable runnable, Z80 z80, C9937wN c9937wN, Long l10) throws JSONException {
        b(context, aVar, true, null, str, null, runnable, z80, c9937wN, l10);
    }

    static final /* synthetic */ com.google.common.util.concurrent.q d(Long l10, C9937wN c9937wN, Z80 z80, K80 k80, JSONObject jSONObject) throws Exception {
        boolean zOptBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (zOptBoolean) {
            v.s().j().A(jSONObject.getString("appSettingsJson"));
            if (l10 != null) {
                f(c9937wN, "cld_s", v.c().c() - l10.longValue());
            }
        }
        k80.s0(zOptBoolean);
        z80.b(k80.zzm());
        return Mj0.h(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C9937wN c9937wN, String str, long j10) {
        if (c9937wN != null) {
            if (((Boolean) A.c().a(C8784lf.f77452zc)).booleanValue()) {
                C9830vN c9830vNA = c9937wN.a();
                c9830vNA.b("action", "lat_init");
                c9830vNA.b(str, Long.toString(j10));
                c9830vNA.g();
            }
        }
    }

    public final void c(Context context, Sc.a aVar, String str, C9768uq c9768uq, Z80 z80) throws JSONException {
        b(context, aVar, false, c9768uq, c9768uq != null ? c9768uq.b() : null, str, null, z80, null, null);
    }

    final void b(Context context, Sc.a aVar, boolean z10, C9768uq c9768uq, String str, String str2, Runnable runnable, final Z80 z80, final C9937wN c9937wN, final Long l10) throws JSONException {
        K80 k80;
        Exception exc;
        JSONObject jSONObject;
        PackageInfo packageInfoF;
        if (v.c().c() - this.f20803b < 5000) {
            Sc.p.g("Not retrying to fetch app settings");
            return;
        }
        this.f20803b = v.c().c();
        if (c9768uq != null && !TextUtils.isEmpty(c9768uq.c())) {
            if (v.c().a() - c9768uq.a() <= ((Long) A.c().a(C8784lf.f77220j4)).longValue() && c9768uq.i()) {
                return;
            }
        }
        if (context == null) {
            Sc.p.g("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            Sc.p.g("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f20802a = applicationContext;
        final K80 k80A = J80.a(context, 4);
        k80A.zzi();
        C7943dl c7943dlA = v.j().a(this.f20802a, aVar, z80);
        InterfaceC7464Xk interfaceC7464Xk = C7623al.f73326b;
        InterfaceC7298Sk interfaceC7298SkA = c7943dlA.a("google.afma.config.fetchAppSettings", interfaceC7464Xk, interfaceC7464Xk);
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
            AbstractC7718bf abstractC7718bf = C8784lf.f77089a;
            jSONObject.put("experiment_ids", TextUtils.join(",", A.a().a()));
            jSONObject.put("js", aVar.f34479a);
            try {
                ApplicationInfo applicationInfo = this.f20802a.getApplicationInfo();
                if (applicationInfo != null && (packageInfoF = C17067f.a(context).f(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", packageInfoF.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                p0.k("Error fetching PackageInfo.");
            }
            com.google.common.util.concurrent.q qVarZzb = interfaceC7298SkA.zzb(jSONObject);
            try {
                InterfaceC9541sj0 interfaceC9541sj0 = new InterfaceC9541sj0(this) { // from class: Nc.d
                    @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
                    public final com.google.common.util.concurrent.q zza(Object obj) {
                        return f.d(l10, c9937wN, z80, k80A, (JSONObject) obj);
                    }
                };
                k80 = k80A;
                try {
                    Xj0 xj0 = C7033Kq.f69020g;
                    com.google.common.util.concurrent.q qVarN = Mj0.n(qVarZzb, interfaceC9541sj0, xj0);
                    if (runnable != null) {
                        qVarZzb.addListener(runnable, xj0);
                    }
                    if (l10 != null) {
                        qVarZzb.addListener(new Runnable(this) { // from class: Nc.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                f.f(c9937wN, "cld_r", v.c().c() - l10.longValue());
                            }
                        }, xj0);
                    }
                    if (((Boolean) A.c().a(C8784lf.f76762C7)).booleanValue()) {
                        C7134Nq.b(qVarN, "ConfigLoader.maybeFetchNewAppSettings");
                    } else {
                        C7134Nq.a(qVarN, "ConfigLoader.maybeFetchNewAppSettings");
                    }
                } catch (Exception e11) {
                    e = e11;
                    exc = e;
                    Sc.p.e("Error requesting application settings", exc);
                    k80.e(exc);
                    k80.s0(false);
                    z80.b(k80.zzm());
                }
            } catch (Exception e12) {
                e = e12;
                k80 = k80A;
            }
        } catch (Exception e13) {
            exc = e13;
            k80 = k80A;
            Sc.p.e("Error requesting application settings", exc);
            k80.e(exc);
            k80.s0(false);
            z80.b(k80.zzm());
        }
    }
}
