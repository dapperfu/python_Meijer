package x3;

import a3.y;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f169041c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f169042a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f169043b = -1;

    public boolean c(a3.y yVar) {
        for (int i10 = 0; i10 < yVar.e(); i10++) {
            y.a aVarD = yVar.d(i10);
            if (aVarD instanceof L3.e) {
                L3.e eVar = (L3.e) aVarD;
                if ("iTunSMPB".equals(eVar.f17843c) && b(eVar.f17844d)) {
                    return true;
                }
            } else if (aVarD instanceof L3.k) {
                L3.k kVar = (L3.k) aVarD;
                if ("com.apple.iTunes".equals(kVar.f17856b) && "iTunSMPB".equals(kVar.f17857c) && b(kVar.f17858d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private boolean b(String str) throws NumberFormatException {
        Matcher matcher = f169041c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i10 = Integer.parseInt((String) d3.P.h(matcher.group(1)), 16);
            int i11 = Integer.parseInt((String) d3.P.h(matcher.group(2)), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f169042a = i10;
            this.f169043b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f169042a == -1 || this.f169043b == -1) ? false : true;
    }
}
