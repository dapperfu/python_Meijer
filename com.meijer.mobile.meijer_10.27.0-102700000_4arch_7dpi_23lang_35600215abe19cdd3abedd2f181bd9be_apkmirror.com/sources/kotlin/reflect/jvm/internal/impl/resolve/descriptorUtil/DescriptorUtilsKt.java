package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeRefinementSupport;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class DescriptorUtilsKt {

    /* renamed from: a, reason: collision with root package name */
    private static final Name f146210a;

    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<ValueParameterDescriptor, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f146211b = new a();

        a() {
            super(1, ValueParameterDescriptor.class, "declaresDefaultValue", "declaresDefaultValue()Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(ValueParameterDescriptor p02) {
            Intrinsics.j(p02, "p0");
            return Boolean.valueOf(p02.x0());
        }
    }

    public static final ClassId n(ClassifierDescriptor classifierDescriptor) {
        DeclarationDescriptor declarationDescriptorB;
        ClassId classIdN;
        if (classifierDescriptor != null && (declarationDescriptorB = classifierDescriptor.b()) != null) {
            if (declarationDescriptorB instanceof PackageFragmentDescriptor) {
                FqName fqNameE = ((PackageFragmentDescriptor) declarationDescriptorB).e();
                Name name = classifierDescriptor.getName();
                Intrinsics.i(name, "getName(...)");
                return new ClassId(fqNameE, name);
            }
            if ((declarationDescriptorB instanceof ClassifierDescriptorWithTypeParameters) && (classIdN = n((ClassifierDescriptor) declarationDescriptorB)) != null) {
                Name name2 = classifierDescriptor.getName();
                Intrinsics.i(name2, "getName(...)");
                return classIdN.d(name2);
            }
        }
        return null;
    }

    public static final InlineClassRepresentation<SimpleType> q(ClassDescriptor classDescriptor) {
        ValueClassRepresentation<SimpleType> valueClassRepresentationS = classDescriptor != null ? classDescriptor.S() : null;
        if (valueClassRepresentationS instanceof InlineClassRepresentation) {
            return (InlineClassRepresentation) valueClassRepresentationS;
        }
        return null;
    }

    public static final MultiFieldValueClassRepresentation<SimpleType> t(ClassDescriptor classDescriptor) {
        ValueClassRepresentation<SimpleType> valueClassRepresentationS = classDescriptor != null ? classDescriptor.S() : null;
        if (valueClassRepresentationS instanceof MultiFieldValueClassRepresentation) {
            return (MultiFieldValueClassRepresentation) valueClassRepresentationS;
        }
        return null;
    }

    static {
        Name nameO = Name.o("value");
        Intrinsics.i(nameO, "identifier(...)");
        f146210a = nameO;
    }

    public static final ClassDescriptor B(ModuleDescriptor moduleDescriptor, FqName topLevelClassFqName, LookupLocation location) {
        Intrinsics.j(moduleDescriptor, "<this>");
        Intrinsics.j(topLevelClassFqName, "topLevelClassFqName");
        Intrinsics.j(location, "location");
        topLevelClassFqName.c();
        ClassifierDescriptor classifierDescriptorF = moduleDescriptor.i0(topLevelClassFqName.d()).n().f(topLevelClassFqName.f(), location);
        if (classifierDescriptorF instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorF;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeclarationDescriptor a(DeclarationDescriptor it) {
        Intrinsics.j(it, "it");
        return it.b();
    }

    public static final boolean f(ValueParameterDescriptor valueParameterDescriptor) {
        Intrinsics.j(valueParameterDescriptor, "<this>");
        Boolean boolE = DFS.e(CollectionsKt.e(valueParameterDescriptor), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.f146214a, a.f146211b);
        Intrinsics.i(boolE, "ifAny(...)");
        return boolE.booleanValue();
    }

    public static final CallableMemberDescriptor h(CallableMemberDescriptor callableMemberDescriptor, boolean z10, final Function1<? super CallableMemberDescriptor, Boolean> predicate) {
        Intrinsics.j(callableMemberDescriptor, "<this>");
        Intrinsics.j(predicate, "predicate");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        return (CallableMemberDescriptor) DFS.b(CollectionsKt.e(callableMemberDescriptor), new c(z10), new DFS.AbstractNodeHandler<CallableMemberDescriptor, CallableMemberDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$firstOverridden$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(CallableMemberDescriptor current) {
                Intrinsics.j(current, "current");
                if (objectRef.f142835a == null && predicate.invoke(current).booleanValue()) {
                    objectRef.f142835a = current;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public boolean c(CallableMemberDescriptor current) {
                Intrinsics.j(current, "current");
                return objectRef.f142835a == null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public CallableMemberDescriptor a() {
                return objectRef.f142835a;
            }
        });
    }

    public static /* synthetic */ CallableMemberDescriptor i(CallableMemberDescriptor callableMemberDescriptor, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(callableMemberDescriptor, z10, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable j(boolean z10, CallableMemberDescriptor callableMemberDescriptor) {
        Collection<? extends CallableMemberDescriptor> collectionD;
        if (z10) {
            callableMemberDescriptor = callableMemberDescriptor != null ? callableMemberDescriptor.a() : null;
        }
        return (callableMemberDescriptor == null || (collectionD = callableMemberDescriptor.d()) == null) ? CollectionsKt.m() : collectionD;
    }

    public static final FqName k(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.j(declarationDescriptor, "<this>");
        FqNameUnsafe fqNameUnsafeP = p(declarationDescriptor);
        if (!fqNameUnsafeP.f()) {
            fqNameUnsafeP = null;
        }
        if (fqNameUnsafeP != null) {
            return fqNameUnsafeP.m();
        }
        return null;
    }

    public static final ClassDescriptor l(AnnotationDescriptor annotationDescriptor) {
        Intrinsics.j(annotationDescriptor, "<this>");
        ClassifierDescriptor classifierDescriptorD = annotationDescriptor.getType().K0().d();
        if (classifierDescriptorD instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorD;
        }
        return null;
    }

    public static final KotlinBuiltIns m(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.j(declarationDescriptor, "<this>");
        return s(declarationDescriptor).l();
    }

    public static final FqName o(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.j(declarationDescriptor, "<this>");
        FqName fqNameN = DescriptorUtils.n(declarationDescriptor);
        Intrinsics.i(fqNameN, "getFqNameSafe(...)");
        return fqNameN;
    }

    public static final FqNameUnsafe p(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.j(declarationDescriptor, "<this>");
        FqNameUnsafe fqNameUnsafeM = DescriptorUtils.m(declarationDescriptor);
        Intrinsics.i(fqNameUnsafeM, "getFqName(...)");
        return fqNameUnsafeM;
    }

    public static final KotlinTypeRefiner r(ModuleDescriptor moduleDescriptor) {
        Intrinsics.j(moduleDescriptor, "<this>");
        kotlin.reflect.jvm.internal.impl.types.checker.Ref ref = (kotlin.reflect.jvm.internal.impl.types.checker.Ref) moduleDescriptor.E0(KotlinTypeRefinerKt.a());
        TypeRefinementSupport typeRefinementSupport = ref != null ? (TypeRefinementSupport) ref.a() : null;
        return typeRefinementSupport instanceof TypeRefinementSupport.Enabled ? ((TypeRefinementSupport.Enabled) typeRefinementSupport).b() : KotlinTypeRefiner.Default.f146818a;
    }

    public static final ModuleDescriptor s(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.j(declarationDescriptor, "<this>");
        ModuleDescriptor moduleDescriptorG = DescriptorUtils.g(declarationDescriptor);
        Intrinsics.i(moduleDescriptorG, "getContainingModule(...)");
        return moduleDescriptorG;
    }

    public static final Sequence<DeclarationDescriptor> u(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.j(declarationDescriptor, "<this>");
        return SequencesKt.A(v(declarationDescriptor), 1);
    }

    public static final Sequence<DeclarationDescriptor> v(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.j(declarationDescriptor, "<this>");
        return SequencesKt.q(declarationDescriptor, b.f146215a);
    }

    public static final CallableMemberDescriptor w(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.j(callableMemberDescriptor, "<this>");
        if (!(callableMemberDescriptor instanceof PropertyAccessorDescriptor)) {
            return callableMemberDescriptor;
        }
        PropertyDescriptor propertyDescriptorT = ((PropertyAccessorDescriptor) callableMemberDescriptor).T();
        Intrinsics.i(propertyDescriptorT, "getCorrespondingProperty(...)");
        return propertyDescriptorT;
    }

    public static final ClassDescriptor x(ClassDescriptor classDescriptor) {
        Intrinsics.j(classDescriptor, "<this>");
        for (KotlinType kotlinType : classDescriptor.o().K0().a()) {
            if (!KotlinBuiltIns.c0(kotlinType)) {
                ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
                if (DescriptorUtils.w(classifierDescriptorD)) {
                    Intrinsics.h(classifierDescriptorD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (ClassDescriptor) classifierDescriptorD;
                }
            }
        }
        return null;
    }

    public static final boolean y(ModuleDescriptor moduleDescriptor) {
        TypeRefinementSupport typeRefinementSupport;
        Intrinsics.j(moduleDescriptor, "<this>");
        kotlin.reflect.jvm.internal.impl.types.checker.Ref ref = (kotlin.reflect.jvm.internal.impl.types.checker.Ref) moduleDescriptor.E0(KotlinTypeRefinerKt.a());
        return (ref == null || (typeRefinementSupport = (TypeRefinementSupport) ref.a()) == null || !typeRefinementSupport.a()) ? false : true;
    }

    public static final Sequence<CallableMemberDescriptor> z(CallableMemberDescriptor callableMemberDescriptor, boolean z10) {
        Intrinsics.j(callableMemberDescriptor, "<this>");
        if (z10) {
            callableMemberDescriptor = callableMemberDescriptor.a();
        }
        Sequence sequenceV = SequencesKt.v(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> collectionD = callableMemberDescriptor.d();
        Intrinsics.i(collectionD, "getOverriddenDescriptors(...)");
        return SequencesKt.Q(sequenceV, SequencesKt.G(CollectionsKt.f0(collectionD), new d(z10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence A(boolean z10, CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.g(callableMemberDescriptor);
        return z(callableMemberDescriptor, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable g(ValueParameterDescriptor valueParameterDescriptor) {
        Collection<ValueParameterDescriptor> collectionD = valueParameterDescriptor.d();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(collectionD, 10));
        Iterator<T> it = collectionD.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it.next()).a());
        }
        return arrayList;
    }
}
