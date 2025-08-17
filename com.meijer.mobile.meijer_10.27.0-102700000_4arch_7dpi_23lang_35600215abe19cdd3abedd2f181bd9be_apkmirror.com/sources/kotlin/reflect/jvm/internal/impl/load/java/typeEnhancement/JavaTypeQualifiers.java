package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class JavaTypeQualifiers {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f144636e = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final JavaTypeQualifiers f144637f = new JavaTypeQualifiers(null, null, false, false, 8, null);

    /* renamed from: a, reason: collision with root package name */
    private final NullabilityQualifier f144638a;

    /* renamed from: b, reason: collision with root package name */
    private final MutabilityQualifier f144639b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f144640c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f144641d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final JavaTypeQualifiers a() {
            return JavaTypeQualifiers.f144637f;
        }
    }

    public JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z10, boolean z11) {
        this.f144638a = nullabilityQualifier;
        this.f144639b = mutabilityQualifier;
        this.f144640c = z10;
        this.f144641d = z11;
    }

    public static /* synthetic */ JavaTypeQualifiers c(JavaTypeQualifiers javaTypeQualifiers, NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nullabilityQualifier = javaTypeQualifiers.f144638a;
        }
        if ((i10 & 2) != 0) {
            mutabilityQualifier = javaTypeQualifiers.f144639b;
        }
        if ((i10 & 4) != 0) {
            z10 = javaTypeQualifiers.f144640c;
        }
        if ((i10 & 8) != 0) {
            z11 = javaTypeQualifiers.f144641d;
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
        return this.f144638a == javaTypeQualifiers.f144638a && this.f144639b == javaTypeQualifiers.f144639b && this.f144640c == javaTypeQualifiers.f144640c && this.f144641d == javaTypeQualifiers.f144641d;
    }

    public int hashCode() {
        NullabilityQualifier nullabilityQualifier = this.f144638a;
        int iHashCode = (nullabilityQualifier == null ? 0 : nullabilityQualifier.hashCode()) * 31;
        MutabilityQualifier mutabilityQualifier = this.f144639b;
        return ((((iHashCode + (mutabilityQualifier != null ? mutabilityQualifier.hashCode() : 0)) * 31) + Boolean.hashCode(this.f144640c)) * 31) + Boolean.hashCode(this.f144641d);
    }

    public String toString() {
        return "JavaTypeQualifiers(nullability=" + this.f144638a + ", mutability=" + this.f144639b + ", definitelyNotNull=" + this.f144640c + ", isNullabilityQualifierForWarning=" + this.f144641d + ')';
    }

    public final boolean d() {
        return this.f144640c;
    }

    public final MutabilityQualifier e() {
        return this.f144639b;
    }

    public final NullabilityQualifier f() {
        return this.f144638a;
    }

    public final boolean g() {
        return this.f144641d;
    }

    public /* synthetic */ JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, mutabilityQualifier, z10, (i10 & 8) != 0 ? false : z11);
    }
}
