package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;

/* loaded from: classes13.dex */
public interface KotlinJvmBinaryClass {

    public interface AnnotationArgumentVisitor {
        void a();

        void b(Name name, ClassId classId, Name name2);

        AnnotationArgumentVisitor c(Name name, ClassId classId);

        void d(Name name, ClassLiteralValue classLiteralValue);

        void e(Name name, Object obj);

        AnnotationArrayArgumentVisitor f(Name name);
    }

    public interface AnnotationArrayArgumentVisitor {
        void a();

        AnnotationArgumentVisitor b(ClassId classId);

        void c(Object obj);

        void d(ClassId classId, Name name);

        void e(ClassLiteralValue classLiteralValue);
    }

    public interface AnnotationVisitor {
        void a();

        AnnotationArgumentVisitor c(ClassId classId, SourceElement sourceElement);
    }

    public interface MemberVisitor {
        AnnotationVisitor a(Name name, String str, Object obj);

        MethodAnnotationVisitor b(Name name, String str);
    }

    public interface MethodAnnotationVisitor extends AnnotationVisitor {
        AnnotationArgumentVisitor b(int i10, ClassId classId, SourceElement sourceElement);
    }

    void a(MemberVisitor memberVisitor, byte[] bArr);

    KotlinClassHeader b();

    void c(AnnotationVisitor annotationVisitor, byte[] bArr);

    ClassId f();

    String getLocation();
}
