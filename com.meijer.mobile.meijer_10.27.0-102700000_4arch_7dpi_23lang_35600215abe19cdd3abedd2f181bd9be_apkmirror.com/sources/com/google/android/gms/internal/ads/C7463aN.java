package com.google.android.gms.internal.ads;

import Mc.InterfaceC4098a;
import Vc.C5366c;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.aN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7463aN implements InterfaceC10120zE, InterfaceC4098a, InterfaceC9581uC, InterfaceC7766dC {

    /* renamed from: a, reason: collision with root package name */
    private final Context f72403a;

    /* renamed from: b, reason: collision with root package name */
    private final M60 f72404b;

    /* renamed from: c, reason: collision with root package name */
    private final C9812wN f72405c;

    /* renamed from: d, reason: collision with root package name */
    private final C8608l60 f72406d;

    /* renamed from: e, reason: collision with root package name */
    private final Z50 f72407e;

    /* renamed from: f, reason: collision with root package name */
    private final C9710vS f72408f;

    /* renamed from: g, reason: collision with root package name */
    private final String f72409g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f72410h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f72411i = ((Boolean) Mc.A.c().a(C8659lf.f75963F6)).booleanValue();

    private final C9705vN a(String str) {
        C8394j60 c8394j60 = this.f72406d.f75749b;
        C9705vN c9705vNA = this.f72405c.a();
        c9705vNA.d(c8394j60.f75337b);
        c9705vNA.c(this.f72407e);
        c9705vNA.b("action", str);
        c9705vNA.b("ad_format", this.f72409g.toUpperCase(Locale.ROOT));
        if (!this.f72407e.f72059t.isEmpty()) {
            c9705vNA.b("ancn", (String) this.f72407e.f72059t.get(0));
        }
        if (this.f72407e.b()) {
            c9705vNA.b("device_connectivity", true != Lc.v.s().a(this.f72403a) ? "offline" : "online");
            c9705vNA.b("event_timestamp", String.valueOf(Lc.v.c().a()));
            c9705vNA.b("offline_ad", "1");
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76061M6)).booleanValue()) {
            boolean z10 = C5366c.f(this.f72406d.f75748a.f74605a) != 1;
            c9705vNA.b("scar", String.valueOf(z10));
            if (z10) {
                Mc.Y1 y12 = this.f72406d.f75748a.f74605a.f78738d;
                c9705vNA.b("ragent", y12.f19182p);
                c9705vNA.b("rtype", C5366c.b(C5366c.c(y12)));
            }
        }
        return c9705vNA;
    }

    private final void j(C9705vN c9705vN) {
        if (!this.f72407e.b()) {
            c9705vN.g();
            return;
        }
        this.f72408f.d(new C9924xS(Lc.v.c().a(), this.f72406d.f75749b.f75337b.f73103b, c9705vN.e(), 2));
    }

    private final boolean p() {
        String strV;
        if (this.f72410h == null) {
            synchronized (this) {
                if (this.f72410h == null) {
                    String str = (String) Mc.A.c().a(C8659lf.f75902B1);
                    Lc.v.t();
                    try {
                        strV = Pc.D0.V(this.f72403a);
                    } catch (RemoteException unused) {
                        strV = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strV != null) {
                        try {
                            zMatches = Pattern.matches(str, strV);
                        } catch (RuntimeException e10) {
                            Lc.v.s().x(e10, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f72410h = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.f72410h.booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7766dC
    public final void i(Mc.W0 w02) {
        Mc.W0 w03;
        if (this.f72411i) {
            C9705vN c9705vNA = a("ifts");
            c9705vNA.b("reason", "adapter");
            int i10 = w02.f19159a;
            String str = w02.f19160b;
            if (w02.f19161c.equals("com.google.android.gms.ads") && (w03 = w02.f19162d) != null && !w03.f19161c.equals("com.google.android.gms.ads")) {
                Mc.W0 w04 = w02.f19162d;
                i10 = w04.f19159a;
                str = w04.f19160b;
            }
            if (i10 >= 0) {
                c9705vNA.b("arec", String.valueOf(i10));
            }
            String strA = this.f72404b.a(str);
            if (strA != null) {
                c9705vNA.b("areec", strA);
            }
            c9705vNA.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7766dC
    public final void k0(zzdgb zzdgbVar) {
        if (this.f72411i) {
            C9705vN c9705vNA = a("ifts");
            c9705vNA.b("reason", "exception");
            if (!TextUtils.isEmpty(zzdgbVar.getMessage())) {
                c9705vNA.b("msg", zzdgbVar.getMessage());
            }
            c9705vNA.g();
        }
    }

    @Override // Mc.InterfaceC4098a
    public final void v() {
        if (this.f72407e.b()) {
            j(a("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7766dC
    public final void zzb() {
        if (this.f72411i) {
            C9705vN c9705vNA = a("ifts");
            c9705vNA.b("reason", "blocked");
            c9705vNA.g();
        }
    }

    public C7463aN(Context context, M60 m60, C9812wN c9812wN, C8608l60 c8608l60, Z50 z50, C9710vS c9710vS, String str) {
        this.f72403a = context;
        this.f72404b = m60;
        this.f72405c = c9812wN;
        this.f72406d = c8608l60;
        this.f72407e = z50;
        this.f72408f = c9710vS;
        this.f72409g = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10120zE
    public final void zzi() {
        if (!p()) {
            return;
        }
        a("adapter_shown").g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10120zE
    public final void zzj() {
        if (!p()) {
            return;
        }
        a("adapter_impression").g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9581uC
    public final void zzr() {
        if (!p() && !this.f72407e.b()) {
            return;
        }
        j(a("impression"));
    }
}
