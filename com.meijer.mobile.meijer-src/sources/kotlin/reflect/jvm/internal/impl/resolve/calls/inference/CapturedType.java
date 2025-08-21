package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;

/* loaded from: classes14.dex */
public final class CapturedType extends SimpleType implements CapturedTypeMarker {

    /* renamed from: b, reason: collision with root package name */
    private final TypeProjection f147070b;

    /* renamed from: c, reason: collision with root package name */
    private final CapturedTypeConstructor f147071c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f147072d;

    /* renamed from: e, reason: collision with root package name */
    private final TypeAttributes f147073e;

    public /* synthetic */ CapturedType(TypeProjection typeProjection, CapturedTypeConstructor capturedTypeConstructor, boolean z10, TypeAttributes typeAttributes, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, (i10 & 2) != 0 ? new CapturedTypeConstructorImpl(typeProjection) : capturedTypeConstructor, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? TypeAttributes.f147647b.k() : typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes J0() {
        return this.f147073e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean L0() {
        return this.f147072d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: S0 */
    public SimpleType Q0(TypeAttributes newAttributes) {
        Intrinsics.j(newAttributes, "newAttributes");
        return new CapturedType(this.f147070b, K0(), L0(), newAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public CapturedTypeConstructor K0() {
        return this.f147071c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public CapturedType U0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        TypeProjection typeProjectionB = this.f147070b.b(kotlinTypeRefiner);
        Intrinsics.i(typeProjectionB, "refine(...)");
        return new CapturedType(typeProjectionB, K0(), L0(), J0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope n() {
        return ErrorUtils.a(ErrorScopeKind.f147787b, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Captured(");
        sb2.append(this.f147070b);
        sb2.append(')');
        sb2.append(L0() ? "?" : "");
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> I0() {
        return CollectionsKt.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public CapturedType R0(boolean z10) {
        if (z10 == L0()) {
            return this;
        }
        return new CapturedType(this.f147070b, K0(), z10, J0());
    }

    public CapturedType(TypeProjection typeProjection, CapturedTypeConstructor constructor, boolean z10, TypeAttributes attributes) {
        Intrinsics.j(typeProjection, "typeProjection");
        Intrinsics.j(constructor, "constructor");
        Intrinsics.j(attributes, "attributes");
        this.f147070b = typeProjection;
        this.f147071c = constructor;
        this.f147072d = z10;
        this.f147073e = attributes;
    }
}
