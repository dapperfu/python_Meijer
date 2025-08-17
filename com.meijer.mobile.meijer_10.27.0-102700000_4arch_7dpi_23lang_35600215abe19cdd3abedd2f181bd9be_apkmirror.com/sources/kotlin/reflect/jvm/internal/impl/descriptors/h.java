package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes13.dex */
class h implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final ScopesHolderForClass f143785a;

    /* renamed from: b, reason: collision with root package name */
    private final KotlinTypeRefiner f143786b;

    public h(ScopesHolderForClass scopesHolderForClass, KotlinTypeRefiner kotlinTypeRefiner) {
        this.f143785a = scopesHolderForClass;
        this.f143786b = kotlinTypeRefiner;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return ScopesHolderForClass.d(this.f143785a, this.f143786b);
    }
}
