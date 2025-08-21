package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;

/* loaded from: classes14.dex */
class N implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final N f144035a = new N();

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(KDeclarationContainerImpl.C((DescriptorVisibility) obj, (DescriptorVisibility) obj2));
    }
}
