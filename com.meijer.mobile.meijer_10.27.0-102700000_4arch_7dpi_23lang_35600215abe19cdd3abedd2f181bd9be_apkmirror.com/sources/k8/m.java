package k8;

import android.content.Context;
import android.content.SharedPreferences;
import g8.x;
import k8.q;
import k8.u;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class m {

    /* renamed from: c, reason: collision with root package name */
    private static final String f141686c = x.f133195a + "PreferencesManager";

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f141687a;

    /* renamed from: b, reason: collision with root package name */
    private final r f141688b;

    public static m a(Context context, r rVar) {
        return new m(context.getSharedPreferences("com.dynatrace.android.dtxPref", 0), rVar);
    }

    private String e(String str, String str2) {
        try {
            return this.f141687a.getString(str, str2);
        } catch (ClassCastException unused) {
            this.f141687a.edit().remove(str).apply();
            return str2;
        }
    }

    private boolean f(String str, boolean z10) {
        try {
            return this.f141687a.getBoolean(str, z10);
        } catch (ClassCastException unused) {
            this.f141687a.edit().remove(str).apply();
            return z10;
        }
    }

    private q g(q qVar, int i10, boolean z10) {
        return (qVar != null ? qVar.I() : new q.b().A(i10).s(z10)).E(0L).q(1).v(1).D(false).F(-1).p();
    }

    private q h() {
        if (!this.f141687a.contains("ServerConfig")) {
            return null;
        }
        String strE = e("ServerConfig", null);
        if (x.f133196b) {
            x8.f.u(f141686c, "stored configuration: " + strE);
        }
        try {
            return this.f141688b.i(strE);
        } catch (Exception e10) {
            if (x.f133196b) {
                x8.f.v(f141686c, "can't parse stored configuration", e10);
            }
            l();
            return null;
        }
    }

    @Deprecated
    public String b() {
        return e("DTX_BeaconSignal", "dynaTraceMonitor");
    }

    public boolean c() {
        return f("DTXNewVisitorSent", true);
    }

    public u i() {
        u uVar = n.f141690c;
        try {
            boolean z10 = this.f141687a.getBoolean("DTXOptInCrashes", uVar.c());
            EnumC15124j enumC15124jValueOf = EnumC15124j.valueOf(this.f141687a.getString("DTXDataCollectionLevel", uVar.b().name()));
            boolean z11 = this.f141687a.getBoolean("DTXCrashReplayOptedIn", uVar.c());
            if (!z10 && z11) {
                this.f141687a.edit().putBoolean("DTXCrashReplayOptedIn", false).apply();
                if (x.f133196b) {
                    x8.f.w(f141686c, "CrashReplayOptedIn cannot be true when CrashReportOptIn is false");
                }
                z11 = false;
            }
            u.b bVarG = new u.b().h(enumC15124jValueOf).g(z10);
            int i10 = this.f141687a.getInt("DTXCScreenRecordOptedIn", -1);
            if (i10 != -1) {
                bVarG.i(Boolean.valueOf(i10 == 1));
            } else {
                bVarG.i(null);
                bVarG.f(z11);
            }
            return bVarG.e();
        } catch (Exception e10) {
            if (x.f133196b) {
                x8.f.v(f141686c, "could not read privacy settings", e10);
            }
            k();
            return uVar;
        }
    }

    @Deprecated
    public void j() {
        this.f141687a.edit().remove("DTX_BeaconSignal").apply();
    }

    public void k() {
        this.f141687a.edit().remove("DTXOptInCrashes").remove("DTXDataCollectionLevel").remove("DTXCrashReplayOptedIn").remove("DTXCScreenRecordOptedIn").apply();
    }

    public void l() {
        this.f141687a.edit().remove("ServerConfig").apply();
    }

    @Deprecated
    public void m(String str) {
        if ("dynaTraceMonitor".equals(str)) {
            j();
        } else {
            this.f141687a.edit().putString("DTX_BeaconSignal", str).apply();
        }
    }

    public void n(boolean z10) {
        this.f141687a.edit().putBoolean("DTXNewVisitorSent", z10).apply();
    }

    public void o(q qVar) {
        SharedPreferences.Editor editorEdit = this.f141687a.edit();
        try {
            editorEdit.putString("ServerConfig", this.f141688b.p(qVar));
        } catch (JSONException e10) {
            if (x.f133196b) {
                x8.f.v(f141686c, "unable to generate configuration", e10);
            }
            editorEdit.remove("ServerConfig");
        }
        editorEdit.apply();
    }

    m(SharedPreferences sharedPreferences, r rVar) {
        this.f141687a = sharedPreferences;
        this.f141688b = rVar;
    }

    public q d(int i10, boolean z10) {
        return g(h(), i10, z10);
    }
}
