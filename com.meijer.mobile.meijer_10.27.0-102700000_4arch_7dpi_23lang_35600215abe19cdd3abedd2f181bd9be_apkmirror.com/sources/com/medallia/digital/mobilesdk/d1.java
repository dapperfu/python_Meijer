package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes7.dex */
class d1 extends z1<CustomParameter> {

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<String, CustomParameter> f91753f;

    protected d1(n0 n0Var) {
        super(n0Var);
        this.f91753f = new HashMap<>();
    }

    protected void a(CustomParameter customParameter) {
        this.f91753f.put(customParameter.b(), customParameter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.m0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(CustomParameter customParameter) {
        super.a((d1) customParameter);
        a4.b(String.format(Locale.US, "Collectors > set custom params: %s", customParameter.toString()));
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f92911E;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected ValueType g() {
        return f().c() == null ? ValueType.TypeString : f().c() instanceof Integer ? ValueType.TypeInteger : f().c() instanceof Double ? ValueType.TypeDouble : f().c() instanceof Long ? ValueType.TypeLong : f().c() instanceof Boolean ? ValueType.TypeBoolean : f().c() instanceof Float ? ValueType.TypeDouble : ValueType.TypeString;
    }

    protected void j() {
        this.f91753f.clear();
    }

    protected HashMap<String, CustomParameter> k() {
        return this.f91753f;
    }
}
