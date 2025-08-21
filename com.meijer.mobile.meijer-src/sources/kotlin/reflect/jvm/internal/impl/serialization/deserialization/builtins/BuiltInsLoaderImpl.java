package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class BuiltInsLoaderImpl implements BuiltInsLoader {

    /* renamed from: b, reason: collision with root package name */
    private final BuiltInsResourceLoader f147359b = new BuiltInsResourceLoader();

    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<String, InputStream> {
        a(Object obj) {
            super(1, obj, BuiltInsResourceLoader.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputStream invoke(String p02) {
            Intrinsics.j(p02, "p0");
            return ((BuiltInsResourceLoader) this.receiver).a(p02);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader
    public PackageFragmentProvider a(StorageManager storageManager, ModuleDescriptor builtInsModule, Iterable<? extends ClassDescriptorFactory> classDescriptorFactories, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, AdditionalClassPartsProvider additionalClassPartsProvider, boolean z10) {
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(builtInsModule, "builtInsModule");
        Intrinsics.j(classDescriptorFactories, "classDescriptorFactories");
        Intrinsics.j(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.j(additionalClassPartsProvider, "additionalClassPartsProvider");
        return b(storageManager, builtInsModule, StandardNames.f144200J, classDescriptorFactories, platformDependentDeclarationFilter, additionalClassPartsProvider, z10, new a(this.f147359b));
    }

    public final PackageFragmentProvider b(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Set<FqName> packageFqNames, Iterable<? extends ClassDescriptorFactory> classDescriptorFactories, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, AdditionalClassPartsProvider additionalClassPartsProvider, boolean z10, Function1<? super String, ? extends InputStream> loadResource) {
        BuiltInsPackageFragmentImpl builtInsPackageFragmentImplA;
        StorageManager storageManager2 = storageManager;
        ModuleDescriptor module = moduleDescriptor;
        Intrinsics.j(storageManager2, "storageManager");
        Intrinsics.j(module, "module");
        Intrinsics.j(packageFqNames, "packageFqNames");
        Intrinsics.j(classDescriptorFactories, "classDescriptorFactories");
        Intrinsics.j(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.j(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.j(loadResource, "loadResource");
        ArrayList arrayList = new ArrayList();
        for (FqName fqName : packageFqNames) {
            InputStream inputStreamInvoke = loadResource.invoke(BuiltInSerializerProtocol.f147358r.r(fqName));
            if (inputStreamInvoke != null) {
                ModuleDescriptor moduleDescriptor2 = module;
                builtInsPackageFragmentImplA = BuiltInsPackageFragmentImpl.f147360o.a(fqName, storageManager, moduleDescriptor2, inputStreamInvoke, z10);
                storageManager2 = storageManager;
                module = moduleDescriptor2;
            } else {
                builtInsPackageFragmentImplA = null;
            }
            if (builtInsPackageFragmentImplA != null) {
                arrayList.add(builtInsPackageFragmentImplA);
            }
        }
        PackageFragmentProviderImpl packageFragmentProviderImpl = new PackageFragmentProviderImpl(arrayList);
        NotFoundClasses notFoundClasses = new NotFoundClasses(storageManager2, module);
        DeserializationConfiguration.Default r32 = DeserializationConfiguration.Default.f147299a;
        DeserializedClassDataFinder deserializedClassDataFinder = new DeserializedClassDataFinder(packageFragmentProviderImpl);
        BuiltInSerializerProtocol builtInSerializerProtocol = BuiltInSerializerProtocol.f147358r;
        AnnotationAndConstantLoaderImpl annotationAndConstantLoaderImpl = new AnnotationAndConstantLoaderImpl(module, notFoundClasses, builtInSerializerProtocol);
        LocalClassifierTypeSettings.Default r72 = LocalClassifierTypeSettings.Default.f147327a;
        ErrorReporter DO_NOTHING = ErrorReporter.f147318a;
        Intrinsics.i(DO_NOTHING, "DO_NOTHING");
        DeserializationComponents deserializationComponents = new DeserializationComponents(storageManager2, moduleDescriptor, r32, deserializedClassDataFinder, annotationAndConstantLoaderImpl, packageFragmentProviderImpl, r72, DO_NOTHING, LookupTracker.DO_NOTHING.f145021a, FlexibleTypeDeserializer.ThrowException.f147319a, classDescriptorFactories, notFoundClasses, ContractDeserializer.f147275a.a(), additionalClassPartsProvider, platformDependentDeclarationFilter, builtInSerializerProtocol.e(), null, new SamConversionResolverImpl(storageManager2, CollectionsKt.m()), null, null, 851968, null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((BuiltInsPackageFragmentImpl) it.next()).I0(deserializationComponents);
        }
        return packageFragmentProviderImpl;
    }
}
