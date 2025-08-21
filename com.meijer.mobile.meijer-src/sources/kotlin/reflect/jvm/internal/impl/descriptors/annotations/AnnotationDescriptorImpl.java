package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes14.dex */
public class AnnotationDescriptorImpl implements AnnotationDescriptor {

    /* renamed from: a, reason: collision with root package name */
    private final KotlinType f144575a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Name, ConstantValue<?>> f144576b;

    /* renamed from: c, reason: collision with root package name */
    private final SourceElement f144577c;

    private static /* synthetic */ void b(int i10) {
        String str = (i10 == 3 || i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "valueArguments";
        } else if (i10 == 2) {
            objArr[0] = "source";
        } else if (i10 == 3 || i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i10 == 3) {
            objArr[1] = "getType";
        } else if (i10 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public AnnotationDescriptorImpl(KotlinType kotlinType, Map<Name, ConstantValue<?>> map, SourceElement sourceElement) {
        if (kotlinType == null) {
            b(0);
        }
        if (map == null) {
            b(1);
        }
        if (sourceElement == null) {
            b(2);
        }
        this.f144575a = kotlinType;
        this.f144576b = map;
        this.f144577c = sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<?>> a() {
        Map<Name, ConstantValue<?>> map = this.f144576b;
        if (map == null) {
            b(4);
        }
        return map;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public SourceElement g() {
        SourceElement sourceElement = this.f144577c;
        if (sourceElement == null) {
            b(5);
        }
        return sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public KotlinType getType() {
        KotlinType kotlinType = this.f144575a;
        if (kotlinType == null) {
            b(3);
        }
        return kotlinType;
    }

    public String toString() {
        return DescriptorRenderer.f146899h.O(this, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public FqName e() {
        return AnnotationDescriptor.DefaultImpls.a(this);
    }
}
