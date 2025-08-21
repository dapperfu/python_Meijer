package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

/* loaded from: classes14.dex */
public final class JavaDeprecatedAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f145243h = {Reflection.j(new PropertyReference1Impl(JavaDeprecatedAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* renamed from: g, reason: collision with root package name */
    private final NotNullLazyValue f145244g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaDeprecatedAnnotationDescriptor(JavaAnnotation javaAnnotation, LazyJavaResolverContext c10) {
        super(c10, javaAnnotation, StandardNames.FqNames.f144323y);
        Intrinsics.j(c10, "c");
        this.f145244g = c10.e().c(c.f145261a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map i() {
        return MapsKt.g(TuplesKt.a(JavaAnnotationMapper.f145235a.b(), new StringValue("Deprecated in Java")));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<?>> a() {
        return (Map) StorageKt.a(this.f145244g, this, f145243h[0]);
    }
}
