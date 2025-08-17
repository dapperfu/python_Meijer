package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class ChainedMemberScope implements MemberScope {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f146249d = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private final String f146250b;

    /* renamed from: c, reason: collision with root package name */
    private final MemberScope[] f146251c;

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MemberScope a(String debugName, Iterable<? extends MemberScope> scopes) {
            Intrinsics.j(debugName, "debugName");
            Intrinsics.j(scopes, "scopes");
            SmartList smartList = new SmartList();
            for (MemberScope memberScope : scopes) {
                if (memberScope != MemberScope.Empty.f146293b) {
                    if (memberScope instanceof ChainedMemberScope) {
                        CollectionsKt.D(smartList, ((ChainedMemberScope) memberScope).f146251c);
                    } else {
                        smartList.add(memberScope);
                    }
                }
            }
            return b(debugName, smartList);
        }

        public final MemberScope b(String debugName, List<? extends MemberScope> scopes) {
            Intrinsics.j(debugName, "debugName");
            Intrinsics.j(scopes, "scopes");
            int size = scopes.size();
            return size != 0 ? size != 1 ? new ChainedMemberScope(debugName, (MemberScope[]) scopes.toArray(new MemberScope[0]), null) : scopes.get(0) : MemberScope.Empty.f146293b;
        }
    }

    public /* synthetic */ ChainedMemberScope(String str, MemberScope[] memberScopeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, memberScopeArr);
    }

    private ChainedMemberScope(String str, MemberScope[] memberScopeArr) {
        this.f146250b = str;
        this.f146251c = memberScopeArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> a() {
        MemberScope[] memberScopeArr = this.f146251c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArr) {
            CollectionsKt.C(linkedHashSet, memberScope.a());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<SimpleFunctionDescriptor> b(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        MemberScope[] memberScopeArr = this.f146251c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return CollectionsKt.m();
        }
        if (length == 1) {
            return memberScopeArr[0].b(name, location);
        }
        Collection<SimpleFunctionDescriptor> collectionA = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionA = ScopeUtilsKt.a(collectionA, memberScope.b(name, location));
        }
        return collectionA == null ? SetsKt.e() : collectionA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> c(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        MemberScope[] memberScopeArr = this.f146251c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return CollectionsKt.m();
        }
        if (length == 1) {
            return memberScopeArr[0].c(name, location);
        }
        Collection<PropertyDescriptor> collectionA = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionA = ScopeUtilsKt.a(collectionA, memberScope.c(name, location));
        }
        return collectionA == null ? SetsKt.e() : collectionA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> d() {
        MemberScope[] memberScopeArr = this.f146251c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArr) {
            CollectionsKt.C(linkedHashSet, memberScope.d());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> e() {
        return MemberScopeKt.a(ArraysKt.R(this.f146251c));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        ClassifierDescriptor classifierDescriptor = null;
        for (MemberScope memberScope : this.f146251c) {
            ClassifierDescriptor classifierDescriptorF = memberScope.f(name, location);
            if (classifierDescriptorF != null) {
                if (!(classifierDescriptorF instanceof ClassifierDescriptorWithTypeParameters) || !((MemberDescriptor) classifierDescriptorF).h0()) {
                    return classifierDescriptorF;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = classifierDescriptorF;
                }
            }
        }
        return classifierDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> g(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.j(kindFilter, "kindFilter");
        Intrinsics.j(nameFilter, "nameFilter");
        MemberScope[] memberScopeArr = this.f146251c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return CollectionsKt.m();
        }
        if (length == 1) {
            return memberScopeArr[0].g(kindFilter, nameFilter);
        }
        Collection<DeclarationDescriptor> collectionA = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionA = ScopeUtilsKt.a(collectionA, memberScope.g(kindFilter, nameFilter));
        }
        return collectionA == null ? SetsKt.e() : collectionA;
    }

    public String toString() {
        return this.f146250b;
    }
}
