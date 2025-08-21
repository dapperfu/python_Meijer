package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.MutableClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class SuspendFunctionTypesKt {

    /* renamed from: a, reason: collision with root package name */
    private static final MutableClassDescriptor f144327a;

    static {
        EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new EmptyPackageFragmentDescriptor(ErrorUtils.f147897a.i(), StandardNames.f144219s);
        ClassKind classKind = ClassKind.f144493c;
        Name nameF = StandardNames.f144222v.f();
        SourceElement sourceElement = SourceElement.f144554a;
        StorageManager storageManager = LockBasedStorageManager.f147540e;
        MutableClassDescriptor mutableClassDescriptor = new MutableClassDescriptor(emptyPackageFragmentDescriptor, classKind, false, false, nameF, sourceElement, storageManager);
        mutableClassDescriptor.J0(Modality.f144529e);
        mutableClassDescriptor.L0(DescriptorVisibilities.f144507e);
        mutableClassDescriptor.K0(CollectionsKt.e(TypeParameterDescriptorImpl.O0(mutableClassDescriptor, Annotations.f144596s3.b(), false, Variance.f147704f, Name.o("T"), 0, storageManager)));
        mutableClassDescriptor.H0();
        f144327a = mutableClassDescriptor;
    }

    public static final SimpleType a(KotlinType suspendFunType) {
        Intrinsics.j(suspendFunType, "suspendFunType");
        FunctionTypesKt.r(suspendFunType);
        KotlinBuiltIns kotlinBuiltInsN = TypeUtilsKt.n(suspendFunType);
        Annotations annotations = suspendFunType.getAnnotations();
        KotlinType kotlinTypeK = FunctionTypesKt.k(suspendFunType);
        List<KotlinType> listE = FunctionTypesKt.e(suspendFunType);
        List<TypeProjection> listM = FunctionTypesKt.m(suspendFunType);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listM, 10));
        Iterator<T> it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        TypeAttributes typeAttributesK = TypeAttributes.f147647b.k();
        TypeConstructor typeConstructorI = f144327a.i();
        Intrinsics.i(typeConstructorI, "getTypeConstructor(...)");
        List listQ0 = CollectionsKt.Q0(arrayList, KotlinTypeFactory.k(typeAttributesK, typeConstructorI, CollectionsKt.e(TypeUtilsKt.d(FunctionTypesKt.l(suspendFunType))), false, null, 16, null));
        SimpleType simpleTypeJ = TypeUtilsKt.n(suspendFunType).J();
        Intrinsics.i(simpleTypeJ, "getNullableAnyType(...)");
        return FunctionTypesKt.b(kotlinBuiltInsN, annotations, kotlinTypeK, listE, listQ0, null, simpleTypeJ, (128 & 128) != 0 ? false : false).R0(suspendFunType.L0());
    }
}
