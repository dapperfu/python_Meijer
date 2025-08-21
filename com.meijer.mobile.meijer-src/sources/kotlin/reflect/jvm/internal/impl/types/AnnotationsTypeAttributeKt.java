package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class AnnotationsTypeAttributeKt {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f147587a = {Reflection.j(new PropertyReference1Impl(AnnotationsTypeAttributeKt.class, "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;", 1))};

    /* renamed from: b, reason: collision with root package name */
    private static final ReadOnlyProperty f147588b;

    static {
        ReadOnlyProperty readOnlyPropertyD = TypeAttributes.f147647b.d(Reflection.b(AnnotationsTypeAttribute.class));
        Intrinsics.h(readOnlyPropertyD, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>");
        f147588b = readOnlyPropertyD;
    }

    public static final Annotations a(TypeAttributes typeAttributes) {
        Annotations annotationsE;
        Intrinsics.j(typeAttributes, "<this>");
        AnnotationsTypeAttribute annotationsTypeAttributeB = b(typeAttributes);
        return (annotationsTypeAttributeB == null || (annotationsE = annotationsTypeAttributeB.e()) == null) ? Annotations.f144596s3.b() : annotationsE;
    }

    public static final AnnotationsTypeAttribute b(TypeAttributes typeAttributes) {
        Intrinsics.j(typeAttributes, "<this>");
        return (AnnotationsTypeAttribute) f147588b.getValue(typeAttributes, f147587a[0]);
    }
}
