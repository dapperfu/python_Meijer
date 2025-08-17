package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class JavaRetentionAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f144340h = {Reflection.j(new PropertyReference1Impl(JavaRetentionAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* renamed from: g, reason: collision with root package name */
    private final NotNullLazyValue f144341g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaRetentionAnnotationDescriptor(JavaAnnotation annotation, LazyJavaResolverContext c10) {
        super(c10, annotation, StandardNames.FqNames.f143342L);
        Intrinsics.j(annotation, "annotation");
        Intrinsics.j(c10, "c");
        this.f144341g = c10.e().c(new d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map i(JavaRetentionAnnotationDescriptor javaRetentionAnnotationDescriptor) {
        ConstantValue<?> constantValueB = JavaAnnotationTargetMapper.f144333a.b(javaRetentionAnnotationDescriptor.c());
        Map mapG = constantValueB != null ? MapsKt.g(TuplesKt.a(JavaAnnotationMapper.f144328a.c(), constantValueB)) : null;
        return mapG == null ? MapsKt.k() : mapG;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<?>> a() {
        return (Map) StorageKt.a(this.f144341g, this, f144340h[0]);
    }
}
