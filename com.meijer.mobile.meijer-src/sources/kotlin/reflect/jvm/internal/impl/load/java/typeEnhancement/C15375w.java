package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15375w implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f145634a;

    /* renamed from: b, reason: collision with root package name */
    private final String f145635b;

    public C15375w(String str, String str2) {
        this.f145634a = str;
        this.f145635b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.w(this.f145634a, this.f145635b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
