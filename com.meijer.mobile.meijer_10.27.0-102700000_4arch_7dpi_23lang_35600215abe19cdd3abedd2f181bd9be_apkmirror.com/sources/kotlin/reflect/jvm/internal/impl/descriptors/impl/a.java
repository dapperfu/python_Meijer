package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractTypeAliasDescriptor f144018a;

    public a(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        this.f144018a = abstractTypeAliasDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return AbstractTypeAliasDescriptor.L0(this.f144018a);
    }
}
