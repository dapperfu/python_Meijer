package h4;

import android.content.res.Resources;
import android.text.TextUtils;
import d3.C13466a;
import d3.P;
import java.util.Locale;

/* renamed from: h4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14355e implements InterfaceC14350E {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f134359a;

    private String j(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f134359a.getString(C14347B.f134267o, string, str);
            }
        }
        return string;
    }

    private String b(a3.t tVar) {
        int i10 = tVar.f43924E;
        return (i10 == -1 || i10 < 1) ? "" : i10 != 1 ? i10 != 2 ? (i10 == 6 || i10 == 7) ? this.f134359a.getString(C14347B.f134249B) : i10 != 8 ? this.f134359a.getString(C14347B.f134248A) : this.f134359a.getString(C14347B.f134250C) : this.f134359a.getString(C14347B.f134278z) : this.f134359a.getString(C14347B.f134269q);
    }

    private String c(a3.t tVar) {
        int i10 = tVar.f43944j;
        return i10 == -1 ? "" : this.f134359a.getString(C14347B.f134268p, Float.valueOf(i10 / 1000000.0f));
    }

    private String d(a3.t tVar) {
        return TextUtils.isEmpty(tVar.f43936b) ? "" : tVar.f43936b;
    }

    private String f(a3.t tVar) {
        String str = tVar.f43938d;
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
        int i10 = tVar.f43956v;
        int i11 = tVar.f43957w;
        return (i10 == -1 || i11 == -1) ? "" : this.f134359a.getString(C14347B.f134270r, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private String h(a3.t tVar) {
        String string = (tVar.f43940f & 2) != 0 ? this.f134359a.getString(C14347B.f134271s) : "";
        if ((tVar.f43940f & 4) != 0) {
            string = j(string, this.f134359a.getString(C14347B.f134274v));
        }
        if ((tVar.f43940f & 8) != 0) {
            string = j(string, this.f134359a.getString(C14347B.f134273u));
        }
        return (tVar.f43940f & 1088) != 0 ? j(string, this.f134359a.getString(C14347B.f134272t)) : string;
    }

    private static int i(a3.t tVar) {
        int iK = a3.z.k(tVar.f43949o);
        if (iK != -1) {
            return iK;
        }
        if (a3.z.m(tVar.f43945k) != null) {
            return 2;
        }
        if (a3.z.c(tVar.f43945k) != null) {
            return 1;
        }
        if (tVar.f43956v == -1 && tVar.f43957w == -1) {
            return (tVar.f43924E == -1 && tVar.f43925F == -1) ? -1 : 1;
        }
        return 2;
    }

    public C14355e(Resources resources) {
        this.f134359a = (Resources) C13466a.e(resources);
    }

    private String e(a3.t tVar) {
        String strJ = j(f(tVar), h(tVar));
        if (TextUtils.isEmpty(strJ)) {
            return d(tVar);
        }
        return strJ;
    }

    @Override // h4.InterfaceC14350E
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
        String str = tVar.f43938d;
        if (str != null && !str.trim().isEmpty()) {
            return this.f134359a.getString(C14347B.f134252E, str);
        }
        return this.f134359a.getString(C14347B.f134251D);
    }
}
