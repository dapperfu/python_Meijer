package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* loaded from: classes14.dex */
class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractTypeAliasDescriptor f144926a;

    public b(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        this.f144926a = abstractTypeAliasDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeAliasDescriptor.Q0(this.f144926a, (UnwrappedType) obj);
    }
}
