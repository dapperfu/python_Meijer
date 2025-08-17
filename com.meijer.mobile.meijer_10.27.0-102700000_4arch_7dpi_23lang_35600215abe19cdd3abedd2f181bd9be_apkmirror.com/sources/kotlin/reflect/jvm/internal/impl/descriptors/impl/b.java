package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* loaded from: classes13.dex */
class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractTypeAliasDescriptor f144019a;

    public b(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        this.f144019a = abstractTypeAliasDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeAliasDescriptor.Q0(this.f144019a, (UnwrappedType) obj);
    }
}
