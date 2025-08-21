package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class UtilKt {
    public static final List<ValueParameterDescriptor> a(Collection<? extends KotlinType> newValueParameterTypes, Collection<? extends ValueParameterDescriptor> oldValueParameters, CallableDescriptor callableDescriptor) {
        Intrinsics.j(newValueParameterTypes, "newValueParameterTypes");
        Intrinsics.j(oldValueParameters, "oldValueParameters");
        CallableDescriptor newOwner = callableDescriptor;
        Intrinsics.j(newOwner, "newOwner");
        newValueParameterTypes.size();
        oldValueParameters.size();
        List<Pair> listU1 = CollectionsKt.u1(newValueParameterTypes, oldValueParameters);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listU1, 10));
        for (Pair pair : listU1) {
            KotlinType kotlinType = (KotlinType) pair.a();
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) pair.b();
            int index = valueParameterDescriptor.getIndex();
            Annotations annotations = valueParameterDescriptor.getAnnotations();
            Name name = valueParameterDescriptor.getName();
            Intrinsics.i(name, "getName(...)");
            boolean zX0 = valueParameterDescriptor.x0();
            boolean zO0 = valueParameterDescriptor.o0();
            boolean zM0 = valueParameterDescriptor.m0();
            KotlinType kotlinTypeK = valueParameterDescriptor.s0() != null ? DescriptorUtilsKt.s(newOwner).l().k(kotlinType) : null;
            SourceElement sourceElementG = valueParameterDescriptor.g();
            Intrinsics.i(sourceElementG, "getSource(...)");
            arrayList.add(new ValueParameterDescriptorImpl(newOwner, null, index, annotations, name, kotlinType, zX0, zO0, zM0, kotlinTypeK, sourceElementG));
            newOwner = callableDescriptor;
        }
        return arrayList;
    }

    public static final LazyJavaStaticClassScope b(ClassDescriptor classDescriptor) {
        Intrinsics.j(classDescriptor, "<this>");
        ClassDescriptor classDescriptorX = DescriptorUtilsKt.x(classDescriptor);
        if (classDescriptorX == null) {
            return null;
        }
        MemberScope memberScopeJ0 = classDescriptorX.j0();
        LazyJavaStaticClassScope lazyJavaStaticClassScope = memberScopeJ0 instanceof LazyJavaStaticClassScope ? (LazyJavaStaticClassScope) memberScopeJ0 : null;
        return lazyJavaStaticClassScope == null ? b(classDescriptorX) : lazyJavaStaticClassScope;
    }
}
