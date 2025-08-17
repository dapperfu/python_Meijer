package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: classes13.dex */
public final class DisjointKeysUnionTypeSubstitution extends TypeSubstitution {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f146692e = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private final TypeSubstitution f146693c;

    /* renamed from: d, reason: collision with root package name */
    private final TypeSubstitution f146694d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TypeSubstitution a(TypeSubstitution first, TypeSubstitution second) {
            Intrinsics.j(first, "first");
            Intrinsics.j(second, "second");
            return first.f() ? second : second.f() ? first : new DisjointKeysUnionTypeSubstitution(first, second, null);
        }
    }

    public /* synthetic */ DisjointKeysUnionTypeSubstitution(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeSubstitution, typeSubstitution2);
    }

    @JvmStatic
    public static final TypeSubstitution i(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        return f146692e.a(typeSubstitution, typeSubstitution2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean f() {
        return false;
    }

    private DisjointKeysUnionTypeSubstitution(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        this.f146693c = typeSubstitution;
        this.f146694d = typeSubstitution2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean a() {
        return this.f146693c.a() || this.f146694d.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean b() {
        return this.f146693c.b() || this.f146694d.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public Annotations d(Annotations annotations) {
        Intrinsics.j(annotations, "annotations");
        return this.f146694d.d(this.f146693c.d(annotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public TypeProjection e(KotlinType key) {
        Intrinsics.j(key, "key");
        TypeProjection typeProjectionE = this.f146693c.e(key);
        return typeProjectionE == null ? this.f146694d.e(key) : typeProjectionE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public KotlinType g(KotlinType topLevelType, Variance position) {
        Intrinsics.j(topLevelType, "topLevelType");
        Intrinsics.j(position, "position");
        return this.f146694d.g(this.f146693c.g(topLevelType, position), position);
    }
}
