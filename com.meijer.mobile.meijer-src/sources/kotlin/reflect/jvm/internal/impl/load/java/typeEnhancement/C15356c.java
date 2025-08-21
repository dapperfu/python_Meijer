package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15356c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractSignatureParts f145607a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeSystemContext f145608b;

    public C15356c(AbstractSignatureParts abstractSignatureParts, TypeSystemContext typeSystemContext) {
        this.f145607a = abstractSignatureParts;
        this.f145608b = typeSystemContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractSignatureParts.I(this.f145607a, this.f145608b, (AbstractSignatureParts.a) obj);
    }
}
