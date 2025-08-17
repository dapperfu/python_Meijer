package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes13.dex */
public class ErrorScope implements MemberScope {

    /* renamed from: b, reason: collision with root package name */
    private final ErrorScopeKind f146878b;

    /* renamed from: c, reason: collision with root package name */
    private final String f146879c;

    public ErrorScope(ErrorScopeKind kind, String... formatParams) {
        Intrinsics.j(kind, "kind");
        Intrinsics.j(formatParams, "formatParams");
        this.f146878b = kind;
        String strB = kind.b();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(strB, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.i(str, "format(...)");
        this.f146879c = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        String str = String.format(ErrorEntity.f146860b.b(), Arrays.copyOf(new Object[]{name}, 1));
        Intrinsics.i(str, "format(...)");
        Name nameU = Name.u(str);
        Intrinsics.i(nameU, "special(...)");
        return new ErrorClassDescriptor(nameU);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> g(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.j(kindFilter, "kindFilter");
        Intrinsics.j(nameFilter, "nameFilter");
        return CollectionsKt.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set<SimpleFunctionDescriptor> b(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        return SetsKt.d(new ErrorFunctionDescriptor(ErrorUtils.f146990a.h()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set<PropertyDescriptor> c(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        return ErrorUtils.f146990a.j();
    }

    protected final String j() {
        return this.f146879c;
    }

    public String toString() {
        return "ErrorScope{" + this.f146879c + '}';
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> a() {
        return SetsKt.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> d() {
        return SetsKt.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> e() {
        return SetsKt.e();
    }
}
