package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Substitutable;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class SubstitutingScope implements MemberScope {

    /* renamed from: b, reason: collision with root package name */
    private final MemberScope f147206b;

    /* renamed from: c, reason: collision with root package name */
    private final Lazy f147207c;

    /* renamed from: d, reason: collision with root package name */
    private final TypeSubstitutor f147208d;

    /* renamed from: e, reason: collision with root package name */
    private Map<DeclarationDescriptor, DeclarationDescriptor> f147209e;

    /* renamed from: f, reason: collision with root package name */
    private final Lazy f147210f;

    public SubstitutingScope(MemberScope workerScope, TypeSubstitutor givenSubstitutor) {
        Intrinsics.j(workerScope, "workerScope");
        Intrinsics.j(givenSubstitutor, "givenSubstitutor");
        this.f147206b = workerScope;
        this.f147207c = LazyKt.b(new f(givenSubstitutor));
        TypeSubstitution typeSubstitutionJ = givenSubstitutor.j();
        Intrinsics.i(typeSubstitutionJ, "getSubstitution(...)");
        this.f147208d = CapturedTypeConstructorKt.h(typeSubstitutionJ, false, 1, null).c();
        this.f147210f = LazyKt.b(new g(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection h(SubstitutingScope substitutingScope) {
        return substitutingScope.l(ResolutionScope.DefaultImpls.a(substitutingScope.f147206b, null, null, 3, null));
    }

    private final Collection<DeclarationDescriptor> k() {
        return (Collection) this.f147210f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <D extends DeclarationDescriptor> Collection<D> l(Collection<? extends D> collection) {
        if (this.f147208d.k() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetG = CollectionsKt.g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetG.add(m((DeclarationDescriptor) it.next()));
        }
        return linkedHashSetG;
    }

    private final <D extends DeclarationDescriptor> D m(D d10) {
        if (this.f147208d.k()) {
            return d10;
        }
        if (this.f147209e == null) {
            this.f147209e = new HashMap();
        }
        Map<DeclarationDescriptor, DeclarationDescriptor> map = this.f147209e;
        Intrinsics.g(map);
        DeclarationDescriptor declarationDescriptorC = map.get(d10);
        if (declarationDescriptorC == null) {
            if (!(d10 instanceof Substitutable)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d10).toString());
            }
            declarationDescriptorC = ((Substitutable) d10).c(this.f147208d);
            if (declarationDescriptorC == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d10 + " substitution fails");
            }
            map.put(d10, declarationDescriptorC);
        }
        D d11 = (D) declarationDescriptorC;
        Intrinsics.h(d11, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return d11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> a() {
        return this.f147206b.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<? extends SimpleFunctionDescriptor> b(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        return l(this.f147206b.b(name, location));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<? extends PropertyDescriptor> c(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        return l(this.f147206b.c(name, location));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> d() {
        return this.f147206b.d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> e() {
        return this.f147206b.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        ClassifierDescriptor classifierDescriptorF = this.f147206b.f(name, location);
        if (classifierDescriptorF != null) {
            return (ClassifierDescriptor) m(classifierDescriptorF);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> g(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.j(kindFilter, "kindFilter");
        Intrinsics.j(nameFilter, "nameFilter");
        return k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeSubstitutor n(TypeSubstitutor typeSubstitutor) {
        return typeSubstitutor.j().c();
    }
}
