package Sg;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* loaded from: classes7.dex */
final class c extends h {
    c(Gg.a aVar) {
        super(aVar);
    }

    @Override // Sg.j
    public String d() throws NotFoundException, FormatException {
        if (c().l() >= 48) {
            StringBuilder sb2 = new StringBuilder();
            f(sb2, 8);
            int iF = b().f(48, 2);
            sb2.append("(392");
            sb2.append(iF);
            sb2.append(')');
            sb2.append(b().c(50, null).b());
            return sb2.toString();
        }
        throw NotFoundException.a();
    }
}
