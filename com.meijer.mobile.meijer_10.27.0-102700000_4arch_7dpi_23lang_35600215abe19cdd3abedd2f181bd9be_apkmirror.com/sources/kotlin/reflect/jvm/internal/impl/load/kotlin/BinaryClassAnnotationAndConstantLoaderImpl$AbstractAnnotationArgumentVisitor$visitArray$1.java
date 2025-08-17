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

/* loaded from: classes13.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1 implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<ConstantValue<?>> f144767a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl f144768b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Name f144769c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor f144770d;

    BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1(BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, Name name, BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor abstractAnnotationArgumentVisitor) {
        this.f144768b = binaryClassAnnotationAndConstantLoaderImpl;
        this.f144769c = name;
        this.f144770d = abstractAnnotationArgumentVisitor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public void a() {
        this.f144770d.g(this.f144769c, this.f144767a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor b(ClassId classId) {
        Intrinsics.j(classId, "classId");
        final ArrayList arrayList = new ArrayList();
        BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = this.f144768b;
        SourceElement NO_SOURCE = SourceElement.f143647a;
        Intrinsics.i(NO_SOURCE, "NO_SOURCE");
        final KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorX = binaryClassAnnotationAndConstantLoaderImpl.x(classId, NO_SOURCE, arrayList);
        Intrinsics.g(annotationArgumentVisitorX);
        return new KotlinJvmBinaryClass.AnnotationArgumentVisitor(this, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1$visitAnnotation$1

            /* renamed from: a, reason: collision with root package name */
            private final /* synthetic */ KotlinJvmBinaryClass.AnnotationArgumentVisitor f144771a;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1 f144773c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ArrayList<AnnotationDescriptor> f144774d;

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void b(Name name, ClassId enumClassId, Name enumEntryName) {
                Intrinsics.j(enumClassId, "enumClassId");
                Intrinsics.j(enumEntryName, "enumEntryName");
                this.f144771a.b(name, enumClassId, enumEntryName);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public KotlinJvmBinaryClass.AnnotationArgumentVisitor c(Name name, ClassId classId2) {
                Intrinsics.j(classId2, "classId");
                return this.f144771a.c(name, classId2);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void d(Name name, ClassLiteralValue value) {
                Intrinsics.j(value, "value");
                this.f144771a.d(name, value);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void e(Name name, Object obj) {
                this.f144771a.e(name, obj);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor f(Name name) {
                return this.f144771a.f(name);
            }

            {
                this.f144773c = this;
                this.f144774d = arrayList;
                this.f144771a = this.f144772b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void a() {
                this.f144772b.a();
                this.f144773c.f144767a.add(new AnnotationValue((AnnotationDescriptor) CollectionsKt.U0(this.f144774d)));
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public void c(Object obj) {
        this.f144767a.add(this.f144768b.O(this.f144769c, obj));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public void d(ClassId enumClassId, Name enumEntryName) {
        Intrinsics.j(enumClassId, "enumClassId");
        Intrinsics.j(enumEntryName, "enumEntryName");
        this.f144767a.add(new EnumValue(enumClassId, enumEntryName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public void e(ClassLiteralValue value) {
        Intrinsics.j(value, "value");
        this.f144767a.add(new KClassValue(value));
    }
}
