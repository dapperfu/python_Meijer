package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* loaded from: classes13.dex */
class E implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f144622a;

    /* renamed from: b, reason: collision with root package name */
    private final String f144623b;

    public E(String str, String str2) {
        this.f144622a = str;
        this.f144623b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.D(this.f144622a, this.f144623b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
