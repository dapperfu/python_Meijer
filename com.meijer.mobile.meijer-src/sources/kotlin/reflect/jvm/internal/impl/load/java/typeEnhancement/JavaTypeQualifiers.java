package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class JavaTypeQualifiers {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f145543e = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final JavaTypeQualifiers f145544f = new JavaTypeQualifiers(null, null, false, false, 8, null);

    /* renamed from: a, reason: collision with root package name */
    private final NullabilityQualifier f145545a;

    /* renamed from: b, reason: collision with root package name */
    private final MutabilityQualifier f145546b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f145547c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f145548d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final JavaTypeQualifiers a() {
            return JavaTypeQualifiers.f145544f;
        }
    }

    public JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z10, boolean z11) {
        this.f145545a = nullabilityQualifier;
        this.f145546b = mutabilityQualifier;
        this.f145547c = z10;
        this.f145548d = z11;
    }

    public static /* synthetic */ JavaTypeQualifiers c(JavaTypeQualifiers javaTypeQualifiers, NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nullabilityQualifier = javaTypeQualifiers.f145545a;
        }
        if ((i10 & 2) != 0) {
            mutabilityQualifier = javaTypeQualifiers.f145546b;
        }
        if ((i10 & 4) != 0) {
            z10 = javaTypeQualifiers.f145547c;
        }
        if ((i10 & 8) != 0) {
            z11 = javaTypeQualifiers.f145548d;
        }
        return javaTypeQualifiers.b(nullabilityQualifier, mutabilityQualifier, z10, z11);
    }

    public final JavaTypeQualifiers b(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z10, boolean z11) {
        return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaTypeQualifiers)) {
            return false;
        }
        JavaTypeQualifiers javaTypeQualifiers = (JavaTypeQualifiers) obj;
        return this.f145545a == javaTypeQualifiers.f145545a && this.f145546b == javaTypeQualifiers.f145546b && this.f145547c == javaTypeQualifiers.f145547c && this.f145548d == javaTypeQualifiers.f145548d;
    }

    public int hashCode() {
        NullabilityQualifier nullabilityQualifier = this.f145545a;
        int iHashCode = (nullabilityQualifier == null ? 0 : nullabilityQualifier.hashCode()) * 31;
        MutabilityQualifier mutabilityQualifier = this.f145546b;
        return ((((iHashCode + (mutabilityQualifier != null ? mutabilityQualifier.hashCode() : 0)) * 31) + Boolean.hashCode(this.f145547c)) * 31) + Boolean.hashCode(this.f145548d);
    }

    public String toString() {
        return "JavaTypeQualifiers(nullability=" + this.f145545a + ", mutability=" + this.f145546b + ", definitelyNotNull=" + this.f145547c + ", isNullabilityQualifierForWarning=" + this.f145548d + ')';
    }

    public final boolean d() {
        return this.f145547c;
    }

    public final MutabilityQualifier e() {
        return this.f145546b;
    }

    public final NullabilityQualifier f() {
        return this.f145545a;
    }

    public final boolean g() {
        return this.f145548d;
    }

    public /* synthetic */ JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, mutabilityQualifier, z10, (i10 & 8) != 0 ? false : z11);
    }
}
