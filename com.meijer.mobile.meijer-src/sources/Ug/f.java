package Ug;

import com.google.zxing.NotFoundException;

/* loaded from: classes8.dex */
abstract class f extends i {
    f(Ig.a aVar) {
        super(aVar);
    }

    @Override // Ug.j
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
