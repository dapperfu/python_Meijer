package Rg;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* loaded from: classes8.dex */
public final class t extends y {

    /* renamed from: i, reason: collision with root package name */
    private final y f32614i = new i();

    @Override // Rg.r, com.google.zxing.l
    public com.google.zxing.m a(com.google.zxing.c cVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, FormatException {
        return s(this.f32614i.a(cVar, map));
    }

    @Override // Rg.r, com.google.zxing.l
    public com.google.zxing.m b(com.google.zxing.c cVar) throws NotFoundException, FormatException {
        return s(this.f32614i.b(cVar));
    }

    @Override // Rg.y, Rg.r
    public com.google.zxing.m c(int i10, Ig.a aVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return s(this.f32614i.c(i10, aVar, map));
    }

    @Override // Rg.y
    protected int l(Ig.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException {
        return this.f32614i.l(aVar, iArr, sb2);
    }

    @Override // Rg.y
    public com.google.zxing.m m(int i10, Ig.a aVar, int[] iArr, Map<com.google.zxing.d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return s(this.f32614i.m(i10, aVar, iArr, map));
    }

    @Override // Rg.y
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
