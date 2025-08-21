package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* loaded from: classes14.dex */
class F implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f145531a;

    /* renamed from: b, reason: collision with root package name */
    private final String f145532b;

    public F(String str, String str2) {
        this.f145531a = str;
        this.f145532b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.E(this.f145531a, this.f145532b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
