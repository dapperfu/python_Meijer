package kotlin.reflect.jvm.internal.impl.incremental.components;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class Position implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f145047c = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Position f145048d = new Position(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    private final int f145049a;

    /* renamed from: b, reason: collision with root package name */
    private final int f145050b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Position a() {
            return Position.f145048d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Position)) {
            return false;
        }
        Position position = (Position) obj;
        return this.f145049a == position.f145049a && this.f145050b == position.f145050b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f145049a) * 31) + Integer.hashCode(this.f145050b);
    }

    public String toString() {
        return "Position(line=" + this.f145049a + ", column=" + this.f145050b + ')';
    }

    public Position(int i10, int i11) {
        this.f145049a = i10;
        this.f145050b = i11;
    }
}
