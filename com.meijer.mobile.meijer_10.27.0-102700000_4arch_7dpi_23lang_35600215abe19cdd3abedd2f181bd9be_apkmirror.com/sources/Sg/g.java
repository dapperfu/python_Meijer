package Sg;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* loaded from: classes7.dex */
final class g extends h {
    @Override // Sg.j
    public String d() throws NotFoundException, FormatException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append(b().f(4, 4));
        g(sb2, 8, length);
        return b().a(sb2, 48);
    }

    g(Gg.a aVar) {
        super(aVar);
    }
}
