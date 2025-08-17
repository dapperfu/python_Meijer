package c8;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lc8/c;", "", "Lc8/b;", "action", "", "x", "y", "<init>", "(Lc8/b;FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc8/b;", "()Lc8/b;", "b", "F", "()F", "c", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: c8.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes4.dex */
public final /* data */ class TouchEvent {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC6375b action;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float x;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float y;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TouchEvent)) {
            return false;
        }
        TouchEvent touchEvent = (TouchEvent) other;
        return this.action == touchEvent.action && Float.compare(this.x, touchEvent.x) == 0 && Float.compare(this.y, touchEvent.y) == 0;
    }

    public TouchEvent(EnumC6375b action, float f10, float f11) {
        Intrinsics.j(action, "action");
        this.action = action;
        this.x = f10;
        this.y = f11;
    }

    /* renamed from: a, reason: from getter */
    public final EnumC6375b getAction() {
        return this.action;
    }

    /* renamed from: b, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: c, reason: from getter */
    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        return (((this.action.hashCode() * 31) + Float.hashCode(this.x)) * 31) + Float.hashCode(this.y);
    }

    public String toString() {
        return "TouchEvent(action=" + this.action + ", x=" + this.x + ", y=" + this.y + ')';
    }
}
