package Tg;

import java.util.List;

/* loaded from: classes8.dex */
final class a {
    static Ig.a a(List<b> list) {
        int size = list.size() * 2;
        int i10 = size - 1;
        if (list.get(list.size() - 1).c() == null) {
            i10 = size - 2;
        }
        Ig.a aVar = new Ig.a(i10 * 12);
        int i11 = 0;
        int iB = list.get(0).c().b();
        for (int i12 = 11; i12 >= 0; i12--) {
            if (((1 << i12) & iB) != 0) {
                aVar.q(i11);
            }
            i11++;
        }
        for (int i13 = 1; i13 < list.size(); i13++) {
            b bVar = list.get(i13);
            int iB2 = bVar.b().b();
            for (int i14 = 11; i14 >= 0; i14--) {
                if (((1 << i14) & iB2) != 0) {
                    aVar.q(i11);
                }
                i11++;
            }
            if (bVar.c() != null) {
                int iB3 = bVar.c().b();
                for (int i15 = 11; i15 >= 0; i15--) {
                    if (((1 << i15) & iB3) != 0) {
                        aVar.q(i11);
                    }
                    i11++;
                }
            }
        }
        return aVar;
    }
}
