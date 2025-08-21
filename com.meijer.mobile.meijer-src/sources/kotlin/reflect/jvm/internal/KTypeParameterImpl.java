package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeParameterReference;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.Variance;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR!\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010'R\u0014\u0010)\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001bR\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "Lkotlin/reflect/KTypeParameter;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "Lkotlin/reflect/jvm/internal/KClassImpl;", "e", "(Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;)Lkotlin/reflect/jvm/internal/KClassImpl;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/DeserializedMemberDescriptor;", "Ljava/lang/Class;", "c", "(Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/DeserializedMemberDescriptor;)Ljava/lang/Class;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "", "Lkotlin/reflect/KType;", "b", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getUpperBounds", "()Ljava/util/List;", "upperBounds", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "getName", "name", "Lkotlin/reflect/KVariance;", "k", "()Lkotlin/reflect/KVariance;", "variance", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class KTypeParameterImpl implements KTypeParameter, KClassifierImpl {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f144027d = {Reflection.j(new PropertyReference1Impl(KTypeParameterImpl.class, "upperBounds", "getUpperBounds()Ljava/util/List;", 0))};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TypeParameterDescriptor descriptor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ReflectProperties.LazySoftVal upperBounds;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final KTypeParameterOwnerImpl container;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.f147703e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.f147704f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.f147705g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KTypeParameterImpl(KTypeParameterOwnerImpl kTypeParameterOwnerImpl, TypeParameterDescriptor descriptor) {
        KClassImpl<?> kClassImplE;
        Object objX;
        Intrinsics.j(descriptor, "descriptor");
        this.descriptor = descriptor;
        this.upperBounds = ReflectProperties.c(new x0(this));
        if (kTypeParameterOwnerImpl == null) {
            DeclarationDescriptor declarationDescriptorB = a().b();
            Intrinsics.i(declarationDescriptorB, "getContainingDeclaration(...)");
            if (declarationDescriptorB instanceof ClassDescriptor) {
                objX = e((ClassDescriptor) declarationDescriptorB);
            } else {
                if (!(declarationDescriptorB instanceof CallableMemberDescriptor)) {
                    throw new KotlinReflectionInternalError("Unknown type parameter container: " + declarationDescriptorB);
                }
                DeclarationDescriptor declarationDescriptorB2 = ((CallableMemberDescriptor) declarationDescriptorB).b();
                Intrinsics.i(declarationDescriptorB2, "getContainingDeclaration(...)");
                if (declarationDescriptorB2 instanceof ClassDescriptor) {
                    kClassImplE = e((ClassDescriptor) declarationDescriptorB2);
                } else {
                    DeserializedMemberDescriptor deserializedMemberDescriptor = declarationDescriptorB instanceof DeserializedMemberDescriptor ? (DeserializedMemberDescriptor) declarationDescriptorB : null;
                    if (deserializedMemberDescriptor == null) {
                        throw new KotlinReflectionInternalError("Non-class callable descriptor must be deserialized: " + declarationDescriptorB);
                    }
                    KClass kClassE = JvmClassMappingKt.e(c(deserializedMemberDescriptor));
                    Intrinsics.h(kClassE, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    kClassImplE = (KClassImpl) kClassE;
                }
                objX = declarationDescriptorB.x(new CreateKCallableVisitor(kClassImplE), Unit.f143329a);
            }
            kTypeParameterOwnerImpl = (KTypeParameterOwnerImpl) objX;
        }
        this.container = kTypeParameterOwnerImpl;
    }

    @Override // kotlin.reflect.jvm.internal.KClassifierImpl
    /* renamed from: d, reason: from getter and merged with bridge method [inline-methods] */
    public TypeParameterDescriptor a() {
        return this.descriptor;
    }

    public boolean equals(Object other) {
        if (!(other instanceof KTypeParameterImpl)) {
            return false;
        }
        KTypeParameterImpl kTypeParameterImpl = (KTypeParameterImpl) other;
        return Intrinsics.e(this.container, kTypeParameterImpl.container) && Intrinsics.e(getName(), kTypeParameterImpl.getName());
    }

    @Override // kotlin.reflect.KTypeParameter
    public List<KType> getUpperBounds() {
        T tB = this.upperBounds.b(this, f144027d[0]);
        Intrinsics.i(tB, "getValue(...)");
        return (List) tB;
    }

    public int hashCode() {
        return (this.container.hashCode() * 31) + getName().hashCode();
    }

    public String toString() {
        return TypeParameterReference.INSTANCE.a(this);
    }

    private final Class<?> c(DeserializedMemberDescriptor deserializedMemberDescriptor) {
        JvmPackagePartSource jvmPackagePartSource;
        Object objG;
        Class<?> clsD;
        DeserializedContainerSource deserializedContainerSourceH = deserializedMemberDescriptor.H();
        ReflectKotlinClass reflectKotlinClass = null;
        if (deserializedContainerSourceH instanceof JvmPackagePartSource) {
            jvmPackagePartSource = (JvmPackagePartSource) deserializedContainerSourceH;
        } else {
            jvmPackagePartSource = null;
        }
        if (jvmPackagePartSource != null) {
            objG = jvmPackagePartSource.g();
        } else {
            objG = null;
        }
        if (objG instanceof ReflectKotlinClass) {
            reflectKotlinClass = (ReflectKotlinClass) objG;
        }
        if (reflectKotlinClass != null && (clsD = reflectKotlinClass.d()) != null) {
            return clsD;
        }
        throw new KotlinReflectionInternalError("Container of deserialized member is not resolved: " + deserializedMemberDescriptor);
    }

    private final KClassImpl<?> e(ClassDescriptor classDescriptor) {
        KClass kClassE;
        Class<?> clsQ = UtilKt.q(classDescriptor);
        if (clsQ != null) {
            kClassE = JvmClassMappingKt.e(clsQ);
        } else {
            kClassE = null;
        }
        KClassImpl<?> kClassImpl = (KClassImpl) kClassE;
        if (kClassImpl != null) {
            return kClassImpl;
        }
        throw new KotlinReflectionInternalError("Type parameter container is not resolved: " + classDescriptor.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(KTypeParameterImpl kTypeParameterImpl) {
        List<KotlinType> upperBounds = kTypeParameterImpl.a().getUpperBounds();
        Intrinsics.i(upperBounds, "getUpperBounds(...)");
        List<KotlinType> list = upperBounds;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new KTypeImpl((KotlinType) it.next(), null, 2, null));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.KTypeParameter
    public String getName() {
        String strB = a().getName().b();
        Intrinsics.i(strB, "asString(...)");
        return strB;
    }

    @Override // kotlin.reflect.KTypeParameter
    /* renamed from: k */
    public KVariance getVariance() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[a().k().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return KVariance.f143860c;
                }
                throw new NoWhenBranchMatchedException();
            }
            return KVariance.f143859b;
        }
        return KVariance.f143858a;
    }
}
