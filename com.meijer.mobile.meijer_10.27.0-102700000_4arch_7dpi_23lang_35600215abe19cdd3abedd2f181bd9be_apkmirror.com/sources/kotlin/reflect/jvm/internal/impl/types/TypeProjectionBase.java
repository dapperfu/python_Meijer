package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes13.dex */
public abstract class TypeProjectionBase implements TypeProjection {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeProjection)) {
            return false;
        }
        TypeProjection typeProjection = (TypeProjection) obj;
        return a() == typeProjection.a() && c() == typeProjection.c() && getType().equals(typeProjection.getType());
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2 = c().hashCode();
        if (TypeUtils.w(getType())) {
            return (iHashCode2 * 31) + 19;
        }
        int i10 = iHashCode2 * 31;
        if (a()) {
            iHashCode = 17;
        } else {
            iHashCode = getType().hashCode();
        }
        return i10 + iHashCode;
    }

    public String toString() {
        if (a()) {
            return "*";
        }
        if (c() == Variance.f146796e) {
            return getType().toString();
        }
        return c() + " " + getType();
    }
}
