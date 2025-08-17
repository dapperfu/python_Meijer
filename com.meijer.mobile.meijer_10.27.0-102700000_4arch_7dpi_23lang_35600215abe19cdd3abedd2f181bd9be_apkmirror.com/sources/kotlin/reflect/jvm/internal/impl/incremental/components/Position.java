package kotlin.reflect.jvm.internal.impl.incremental.components;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class Position implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f144140c = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Position f144141d = new Position(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    private final int f144142a;

    /* renamed from: b, reason: collision with root package name */
    private final int f144143b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Position a() {
            return Position.f144141d;
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
        return this.f144142a == position.f144142a && this.f144143b == position.f144143b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f144142a) * 31) + Integer.hashCode(this.f144143b);
    }

    public String toString() {
        return "Position(line=" + this.f144142a + ", column=" + this.f144143b + ')';
    }

    public Position(int i10, int i11) {
        this.f144142a = i10;
        this.f144143b = i11;
    }
}
