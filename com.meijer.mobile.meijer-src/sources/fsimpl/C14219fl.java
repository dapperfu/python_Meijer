package fsimpl;

/* renamed from: fsimpl.fl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14219fl extends AbstractC14216fi {

    /* renamed from: a, reason: collision with root package name */
    private final byte f133512a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f133513b;

    public C14219fl(byte b10, String[] strArr) {
        this.f133512a = b10;
        this.f133513b = strArr;
    }

    @Override // fsimpl.InterfaceC14215fh
    public void a(gh ghVar, fH fHVar) {
        String[] strArr = this.f133513b;
        int iA = 0;
        int length = strArr != null ? strArr.length : 0;
        if (length > 0) {
            int[] iArr = new int[length];
            while (iA < length) {
                iArr[iA] = ghVar.a(this.f133513b[iA]);
                iA++;
            }
            iA = cS.a(ghVar, iArr);
        }
        fHVar.a(a(ghVar, (byte) 25, cS.a(ghVar, this.f133512a, iA)));
    }
}
