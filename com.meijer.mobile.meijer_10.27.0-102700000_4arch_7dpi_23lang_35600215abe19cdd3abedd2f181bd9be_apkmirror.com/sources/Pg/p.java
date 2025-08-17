package Pg;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes7.dex */
public final class p extends r {

    /* renamed from: b, reason: collision with root package name */
    private static final r[] f25395b = new r[0];

    /* renamed from: a, reason: collision with root package name */
    private final r[] f25396a;

    @Override // Pg.r
    public com.google.zxing.m c(int i10, Gg.a aVar, Map<com.google.zxing.d, ?> map) throws NotFoundException {
        for (r rVar : this.f25396a) {
            try {
                return rVar.c(i10, aVar, map);
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.a();
    }

    @Override // Pg.r, com.google.zxing.l
    public void reset() {
        for (r rVar : this.f25396a) {
            rVar.reset();
        }
    }

    public p(Map<com.google.zxing.d, ?> map) {
        Collection collection;
        boolean z10;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(com.google.zxing.d.POSSIBLE_FORMATS);
        }
        if (map != null && map.get(com.google.zxing.d.ASSUME_CODE_39_CHECK_DIGIT) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(com.google.zxing.a.EAN_13) || collection.contains(com.google.zxing.a.UPC_A) || collection.contains(com.google.zxing.a.EAN_8) || collection.contains(com.google.zxing.a.UPC_E)) {
                arrayList.add(new q(map));
            }
            if (collection.contains(com.google.zxing.a.CODE_39)) {
                arrayList.add(new e(z10));
            }
            if (collection.contains(com.google.zxing.a.CODE_93)) {
                arrayList.add(new g());
            }
            if (collection.contains(com.google.zxing.a.CODE_128)) {
                arrayList.add(new c());
            }
            if (collection.contains(com.google.zxing.a.ITF)) {
                arrayList.add(new n());
            }
            if (collection.contains(com.google.zxing.a.CODABAR)) {
                arrayList.add(new C4596a());
            }
            if (collection.contains(com.google.zxing.a.RSS_14)) {
                arrayList.add(new Qg.e());
            }
            if (collection.contains(com.google.zxing.a.RSS_EXPANDED)) {
                arrayList.add(new Rg.d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new q(map));
            arrayList.add(new e());
            arrayList.add(new C4596a());
            arrayList.add(new g());
            arrayList.add(new c());
            arrayList.add(new n());
            arrayList.add(new Qg.e());
            arrayList.add(new Rg.d());
        }
        this.f25396a = (r[]) arrayList.toArray(f25395b);
    }
}
