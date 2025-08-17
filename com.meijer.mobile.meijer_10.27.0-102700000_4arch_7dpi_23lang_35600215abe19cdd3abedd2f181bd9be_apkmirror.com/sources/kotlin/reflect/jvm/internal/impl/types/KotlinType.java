package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.StrictEqualityTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* loaded from: classes13.dex */
public abstract class KotlinType implements Annotated, KotlinTypeMarker {

    /* renamed from: a, reason: collision with root package name */
    private int f146713a;

    public /* synthetic */ KotlinType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract List<TypeProjection> I0();

    public abstract TypeAttributes J0();

    public abstract TypeConstructor K0();

    public abstract boolean L0();

    public abstract KotlinType M0(KotlinTypeRefiner kotlinTypeRefiner);

    public abstract UnwrappedType N0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KotlinType)) {
            return false;
        }
        KotlinType kotlinType = (KotlinType) obj;
        return L0() == kotlinType.L0() && StrictEqualityTypeChecker.f146840a.a(N0(), kotlinType.N0());
    }

    public abstract MemberScope n();

    private KotlinType() {
    }

    public final int hashCode() {
        int i10 = this.f146713a;
        if (i10 != 0) {
            return i10;
        }
        int iH0 = H0();
        this.f146713a = iH0;
        return iH0;
    }

    private final int H0() {
        if (KotlinTypeKt.a(this)) {
            return super.hashCode();
        }
        return (((K0().hashCode() * 31) + I0().hashCode()) * 31) + (L0() ? 1 : 0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return AnnotationsTypeAttributeKt.a(J0());
    }
}
