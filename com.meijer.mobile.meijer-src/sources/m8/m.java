package m8;

import android.content.Context;
import android.content.SharedPreferences;
import i8.x;
import m8.q;
import m8.u;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class m {

    /* renamed from: c, reason: collision with root package name */
    private static final String f150832c = x.f137411a + "PreferencesManager";

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f150833a;

    /* renamed from: b, reason: collision with root package name */
    private final r f150834b;

    public static m a(Context context, r rVar) {
        return new m(context.getSharedPreferences("com.dynatrace.android.dtxPref", 0), rVar);
    }

    private String e(String str, String str2) {
        try {
            return this.f150833a.getString(str, str2);
        } catch (ClassCastException unused) {
            this.f150833a.edit().remove(str).apply();
            return str2;
        }
    }

    private boolean f(String str, boolean z10) {
        try {
            return this.f150833a.getBoolean(str, z10);
        } catch (ClassCastException unused) {
            this.f150833a.edit().remove(str).apply();
            return z10;
        }
    }

    private q g(q qVar, int i10, boolean z10) {
        return (qVar != null ? qVar.I() : new q.b().A(i10).s(z10)).E(0L).q(1).v(1).D(false).F(-1).p();
    }

    private q h() {
        if (!this.f150833a.contains("ServerConfig")) {
            return null;
        }
        String strE = e("ServerConfig", null);
        if (x.f137412b) {
            z8.f.u(f150832c, "stored configuration: " + strE);
        }
        try {
            return this.f150834b.i(strE);
        } catch (Exception e10) {
            if (x.f137412b) {
                z8.f.v(f150832c, "can't parse stored configuration", e10);
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
        u uVar = n.f150836c;
        try {
            boolean z10 = this.f150833a.getBoolean("DTXOptInCrashes", uVar.c());
            EnumC15695j enumC15695jValueOf = EnumC15695j.valueOf(this.f150833a.getString("DTXDataCollectionLevel", uVar.b().name()));
            boolean z11 = this.f150833a.getBoolean("DTXCrashReplayOptedIn", uVar.c());
            if (!z10 && z11) {
                this.f150833a.edit().putBoolean("DTXCrashReplayOptedIn", false).apply();
                if (x.f137412b) {
                    z8.f.w(f150832c, "CrashReplayOptedIn cannot be true when CrashReportOptIn is false");
                }
                z11 = false;
            }
            u.b bVarG = new u.b().h(enumC15695jValueOf).g(z10);
            int i10 = this.f150833a.getInt("DTXCScreenRecordOptedIn", -1);
            if (i10 != -1) {
                bVarG.i(Boolean.valueOf(i10 == 1));
            } else {
                bVarG.i(null);
                bVarG.f(z11);
            }
            return bVarG.e();
        } catch (Exception e10) {
            if (x.f137412b) {
                z8.f.v(f150832c, "could not read privacy settings", e10);
            }
            k();
            return uVar;
        }
    }

    @Deprecated
    public void j() {
        this.f150833a.edit().remove("DTX_BeaconSignal").apply();
    }

    public void k() {
        this.f150833a.edit().remove("DTXOptInCrashes").remove("DTXDataCollectionLevel").remove("DTXCrashReplayOptedIn").remove("DTXCScreenRecordOptedIn").apply();
    }

    public void l() {
        this.f150833a.edit().remove("ServerConfig").apply();
    }

    @Deprecated
    public void m(String str) {
        if ("dynaTraceMonitor".equals(str)) {
            j();
        } else {
            this.f150833a.edit().putString("DTX_BeaconSignal", str).apply();
        }
    }

    public void n(boolean z10) {
        this.f150833a.edit().putBoolean("DTXNewVisitorSent", z10).apply();
    }

    public void o(q qVar) {
        SharedPreferences.Editor editorEdit = this.f150833a.edit();
        try {
            editorEdit.putString("ServerConfig", this.f150834b.p(qVar));
        } catch (JSONException e10) {
            if (x.f137412b) {
                z8.f.v(f150832c, "unable to generate configuration", e10);
            }
            editorEdit.remove("ServerConfig");
        }
        editorEdit.apply();
    }

    m(SharedPreferences sharedPreferences, r rVar) {
        this.f150833a = sharedPreferences;
        this.f150834b = rVar;
    }

    public q d(int i10, boolean z10) {
        return g(h(), i10, z10);
    }
}
