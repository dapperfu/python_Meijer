package h4;

import android.content.res.Resources;
import android.text.TextUtils;
import d3.C13599a;
import d3.P;
import java.util.Locale;

/* renamed from: h4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14466e implements E {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f134830a;

    private String j(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f134830a.getString(C14460B.f134738o, string, str);
            }
        }
        return string;
    }

    private String b(a3.t tVar) {
        int i10 = tVar.f44742E;
        return (i10 == -1 || i10 < 1) ? "" : i10 != 1 ? i10 != 2 ? (i10 == 6 || i10 == 7) ? this.f134830a.getString(C14460B.f134720B) : i10 != 8 ? this.f134830a.getString(C14460B.f134719A) : this.f134830a.getString(C14460B.f134721C) : this.f134830a.getString(C14460B.f134749z) : this.f134830a.getString(C14460B.f134740q);
    }

    private String c(a3.t tVar) {
        int i10 = tVar.f44762j;
        return i10 == -1 ? "" : this.f134830a.getString(C14460B.f134739p, Float.valueOf(i10 / 1000000.0f));
    }

    private String d(a3.t tVar) {
        return TextUtils.isEmpty(tVar.f44754b) ? "" : tVar.f44754b;
    }

    private String f(a3.t tVar) {
        String str = tVar.f44756d;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        Locale localeU = P.U();
        String displayName = localeForLanguageTag.getDisplayName(localeU);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, iOffsetByCodePoints).toUpperCase(localeU) + displayName.substring(iOffsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private String g(a3.t tVar) {
        int i10 = tVar.f44774v;
        int i11 = tVar.f44775w;
        return (i10 == -1 || i11 == -1) ? "" : this.f134830a.getString(C14460B.f134741r, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private String h(a3.t tVar) {
        String string = (tVar.f44758f & 2) != 0 ? this.f134830a.getString(C14460B.f134742s) : "";
        if ((tVar.f44758f & 4) != 0) {
            string = j(string, this.f134830a.getString(C14460B.f134745v));
        }
        if ((tVar.f44758f & 8) != 0) {
            string = j(string, this.f134830a.getString(C14460B.f134744u));
        }
        return (tVar.f44758f & 1088) != 0 ? j(string, this.f134830a.getString(C14460B.f134743t)) : string;
    }

    private static int i(a3.t tVar) {
        int iK = a3.z.k(tVar.f44767o);
        if (iK != -1) {
            return iK;
        }
        if (a3.z.m(tVar.f44763k) != null) {
            return 2;
        }
        if (a3.z.c(tVar.f44763k) != null) {
            return 1;
        }
        if (tVar.f44774v == -1 && tVar.f44775w == -1) {
            return (tVar.f44742E == -1 && tVar.f44743F == -1) ? -1 : 1;
        }
        return 2;
    }

    public C14466e(Resources resources) {
        this.f134830a = (Resources) C13599a.e(resources);
    }

    private String e(a3.t tVar) {
        String strJ = j(f(tVar), h(tVar));
        if (TextUtils.isEmpty(strJ)) {
            return d(tVar);
        }
        return strJ;
    }

    @Override // h4.E
    public String a(a3.t tVar) {
        String strE;
        int i10 = i(tVar);
        if (i10 == 2) {
            strE = j(h(tVar), g(tVar), c(tVar));
        } else if (i10 == 1) {
            strE = j(e(tVar), b(tVar), c(tVar));
        } else {
            strE = e(tVar);
        }
        if (strE.length() != 0) {
            return strE;
        }
        String str = tVar.f44756d;
        if (str != null && !str.trim().isEmpty()) {
            return this.f134830a.getString(C14460B.f134723E, str);
        }
        return this.f134830a.getString(C14460B.f134722D);
    }
}
