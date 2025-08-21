package x3;

import a3.y;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f170129c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f170130a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f170131b = -1;

    public boolean c(a3.y yVar) {
        for (int i10 = 0; i10 < yVar.e(); i10++) {
            y.a aVarD = yVar.d(i10);
            if (aVarD instanceof L3.e) {
                L3.e eVar = (L3.e) aVarD;
                if ("iTunSMPB".equals(eVar.f17990c) && b(eVar.f17991d)) {
                    return true;
                }
            } else if (aVarD instanceof L3.k) {
                L3.k kVar = (L3.k) aVarD;
                if ("com.apple.iTunes".equals(kVar.f18003b) && "iTunSMPB".equals(kVar.f18004c) && b(kVar.f18005d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private boolean b(String str) throws NumberFormatException {
        Matcher matcher = f170129c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i10 = Integer.parseInt((String) d3.P.h(matcher.group(1)), 16);
            int i11 = Integer.parseInt((String) d3.P.h(matcher.group(2)), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f170130a = i10;
            this.f170131b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f170130a == -1 || this.f170131b == -1) ? false : true;
    }
}
