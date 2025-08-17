package Pg;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* loaded from: classes7.dex */
public final class t extends y {

    /* renamed from: i, reason: collision with root package name */
    private final y f25400i = new i();

    @Override // Pg.r, com.google.zxing.l
    public com.google.zxing.m a(com.google.zxing.c cVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, FormatException {
        return s(this.f25400i.a(cVar, map));
    }

    @Override // Pg.r, com.google.zxing.l
    public com.google.zxing.m b(com.google.zxing.c cVar) throws NotFoundException, FormatException {
        return s(this.f25400i.b(cVar));
    }

    @Override // Pg.y, Pg.r
    public com.google.zxing.m c(int i10, Gg.a aVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return s(this.f25400i.c(i10, aVar, map));
    }

    @Override // Pg.y
    protected int l(Gg.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException {
        return this.f25400i.l(aVar, iArr, sb2);
    }

    @Override // Pg.y
    public com.google.zxing.m m(int i10, Gg.a aVar, int[] iArr, Map<com.google.zxing.d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return s(this.f25400i.m(i10, aVar, iArr, map));
    }

    @Override // Pg.y
    com.google.zxing.a q() {
        return com.google.zxing.a.UPC_A;
    }

    private static com.google.zxing.m s(com.google.zxing.m mVar) throws FormatException {
        String strF = mVar.f();
        if (strF.charAt(0) == '0') {
            com.google.zxing.m mVar2 = new com.google.zxing.m(strF.substring(1), null, mVar.e(), com.google.zxing.a.UPC_A);
            if (mVar.d() != null) {
                mVar2.g(mVar.d());
            }
            return mVar2;
        }
        throw FormatException.a();
    }
}
