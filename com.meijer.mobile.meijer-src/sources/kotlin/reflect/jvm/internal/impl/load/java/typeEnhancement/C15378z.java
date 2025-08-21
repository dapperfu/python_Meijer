package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.z, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15378z implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f145640a;

    /* renamed from: b, reason: collision with root package name */
    private final String f145641b;

    public C15378z(String str, String str2) {
        this.f145640a = str;
        this.f145641b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.z(this.f145640a, this.f145641b, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
