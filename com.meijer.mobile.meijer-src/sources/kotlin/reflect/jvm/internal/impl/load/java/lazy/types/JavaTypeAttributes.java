package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;

/* loaded from: classes14.dex */
public final class JavaTypeAttributes extends ErasureTypeAttributes {

    /* renamed from: d, reason: collision with root package name */
    private final TypeUsage f145487d;

    /* renamed from: e, reason: collision with root package name */
    private final JavaTypeFlexibility f145488e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f145489f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f145490g;

    /* renamed from: h, reason: collision with root package name */
    private final Set<TypeParameterDescriptor> f145491h;

    /* renamed from: i, reason: collision with root package name */
    private final SimpleType f145492i;

    public /* synthetic */ JavaTypeAttributes(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z10, boolean z11, Set set, SimpleType simpleType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeUsage, (i10 & 2) != 0 ? JavaTypeFlexibility.f145493a : javaTypeFlexibility, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : set, (i10 & 32) != 0 ? null : simpleType);
    }

    public static /* synthetic */ JavaTypeAttributes f(JavaTypeAttributes javaTypeAttributes, TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z10, boolean z11, Set set, SimpleType simpleType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeUsage = javaTypeAttributes.f145487d;
        }
        if ((i10 & 2) != 0) {
            javaTypeFlexibility = javaTypeAttributes.f145488e;
        }
        if ((i10 & 4) != 0) {
            z10 = javaTypeAttributes.f145489f;
        }
        if ((i10 & 8) != 0) {
            z11 = javaTypeAttributes.f145490g;
        }
        if ((i10 & 16) != 0) {
            set = javaTypeAttributes.f145491h;
        }
        if ((i10 & 32) != 0) {
            simpleType = javaTypeAttributes.f145492i;
        }
        Set set2 = set;
        SimpleType simpleType2 = simpleType;
        return javaTypeAttributes.e(typeUsage, javaTypeFlexibility, z10, z11, set2, simpleType2);
    }

    public final JavaTypeAttributes e(TypeUsage howThisTypeIsUsed, JavaTypeFlexibility flexibility, boolean z10, boolean z11, Set<? extends TypeParameterDescriptor> set, SimpleType simpleType) {
        Intrinsics.j(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.j(flexibility, "flexibility");
        return new JavaTypeAttributes(howThisTypeIsUsed, flexibility, z10, z11, set, simpleType);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f145487d + ", flexibility=" + this.f145488e + ", isRaw=" + this.f145489f + ", isForAnnotationParameter=" + this.f145490g + ", visitedTypeParameters=" + this.f145491h + ", defaultType=" + this.f145492i + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public SimpleType a() {
        return this.f145492i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public TypeUsage b() {
        return this.f145487d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public Set<TypeParameterDescriptor> c() {
        return this.f145491h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public boolean equals(Object obj) {
        if (!(obj instanceof JavaTypeAttributes)) {
            return false;
        }
        JavaTypeAttributes javaTypeAttributes = (JavaTypeAttributes) obj;
        return Intrinsics.e(javaTypeAttributes.a(), a()) && javaTypeAttributes.b() == b() && javaTypeAttributes.f145488e == this.f145488e && javaTypeAttributes.f145489f == this.f145489f && javaTypeAttributes.f145490g == this.f145490g;
    }

    public final JavaTypeFlexibility g() {
        return this.f145488e;
    }

    public final boolean h() {
        return this.f145490g;
    }

    public final boolean i() {
        return this.f145489f;
    }

    public final JavaTypeAttributes j(boolean z10) {
        return f(this, null, null, z10, false, null, null, 59, null);
    }

    public JavaTypeAttributes k(SimpleType simpleType) {
        return f(this, null, null, false, false, null, simpleType, 31, null);
    }

    public final JavaTypeAttributes l(JavaTypeFlexibility flexibility) {
        Intrinsics.j(flexibility, "flexibility");
        return f(this, null, flexibility, false, false, null, null, 61, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public JavaTypeAttributes d(TypeParameterDescriptor typeParameter) {
        Intrinsics.j(typeParameter, "typeParameter");
        return f(this, null, null, false, false, c() != null ? SetsKt.m(c(), typeParameter) : SetsKt.d(typeParameter), null, 47, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeAttributes(TypeUsage howThisTypeIsUsed, JavaTypeFlexibility flexibility, boolean z10, boolean z11, Set<? extends TypeParameterDescriptor> set, SimpleType simpleType) {
        super(howThisTypeIsUsed, set, simpleType);
        Intrinsics.j(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.j(flexibility, "flexibility");
        this.f145487d = howThisTypeIsUsed;
        this.f145488e = flexibility;
        this.f145489f = z10;
        this.f145490g = z11;
        this.f145491h = set;
        this.f145492i = simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public int hashCode() {
        int iHashCode;
        SimpleType simpleTypeA = a();
        if (simpleTypeA != null) {
            iHashCode = simpleTypeA.hashCode();
        } else {
            iHashCode = 0;
        }
        int iHashCode2 = iHashCode + (iHashCode * 31) + b().hashCode();
        int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.f145488e.hashCode();
        int i10 = iHashCode3 + (iHashCode3 * 31) + (this.f145489f ? 1 : 0);
        return i10 + (i10 * 31) + (this.f145490g ? 1 : 0);
    }
}
