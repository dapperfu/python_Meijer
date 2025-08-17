package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;

/* loaded from: classes13.dex */
public final class JavaDefaultQualifiers {

    /* renamed from: a, reason: collision with root package name */
    private final NullabilityQualifierWithMigrationStatus f144178a;

    /* renamed from: b, reason: collision with root package name */
    private final Collection<AnnotationQualifierApplicabilityType> f144179b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f144180c;

    /* JADX WARN: Multi-variable type inference failed */
    public JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus nullabilityQualifier, Collection<? extends AnnotationQualifierApplicabilityType> qualifierApplicabilityTypes, boolean z10) {
        Intrinsics.j(nullabilityQualifier, "nullabilityQualifier");
        Intrinsics.j(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f144178a = nullabilityQualifier;
        this.f144179b = qualifierApplicabilityTypes;
        this.f144180c = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JavaDefaultQualifiers b(JavaDefaultQualifiers javaDefaultQualifiers, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nullabilityQualifierWithMigrationStatus = javaDefaultQualifiers.f144178a;
        }
        if ((i10 & 2) != 0) {
            collection = javaDefaultQualifiers.f144179b;
        }
        if ((i10 & 4) != 0) {
            z10 = javaDefaultQualifiers.f144180c;
        }
        return javaDefaultQualifiers.a(nullabilityQualifierWithMigrationStatus, collection, z10);
    }

    public final JavaDefaultQualifiers a(NullabilityQualifierWithMigrationStatus nullabilityQualifier, Collection<? extends AnnotationQualifierApplicabilityType> qualifierApplicabilityTypes, boolean z10) {
        Intrinsics.j(nullabilityQualifier, "nullabilityQualifier");
        Intrinsics.j(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new JavaDefaultQualifiers(nullabilityQualifier, qualifierApplicabilityTypes, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaDefaultQualifiers)) {
            return false;
        }
        JavaDefaultQualifiers javaDefaultQualifiers = (JavaDefaultQualifiers) obj;
        return Intrinsics.e(this.f144178a, javaDefaultQualifiers.f144178a) && Intrinsics.e(this.f144179b, javaDefaultQualifiers.f144179b) && this.f144180c == javaDefaultQualifiers.f144180c;
    }

    public int hashCode() {
        return (((this.f144178a.hashCode() * 31) + this.f144179b.hashCode()) * 31) + Boolean.hashCode(this.f144180c);
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f144178a + ", qualifierApplicabilityTypes=" + this.f144179b + ", definitelyNotNull=" + this.f144180c + ')';
    }

    public final boolean c() {
        return this.f144180c;
    }

    public final NullabilityQualifierWithMigrationStatus d() {
        return this.f144178a;
    }

    public final Collection<AnnotationQualifierApplicabilityType> e() {
        return this.f144179b;
    }

    public /* synthetic */ JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifierWithMigrationStatus, collection, (i10 & 4) != 0 ? nullabilityQualifierWithMigrationStatus.c() == NullabilityQualifier.f144653c : z10);
    }
}
