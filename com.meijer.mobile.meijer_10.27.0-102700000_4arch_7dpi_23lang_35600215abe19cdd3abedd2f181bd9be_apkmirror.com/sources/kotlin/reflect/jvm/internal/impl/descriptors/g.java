package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class g implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final ScopesHolderForClass f143784a;

    public g(ScopesHolderForClass scopesHolderForClass) {
        this.f143784a = scopesHolderForClass;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return ScopesHolderForClass.f(this.f143784a);
    }
}
