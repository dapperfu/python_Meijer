package Sg;

import com.google.zxing.NotFoundException;

/* loaded from: classes7.dex */
abstract class f extends i {
    f(Gg.a aVar) {
        super(aVar);
    }

    @Override // Sg.j
    public String d() throws NotFoundException {
        if (c().l() == 60) {
            StringBuilder sb2 = new StringBuilder();
            f(sb2, 5);
            j(sb2, 45, 15);
            return sb2.toString();
        }
        throw NotFoundException.a();
    }
}
