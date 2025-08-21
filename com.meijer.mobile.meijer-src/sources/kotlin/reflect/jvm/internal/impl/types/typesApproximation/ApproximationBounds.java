package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class ApproximationBounds<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f147946a;

    /* renamed from: b, reason: collision with root package name */
    private final T f147947b;

    public final T a() {
        return this.f147946a;
    }

    public final T b() {
        return this.f147947b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproximationBounds)) {
            return false;
        }
        ApproximationBounds approximationBounds = (ApproximationBounds) obj;
        return Intrinsics.e(this.f147946a, approximationBounds.f147946a) && Intrinsics.e(this.f147947b, approximationBounds.f147947b);
    }

    public int hashCode() {
        T t10 = this.f147946a;
        int iHashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        T t11 = this.f147947b;
        return iHashCode + (t11 != null ? t11.hashCode() : 0);
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f147946a + ", upper=" + this.f147947b + ')';
    }

    public final T c() {
        return this.f147946a;
    }

    public final T d() {
        return this.f147947b;
    }

    public ApproximationBounds(T t10, T t11) {
        this.f147946a = t10;
        this.f147947b = t11;
    }
}
