package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class JavaTargetAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f145249h = {Reflection.j(new PropertyReference1Impl(JavaTargetAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* renamed from: g, reason: collision with root package name */
    private final NotNullLazyValue f145250g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaTargetAnnotationDescriptor(JavaAnnotation annotation, LazyJavaResolverContext c10) {
        super(c10, annotation, StandardNames.FqNames.f144241H);
        Intrinsics.j(annotation, "annotation");
        Intrinsics.j(c10, "c");
        this.f145250g = c10.e().c(new e(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<Object>> a() {
        return (Map) StorageKt.a(this.f145250g, this, f145249h[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map i(JavaTargetAnnotationDescriptor javaTargetAnnotationDescriptor) {
        ConstantValue<?> constantValueD;
        JavaAnnotationArgument javaAnnotationArgumentC = javaTargetAnnotationDescriptor.c();
        Map mapG = null;
        if (javaAnnotationArgumentC instanceof JavaArrayAnnotationArgument) {
            constantValueD = JavaAnnotationTargetMapper.f145240a.d(((JavaArrayAnnotationArgument) javaTargetAnnotationDescriptor.c()).getElements());
        } else if (javaAnnotationArgumentC instanceof JavaEnumValueAnnotationArgument) {
            constantValueD = JavaAnnotationTargetMapper.f145240a.d(CollectionsKt.e(javaTargetAnnotationDescriptor.c()));
        } else {
            constantValueD = null;
        }
        if (constantValueD != null) {
            mapG = MapsKt.g(TuplesKt.a(JavaAnnotationMapper.f145235a.d(), constantValueD));
        }
        if (mapG == null) {
            return MapsKt.k();
        }
        return mapG;
    }
}
