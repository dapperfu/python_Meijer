package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJava;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;

/* loaded from: classes14.dex */
public final class RuntimeModuleData {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f144954c = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final DeserializationComponents f144955a;

    /* renamed from: b, reason: collision with root package name */
    private final PackagePartScopeCache f144956b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RuntimeModuleData a(ClassLoader classLoader) {
            Intrinsics.j(classLoader, "classLoader");
            ReflectKotlinClassFinder reflectKotlinClassFinder = new ReflectKotlinClassFinder(classLoader);
            DeserializationComponentsForJava.Companion companion = DeserializationComponentsForJava.f145688b;
            ClassLoader classLoader2 = Unit.class.getClassLoader();
            Intrinsics.i(classLoader2, "getClassLoader(...)");
            DeserializationComponentsForJava.Companion.ModuleData moduleDataA = companion.a(reflectKotlinClassFinder, new ReflectKotlinClassFinder(classLoader2), new ReflectJavaClassFinder(classLoader), "runtime module for " + classLoader, RuntimeErrorReporter.f144953b, RuntimeSourceElementFactory.f144957a);
            return new RuntimeModuleData(moduleDataA.a().a(), new PackagePartScopeCache(moduleDataA.b(), reflectKotlinClassFinder), null);
        }
    }

    public /* synthetic */ RuntimeModuleData(DeserializationComponents deserializationComponents, PackagePartScopeCache packagePartScopeCache, DefaultConstructorMarker defaultConstructorMarker) {
        this(deserializationComponents, packagePartScopeCache);
    }

    private RuntimeModuleData(DeserializationComponents deserializationComponents, PackagePartScopeCache packagePartScopeCache) {
        this.f144955a = deserializationComponents;
        this.f144956b = packagePartScopeCache;
    }

    public final DeserializationComponents a() {
        return this.f144955a;
    }

    public final ModuleDescriptor b() {
        return this.f144955a.q();
    }

    public final PackagePartScopeCache c() {
        return this.f144956b;
    }
}
