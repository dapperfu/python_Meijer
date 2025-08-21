package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.EnumEntriesDeserializationSupport;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;

/* loaded from: classes14.dex */
public final class DeserializationComponents {

    /* renamed from: a, reason: collision with root package name */
    private final StorageManager f147278a;

    /* renamed from: b, reason: collision with root package name */
    private final ModuleDescriptor f147279b;

    /* renamed from: c, reason: collision with root package name */
    private final DeserializationConfiguration f147280c;

    /* renamed from: d, reason: collision with root package name */
    private final ClassDataFinder f147281d;

    /* renamed from: e, reason: collision with root package name */
    private final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> f147282e;

    /* renamed from: f, reason: collision with root package name */
    private final PackageFragmentProvider f147283f;

    /* renamed from: g, reason: collision with root package name */
    private final LocalClassifierTypeSettings f147284g;

    /* renamed from: h, reason: collision with root package name */
    private final ErrorReporter f147285h;

    /* renamed from: i, reason: collision with root package name */
    private final LookupTracker f147286i;

    /* renamed from: j, reason: collision with root package name */
    private final FlexibleTypeDeserializer f147287j;

    /* renamed from: k, reason: collision with root package name */
    private final Iterable<ClassDescriptorFactory> f147288k;

    /* renamed from: l, reason: collision with root package name */
    private final NotFoundClasses f147289l;

    /* renamed from: m, reason: collision with root package name */
    private final ContractDeserializer f147290m;

    /* renamed from: n, reason: collision with root package name */
    private final AdditionalClassPartsProvider f147291n;

    /* renamed from: o, reason: collision with root package name */
    private final PlatformDependentDeclarationFilter f147292o;

    /* renamed from: p, reason: collision with root package name */
    private final ExtensionRegistryLite f147293p;

    /* renamed from: q, reason: collision with root package name */
    private final NewKotlinTypeChecker f147294q;

    /* renamed from: r, reason: collision with root package name */
    private final SamConversionResolver f147295r;

    /* renamed from: s, reason: collision with root package name */
    private final List<TypeAttributeTranslator> f147296s;

    /* renamed from: t, reason: collision with root package name */
    private final EnumEntriesDeserializationSupport f147297t;

    /* renamed from: u, reason: collision with root package name */
    private final ClassDeserializer f147298u;

