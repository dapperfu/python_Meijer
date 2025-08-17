package fsimpl;

/* renamed from: fsimpl.fl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14094fl extends AbstractC14091fi {

    /* renamed from: a, reason: collision with root package name */
    private final byte f132262a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f132263b;

    public C14094fl(byte b10, String[] strArr) {
        this.f132262a = b10;
        this.f132263b = strArr;
    }

    @Override // fsimpl.InterfaceC14090fh
    public void a(gh ghVar, fH fHVar) {
        String[] strArr = this.f132263b;
        int iA = 0;
        int length = strArr != null ? strArr.length : 0;
        if (length > 0) {
            int[] iArr = new int[length];
            while (iA < length) {
                iArr[iA] = ghVar.a(this.f132263b[iA]);
                iA++;
            }
            iA = cS.a(ghVar, iArr);
        }
        fHVar.a(a(ghVar, (byte) 25, cS.a(ghVar, this.f132262a, iA)));
    }
}
