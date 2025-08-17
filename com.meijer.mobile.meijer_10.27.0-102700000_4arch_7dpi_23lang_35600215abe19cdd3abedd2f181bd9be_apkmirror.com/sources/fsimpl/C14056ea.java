package fsimpl;

/* renamed from: fsimpl.ea, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14056ea {

    /* renamed from: a, reason: collision with root package name */
    private final dQ[] f132121a;

    /* renamed from: b, reason: collision with root package name */
    private final dQ[] f132122b;

    /* renamed from: c, reason: collision with root package name */
    private final dQ[] f132123c;

    private C14056ea(dQ[] dQVarArr, dQ[] dQVarArr2, dQ[] dQVarArr3) {
        this.f132121a = dQVarArr;
        this.f132122b = dQVarArr2;
        this.f132123c = dQVarArr3;
    }

    public dQ a(C14060ee c14060ee, Object obj, boolean z10) {
        dQ dQVarA = dV.a(c14060ee, obj, a());
        if (dQVarA != null) {
            return dQVarA;
        }
        return dV.a(c14060ee, obj, z10 ? this.f132122b : this.f132123c);
    }

    public dQ[] a() {
        return this.f132121a;
    }

    public dQ[] b() {
        return this.f132122b;
    }

    public dQ[] c() {
        return this.f132123c;
    }
}
