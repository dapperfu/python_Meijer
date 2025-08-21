package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes14.dex */
public abstract class ReflectJavaAnnotationArgument implements JavaAnnotationArgument {

    /* renamed from: b, reason: collision with root package name */
    public static final Factory f144980b = new Factory(null);

    /* renamed from: a, reason: collision with root package name */
    private final Name f144981a;

    public static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Factory() {
        }

        public final ReflectJavaAnnotationArgument a(Object value, Name name) {
            Intrinsics.j(value, "value");
            return ReflectClassUtilKt.l(value.getClass()) ? new ReflectJavaEnumValueAnnotationArgument(name, (Enum) value) : value instanceof Annotation ? new ReflectJavaAnnotationAsAnnotationArgument(name, (Annotation) value) : value instanceof Object[] ? new ReflectJavaArrayAnnotationArgument(name, (Object[]) value) : value instanceof Class ? new ReflectJavaClassObjectAnnotationArgument(name, (Class) value) : new ReflectJavaLiteralAnnotationArgument(name, value);
        }
    }

    public /* synthetic */ ReflectJavaAnnotationArgument(Name name, DefaultConstructorMarker defaultConstructorMarker) {
        this(name);
    }

    private ReflectJavaAnnotationArgument(Name name) {
        this.f144981a = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument
    public Name getName() {
        return this.f144981a;
    }
}
