package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes13.dex */
class c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractTypeAliasDescriptor f144020a;

    public c(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        this.f144020a = abstractTypeAliasDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeAliasDescriptor.K0(this.f144020a, (KotlinTypeRefiner) obj);
    }
}
