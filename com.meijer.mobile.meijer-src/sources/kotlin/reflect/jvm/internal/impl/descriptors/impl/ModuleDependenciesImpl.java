package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class ModuleDependenciesImpl implements ModuleDependencies {

    /* renamed from: a, reason: collision with root package name */
    private final List<ModuleDescriptorImpl> f144826a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<ModuleDescriptorImpl> f144827b;

    /* renamed from: c, reason: collision with root package name */
    private final List<ModuleDescriptorImpl> f144828c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<ModuleDescriptorImpl> f144829d;

    public ModuleDependenciesImpl(List<ModuleDescriptorImpl> allDependencies, Set<ModuleDescriptorImpl> modulesWhoseInternalsAreVisible, List<ModuleDescriptorImpl> directExpectedByDependencies, Set<ModuleDescriptorImpl> allExpectedByDependencies) {
        Intrinsics.j(allDependencies, "allDependencies");
        Intrinsics.j(modulesWhoseInternalsAreVisible, "modulesWhoseInternalsAreVisible");
        Intrinsics.j(directExpectedByDependencies, "directExpectedByDependencies");
        Intrinsics.j(allExpectedByDependencies, "allExpectedByDependencies");
        this.f144826a = allDependencies;
        this.f144827b = modulesWhoseInternalsAreVisible;
        this.f144828c = directExpectedByDependencies;
        this.f144829d = allExpectedByDependencies;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    public List<ModuleDescriptorImpl> a() {
        return this.f144826a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    public List<ModuleDescriptorImpl> b() {
        return this.f144828c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    public Set<ModuleDescriptorImpl> c() {
        return this.f144827b;
    }
}
