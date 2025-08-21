package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.m, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15366m implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f145624a;

    public C15366m(String str) {
        this.f145624a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.m(this.f145624a, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
