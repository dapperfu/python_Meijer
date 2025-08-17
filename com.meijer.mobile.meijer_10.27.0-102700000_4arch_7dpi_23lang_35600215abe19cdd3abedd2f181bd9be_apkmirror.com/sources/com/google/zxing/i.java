package com.google.zxing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes7.dex */
public final class i implements l {

    /* renamed from: c, reason: collision with root package name */
    private static final l[] f90827c = new l[0];

    /* renamed from: a, reason: collision with root package name */
    private Map<d, ?> f90828a;

    /* renamed from: b, reason: collision with root package name */
    private l[] f90829b;

    @Override // com.google.zxing.l
    public m b(c cVar) throws NotFoundException {
        e(null);
        return c(cVar);
    }

    private m c(c cVar) throws NotFoundException {
        l[] lVarArr = this.f90829b;
        if (lVarArr != null) {
            for (l lVar : lVarArr) {
                if (Thread.currentThread().isInterrupted()) {
                    throw NotFoundException.a();
                }
                try {
                    return lVar.a(cVar, this.f90828a);
                } catch (ReaderException unused) {
                }
            }
            Map<d, ?> map = this.f90828a;
            if (map != null && map.containsKey(d.ALSO_INVERTED)) {
                cVar.a().d();
                for (l lVar2 : this.f90829b) {
                    if (Thread.currentThread().isInterrupted()) {
                        throw NotFoundException.a();
                    }
                    try {
                        return lVar2.a(cVar, this.f90828a);
                    } catch (ReaderException unused2) {
                    }
                }
            }
        }
        throw NotFoundException.a();
    }

    public m d(c cVar) throws NotFoundException {
        if (this.f90829b == null) {
            e(null);
        }
        return c(cVar);
    }

    public void e(Map<d, ?> map) {
        this.f90828a = map;
        boolean z10 = map != null && map.containsKey(d.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(d.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            boolean z11 = collection.contains(a.UPC_A) || collection.contains(a.UPC_E) || collection.contains(a.EAN_13) || collection.contains(a.EAN_8) || collection.contains(a.CODABAR) || collection.contains(a.CODE_39) || collection.contains(a.CODE_93) || collection.contains(a.CODE_128) || collection.contains(a.ITF) || collection.contains(a.RSS_14) || collection.contains(a.RSS_EXPANDED);
            if (z11 && !z10) {
                arrayList.add(new Pg.p(map));
            }
            if (collection.contains(a.QR_CODE)) {
                arrayList.add(new Yg.a());
            }
            if (collection.contains(a.DATA_MATRIX)) {
                arrayList.add(new Jg.a());
            }
            if (collection.contains(a.AZTEC)) {
                arrayList.add(new Ag.b());
            }
            if (collection.contains(a.PDF_417)) {
                arrayList.add(new Tg.b());
            }
            if (collection.contains(a.MAXICODE)) {
                arrayList.add(new Ng.a());
            }
            if (z11 && z10) {
                arrayList.add(new Pg.p(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z10) {
                arrayList.add(new Pg.p(map));
            }
            arrayList.add(new Yg.a());
            arrayList.add(new Jg.a());
            arrayList.add(new Ag.b());
            arrayList.add(new Tg.b());
            arrayList.add(new Ng.a());
            if (z10) {
                arrayList.add(new Pg.p(map));
            }
        }
        this.f90829b = (l[]) arrayList.toArray(f90827c);
    }

    @Override // com.google.zxing.l
    public void reset() {
        l[] lVarArr = this.f90829b;
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
