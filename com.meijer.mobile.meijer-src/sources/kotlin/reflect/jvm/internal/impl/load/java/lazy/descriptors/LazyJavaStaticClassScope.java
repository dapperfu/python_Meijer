package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.sequences.SequencesKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class LazyJavaStaticClassScope extends LazyJavaStaticScope {

    /* renamed from: n, reason: collision with root package name */
    private final JavaClass f145442n;

    /* renamed from: o, reason: collision with root package name */
    private final JavaClassDescriptor f145443o;

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticClassScope(LazyJavaResolverContext c10, JavaClass jClass, JavaClassDescriptor ownerDescriptor) {
        super(c10);
        Intrinsics.j(c10, "c");
        Intrinsics.j(jClass, "jClass");
        Intrinsics.j(ownerDescriptor, "ownerDescriptor");
        this.f145442n = jClass;
        this.f145443o = ownerDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m0(JavaMember it) {
        Intrinsics.j(it, "it");
        return it.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection n0(Name name, MemberScope it) {
        Intrinsics.j(it, "it");
        return it.c(name, NoLookupLocation.f145036o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection o0(MemberScope it) {
        Intrinsics.j(it, "it");
        return it.d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void B(Collection<SimpleFunctionDescriptor> result, Name name) {
        Intrinsics.j(result, "result");
        Intrinsics.j(name, "name");
        Collection<? extends SimpleFunctionDescriptor> collectionE = DescriptorResolverUtils.e(name, u0(name, R()), result, R(), L().a().c(), L().a().k().a());
        Intrinsics.i(collectionE, "resolveOverridesForStaticMembers(...)");
        result.addAll(collectionE);
        if (this.f145442n.w()) {
            if (Intrinsics.e(name, StandardNames.f144206f)) {
                SimpleFunctionDescriptor simpleFunctionDescriptorG = DescriptorFactory.g(R());
                Intrinsics.i(simpleFunctionDescriptorG, "createEnumValueOfMethod(...)");
                result.add(simpleFunctionDescriptorG);
            } else if (Intrinsics.e(name, StandardNames.f144204d)) {
                SimpleFunctionDescriptor simpleFunctionDescriptorH = DescriptorFactory.h(R());
                Intrinsics.i(simpleFunctionDescriptorH, "createEnumValuesMethod(...)");
                result.add(simpleFunctionDescriptorH);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void C(Name name, Collection<PropertyDescriptor> result) {
        Name name2;
        Collection<PropertyDescriptor> collection;
        Intrinsics.j(name, "name");
        Intrinsics.j(result, "result");
        Set setP0 = p0(R(), new LinkedHashSet(), new M(name));
        if (result.isEmpty()) {
            name2 = name;
            collection = result;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : setP0) {
                PropertyDescriptor propertyDescriptorT0 = t0((PropertyDescriptor) obj);
                Object arrayList = linkedHashMap.get(propertyDescriptorT0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(propertyDescriptorT0, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collectionE = DescriptorResolverUtils.e(name2, (Collection) ((Map.Entry) it.next()).getValue(), collection, R(), L().a().c(), L().a().k().a());
                Intrinsics.i(collectionE, "resolveOverridesForStaticMembers(...)");
                CollectionsKt.C(arrayList2, collectionE);
            }
            collection.addAll(arrayList2);
        } else {
            name2 = name;
            collection = result;
            Collection<? extends PropertyDescriptor> collectionE2 = DescriptorResolverUtils.e(name2, setP0, collection, R(), L().a().c(), L().a().k().a());
            Intrinsics.i(collectionE2, "resolveOverridesForStaticMembers(...)");
            collection.addAll(collectionE2);
        }
        if (this.f145442n.w() && Intrinsics.e(name2, StandardNames.f144205e)) {
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(collection, DescriptorFactory.f(R()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected Set<Name> D(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.j(kindFilter, "kindFilter");
        Set<Name> setN1 = CollectionsKt.n1(N().invoke().c());
        p0(R(), setN1, L.f145366a);
        if (this.f145442n.w()) {
            setN1.add(StandardNames.f144205e);
        }
        return setN1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public ClassDeclaredMemberIndex z() {
        return new ClassDeclaredMemberIndex(this.f145442n, K.f145365a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public JavaClassDescriptor R() {
        return this.f145443o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected Set<Name> v(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.j(kindFilter, "kindFilter");
        return SetsKt.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected Set<Name> x(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> function1) {
        Intrinsics.j(kindFilter, "kindFilter");
        Set<Name> setN1 = CollectionsKt.n1(N().invoke().a());
        LazyJavaStaticClassScope lazyJavaStaticClassScopeB = UtilKt.b(R());
        Set<Name> setA = lazyJavaStaticClassScopeB != null ? lazyJavaStaticClassScopeB.a() : null;
        if (setA == null) {
            setA = SetsKt.e();
        }
        setN1.addAll(setA);
        if (this.f145442n.w()) {
            setN1.addAll(CollectionsKt.p(StandardNames.f144206f, StandardNames.f144204d));
        }
        setN1.addAll(L().a().w().g(R(), L()));
        return setN1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void y(Collection<SimpleFunctionDescriptor> result, Name name) {
        Intrinsics.j(result, "result");
        Intrinsics.j(name, "name");
        L().a().w().d(R(), name, result, L());
    }

    private final <R> Set<R> p0(final ClassDescriptor classDescriptor, final Set<R> set, final Function1<? super MemberScope, ? extends Collection<? extends R>> function1) {
        DFS.b(CollectionsKt.e(classDescriptor), N.f145450a, new DFS.AbstractNodeHandler<ClassDescriptor, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2
            public void e() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public boolean c(ClassDescriptor current) {
                Intrinsics.j(current, "current");
                if (current == classDescriptor) {
                    return true;
                }
                MemberScope memberScopeJ0 = current.j0();
                Intrinsics.i(memberScopeJ0, "getStaticScope(...)");
                if (!(memberScopeJ0 instanceof LazyJavaStaticScope)) {
                    return true;
                }
                set.addAll((Collection) function1.invoke(memberScopeJ0));
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public /* bridge */ /* synthetic */ Object a() {
                e();
                return Unit.f143329a;
            }
        });
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable q0(ClassDescriptor classDescriptor) {
        Collection<KotlinType> collectionA = classDescriptor.i().a();
        Intrinsics.i(collectionA, "getSupertypes(...)");
        return SequencesKt.y(SequencesKt.N(CollectionsKt.f0(collectionA), O.f145451a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptor r0(KotlinType kotlinType) {
        ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
        if (classifierDescriptorD instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorD;
        }
        return null;
    }

    private final PropertyDescriptor t0(PropertyDescriptor propertyDescriptor) {
        if (propertyDescriptor.f().a()) {
            return propertyDescriptor;
        }
        Collection<? extends PropertyDescriptor> collectionD = propertyDescriptor.d();
        Intrinsics.i(collectionD, "getOverriddenDescriptors(...)");
        Collection<? extends PropertyDescriptor> collection = collectionD;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(collection, 10));
        for (PropertyDescriptor propertyDescriptor2 : collection) {
            Intrinsics.g(propertyDescriptor2);
            arrayList.add(t0(propertyDescriptor2));
        }
        return (PropertyDescriptor) CollectionsKt.U0(CollectionsKt.i0(arrayList));
    }

    private final Set<SimpleFunctionDescriptor> u0(Name name, ClassDescriptor classDescriptor) {
        LazyJavaStaticClassScope lazyJavaStaticClassScopeB = UtilKt.b(classDescriptor);
        if (lazyJavaStaticClassScopeB == null) {
            return SetsKt.e();
        }
        return CollectionsKt.o1(lazyJavaStaticClassScopeB.b(name, NoLookupLocation.f145036o));
    }
}
