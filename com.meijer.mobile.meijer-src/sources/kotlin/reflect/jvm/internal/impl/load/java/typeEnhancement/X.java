package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* loaded from: classes14.dex */
class X implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f145598a;

    public X(String str) {
        this.f145598a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.d(this.f145598a, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
