package V1;

import java.util.Arrays;

/* loaded from: classes.dex */
public class j extends e implements i {

    /* renamed from: w0, reason: collision with root package name */
    public e[] f39611w0 = new e[4];

    /* renamed from: x0, reason: collision with root package name */
    public int f39612x0 = 0;

    @Override // V1.i
    public void a(f fVar) {
    }

    @Override // V1.i
    public void c() {
        this.f39612x0 = 0;
        Arrays.fill(this.f39611w0, (Object) null);
    }

    @Override // V1.i
    public void b(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i10 = this.f39612x0 + 1;
        e[] eVarArr = this.f39611w0;
        if (i10 > eVarArr.length) {
            this.f39611w0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f39611w0;
        int i11 = this.f39612x0;
        eVarArr2[i11] = eVar;
        this.f39612x0 = i11 + 1;
    }
}
