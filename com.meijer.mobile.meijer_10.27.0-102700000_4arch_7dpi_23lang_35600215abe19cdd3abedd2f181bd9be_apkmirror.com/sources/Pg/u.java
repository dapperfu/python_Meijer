package Pg;

import java.util.Map;

/* loaded from: classes7.dex */
public final class u implements com.google.zxing.q {

    /* renamed from: a, reason: collision with root package name */
    private final j f25401a = new j();

    @Override // com.google.zxing.q
    public Gg.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<com.google.zxing.f, ?> map) {
        if (aVar != com.google.zxing.a.UPC_A) {
            throw new IllegalArgumentException("Can only encode UPC-A, but got " + aVar);
        }
        return this.f25401a.a('0' + str, com.google.zxing.a.EAN_13, i10, i11, map);
    }
}
