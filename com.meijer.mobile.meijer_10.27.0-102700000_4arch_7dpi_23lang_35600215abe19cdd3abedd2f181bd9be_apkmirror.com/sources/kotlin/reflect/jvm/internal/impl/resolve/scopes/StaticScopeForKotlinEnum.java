package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class StaticScopeForKotlinEnum extends MemberScopeImpl {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f146294f = {Reflection.j(new PropertyReference1Impl(StaticScopeForKotlinEnum.class, "functions", "getFunctions()Ljava/util/List;", 0)), Reflection.j(new PropertyReference1Impl(StaticScopeForKotlinEnum.class, "properties", "getProperties()Ljava/util/List;", 0))};

    /* renamed from: b, reason: collision with root package name */
    private final ClassDescriptor f146295b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f146296c;

    /* renamed from: d, reason: collision with root package name */
    private final NotNullLazyValue f146297d;

    /* renamed from: e, reason: collision with root package name */
    private final NotNullLazyValue f146298e;

    public Void k(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        return null;
    }

    public StaticScopeForKotlinEnum(StorageManager storageManager, ClassDescriptor containingClass, boolean z10) {
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(containingClass, "containingClass");
        this.f146295b = containingClass;
        this.f146296c = z10;
        containingClass.f();
        ClassKind classKind = ClassKind.f143585b;
        this.f146297d = storageManager.c(new d(this));
        this.f146298e = storageManager.c(new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List j(StaticScopeForKotlinEnum staticScopeForKotlinEnum) {
        return CollectionsKt.p(DescriptorFactory.g(staticScopeForKotlinEnum.f146295b), DescriptorFactory.h(staticScopeForKotlinEnum.f146295b));
    }

    private final List<SimpleFunctionDescriptor> n() {
        return (List) StorageKt.a(this.f146297d, this, f146294f[0]);
    }

    private final List<PropertyDescriptor> o() {
        return (List) StorageKt.a(this.f146298e, this, f146294f[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(StaticScopeForKotlinEnum staticScopeForKotlinEnum) {
        return staticScopeForKotlinEnum.f146296c ? CollectionsKt.q(DescriptorFactory.f(staticScopeForKotlinEnum.f146295b)) : CollectionsKt.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> c(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        List<PropertyDescriptor> listO = o();
        SmartList smartList = new SmartList();
        for (Object obj : listO) {
            if (Intrinsics.e(((PropertyDescriptor) obj).getName(), name)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public List<CallableMemberDescriptor> g(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.j(kindFilter, "kindFilter");
        Intrinsics.j(nameFilter, "nameFilter");
        return CollectionsKt.P0(n(), o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public SmartList<SimpleFunctionDescriptor> b(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        List<SimpleFunctionDescriptor> listN = n();
        SmartList<SimpleFunctionDescriptor> smartList = new SmartList<>();
        for (Object obj : listN) {
            if (Intrinsics.e(((SimpleFunctionDescriptor) obj).getName(), name)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public /* bridge */ /* synthetic */ ClassifierDescriptor f(Name name, LookupLocation lookupLocation) {
        return (ClassifierDescriptor) k(name, lookupLocation);
    }
}
