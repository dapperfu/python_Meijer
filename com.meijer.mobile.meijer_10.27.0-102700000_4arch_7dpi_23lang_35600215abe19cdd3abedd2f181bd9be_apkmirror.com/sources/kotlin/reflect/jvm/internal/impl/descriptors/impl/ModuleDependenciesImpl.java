package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class ModuleDependenciesImpl implements ModuleDependencies {

    /* renamed from: a, reason: collision with root package name */
    private final List<ModuleDescriptorImpl> f143919a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<ModuleDescriptorImpl> f143920b;

    /* renamed from: c, reason: collision with root package name */
    private final List<ModuleDescriptorImpl> f143921c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<ModuleDescriptorImpl> f143922d;

    public ModuleDependenciesImpl(List<ModuleDescriptorImpl> allDependencies, Set<ModuleDescriptorImpl> modulesWhoseInternalsAreVisible, List<ModuleDescriptorImpl> directExpectedByDependencies, Set<ModuleDescriptorImpl> allExpectedByDependencies) {
        Intrinsics.j(allDependencies, "allDependencies");
        Intrinsics.j(modulesWhoseInternalsAreVisible, "modulesWhoseInternalsAreVisible");
        Intrinsics.j(directExpectedByDependencies, "directExpectedByDependencies");
        Intrinsics.j(allExpectedByDependencies, "allExpectedByDependencies");
        this.f143919a = allDependencies;
        this.f143920b = modulesWhoseInternalsAreVisible;
        this.f143921c = directExpectedByDependencies;
        this.f143922d = allExpectedByDependencies;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    public List<ModuleDescriptorImpl> a() {
        return this.f143919a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    public List<ModuleDescriptorImpl> b() {
        return this.f143921c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    public Set<ModuleDescriptorImpl> c() {
        return this.f143920b;
    }
}
