package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: classes13.dex */
public abstract class TypeSubstitution {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f146777a = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final TypeSubstitution f146778b = new TypeSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitution$Companion$EMPTY$1
        @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
        public boolean f() {
            return true;
        }

        public Void i(KotlinType key) {
            Intrinsics.j(key, "key");
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
        public /* bridge */ /* synthetic */ TypeProjection e(KotlinType kotlinType) {
            return (TypeProjection) i(kotlinType);
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public Annotations d(Annotations annotations) {
        Intrinsics.j(annotations, "annotations");
        return annotations;
    }

    public abstract TypeProjection e(KotlinType kotlinType);

    public boolean f() {
        return false;
    }

    public KotlinType g(KotlinType topLevelType, Variance position) {
        Intrinsics.j(topLevelType, "topLevelType");
        Intrinsics.j(position, "position");
        return topLevelType;
    }

    public final TypeSubstitution h() {
        return new TypeSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitution$replaceWithNonApproximating$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean a() {
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean b() {
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public Annotations d(Annotations annotations) {
                Intrinsics.j(annotations, "annotations");
                return this.f146779c.d(annotations);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public TypeProjection e(KotlinType key) {
                Intrinsics.j(key, "key");
                return this.f146779c.e(key);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean f() {
                return this.f146779c.f();
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public KotlinType g(KotlinType topLevelType, Variance position) {
                Intrinsics.j(topLevelType, "topLevelType");
                Intrinsics.j(position, "position");
                return this.f146779c.g(topLevelType, position);
            }
        };
    }

    public final TypeSubstitutor c() {
        TypeSubstitutor typeSubstitutorG = TypeSubstitutor.g(this);
        Intrinsics.i(typeSubstitutorG, "create(...)");
        return typeSubstitutorG;
    }
}