    /* JADX WARN: Multi-variable type inference failed */
    public DeserializationComponents(StorageManager storageManager, ModuleDescriptor moduleDescriptor, DeserializationConfiguration configuration, ClassDataFinder classDataFinder, AnnotationAndConstantLoader<? extends AnnotationDescriptor, ? extends ConstantValue<?>> annotationAndConstantLoader, PackageFragmentProvider packageFragmentProvider, LocalClassifierTypeSettings localClassifierTypeSettings, ErrorReporter errorReporter, LookupTracker lookupTracker, FlexibleTypeDeserializer flexibleTypeDeserializer, Iterable<? extends ClassDescriptorFactory> fictitiousClassDescriptorFactories, NotFoundClasses notFoundClasses, ContractDeserializer contractDeserializer, AdditionalClassPartsProvider additionalClassPartsProvider, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, ExtensionRegistryLite extensionRegistryLite, NewKotlinTypeChecker kotlinTypeChecker, SamConversionResolver samConversionResolver, List<? extends TypeAttributeTranslator> typeAttributeTranslators, EnumEntriesDeserializationSupport enumEntriesDeserializationSupport) {
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(moduleDescriptor, "moduleDescriptor");
        Intrinsics.j(configuration, "configuration");
        Intrinsics.j(classDataFinder, "classDataFinder");
        Intrinsics.j(annotationAndConstantLoader, "annotationAndConstantLoader");
        Intrinsics.j(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.j(localClassifierTypeSettings, "localClassifierTypeSettings");
        Intrinsics.j(errorReporter, "errorReporter");
        Intrinsics.j(lookupTracker, "lookupTracker");
        Intrinsics.j(flexibleTypeDeserializer, "flexibleTypeDeserializer");
        Intrinsics.j(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        Intrinsics.j(notFoundClasses, "notFoundClasses");
        Intrinsics.j(contractDeserializer, "contractDeserializer");
        Intrinsics.j(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.j(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.j(extensionRegistryLite, "extensionRegistryLite");
        Intrinsics.j(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.j(samConversionResolver, "samConversionResolver");
        Intrinsics.j(typeAttributeTranslators, "typeAttributeTranslators");
        Intrinsics.j(enumEntriesDeserializationSupport, "enumEntriesDeserializationSupport");
        this.f147278a = storageManager;
        this.f147279b = moduleDescriptor;
        this.f147280c = configuration;
        this.f147281d = classDataFinder;
        this.f147282e = annotationAndConstantLoader;
        this.f147283f = packageFragmentProvider;
        this.f147284g = localClassifierTypeSettings;
        this.f147285h = errorReporter;
        this.f147286i = lookupTracker;
        this.f147287j = flexibleTypeDeserializer;
        this.f147288k = fictitiousClassDescriptorFactories;
        this.f147289l = notFoundClasses;
        this.f147290m = contractDeserializer;
        this.f147291n = additionalClassPartsProvider;
        this.f147292o = platformDependentDeclarationFilter;
        this.f147293p = extensionRegistryLite;
        this.f147294q = kotlinTypeChecker;
        this.f147295r = samConversionResolver;
        this.f147296s = typeAttributeTranslators;
        this.f147297t = enumEntriesDeserializationSupport;
        this.f147298u = new ClassDeserializer(this);
    }

    public final DeserializationContext a(PackageFragmentDescriptor descriptor, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion metadataVersion, DeserializedContainerSource deserializedContainerSource) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(nameResolver, "nameResolver");
        Intrinsics.j(typeTable, "typeTable");
        Intrinsics.j(versionRequirementTable, "versionRequirementTable");
        Intrinsics.j(metadataVersion, "metadataVersion");
        return new DeserializationContext(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, deserializedContainerSource, null, CollectionsKt.m());
    }

    public final ClassDescriptor b(ClassId classId) {
        Intrinsics.j(classId, "classId");
        return ClassDeserializer.f(this.f147298u, classId, null, 2, null);
    }

    public final AdditionalClassPartsProvider c() {
        return this.f147291n;
    }

    public final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> d() {
        return this.f147282e;
    }

    public final ClassDataFinder e() {
        return this.f147281d;
    }

    public final ClassDeserializer f() {
        return this.f147298u;
    }

    public final DeserializationConfiguration g() {
        return this.f147280c;
    }

    public final ContractDeserializer h() {
        return this.f147290m;
    }

    public final EnumEntriesDeserializationSupport i() {
        return this.f147297t;
    }

    public final ErrorReporter j() {
        return this.f147285h;
    }

    public final ExtensionRegistryLite k() {
        return this.f147293p;
    }

    public final Iterable<ClassDescriptorFactory> l() {
        return this.f147288k;
    }

    public final FlexibleTypeDeserializer m() {
        return this.f147287j;
    }

    public final NewKotlinTypeChecker n() {
        return this.f147294q;
    }

    public final LocalClassifierTypeSettings o() {
        return this.f147284g;
    }

    public final LookupTracker p() {
        return this.f147286i;
    }

    public final ModuleDescriptor q() {
        return this.f147279b;
    }

    public final NotFoundClasses r() {
        return this.f147289l;
    }

    public final PackageFragmentProvider s() {
        return this.f147283f;
    }

    public final PlatformDependentDeclarationFilter t() {
        return this.f147292o;
    }

    public final StorageManager u() {
        return this.f147278a;
    }

    public final List<TypeAttributeTranslator> v() {
        return this.f147296s;
    }

    public /* synthetic */ DeserializationComponents(StorageManager storageManager, ModuleDescriptor moduleDescriptor, DeserializationConfiguration deserializationConfiguration, ClassDataFinder classDataFinder, AnnotationAndConstantLoader annotationAndConstantLoader, PackageFragmentProvider packageFragmentProvider, LocalClassifierTypeSettings localClassifierTypeSettings, ErrorReporter errorReporter, LookupTracker lookupTracker, FlexibleTypeDeserializer flexibleTypeDeserializer, Iterable iterable, NotFoundClasses notFoundClasses, ContractDeserializer contractDeserializer, AdditionalClassPartsProvider additionalClassPartsProvider, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, ExtensionRegistryLite extensionRegistryLite, NewKotlinTypeChecker newKotlinTypeChecker, SamConversionResolver samConversionResolver, List list, EnumEntriesDeserializationSupport enumEntriesDeserializationSupport, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor, deserializationConfiguration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, localClassifierTypeSettings, errorReporter, lookupTracker, flexibleTypeDeserializer, iterable, notFoundClasses, contractDeserializer, (i10 & 8192) != 0 ? AdditionalClassPartsProvider.None.f144685a : additionalClassPartsProvider, (i10 & 16384) != 0 ? PlatformDependentDeclarationFilter.All.f144686a : platformDependentDeclarationFilter, extensionRegistryLite, (65536 & i10) != 0 ? NewKotlinTypeChecker.f147738b.a() : newKotlinTypeChecker, samConversionResolver, (262144 & i10) != 0 ? CollectionsKt.e(DefaultTypeAttributeTranslator.f147593a) : list, (i10 & 524288) != 0 ? EnumEntriesDeserializationSupport.Default.f147317a : enumEntriesDeserializationSupport);
    }
}
