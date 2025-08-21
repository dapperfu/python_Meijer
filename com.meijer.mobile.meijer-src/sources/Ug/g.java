package Ug;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* loaded from: classes8.dex */
final class g extends h {
    @Override // Ug.j
    public String d() throws NotFoundException, FormatException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append(b().f(4, 4));
        g(sb2, 8, length);
        return b().a(sb2, 48);
    }

    g(Ig.a aVar) {
        super(aVar);
    }
}
