package fsimpl;

/* renamed from: fsimpl.ea, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14181ea {

    /* renamed from: a, reason: collision with root package name */
    private final dQ[] f133371a;

    /* renamed from: b, reason: collision with root package name */
    private final dQ[] f133372b;

    /* renamed from: c, reason: collision with root package name */
    private final dQ[] f133373c;

    private C14181ea(dQ[] dQVarArr, dQ[] dQVarArr2, dQ[] dQVarArr3) {
        this.f133371a = dQVarArr;
        this.f133372b = dQVarArr2;
        this.f133373c = dQVarArr3;
    }

    public dQ a(C14185ee c14185ee, Object obj, boolean z10) {
        dQ dQVarA = dV.a(c14185ee, obj, a());
        if (dQVarA != null) {
            return dQVarA;
        }
        return dV.a(c14185ee, obj, z10 ? this.f133372b : this.f133373c);
    }

    public dQ[] a() {
        return this.f133371a;
    }

    public dQ[] b() {
        return this.f133372b;
    }

    public dQ[] c() {
        return this.f133373c;
    }
}
