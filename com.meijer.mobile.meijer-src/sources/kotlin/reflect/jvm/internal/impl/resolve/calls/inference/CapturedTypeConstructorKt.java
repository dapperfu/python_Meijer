package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.Variance;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class CapturedTypeConstructorKt {
    public static /* synthetic */ TypeSubstitution h(TypeSubstitution typeSubstitution, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return g(typeSubstitution, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeProjection c(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor == null || typeProjection.c() == Variance.f147703e) {
            return typeProjection;
        }
        if (typeParameterDescriptor.k() != typeProjection.c()) {
            return new TypeProjectionImpl(e(typeProjection));
        }
        if (!typeProjection.a()) {
            return new TypeProjectionImpl(typeProjection.getType());
        }
        StorageManager NO_LOCKS = LockBasedStorageManager.f147540e;
        Intrinsics.i(NO_LOCKS, "NO_LOCKS");
        return new TypeProjectionImpl(new LazyWrappedType(NO_LOCKS, new a(typeProjection)));
    }

    public static final KotlinType e(TypeProjection typeProjection) {
        Intrinsics.j(typeProjection, "typeProjection");
        return new CapturedType(typeProjection, null, false, null, 14, null);
    }

    public static final boolean f(KotlinType kotlinType) {
        Intrinsics.j(kotlinType, "<this>");
        return kotlinType.K0() instanceof CapturedTypeConstructor;
    }

    public static final TypeSubstitution g(final TypeSubstitution typeSubstitution, final boolean z10) {
        Intrinsics.j(typeSubstitution, "<this>");
        if (!(typeSubstitution instanceof IndexedParametersSubstitution)) {
            return new DelegatedTypeSubstitution(typeSubstitution) { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt$wrapWithCapturingSubstitution$2
                @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean b() {
                    return z10;
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public TypeProjection e(KotlinType key) {
                    Intrinsics.j(key, "key");
                    TypeProjection typeProjectionE = super.e(key);
                    if (typeProjectionE == null) {
                        return null;
                    }
                    ClassifierDescriptor classifierDescriptorD = key.K0().d();
                    return CapturedTypeConstructorKt.c(typeProjectionE, classifierDescriptorD instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorD : null);
                }
            };
        }
        IndexedParametersSubstitution indexedParametersSubstitution = (IndexedParametersSubstitution) typeSubstitution;
        TypeParameterDescriptor[] typeParameterDescriptorArrJ = indexedParametersSubstitution.j();
        List<Pair> listX1 = ArraysKt.x1(indexedParametersSubstitution.i(), indexedParametersSubstitution.j());
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listX1, 10));
        for (Pair pair : listX1) {
            arrayList.add(c((TypeProjection) pair.c(), (TypeParameterDescriptor) pair.d()));
        }
        return new IndexedParametersSubstitution(typeParameterDescriptorArrJ, (TypeProjection[]) arrayList.toArray(new TypeProjection[0]), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType d(TypeProjection typeProjection) {
        KotlinType type = typeProjection.getType();
        Intrinsics.i(type, "getType(...)");
        return type;
    }
}
