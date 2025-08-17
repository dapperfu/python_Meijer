package Pg;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes7.dex */
public final class q extends r {

    /* renamed from: b, reason: collision with root package name */
    private static final y[] f25397b = new y[0];

    /* renamed from: a, reason: collision with root package name */
    private final y[] f25398a;

    @Override // Pg.r, com.google.zxing.l
    public void reset() {
        for (y yVar : this.f25398a) {
            yVar.reset();
        }
    }

    public q(Map<com.google.zxing.d, ?> map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(com.google.zxing.d.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(com.google.zxing.a.EAN_13)) {
                arrayList.add(new i());
            } else if (collection.contains(com.google.zxing.a.UPC_A)) {
                arrayList.add(new t());
            }
            if (collection.contains(com.google.zxing.a.EAN_8)) {
                arrayList.add(new k());
            }
            if (collection.contains(com.google.zxing.a.UPC_E)) {
                arrayList.add(new A());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new i());
            arrayList.add(new k());
            arrayList.add(new A());
        }
        this.f25398a = (y[]) arrayList.toArray(f25397b);
    }

    @Override // Pg.r
    public com.google.zxing.m c(int i10, Gg.a aVar, Map<com.google.zxing.d, ?> map) throws NotFoundException {
        boolean z10;
        Collection collection;
        boolean z11;
        int[] iArrP = y.p(aVar);
        for (y yVar : this.f25398a) {
            try {
                com.google.zxing.m mVarM = yVar.m(i10, aVar, iArrP, map);
                if (mVarM.b() == com.google.zxing.a.EAN_13 && mVarM.f().charAt(0) == '0') {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (map == null) {
                    collection = null;
                } else {
                    collection = (Collection) map.get(com.google.zxing.d.POSSIBLE_FORMATS);
                }
                if (collection != null && !collection.contains(com.google.zxing.a.UPC_A)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z10 && z11) {
                    com.google.zxing.m mVar = new com.google.zxing.m(mVarM.f().substring(1), mVarM.c(), mVarM.e(), com.google.zxing.a.UPC_A);
                    mVar.g(mVarM.d());
                    return mVar;
                }
                return mVarM;
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.a();
    }
}
