package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;

/* loaded from: classes14.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1 implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<ConstantValue<?>> f145674a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl f145675b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Name f145676c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor f145677d;

    BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1(BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, Name name, BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor abstractAnnotationArgumentVisitor) {
        this.f145675b = binaryClassAnnotationAndConstantLoaderImpl;
        this.f145676c = name;
        this.f145677d = abstractAnnotationArgumentVisitor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public void a() {
        this.f145677d.g(this.f145676c, this.f145674a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor b(ClassId classId) {
        Intrinsics.j(classId, "classId");
        final ArrayList arrayList = new ArrayList();
        BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = this.f145675b;
        SourceElement NO_SOURCE = SourceElement.f144554a;
        Intrinsics.i(NO_SOURCE, "NO_SOURCE");
        final KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorX = binaryClassAnnotationAndConstantLoaderImpl.x(classId, NO_SOURCE, arrayList);
        Intrinsics.g(annotationArgumentVisitorX);
        return new KotlinJvmBinaryClass.AnnotationArgumentVisitor(this, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1$visitAnnotation$1

            /* renamed from: a, reason: collision with root package name */
            private final /* synthetic */ KotlinJvmBinaryClass.AnnotationArgumentVisitor f145678a;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1 f145680c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ArrayList<AnnotationDescriptor> f145681d;

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void b(Name name, ClassId enumClassId, Name enumEntryName) {
                Intrinsics.j(enumClassId, "enumClassId");
                Intrinsics.j(enumEntryName, "enumEntryName");
                this.f145678a.b(name, enumClassId, enumEntryName);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public KotlinJvmBinaryClass.AnnotationArgumentVisitor c(Name name, ClassId classId2) {
                Intrinsics.j(classId2, "classId");
                return this.f145678a.c(name, classId2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void d(Name name, ClassLiteralValue value) {
                Intrinsics.j(value, "value");
                this.f145678a.d(name, value);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void e(Name name, Object obj) {
                this.f145678a.e(name, obj);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor f(Name name) {
                return this.f145678a.f(name);
            }

            {
                this.f145680c = this;
                this.f145681d = arrayList;
                this.f145678a = this.f145679b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void a() {
                this.f145679b.a();
                this.f145680c.f145674a.add(new AnnotationValue((AnnotationDescriptor) CollectionsKt.U0(this.f145681d)));
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public void c(Object obj) {
        this.f145674a.add(this.f145675b.O(this.f145676c, obj));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public void d(ClassId enumClassId, Name enumEntryName) {
        Intrinsics.j(enumClassId, "enumClassId");
        Intrinsics.j(enumEntryName, "enumEntryName");
        this.f145674a.add(new EnumValue(enumClassId, enumEntryName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public void e(ClassLiteralValue value) {
        Intrinsics.j(value, "value");
        this.f145674a.add(new KClassValue(value));
    }
}
