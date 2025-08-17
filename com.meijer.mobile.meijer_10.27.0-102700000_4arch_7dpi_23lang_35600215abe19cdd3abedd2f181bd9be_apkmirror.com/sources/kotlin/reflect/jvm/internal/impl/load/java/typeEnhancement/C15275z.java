package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.z, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15275z implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f144733a;

    /* renamed from: b, reason: collision with root package name */
    private final String f144734b;

    public C15275z(String str, String str2) {
        this.f144733a = str;
        this.f144734b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.z(this.f144733a, this.f144734b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
