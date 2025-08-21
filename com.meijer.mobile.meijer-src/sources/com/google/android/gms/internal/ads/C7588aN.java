package com.google.android.gms.internal.ads;

import Oc.InterfaceC4376a;
import Xc.C5569c;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.aN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7588aN implements InterfaceC10245zE, InterfaceC4376a, InterfaceC9706uC, InterfaceC7891dC {

    /* renamed from: a, reason: collision with root package name */
    private final Context f73243a;

    /* renamed from: b, reason: collision with root package name */
    private final M60 f73244b;

    /* renamed from: c, reason: collision with root package name */
    private final C9937wN f73245c;

    /* renamed from: d, reason: collision with root package name */
    private final C8733l60 f73246d;

    /* renamed from: e, reason: collision with root package name */
    private final Z50 f73247e;

    /* renamed from: f, reason: collision with root package name */
    private final C9835vS f73248f;

    /* renamed from: g, reason: collision with root package name */
    private final String f73249g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f73250h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f73251i = ((Boolean) Oc.A.c().a(C8784lf.f76803F6)).booleanValue();

    private final C9830vN a(String str) {
        C8519j60 c8519j60 = this.f73246d.f76589b;
        C9830vN c9830vNA = this.f73245c.a();
        c9830vNA.d(c8519j60.f76177b);
        c9830vNA.c(this.f73247e);
        c9830vNA.b("action", str);
        c9830vNA.b("ad_format", this.f73249g.toUpperCase(Locale.ROOT));
        if (!this.f73247e.f72899t.isEmpty()) {
            c9830vNA.b("ancn", (String) this.f73247e.f72899t.get(0));
        }
        if (this.f73247e.b()) {
            c9830vNA.b("device_connectivity", true != Nc.v.s().a(this.f73243a) ? "offline" : "online");
            c9830vNA.b("event_timestamp", String.valueOf(Nc.v.c().a()));
            c9830vNA.b("offline_ad", "1");
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f76901M6)).booleanValue()) {
            boolean z10 = C5569c.f(this.f73246d.f76588a.f75445a) != 1;
            c9830vNA.b("scar", String.valueOf(z10));
            if (z10) {
                Oc.Y1 y12 = this.f73246d.f76588a.f75445a.f79578d;
                c9830vNA.b("ragent", y12.f23369p);
                c9830vNA.b("rtype", C5569c.b(C5569c.c(y12)));
            }
        }
        return c9830vNA;
    }

    private final void j(C9830vN c9830vN) {
        if (!this.f73247e.b()) {
            c9830vN.g();
            return;
        }
        this.f73248f.d(new C10049xS(Nc.v.c().a(), this.f73246d.f76589b.f76177b.f73943b, c9830vN.e(), 2));
    }

    private final boolean p() {
        String strV;
        if (this.f73250h == null) {
            synchronized (this) {
                if (this.f73250h == null) {
                    String str = (String) Oc.A.c().a(C8784lf.f76742B1);
                    Nc.v.t();
                    try {
                        strV = Rc.D0.V(this.f73243a);
                    } catch (RemoteException unused) {
                        strV = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strV != null) {
                        try {
                            zMatches = Pattern.matches(str, strV);
                        } catch (RuntimeException e10) {
                            Nc.v.s().x(e10, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f73250h = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.f73250h.booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7891dC
    public final void i(Oc.W0 w02) {
        Oc.W0 w03;
        if (this.f73251i) {
            C9830vN c9830vNA = a("ifts");
            c9830vNA.b("reason", "adapter");
            int i10 = w02.f23346a;
            String str = w02.f23347b;
            if (w02.f23348c.equals("com.google.android.gms.ads") && (w03 = w02.f23349d) != null && !w03.f23348c.equals("com.google.android.gms.ads")) {
                Oc.W0 w04 = w02.f23349d;
                i10 = w04.f23346a;
                str = w04.f23347b;
            }
            if (i10 >= 0) {
                c9830vNA.b("arec", String.valueOf(i10));
            }
            String strA = this.f73244b.a(str);
            if (strA != null) {
                c9830vNA.b("areec", strA);
            }
            c9830vNA.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7891dC
    public final void k0(zzdgb zzdgbVar) {
        if (this.f73251i) {
            C9830vN c9830vNA = a("ifts");
            c9830vNA.b("reason", "exception");
            if (!TextUtils.isEmpty(zzdgbVar.getMessage())) {
                c9830vNA.b("msg", zzdgbVar.getMessage());
            }
            c9830vNA.g();
        }
    }

    @Override // Oc.InterfaceC4376a
    public final void v() {
        if (this.f73247e.b()) {
            j(a("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7891dC
    public final void zzb() {
        if (this.f73251i) {
            C9830vN c9830vNA = a("ifts");
            c9830vNA.b("reason", "blocked");
            c9830vNA.g();
        }
    }

    public C7588aN(Context context, M60 m60, C9937wN c9937wN, C8733l60 c8733l60, Z50 z50, C9835vS c9835vS, String str) {
        this.f73243a = context;
        this.f73244b = m60;
        this.f73245c = c9937wN;
        this.f73246d = c8733l60;
        this.f73247e = z50;
        this.f73248f = c9835vS;
        this.f73249g = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10245zE
    public final void zzi() {
        if (!p()) {
            return;
        }
        a("adapter_shown").g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10245zE
    public final void zzj() {
        if (!p()) {
            return;
        }
        a("adapter_impression").g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9706uC
    public final void zzr() {
        if (!p() && !this.f73247e.b()) {
            return;
        }
        j(a("impression"));
    }
}
