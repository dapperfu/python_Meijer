package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C15254d implements AnnotationDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public static final C15254d f144703a = new C15254d();

    private final Void b() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public String toString() {
        return "[EnhancedType]";
    }

    private C15254d() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<?>> a() {
        b();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public FqName e() {
        return AnnotationDescriptor.DefaultImpls.a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public SourceElement g() {
        b();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public KotlinType getType() {
        b();
        throw new KotlinNothingValueException();
    }
}
