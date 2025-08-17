package Ce;

import java.lang.Comparable;

/* renamed from: Ce.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC3015g<C extends Comparable> implements l0<C> {
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l0) {
            return a().equals(((l0) obj).a());
        }
        return false;
    }

    AbstractC3015g() {
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
