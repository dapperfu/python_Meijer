package com.google.zxing;

import ah.C5689a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes8.dex */
public final class i implements l {

    /* renamed from: c, reason: collision with root package name */
    private static final l[] f91666c = new l[0];

    /* renamed from: a, reason: collision with root package name */
    private Map<d, ?> f91667a;

    /* renamed from: b, reason: collision with root package name */
    private l[] f91668b;

    @Override // com.google.zxing.l
    public m b(c cVar) throws NotFoundException {
        e(null);
        return c(cVar);
    }

    private m c(c cVar) throws NotFoundException {
        l[] lVarArr = this.f91668b;
        if (lVarArr != null) {
            for (l lVar : lVarArr) {
                if (Thread.currentThread().isInterrupted()) {
                    throw NotFoundException.a();
                }
                try {
                    return lVar.a(cVar, this.f91667a);
                } catch (ReaderException unused) {
                }
            }
            Map<d, ?> map = this.f91667a;
            if (map != null && map.containsKey(d.ALSO_INVERTED)) {
                cVar.a().d();
                for (l lVar2 : this.f91668b) {
                    if (Thread.currentThread().isInterrupted()) {
                        throw NotFoundException.a();
                    }
                    try {
                        return lVar2.a(cVar, this.f91667a);
                    } catch (ReaderException unused2) {
                    }
                }
            }
        }
        throw NotFoundException.a();
    }

    public m d(c cVar) throws NotFoundException {
        if (this.f91668b == null) {
            e(null);
        }
        return c(cVar);
    }

    public void e(Map<d, ?> map) {
        this.f91667a = map;
        boolean z10 = map != null && map.containsKey(d.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(d.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            boolean z11 = collection.contains(a.UPC_A) || collection.contains(a.UPC_E) || collection.contains(a.EAN_13) || collection.contains(a.EAN_8) || collection.contains(a.CODABAR) || collection.contains(a.CODE_39) || collection.contains(a.CODE_93) || collection.contains(a.CODE_128) || collection.contains(a.ITF) || collection.contains(a.RSS_14) || collection.contains(a.RSS_EXPANDED);
            if (z11 && !z10) {
                arrayList.add(new Rg.p(map));
            }
            if (collection.contains(a.QR_CODE)) {
                arrayList.add(new C5689a());
            }
            if (collection.contains(a.DATA_MATRIX)) {
                arrayList.add(new Lg.a());
            }
            if (collection.contains(a.AZTEC)) {
                arrayList.add(new Cg.b());
            }
            if (collection.contains(a.PDF_417)) {
                arrayList.add(new Vg.b());
            }
            if (collection.contains(a.MAXICODE)) {
                arrayList.add(new Pg.a());
            }
            if (z11 && z10) {
                arrayList.add(new Rg.p(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z10) {
                arrayList.add(new Rg.p(map));
            }
            arrayList.add(new C5689a());
            arrayList.add(new Lg.a());
            arrayList.add(new Cg.b());
            arrayList.add(new Vg.b());
            arrayList.add(new Pg.a());
            if (z10) {
                arrayList.add(new Rg.p(map));
            }
        }
        this.f91668b = (l[]) arrayList.toArray(f91666c);
    }

    @Override // com.google.zxing.l
    public void reset() {
        l[] lVarArr = this.f91668b;
        if (lVarArr != null) {
            for (l lVar : lVarArr) {
                lVar.reset();
            }
        }
    }

    @Override // com.google.zxing.l
    public m a(c cVar, Map<d, ?> map) throws NotFoundException {
        e(map);
        return c(cVar);
    }
}
