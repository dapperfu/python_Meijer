package com.scandit.datacapture.core.internal.sdk.common.geometry;

import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.sdk.extensions.PointExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\u001f\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010!\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010\u000fR\u0011\u0010#\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0015R\u0011\u0010%\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b$\u0010\u0015¨\u0006&"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/geometry/Segment;", "", "Lcom/scandit/datacapture/core/common/geometry/Point;", "a", "b", "<init>", "(Lcom/scandit/datacapture/core/common/geometry/Point;Lcom/scandit/datacapture/core/common/geometry/Point;)V", "Lcom/scandit/datacapture/core/internal/sdk/common/geometry/Vector;", "vector", "()Lcom/scandit/datacapture/core/internal/sdk/common/geometry/Vector;", "", "toString", "()Ljava/lang/String;", "Lcom/scandit/datacapture/core/common/geometry/Point;", "getA", "()Lcom/scandit/datacapture/core/common/geometry/Point;", "getB", "", "c", "F", "getLength", "()F", "length", "d", "getDx", "dx", "e", "getDy", "dy", "f", "getSlope", "slope", "getCenter", "center", "getAngleDegrees", "angleDegrees", "getAngleRadian", "angleRadian", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class Segment {
    private final Point a;
    private final Point b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float length;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float dx;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float dy;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float slope;

    public Segment(Point a10, Point b10) {
        Intrinsics.j(a10, "a");
        Intrinsics.j(b10, "b");
        this.a = a10;
        this.b = b10;
        this.length = PointExtensionsKt.distance(a10, b10);
        float x10 = b10.getX() - a10.getX();
        this.dx = x10;
        float y10 = b10.getY() - a10.getY();
        this.dy = y10;
        this.slope = y10 / x10;
    }

    public final Point getA() {
        return this.a;
    }

    public final Point getB() {
        return this.b;
    }

    public final Point getCenter() {
        return PointExtensionsKt.div(PointExtensionsKt.plus(this.a, this.b), 2.0f);
    }

    public final float getDx() {
        return this.dx;
    }

    public final float getDy() {
        return this.dy;
    }

    public final float getLength() {
        return this.length;
    }

    public final float getSlope() {
        return this.slope;
    }

    public String toString() {
        return "Segment{A[" + this.a + "] -> B[" + this.b + "]}";
    }

    public final Vector vector() {
        return new Vector(this.b.getX() - this.a.getX(), this.b.getY() - this.a.getY());
    }

    public final float getAngleDegrees() {
        return (float) ((getAngleRadian() * 180.0d) / 3.141592653589793d);
    }

    public final float getAngleRadian() {
        Vector vectorNormalized = vector().normalized();
        float dy = vectorNormalized.getDy();
        float dx = vectorNormalized.getDx();
        if (dy >= 0.0f) {
            return (float) Math.acos(dx);
        }
        return -((float) Math.acos(dx));
    }
}
