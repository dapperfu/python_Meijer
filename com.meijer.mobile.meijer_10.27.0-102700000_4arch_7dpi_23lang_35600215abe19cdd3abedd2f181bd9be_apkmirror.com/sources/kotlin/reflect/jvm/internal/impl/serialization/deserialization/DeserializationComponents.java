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

/* loaded from: classes13.dex */
public final class DeserializationComponents {

    /* renamed from: a, reason: collision with root package name */
    private final StorageManager f146371a;

    /* renamed from: b, reason: collision with root package name */
    private final ModuleDescriptor f146372b;

    /* renamed from: c, reason: collision with root package name */
    private final DeserializationConfiguration f146373c;

    /* renamed from: d, reason: collision with root package name */
    private final ClassDataFinder f146374d;

    /* renamed from: e, reason: collision with root package name */
    private final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> f146375e;

    /* renamed from: f, reason: collision with root package name */
    private final PackageFragmentProvider f146376f;

    /* renamed from: g, reason: collision with root package name */
    private final LocalClassifierTypeSettings f146377g;

    /* renamed from: h, reason: collision with root package name */
    private final ErrorReporter f146378h;

    /* renamed from: i, reason: collision with root package name */
    private final LookupTracker f146379i;

    /* renamed from: j, reason: collision with root package name */
    private final FlexibleTypeDeserializer f146380j;

    /* renamed from: k, reason: collision with root package name */
    private final Iterable<ClassDescriptorFactory> f146381k;

    /* renamed from: l, reason: collision with root package name */
    private final NotFoundClasses f146382l;

    /* renamed from: m, reason: collision with root package name */
    private final ContractDeserializer f146383m;

    /* renamed from: n, reason: collision with root package name */
    private final AdditionalClassPartsProvider f146384n;

    /* renamed from: o, reason: collision with root package name */
    private final PlatformDependentDeclarationFilter f146385o;

    /* renamed from: p, reason: collision with root package name */
    private final ExtensionRegistryLite f146386p;

    /* renamed from: q, reason: collision with root package name */
    private final NewKotlinTypeChecker f146387q;

    /* renamed from: r, reason: collision with root package name */
    private final SamConversionResolver f146388r;

    /* renamed from: s, reason: collision with root package name */
    private final List<TypeAttributeTranslator> f146389s;

    /* renamed from: t, reason: collision with root package name */
    private final EnumEntriesDeserializationSupport f146390t;

    /* renamed from: u, reason: collision with root package name */
    private final ClassDeserializer f146391u;

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
        this.f146371a = storageManager;
        this.f146372b = moduleDescriptor;
        this.f146373c = configuration;
        this.f146374d = classDataFinder;
        this.f146375e = annotationAndConstantLoader;
        this.f146376f = packageFragmentProvider;
        this.f146377g = localClassifierTypeSettings;
        this.f146378h = errorReporter;
        this.f146379i = lookupTracker;
        this.f146380j = flexibleTypeDeserializer;
        this.f146381k = fictitiousClassDescriptorFactories;
        this.f146382l = notFoundClasses;
        this.f146383m = contractDeserializer;
        this.f146384n = additionalClassPartsProvider;
        this.f146385o = platformDependentDeclarationFilter;
        this.f146386p = extensionRegistryLite;
        this.f146387q = kotlinTypeChecker;
        this.f146388r = samConversionResolver;
        this.f146389s = typeAttributeTranslators;
        this.f146390t = enumEntriesDeserializationSupport;
        this.f146391u = new ClassDeserializer(this);
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
        return ClassDeserializer.f(this.f146391u, classId, null, 2, null);
    }

    public final AdditionalClassPartsProvider c() {
        return this.f146384n;
    }

    public final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> d() {
        return this.f146375e;
    }

    public final ClassDataFinder e() {
        return this.f146374d;
    }

    public final ClassDeserializer f() {
        return this.f146391u;
    }

    public final DeserializationConfiguration g() {
        return this.f146373c;
    }

    public final ContractDeserializer h() {
        return this.f146383m;
    }

    public final EnumEntriesDeserializationSupport i() {
        return this.f146390t;
    }

    public final ErrorReporter j() {
        return this.f146378h;
    }

    public final ExtensionRegistryLite k() {
        return this.f146386p;
    }

    public final Iterable<ClassDescriptorFactory> l() {
        return this.f146381k;
    }

    public final FlexibleTypeDeserializer m() {
        return this.f146380j;
    }

    public final NewKotlinTypeChecker n() {
        return this.f146387q;
    }

    public final LocalClassifierTypeSettings o() {
        return this.f146377g;
    }

    public final LookupTracker p() {
        return this.f146379i;
    }

    public final ModuleDescriptor q() {
        return this.f146372b;
    }

    public final NotFoundClasses r() {
        return this.f146382l;
    }

    public final PackageFragmentProvider s() {
        return this.f146376f;
    }

    public final PlatformDependentDeclarationFilter t() {
        return this.f146385o;
    }

    public final StorageManager u() {
        return this.f146371a;
    }

    public final List<TypeAttributeTranslator> v() {
        return this.f146389s;
    }

    public /* synthetic */ DeserializationComponents(StorageManager storageManager, ModuleDescriptor moduleDescriptor, DeserializationConfiguration deserializationConfiguration, ClassDataFinder classDataFinder, AnnotationAndConstantLoader annotationAndConstantLoader, PackageFragmentProvider packageFragmentProvider, LocalClassifierTypeSettings localClassifierTypeSettings, ErrorReporter errorReporter, LookupTracker lookupTracker, FlexibleTypeDeserializer flexibleTypeDeserializer, Iterable iterable, NotFoundClasses notFoundClasses, ContractDeserializer contractDeserializer, AdditionalClassPartsProvider additionalClassPartsProvider, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, ExtensionRegistryLite extensionRegistryLite, NewKotlinTypeChecker newKotlinTypeChecker, SamConversionResolver samConversionResolver, List list, EnumEntriesDeserializationSupport enumEntriesDeserializationSupport, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor, deserializationConfiguration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, localClassifierTypeSettings, errorReporter, lookupTracker, flexibleTypeDeserializer, iterable, notFoundClasses, contractDeserializer, (i10 & 8192) != 0 ? AdditionalClassPartsProvider.None.f143778a : additionalClassPartsProvider, (i10 & 16384) != 0 ? PlatformDependentDeclarationFilter.All.f143779a : platformDependentDeclarationFilter, extensionRegistryLite, (65536 & i10) != 0 ? NewKotlinTypeChecker.f146831b.a() : newKotlinTypeChecker, samConversionResolver, (262144 & i10) != 0 ? CollectionsKt.e(DefaultTypeAttributeTranslator.f146686a) : list, (i10 & 524288) != 0 ? EnumEntriesDeserializationSupport.Default.f146410a : enumEntriesDeserializationSupport);
    }
}
