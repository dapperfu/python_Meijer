package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;

/* loaded from: classes14.dex */
public final class JavaDefaultQualifiers {

    /* renamed from: a, reason: collision with root package name */
    private final NullabilityQualifierWithMigrationStatus f145085a;

    /* renamed from: b, reason: collision with root package name */
    private final Collection<AnnotationQualifierApplicabilityType> f145086b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f145087c;

    /* JADX WARN: Multi-variable type inference failed */
    public JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus nullabilityQualifier, Collection<? extends AnnotationQualifierApplicabilityType> qualifierApplicabilityTypes, boolean z10) {
        Intrinsics.j(nullabilityQualifier, "nullabilityQualifier");
        Intrinsics.j(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f145085a = nullabilityQualifier;
        this.f145086b = qualifierApplicabilityTypes;
        this.f145087c = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JavaDefaultQualifiers b(JavaDefaultQualifiers javaDefaultQualifiers, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nullabilityQualifierWithMigrationStatus = javaDefaultQualifiers.f145085a;
        }
        if ((i10 & 2) != 0) {
            collection = javaDefaultQualifiers.f145086b;
        }
        if ((i10 & 4) != 0) {
            z10 = javaDefaultQualifiers.f145087c;
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
        return Intrinsics.e(this.f145085a, javaDefaultQualifiers.f145085a) && Intrinsics.e(this.f145086b, javaDefaultQualifiers.f145086b) && this.f145087c == javaDefaultQualifiers.f145087c;
    }

    public int hashCode() {
        return (((this.f145085a.hashCode() * 31) + this.f145086b.hashCode()) * 31) + Boolean.hashCode(this.f145087c);
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f145085a + ", qualifierApplicabilityTypes=" + this.f145086b + ", definitelyNotNull=" + this.f145087c + ')';
    }

    public final boolean c() {
        return this.f145087c;
    }

    public final NullabilityQualifierWithMigrationStatus d() {
        return this.f145085a;
    }

    public final Collection<AnnotationQualifierApplicabilityType> e() {
        return this.f145086b;
    }

    public /* synthetic */ JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifierWithMigrationStatus, collection, (i10 & 4) != 0 ? nullabilityQualifierWithMigrationStatus.c() == NullabilityQualifier.f145560c : z10);
    }
}
