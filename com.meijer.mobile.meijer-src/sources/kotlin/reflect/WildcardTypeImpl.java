package kotlin.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001bB\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001c"}, d2 = {"Lkotlin/reflect/WildcardTypeImpl;", "Ljava/lang/reflect/WildcardType;", "", "Ljava/lang/reflect/Type;", "upperBound", "lowerBound", "<init>", "(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V", "", "getUpperBounds", "()[Ljava/lang/reflect/Type;", "getLowerBounds", "", "getTypeName", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "a", "Ljava/lang/reflect/Type;", "b", "c", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ExperimentalStdlibApi
/* loaded from: classes14.dex */
final class WildcardTypeImpl implements WildcardType, Type {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final WildcardTypeImpl f143871d = new WildcardTypeImpl(null, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Type upperBound;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Type lowerBound;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/reflect/WildcardTypeImpl$Companion;", "", "<init>", "()V", "Lkotlin/reflect/WildcardTypeImpl;", "STAR", "Lkotlin/reflect/WildcardTypeImpl;", "a", "()Lkotlin/reflect/WildcardTypeImpl;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final WildcardTypeImpl a() {
            return WildcardTypeImpl.f143871d;
        }
    }

    public boolean equals(Object other) {
        if (!(other instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) other;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.lowerBound;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        if (this.lowerBound != null) {
            return "? super " + TypesJVMKt.h(this.lowerBound);
        }
        Type type = this.upperBound;
        if (type == null || Intrinsics.e(type, Object.class)) {
            return "?";
        }
        return "? extends " + TypesJVMKt.h(this.upperBound);
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getUpperBounds() {
        Type type = this.upperBound;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public WildcardTypeImpl(Type type, Type type2) {
        this.upperBound = type;
        this.lowerBound = type2;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public String toString() {
        return getTypeName();
    }
}
