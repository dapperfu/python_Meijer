package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class NullabilityQualifierWithMigrationStatus {

    /* renamed from: a, reason: collision with root package name */
    private final NullabilityQualifier f144656a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f144657b;

    public NullabilityQualifierWithMigrationStatus(NullabilityQualifier qualifier, boolean z10) {
        Intrinsics.j(qualifier, "qualifier");
        this.f144656a = qualifier;
        this.f144657b = z10;
    }

    public static /* synthetic */ NullabilityQualifierWithMigrationStatus b(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifier nullabilityQualifier, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nullabilityQualifier = nullabilityQualifierWithMigrationStatus.f144656a;
        }
        if ((i10 & 2) != 0) {
            z10 = nullabilityQualifierWithMigrationStatus.f144657b;
        }
        return nullabilityQualifierWithMigrationStatus.a(nullabilityQualifier, z10);
    }

    public final NullabilityQualifierWithMigrationStatus a(NullabilityQualifier qualifier, boolean z10) {
        Intrinsics.j(qualifier, "qualifier");
        return new NullabilityQualifierWithMigrationStatus(qualifier, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullabilityQualifierWithMigrationStatus)) {
            return false;
        }
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = (NullabilityQualifierWithMigrationStatus) obj;
        return this.f144656a == nullabilityQualifierWithMigrationStatus.f144656a && this.f144657b == nullabilityQualifierWithMigrationStatus.f144657b;
    }

    public int hashCode() {
        return (this.f144656a.hashCode() * 31) + Boolean.hashCode(this.f144657b);
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f144656a + ", isForWarningOnly=" + this.f144657b + ')';
    }

    public final NullabilityQualifier c() {
        return this.f144656a;
    }

    public final boolean d() {
        return this.f144657b;
    }

    public /* synthetic */ NullabilityQualifierWithMigrationStatus(NullabilityQualifier nullabilityQualifier, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, (i10 & 2) != 0 ? false : z10);
    }
}
