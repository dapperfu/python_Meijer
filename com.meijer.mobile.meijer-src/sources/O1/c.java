package O1;

import O1.e;
import Q1.i;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class c extends a implements P1.e {

    /* renamed from: j0, reason: collision with root package name */
    protected final e f23015j0;

    /* renamed from: k0, reason: collision with root package name */
    final e.EnumC0378e f23016k0;

    /* renamed from: l0, reason: collision with root package name */
    protected ArrayList<Object> f23017l0;

    /* renamed from: m0, reason: collision with root package name */
    private i f23018m0;

    @Override // O1.a, O1.d
    public void apply() {
    }

    public c Z(Object... objArr) {
        Collections.addAll(this.f23017l0, objArr);
        return this;
    }

    public i a0() {
        return this.f23018m0;
    }

    public c(e eVar, e.EnumC0378e enumC0378e) {
        super(eVar);
        this.f23017l0 = new ArrayList<>();
        this.f23015j0 = eVar;
        this.f23016k0 = enumC0378e;
    }

    @Override // O1.a, O1.d
    public Q1.e a() {
        return a0();
    }
}
