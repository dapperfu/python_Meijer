package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes14.dex */
class C implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KotlinType f143884a;

    /* renamed from: b, reason: collision with root package name */
    private final KClassImpl.Data f143885b;

    /* renamed from: c, reason: collision with root package name */
    private final KClassImpl f143886c;

    public C(KotlinType kotlinType, KClassImpl.Data data, KClassImpl kClassImpl) {
        this.f143884a = kotlinType;
        this.f143885b = data;
        this.f143886c = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.Y(this.f143884a, this.f143885b, this.f143886c);
    }
}
