package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes.dex */
final class u {
    private static j2.i a(j2.i iVar, j2.i iVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < iVar.f() + iVar2.f()) {
            Locale localeC = i10 < iVar.f() ? iVar.c(i10) : iVar2.c(i10 - iVar.f());
            if (localeC != null) {
                linkedHashSet.add(localeC);
            }
            i10++;
        }
        return j2.i.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static j2.i b(j2.i iVar, j2.i iVar2) {
        return (iVar == null || iVar.e()) ? j2.i.d() : a(iVar, iVar2);
    }
}
