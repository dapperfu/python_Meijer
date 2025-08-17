package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.q, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15267q implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final SignatureBuildingComponents f144721a;

    public C15267q(SignatureBuildingComponents signatureBuildingComponents) {
        this.f144721a = signatureBuildingComponents;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PredefinedEnhancementInfoKt.q(this.f144721a, (SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
    }
}
