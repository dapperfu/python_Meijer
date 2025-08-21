package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class InnerClassesScopeWrapper extends MemberScopeImpl {

    /* renamed from: b, reason: collision with root package name */
    private final MemberScope f147195b;

    public InnerClassesScopeWrapper(MemberScope workerScope) {
        Intrinsics.j(workerScope, "workerScope");
        this.f147195b = workerScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> a() {
        return this.f147195b.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> d() {
        return this.f147195b.d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> e() {
        return this.f147195b.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        ClassifierDescriptor classifierDescriptorF = this.f147195b.f(name, location);
        if (classifierDescriptorF != null) {
            ClassDescriptor classDescriptor = classifierDescriptorF instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorF : null;
            if (classDescriptor != null) {
                return classDescriptor;
            }
            if (classifierDescriptorF instanceof TypeAliasDescriptor) {
                return (TypeAliasDescriptor) classifierDescriptorF;
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<ClassifierDescriptor> g(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.j(kindFilter, "kindFilter");
        Intrinsics.j(nameFilter, "nameFilter");
        DescriptorKindFilter descriptorKindFilterN = kindFilter.n(DescriptorKindFilter.f147162c.c());
        if (descriptorKindFilterN == null) {
            return CollectionsKt.m();
        }
        Collection<DeclarationDescriptor> collectionG = this.f147195b.g(descriptorKindFilterN, nameFilter);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionG) {
            if (obj instanceof ClassifierDescriptorWithTypeParameters) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Classes from " + this.f147195b;
    }
}
