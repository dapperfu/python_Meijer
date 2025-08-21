package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: classes14.dex */
public class DelegatedTypeSubstitution extends TypeSubstitution {

    /* renamed from: c, reason: collision with root package name */
    private final TypeSubstitution f147597c;

    public DelegatedTypeSubstitution(TypeSubstitution substitution) {
        Intrinsics.j(substitution, "substitution");
        this.f147597c = substitution;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean a() {
        return this.f147597c.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean b() {
        return this.f147597c.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public Annotations d(Annotations annotations) {
        Intrinsics.j(annotations, "annotations");
        return this.f147597c.d(annotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public TypeProjection e(KotlinType key) {
        Intrinsics.j(key, "key");
        return this.f147597c.e(key);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean f() {
        return this.f147597c.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public KotlinType g(KotlinType topLevelType, Variance position) {
        Intrinsics.j(topLevelType, "topLevelType");
        Intrinsics.j(position, "position");
        return this.f147597c.g(topLevelType, position);
    }
}
