package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;

/* loaded from: classes13.dex */
class S implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KDeclarationContainerImpl f143139a;

    public S(KDeclarationContainerImpl kDeclarationContainerImpl) {
        this.f143139a = kDeclarationContainerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KDeclarationContainerImpl.Data.c(this.f143139a);
    }
}
