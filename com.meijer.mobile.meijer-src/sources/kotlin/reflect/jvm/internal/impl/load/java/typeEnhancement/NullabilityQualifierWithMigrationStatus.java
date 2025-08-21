package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class NullabilityQualifierWithMigrationStatus {

    /* renamed from: a, reason: collision with root package name */
    private final NullabilityQualifier f145563a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f145564b;

    public NullabilityQualifierWithMigrationStatus(NullabilityQualifier qualifier, boolean z10) {
        Intrinsics.j(qualifier, "qualifier");
        this.f145563a = qualifier;
        this.f145564b = z10;
    }

    public static /* synthetic */ NullabilityQualifierWithMigrationStatus b(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifier nullabilityQualifier, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nullabilityQualifier = nullabilityQualifierWithMigrationStatus.f145563a;
        }
        if ((i10 & 2) != 0) {
            z10 = nullabilityQualifierWithMigrationStatus.f145564b;
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
        return this.f145563a == nullabilityQualifierWithMigrationStatus.f145563a && this.f145564b == nullabilityQualifierWithMigrationStatus.f145564b;
    }

    public int hashCode() {
        return (this.f145563a.hashCode() * 31) + Boolean.hashCode(this.f145564b);
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f145563a + ", isForWarningOnly=" + this.f145564b + ')';
    }

    public final NullabilityQualifier c() {
        return this.f145563a;
    }

    public final boolean d() {
        return this.f145564b;
    }

    public /* synthetic */ NullabilityQualifierWithMigrationStatus(NullabilityQualifier nullabilityQualifier, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, (i10 & 2) != 0 ? false : z10);
    }
}
