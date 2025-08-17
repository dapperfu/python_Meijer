package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15253c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractSignatureParts f144700a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeSystemContext f144701b;

    public C15253c(AbstractSignatureParts abstractSignatureParts, TypeSystemContext typeSystemContext) {
        this.f144700a = abstractSignatureParts;
        this.f144701b = typeSystemContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractSignatureParts.I(this.f144700a, this.f144701b, (AbstractSignatureParts.a) obj);
    }
}
