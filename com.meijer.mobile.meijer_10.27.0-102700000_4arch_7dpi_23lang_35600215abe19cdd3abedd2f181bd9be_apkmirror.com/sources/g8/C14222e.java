package g8;

import V7.AppVersion;
import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import h8.C14388d;
import java.util.Iterator;
import java.util.Locale;
import m8.C15576a;
import u7.EnumC17232a;
import u8.C17233a;

/* renamed from: g8.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14222e {

    /* renamed from: c, reason: collision with root package name */
    private static final String f133009c = x.f133195a + "BasicSegment";

    /* renamed from: a, reason: collision with root package name */
    protected C17233a f133010a = C17233a.h();

    /* renamed from: b, reason: collision with root package name */
    private final EnumC17232a f133011b;

    /* renamed from: g8.e$a */
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

    public static boolean a(C14388d c14388d) {
        Iterator<String> it = c14388d.f134509b.iterator();
        while (it.hasNext()) {
            if (it.next().contains("&pa=0")) {
                c14388d.f134508a += "&nu=1";
                return true;
            }
        }
        return false;
    }

    private String c(k8.u uVar) {
        return !C15576a.f149956b ? "0" : uVar.c() ? "2" : "1";
    }

    public StringBuilder b(n8.b bVar) {
        StringBuilder sb2 = new StringBuilder();
        C8.a aVarK = this.f133010a.k();
        sb2.append("vv=");
        sb2.append("3");
        sb2.append("&va=");
        sb2.append(D.a());
        sb2.append("&ap=");
        sb2.append(C14219b.f132996j);
        sb2.append("&an=");
        sb2.append(x8.f.t(C14219b.f132997k));
        sb2.append("&ai=");
        sb2.append(x8.f.t(C14219b.f132998l));
        AppVersion appVersionC = this.f133010a.c();
        if (appVersionC == null) {
            sb2.append("&vb=");
            sb2.append(0);
        } else {
            sb2.append("&vb=");
            sb2.append(appVersionC.getVersionCode());
            if (appVersionC.getVersionName() != null) {
                String strS = x8.f.s(appVersionC.getVersionName(), 50);
                sb2.append("&vn=");
                sb2.append(x8.f.t(strS));
            }
        }
        sb2.append("&vi=");
        sb2.append(bVar.f151062b);
        sb2.append("&sn=");
        sb2.append(bVar.f151063c);
        sb2.append("&ss=");
        sb2.append(bVar.f151064d);
        sb2.append("&rm=");
        sb2.append(this.f133010a.f162778d.intValue());
        sb2.append("&cp=");
        sb2.append(x8.f.t(this.f133010a.f162788n));
        sb2.append("&os=");
        sb2.append(x8.f.t(this.f133010a.f162787m));
        sb2.append("&mf=");
        String str = this.f133010a.f162779e;
        if (str == null) {
            str = zzbz.UNKNOWN_CONTENT_TYPE;
        }
        sb2.append(x8.f.t(x8.f.s(str, 250)));
        sb2.append("&md=");
        sb2.append(x8.f.t(this.f133010a.f162791q));
        sb2.append("&rj=");
        sb2.append(this.f133010a.f162781g ? "r" : "g");
        sb2.append("&ul=");
        sb2.append(this.f133010a.f162780f);
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
        int i10 = this.f133010a.f162785k;
        String str2 = i10 == 2 ? "l" : i10 == 1 ? "p" : null;
        if (str2 != null) {
            sb2.append("&so=");
            sb2.append(str2);
        }
        if (this.f133010a.f162789o >= 0) {
            sb2.append("&bl=");
            sb2.append(this.f133010a.f162789o);
        }
        if (this.f133010a.f162790p != null) {
            sb2.append("&fm=");
            sb2.append(this.f133010a.f162790p.intValue());
        }
        if (this.f133010a.f162782h != null) {
            sb2.append("&cr=");
            sb2.append(x8.f.t(this.f133010a.f162782h));
        }
        if (this.f133010a.f162783i != u8.g.OTHER) {
            sb2.append("&ct=");
            sb2.append(this.f133010a.f162783i.b());
            String str3 = this.f133010a.f162784j;
            if (str3 != null && str3.length() > 0) {
                sb2.append("&np=");
                sb2.append(x8.f.t(this.f133010a.f162784j));
            }
        }
        k8.n nVarF = bVar.f();
        if (this.f133010a.f162792r != null && nVarF.a()) {
            String str4 = String.format(Locale.US, "%3.3fx%3.3f", Double.valueOf(this.f133010a.f162792r.getLatitude()), Double.valueOf(this.f133010a.f162792r.getLongitude()));
            sb2.append("&lx=");
            sb2.append(x8.f.t(str4));
        }
        sb2.append("&tt=");
        sb2.append("maandroid");
        sb2.append("&dl=");
        sb2.append(nVarF.c().b().ordinal());
        sb2.append("&cl=");
        sb2.append(c(nVarF.c()));
        sb2.append("&fv=");
        sb2.append(this.f133011b.getProtocolValue());
        return sb2;
    }

    public void d(boolean z10) {
        if (z10) {
            this.f133010a.r();
        }
        if (this.f133010a.d() <= 6000) {
            return;
        }
        this.f133010a.u();
    }

    protected C14222e(EnumC17232a enumC17232a) {
        this.f133011b = enumC17232a;
    }
}
