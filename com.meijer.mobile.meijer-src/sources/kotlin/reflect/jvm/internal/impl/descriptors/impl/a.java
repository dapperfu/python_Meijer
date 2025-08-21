package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractTypeAliasDescriptor f144925a;

    public a(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        this.f144925a = abstractTypeAliasDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return AbstractTypeAliasDescriptor.L0(this.f144925a);
    }
}
