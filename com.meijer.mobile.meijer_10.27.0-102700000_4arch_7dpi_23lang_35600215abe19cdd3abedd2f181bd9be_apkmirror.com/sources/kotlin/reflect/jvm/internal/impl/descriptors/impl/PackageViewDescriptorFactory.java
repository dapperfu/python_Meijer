package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes13.dex */
public interface PackageViewDescriptorFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f143944a = Companion.f143945a;

    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f143945a = new Companion();

        /* renamed from: b, reason: collision with root package name */
        private static final ModuleCapability<PackageViewDescriptorFactory> f143946b = new ModuleCapability<>("PackageViewDescriptorFactory");

        public final ModuleCapability<PackageViewDescriptorFactory> a() {
            return f143946b;
        }

        private Companion() {
        }
    }

    public static final class Default implements PackageViewDescriptorFactory {

        /* renamed from: b, reason: collision with root package name */
        public static final Default f143947b = new Default();

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
