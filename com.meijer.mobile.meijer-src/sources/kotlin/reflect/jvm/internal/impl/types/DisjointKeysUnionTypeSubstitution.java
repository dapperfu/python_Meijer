package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: classes14.dex */
public final class DisjointKeysUnionTypeSubstitution extends TypeSubstitution {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f147599e = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private final TypeSubstitution f147600c;

    /* renamed from: d, reason: collision with root package name */
    private final TypeSubstitution f147601d;

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
        return f147599e.a(typeSubstitution, typeSubstitution2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean f() {
        return false;
    }

    private DisjointKeysUnionTypeSubstitution(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        this.f147600c = typeSubstitution;
        this.f147601d = typeSubstitution2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean a() {
        return this.f147600c.a() || this.f147601d.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean b() {
        return this.f147600c.b() || this.f147601d.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public Annotations d(Annotations annotations) {
        Intrinsics.j(annotations, "annotations");
        return this.f147601d.d(this.f147600c.d(annotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public TypeProjection e(KotlinType key) {
        Intrinsics.j(key, "key");
        TypeProjection typeProjectionE = this.f147600c.e(key);
        return typeProjectionE == null ? this.f147601d.e(key) : typeProjectionE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public KotlinType g(KotlinType topLevelType, Variance position) {
        Intrinsics.j(topLevelType, "topLevelType");
        Intrinsics.j(position, "position");
        return this.f147601d.g(this.f147600c.g(topLevelType, position), position);
    }
}
