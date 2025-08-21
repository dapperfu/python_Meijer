package i8;

import X7.AppVersion;
import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import j8.C14966d;
import java.util.Iterator;
import java.util.Locale;
import o8.C16086a;
import w7.EnumC17849a;
import w8.C17850a;

/* renamed from: i8.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14698e {

    /* renamed from: c, reason: collision with root package name */
    private static final String f137225c = x.f137411a + "BasicSegment";

    /* renamed from: a, reason: collision with root package name */
    protected C17850a f137226a = C17850a.h();

    /* renamed from: b, reason: collision with root package name */
    private final EnumC17849a f137227b;

    /* renamed from: i8.e$a */
    public static class a {
        public String a(long j10, int i10, String str) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("&tv=");
            sb2.append(j10);
            sb2.append("&tx=");
            sb2.append("__tsNow__");
            sb2.append("&mp=");
            if (i10 < 0) {
                i10 = 1;
            }
            sb2.append(i10);
            if (str != null) {
                sb2.append("&sr=");
                sb2.append(str);
            }
            return sb2.toString();
        }
    }

    public static boolean a(C14966d c14966d) {
        Iterator<String> it = c14966d.f140196b.iterator();
        while (it.hasNext()) {
            if (it.next().contains("&pa=0")) {
                c14966d.f140195a += "&nu=1";
                return true;
            }
        }
        return false;
    }

    private String c(m8.u uVar) {
        return !C16086a.f153743b ? "0" : uVar.c() ? "2" : "1";
    }

    public StringBuilder b(p8.b bVar) {
        StringBuilder sb2 = new StringBuilder();
        E8.a aVarK = this.f137226a.k();
        sb2.append("vv=");
        sb2.append("3");
        sb2.append("&va=");
        sb2.append(D.a());
        sb2.append("&ap=");
        sb2.append(C14695b.f137212j);
        sb2.append("&an=");
        sb2.append(z8.f.t(C14695b.f137213k));
        sb2.append("&ai=");
        sb2.append(z8.f.t(C14695b.f137214l));
        AppVersion appVersionC = this.f137226a.c();
        if (appVersionC == null) {
            sb2.append("&vb=");
            sb2.append(0);
        } else {
            sb2.append("&vb=");
            sb2.append(appVersionC.getVersionCode());
            if (appVersionC.getVersionName() != null) {
                String strS = z8.f.s(appVersionC.getVersionName(), 50);
                sb2.append("&vn=");
                sb2.append(z8.f.t(strS));
            }
        }
        sb2.append("&vi=");
        sb2.append(bVar.f156193b);
        sb2.append("&sn=");
        sb2.append(bVar.f156194c);
        sb2.append("&ss=");
        sb2.append(bVar.f156195d);
        sb2.append("&rm=");
        sb2.append(this.f137226a.f166987d.intValue());
        sb2.append("&cp=");
        sb2.append(z8.f.t(this.f137226a.f166997n));
        sb2.append("&os=");
        sb2.append(z8.f.t(this.f137226a.f166996m));
        sb2.append("&mf=");
        String str = this.f137226a.f166988e;
        if (str == null) {
            str = zzbz.UNKNOWN_CONTENT_TYPE;
        }
        sb2.append(z8.f.t(z8.f.s(str, 250)));
        sb2.append("&md=");
        sb2.append(z8.f.t(this.f137226a.f167000q));
        sb2.append("&rj=");
        sb2.append(this.f137226a.f166990g ? "r" : "g");
        sb2.append("&ul=");
        sb2.append(this.f137226a.f166989f);
        if (aVarK != null) {
            if (aVarK.b() > aVarK.a()) {
                sb2.append("&sw=");
                sb2.append(aVarK.a());
                sb2.append("&sh=");
                sb2.append(aVarK.b());
            } else {
                sb2.append("&sw=");
                sb2.append(aVarK.b());
                sb2.append("&sh=");
                sb2.append(aVarK.a());
            }
            sb2.append("&sd=");
            sb2.append(aVarK.c());
        }
        sb2.append("&pt=");
        sb2.append("0");
        int i10 = this.f137226a.f166994k;
        String str2 = i10 == 2 ? "l" : i10 == 1 ? "p" : null;
        if (str2 != null) {
            sb2.append("&so=");
            sb2.append(str2);
        }
        if (this.f137226a.f166998o >= 0) {
            sb2.append("&bl=");
            sb2.append(this.f137226a.f166998o);
        }
        if (this.f137226a.f166999p != null) {
            sb2.append("&fm=");
            sb2.append(this.f137226a.f166999p.intValue());
        }
        if (this.f137226a.f166991h != null) {
            sb2.append("&cr=");
            sb2.append(z8.f.t(this.f137226a.f166991h));
        }
        if (this.f137226a.f166992i != w8.g.OTHER) {
            sb2.append("&ct=");
            sb2.append(this.f137226a.f166992i.b());
            String str3 = this.f137226a.f166993j;
            if (str3 != null && str3.length() > 0) {
                sb2.append("&np=");
                sb2.append(z8.f.t(this.f137226a.f166993j));
            }
        }
        m8.n nVarF = bVar.f();
        if (this.f137226a.f167001r != null && nVarF.a()) {
            String str4 = String.format(Locale.US, "%3.3fx%3.3f", Double.valueOf(this.f137226a.f167001r.getLatitude()), Double.valueOf(this.f137226a.f167001r.getLongitude()));
            sb2.append("&lx=");
            sb2.append(z8.f.t(str4));
        }
        sb2.append("&tt=");
        sb2.append("maandroid");
        sb2.append("&dl=");
        sb2.append(nVarF.c().b().ordinal());
        sb2.append("&cl=");
        sb2.append(c(nVarF.c()));
        sb2.append("&fv=");
        sb2.append(this.f137227b.getProtocolValue());
        return sb2;
    }

    public void d(boolean z10) {
        if (z10) {
            this.f137226a.r();
        }
        if (this.f137226a.d() <= 6000) {
            return;
        }
        this.f137226a.u();
    }

    protected C14698e(EnumC17849a enumC17849a) {
        this.f137227b = enumC17849a;
    }
}
