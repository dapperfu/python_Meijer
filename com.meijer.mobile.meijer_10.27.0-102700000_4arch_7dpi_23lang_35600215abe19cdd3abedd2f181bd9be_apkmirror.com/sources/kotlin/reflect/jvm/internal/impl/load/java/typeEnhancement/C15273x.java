package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.x, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15273x implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f144729a;

    /* renamed from: b, reason: collision with root package name */
    private final String f144730b;

    public C15273x(String str, String str2) {
        this.f144729a = str;
        this.f144730b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.x(this.f144729a, this.f144730b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
