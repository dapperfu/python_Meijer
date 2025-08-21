package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.SingleModuleClassResolver;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.JvmEnumEntriesDeserializationSupport;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.extensions.TypeAttributeTranslators;

/* loaded from: classes14.dex */
public final class DeserializationComponentsForJava {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f145688b = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final DeserializationComponents f145689a;

    public static final class Companion {

        public static final class ModuleData {

            /* renamed from: a, reason: collision with root package name */
            private final DeserializationComponentsForJava f145690a;

            /* renamed from: b, reason: collision with root package name */
            private final DeserializedDescriptorResolver f145691b;

            public ModuleData(DeserializationComponentsForJava deserializationComponentsForJava, DeserializedDescriptorResolver deserializedDescriptorResolver) {
                Intrinsics.j(deserializationComponentsForJava, "deserializationComponentsForJava");
                Intrinsics.j(deserializedDescriptorResolver, "deserializedDescriptorResolver");
                this.f145690a = deserializationComponentsForJava;
                this.f145691b = deserializedDescriptorResolver;
            }

            public final DeserializationComponentsForJava a() {
                return this.f145690a;
            }

            public final DeserializedDescriptorResolver b() {
                return this.f145691b;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ModuleData a(KotlinClassFinder kotlinClassFinder, KotlinClassFinder jvmBuiltInsKotlinClassFinder, JavaClassFinder javaClassFinder, String moduleName, ErrorReporter errorReporter, JavaSourceElementFactory javaSourceElementFactory) {
            Intrinsics.j(kotlinClassFinder, "kotlinClassFinder");
            Intrinsics.j(jvmBuiltInsKotlinClassFinder, "jvmBuiltInsKotlinClassFinder");
            Intrinsics.j(javaClassFinder, "javaClassFinder");
            Intrinsics.j(moduleName, "moduleName");
            Intrinsics.j(errorReporter, "errorReporter");
            Intrinsics.j(javaSourceElementFactory, "javaSourceElementFactory");
            LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("DeserializationComponentsForJava.ModuleData");
            JvmBuiltIns jvmBuiltIns = new JvmBuiltIns(lockBasedStorageManager, JvmBuiltIns.Kind.f144432a);
            Name nameU = Name.u('<' + moduleName + '>');
            Intrinsics.i(nameU, "special(...)");
            ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(nameU, lockBasedStorageManager, jvmBuiltIns, null, null, null, 56, null);
            jvmBuiltIns.F0(moduleDescriptorImpl);
            jvmBuiltIns.N0(moduleDescriptorImpl, true);
            DeserializedDescriptorResolver deserializedDescriptorResolver = new DeserializedDescriptorResolver();
            SingleModuleClassResolver singleModuleClassResolver = new SingleModuleClassResolver();
            NotFoundClasses notFoundClasses = new NotFoundClasses(lockBasedStorageManager, moduleDescriptorImpl);
            LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProviderB = DeserializationComponentsForJavaKt.b(javaClassFinder, moduleDescriptorImpl, lockBasedStorageManager, notFoundClasses, kotlinClassFinder, deserializedDescriptorResolver, errorReporter, javaSourceElementFactory, singleModuleClassResolver, (512 & 512) != 0 ? PackagePartProvider.Empty.f145735a : null);
            DeserializationComponentsForJava deserializationComponentsForJavaA = DeserializationComponentsForJavaKt.a(moduleDescriptorImpl, lockBasedStorageManager, notFoundClasses, lazyJavaPackageFragmentProviderB, kotlinClassFinder, deserializedDescriptorResolver, errorReporter, MetadataVersion.f146450i);
            deserializedDescriptorResolver.o(deserializationComponentsForJavaA);
            JavaResolverCache EMPTY = JavaResolverCache.f145246a;
            Intrinsics.i(EMPTY, "EMPTY");
            JavaDescriptorResolver javaDescriptorResolver = new JavaDescriptorResolver(lazyJavaPackageFragmentProviderB, EMPTY);
            singleModuleClassResolver.c(javaDescriptorResolver);
            JvmBuiltInsPackageFragmentProvider jvmBuiltInsPackageFragmentProvider = new JvmBuiltInsPackageFragmentProvider(lockBasedStorageManager, jvmBuiltInsKotlinClassFinder, moduleDescriptorImpl, notFoundClasses, jvmBuiltIns.M0(), jvmBuiltIns.M0(), DeserializationConfiguration.Default.f147299a, NewKotlinTypeChecker.f147738b.a(), new SamConversionResolverImpl(lockBasedStorageManager, CollectionsKt.m()));
            moduleDescriptorImpl.T0(moduleDescriptorImpl);
            moduleDescriptorImpl.L0(new CompositePackageFragmentProvider(CollectionsKt.p(javaDescriptorResolver.a(), jvmBuiltInsPackageFragmentProvider), "CompositeProvider@RuntimeModuleData for " + moduleDescriptorImpl));
            return new ModuleData(deserializationComponentsForJavaA, deserializedDescriptorResolver);
        }
    }

