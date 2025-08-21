package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collection;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

@SourceDebugExtension
/* loaded from: classes14.dex */
public class JavaAnnotationDescriptor implements PossiblyExternalAnnotationDescriptor {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f145229f = {Reflection.j(new PropertyReference1Impl(JavaAnnotationDescriptor.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};

    /* renamed from: a, reason: collision with root package name */
    private final FqName f145230a;

    /* renamed from: b, reason: collision with root package name */
    private final SourceElement f145231b;

    /* renamed from: c, reason: collision with root package name */
    private final NotNullLazyValue f145232c;

    /* renamed from: d, reason: collision with root package name */
    private final JavaAnnotationArgument f145233d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f145234e;

    public JavaAnnotationDescriptor(LazyJavaResolverContext c10, JavaAnnotation javaAnnotation, FqName fqName) {
        SourceElement NO_SOURCE;
        Collection<JavaAnnotationArgument> collectionD;
        Intrinsics.j(c10, "c");
        Intrinsics.j(fqName, "fqName");
        this.f145230a = fqName;
        if (javaAnnotation == null || (NO_SOURCE = c10.a().t().a(javaAnnotation)) == null) {
            NO_SOURCE = SourceElement.f144554a;
            Intrinsics.i(NO_SOURCE, "NO_SOURCE");
        }
        this.f145231b = NO_SOURCE;
        this.f145232c = c10.e().c(new a(c10, this));
        this.f145233d = (javaAnnotation == null || (collectionD = javaAnnotation.d()) == null) ? null : (JavaAnnotationArgument) CollectionsKt.t0(collectionD);
        boolean z10 = false;
        if (javaAnnotation != null && javaAnnotation.k()) {
            z10 = true;
        }
        this.f145234e = z10;
    }

    protected final JavaAnnotationArgument c() {
        return this.f145233d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public SimpleType getType() {
        return (SimpleType) StorageKt.a(this.f145232c, this, f145229f[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public FqName e() {
        return this.f145230a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public SourceElement g() {
        return this.f145231b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public boolean k() {
        return this.f145234e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType f(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationDescriptor javaAnnotationDescriptor) {
        SimpleType simpleTypeO = lazyJavaResolverContext.d().l().p(javaAnnotationDescriptor.e()).o();
        Intrinsics.i(simpleTypeO, "getDefaultType(...)");
        return simpleTypeO;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<?>> a() {
        return MapsKt.k();
    }
}
