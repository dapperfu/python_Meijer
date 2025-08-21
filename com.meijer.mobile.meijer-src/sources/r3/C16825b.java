package r3;

import U3.j;
import U3.k;
import U3.r;

/* renamed from: r3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C16825b extends j {

    /* renamed from: p, reason: collision with root package name */
    private final r f159191p;

    @Override // U3.j
    protected k B(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f159191p.reset();
        }
        return this.f159191p.b(bArr, 0, i10);
    }

    public C16825b(String str, r rVar) {
        super(str);
        this.f159191p = rVar;
    }
}