    public DeserializationComponentsForJava(StorageManager storageManager, ModuleDescriptor moduleDescriptor, DeserializationConfiguration configuration, JavaClassDataFinder classDataFinder, BinaryClassAnnotationAndConstantLoaderImpl annotationAndConstantLoader, LazyJavaPackageFragmentProvider packageFragmentProvider, NotFoundClasses notFoundClasses, ErrorReporter errorReporter, LookupTracker lookupTracker, ContractDeserializer contractDeserializer, NewKotlinTypeChecker kotlinTypeChecker, TypeAttributeTranslators typeAttributeTranslators) {
        PlatformDependentDeclarationFilter platformDependentDeclarationFilterM0;
        AdditionalClassPartsProvider additionalClassPartsProviderM0;
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(moduleDescriptor, "moduleDescriptor");
        Intrinsics.j(configuration, "configuration");
        Intrinsics.j(classDataFinder, "classDataFinder");
        Intrinsics.j(annotationAndConstantLoader, "annotationAndConstantLoader");
        Intrinsics.j(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.j(notFoundClasses, "notFoundClasses");
        Intrinsics.j(errorReporter, "errorReporter");
        Intrinsics.j(lookupTracker, "lookupTracker");
        Intrinsics.j(contractDeserializer, "contractDeserializer");
        Intrinsics.j(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.j(typeAttributeTranslators, "typeAttributeTranslators");
        KotlinBuiltIns kotlinBuiltInsL = moduleDescriptor.l();
        JvmBuiltIns jvmBuiltIns = kotlinBuiltInsL instanceof JvmBuiltIns ? (JvmBuiltIns) kotlinBuiltInsL : null;
        this.f145689a = new DeserializationComponents(storageManager, moduleDescriptor, configuration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, LocalClassifierTypeSettings.Default.f147327a, errorReporter, lookupTracker, JavaFlexibleTypeDeserializer.f145701a, CollectionsKt.m(), notFoundClasses, contractDeserializer, (jvmBuiltIns == null || (additionalClassPartsProviderM0 = jvmBuiltIns.M0()) == null) ? AdditionalClassPartsProvider.None.f144685a : additionalClassPartsProviderM0, (jvmBuiltIns == null || (platformDependentDeclarationFilterM0 = jvmBuiltIns.M0()) == null) ? PlatformDependentDeclarationFilter.NoPlatformDependent.f144687a : platformDependentDeclarationFilterM0, JvmProtoBufUtil.f146571a.a(), kotlinTypeChecker, new SamConversionResolverImpl(storageManager, CollectionsKt.m()), typeAttributeTranslators.a(), JvmEnumEntriesDeserializationSupport.f147326a);
    }

    public final DeserializationComponents a() {
        return this.f145689a;
    }
}
