package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes14.dex */
public interface PackageViewDescriptorFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f144851a = Companion.f144852a;

    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f144852a = new Companion();

        /* renamed from: b, reason: collision with root package name */
        private static final ModuleCapability<PackageViewDescriptorFactory> f144853b = new ModuleCapability<>("PackageViewDescriptorFactory");

        public final ModuleCapability<PackageViewDescriptorFactory> a() {
            return f144853b;
        }

        private Companion() {
        }
    }

    public static final class Default implements PackageViewDescriptorFactory {

        /* renamed from: b, reason: collision with root package name */
        public static final Default f144854b = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory
        public PackageViewDescriptor a(ModuleDescriptorImpl module, FqName fqName, StorageManager storageManager) {
            Intrinsics.j(module, "module");
            Intrinsics.j(fqName, "fqName");
            Intrinsics.j(storageManager, "storageManager");
            return new LazyPackageViewDescriptorImpl(module, fqName, storageManager);
        }

        private Default() {
        }
    }

    PackageViewDescriptor a(ModuleDescriptorImpl moduleDescriptorImpl, FqName fqName, StorageManager storageManager);
}
