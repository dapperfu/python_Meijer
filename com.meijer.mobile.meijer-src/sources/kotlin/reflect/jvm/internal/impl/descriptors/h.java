package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes14.dex */
class h implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final ScopesHolderForClass f144692a;

    /* renamed from: b, reason: collision with root package name */
    private final KotlinTypeRefiner f144693b;

    public h(ScopesHolderForClass scopesHolderForClass, KotlinTypeRefiner kotlinTypeRefiner) {
        this.f144692a = scopesHolderForClass;
        this.f144693b = kotlinTypeRefiner;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return ScopesHolderForClass.d(this.f144692a, this.f144693b);
    }
}
