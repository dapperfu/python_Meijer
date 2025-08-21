package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* loaded from: classes14.dex */
class E implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f145529a;

    /* renamed from: b, reason: collision with root package name */
    private final String f145530b;

    public E(String str, String str2) {
        this.f145529a = str;
        this.f145530b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.D(this.f145529a, this.f145530b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
