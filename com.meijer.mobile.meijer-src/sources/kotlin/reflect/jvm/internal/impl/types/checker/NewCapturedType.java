package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class NewCapturedType extends SimpleType implements CapturedTypeMarker {

    /* renamed from: b, reason: collision with root package name */
    private final CaptureStatus f147727b;

    /* renamed from: c, reason: collision with root package name */
    private final NewCapturedTypeConstructor f147728c;

    /* renamed from: d, reason: collision with root package name */
    private final UnwrappedType f147729d;

    /* renamed from: e, reason: collision with root package name */
    private final TypeAttributes f147730e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f147731f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f147732g;

    public /* synthetic */ NewCapturedType(CaptureStatus captureStatus, NewCapturedTypeConstructor newCapturedTypeConstructor, UnwrappedType unwrappedType, TypeAttributes typeAttributes, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(captureStatus, newCapturedTypeConstructor, unwrappedType, (i10 & 8) != 0 ? TypeAttributes.f147647b.k() : typeAttributes, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? false : z11);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes J0() {
        return this.f147730e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean L0() {
        return this.f147731f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: S0 */
    public SimpleType Q0(TypeAttributes newAttributes) {
        Intrinsics.j(newAttributes, "newAttributes");
        return new NewCapturedType(this.f147727b, K0(), this.f147729d, newAttributes, L0(), this.f147732g);
    }

    public final CaptureStatus T0() {
        return this.f147727b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public NewCapturedTypeConstructor K0() {
        return this.f147728c;
    }

    public final UnwrappedType V0() {
        return this.f147729d;
    }

    public final boolean W0() {
        return this.f147732g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public NewCapturedType R0(boolean z10) {
        return new NewCapturedType(this.f147727b, K0(), this.f147729d, J0(), z10, false, 32, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public NewCapturedType U0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        CaptureStatus captureStatus = this.f147727b;
        NewCapturedTypeConstructor newCapturedTypeConstructorB = K0().b(kotlinTypeRefiner);
        UnwrappedType unwrappedType = this.f147729d;
        return new NewCapturedType(captureStatus, newCapturedTypeConstructorB, unwrappedType != null ? kotlinTypeRefiner.a(unwrappedType).N0() : null, J0(), L0(), false, 32, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope n() {
        return ErrorUtils.a(ErrorScopeKind.f147787b, true, new String[0]);
    }

    public NewCapturedType(CaptureStatus captureStatus, NewCapturedTypeConstructor constructor, UnwrappedType unwrappedType, TypeAttributes attributes, boolean z10, boolean z11) {
        Intrinsics.j(captureStatus, "captureStatus");
        Intrinsics.j(constructor, "constructor");
        Intrinsics.j(attributes, "attributes");
        this.f147727b = captureStatus;
        this.f147728c = constructor;
        this.f147729d = unwrappedType;
        this.f147730e = attributes;
        this.f147731f = z10;
        this.f147732g = z11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> I0() {
        return CollectionsKt.m();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewCapturedType(CaptureStatus captureStatus, UnwrappedType unwrappedType, TypeProjection projection, TypeParameterDescriptor typeParameter) {
        this(captureStatus, new NewCapturedTypeConstructor(projection, null, null, typeParameter, 6, null), unwrappedType, null, false, false, 56, null);
        Intrinsics.j(captureStatus, "captureStatus");
        Intrinsics.j(projection, "projection");
        Intrinsics.j(typeParameter, "typeParameter");
    }
}
