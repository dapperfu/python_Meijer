package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes13.dex */
class C implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KotlinType f142977a;

    /* renamed from: b, reason: collision with root package name */
    private final KClassImpl.Data f142978b;

    /* renamed from: c, reason: collision with root package name */
    private final KClassImpl f142979c;

    public C(KotlinType kotlinType, KClassImpl.Data data, KClassImpl kClassImpl) {
        this.f142977a = kotlinType;
        this.f142978b = data;
        this.f142979c = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.Y(this.f142977a, this.f142978b, this.f142979c);
    }
}
