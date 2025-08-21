package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.text.StringsKt;

/* loaded from: classes14.dex */
public final class ReflectKotlinClass implements KotlinJvmBinaryClass {

    /* renamed from: c, reason: collision with root package name */
    public static final Factory f144947c = new Factory(null);

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f144948a;

    /* renamed from: b, reason: collision with root package name */
    private final KotlinClassHeader f144949b;

    public static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Factory() {
        }

        public final ReflectKotlinClass a(Class<?> klass) {
            Intrinsics.j(klass, "klass");
            ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = new ReadKotlinClassHeaderAnnotationVisitor();
            a.f144959a.b(klass, readKotlinClassHeaderAnnotationVisitor);
            KotlinClassHeader kotlinClassHeaderN = readKotlinClassHeaderAnnotationVisitor.n();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (kotlinClassHeaderN == null) {
                return null;
            }
            return new ReflectKotlinClass(klass, kotlinClassHeaderN, defaultConstructorMarker);
        }
    }

    public /* synthetic */ ReflectKotlinClass(Class cls, KotlinClassHeader kotlinClassHeader, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, kotlinClassHeader);
    }

    private ReflectKotlinClass(Class<?> cls, KotlinClassHeader kotlinClassHeader) {
        this.f144948a = cls;
        this.f144949b = kotlinClassHeader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public void a(KotlinJvmBinaryClass.MemberVisitor visitor, byte[] bArr) {
        Intrinsics.j(visitor, "visitor");
        a.f144959a.i(this.f144948a, visitor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public KotlinClassHeader b() {
        return this.f144949b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public void c(KotlinJvmBinaryClass.AnnotationVisitor visitor, byte[] bArr) {
        Intrinsics.j(visitor, "visitor");
        a.f144959a.b(this.f144948a, visitor);
    }

    public final Class<?> d() {
        return this.f144948a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectKotlinClass) && Intrinsics.e(this.f144948a, ((ReflectKotlinClass) obj).f144948a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public ClassId f() {
        return ReflectClassUtilKt.e(this.f144948a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public String getLocation() {
        StringBuilder sb2 = new StringBuilder();
        String name = this.f144948a.getName();
        Intrinsics.i(name, "getName(...)");
        sb2.append(StringsKt.P(name, '.', '/', false, 4, null));
        sb2.append(".class");
        return sb2.toString();
    }

    public int hashCode() {
        return this.f144948a.hashCode();
    }

    public String toString() {
        return ReflectKotlinClass.class.getName() + ": " + this.f144948a;
    }
}
