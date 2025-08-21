package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes14.dex */
public interface BuiltInsLoader {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f144140a = Companion.f144141a;

    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f144141a = new Companion();

        /* renamed from: b, reason: collision with root package name */
        private static final Lazy<BuiltInsLoader> f144142b = LazyKt.a(LazyThreadSafetyMode.f143287b, a.f144352a);

        /* JADX INFO: Access modifiers changed from: private */
        public static final BuiltInsLoader a() {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
            Intrinsics.g(serviceLoaderLoad);
            BuiltInsLoader builtInsLoader = (BuiltInsLoader) CollectionsKt.t0(serviceLoaderLoad);
            if (builtInsLoader != null) {
                return builtInsLoader;
            }
            throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }

        public final BuiltInsLoader c() {
            return f144142b.getValue();
        }

        private Companion() {
        }
    }

    PackageFragmentProvider a(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Iterable<? extends ClassDescriptorFactory> iterable, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, AdditionalClassPartsProvider additionalClassPartsProvider, boolean z10);
}
