package a1;

import V0.q1;
import a1.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a_\u0010\r\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0013\u001a_\u0010\f\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u001a\"\u001a\u0010\u001f\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"", "La1/h;", "LV0/q1;", "target", "c", "(Ljava/util/List;LV0/q1;)LV0/q1;", "p", "", "x0", "y0", "x1", "y1", "a", "b", "theta", "", "isMoreThanHalf", "isPositiveArc", "", "(LV0/q1;DDDDDDDZZ)V", "cx", "cy", "e1x", "e1y", "start", "sweep", "(LV0/q1;DDDDDDDDD)V", "", "[F", "getEmptyArray", "()[F", "EmptyArray", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final float[] f43492a = new float[0];

    private static final void a(q1 q1Var, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        double d19 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d18 * d19) / 3.141592653589793d));
        double dCos = Math.cos(d16);
        double dSin = Math.sin(d16);
        double dCos2 = Math.cos(d17);
        double dSin2 = Math.sin(d17);
        double d20 = -d12;
        double d21 = d20 * dCos;
        double d22 = d13 * dSin;
        double d23 = (d21 * dSin2) - (d22 * dCos2);
        double d24 = d20 * dSin;
        double d25 = d13 * dCos;
        double d26 = (dSin2 * d24) + (dCos2 * d25);
        double d27 = d18 / iCeil;
        double d28 = d26;
        double d29 = d23;
        int i10 = 0;
        double d30 = d14;
        double d31 = d15;
        double d32 = d17;
        while (i10 < iCeil) {
            double d33 = d32 + d27;
            double dSin3 = Math.sin(d33);
            double dCos3 = Math.cos(d33);
            int i11 = i10;
            double d34 = (d10 + ((d12 * dCos) * dCos3)) - (d22 * dSin3);
            double d35 = d19;
            double d36 = d11 + (d12 * dSin * dCos3) + (d25 * dSin3);
            double d37 = (d21 * dSin3) - (d22 * dCos3);
            double d38 = (dSin3 * d24) + (dCos3 * d25);
            double d39 = d33 - d32;
            int i12 = iCeil;
            double dTan = Math.tan(d39 / 2);
            double dSin4 = (Math.sin(d39) * (Math.sqrt(d35 + ((3.0d * dTan) * dTan)) - 1)) / 3;
            q1Var.s((float) (d30 + (d29 * dSin4)), (float) (d31 + (d28 * dSin4)), (float) (d34 - (dSin4 * d37)), (float) (d36 - (dSin4 * d38)), (float) d34, (float) d36);
            dSin = dSin;
            d27 = d27;
            d30 = d34;
            d31 = d36;
            i10 = i11 + 1;
            d32 = d33;
            d28 = d38;
            iCeil = i12;
            d29 = d37;
            dCos = dCos;
            d19 = d35;
        }
    }

    private static final void b(q1 q1Var, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10, boolean z11) {
        double d17;
        double d18;
        double d19 = (d16 / 180) * 3.141592653589793d;
        double dCos = Math.cos(d19);
        double dSin = Math.sin(d19);
        double d20 = ((d10 * dCos) + (d11 * dSin)) / d14;
        double d21 = (((-d10) * dSin) + (d11 * dCos)) / d15;
        double d22 = ((d12 * dCos) + (d13 * dSin)) / d14;
        double d23 = (((-d12) * dSin) + (d13 * dCos)) / d15;
        double d24 = d20 - d22;
        double d25 = d21 - d23;
        double d26 = 2;
        double d27 = (d20 + d22) / d26;
        double d28 = (d21 + d23) / d26;
        double d29 = (d24 * d24) + (d25 * d25);
        if (d29 == 0.0d) {
            return;
        }
        double d30 = (1.0d / d29) - 0.25d;
        if (d30 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d29) / 1.99999d);
            b(q1Var, d10, d11, d12, d13, d14 * dSqrt, d15 * dSqrt, d16, z10, z11);
            return;
        }
        double dSqrt2 = Math.sqrt(d30);
        double d31 = d24 * dSqrt2;
        double d32 = dSqrt2 * d25;
        if (z10 == z11) {
            d17 = d27 - d32;
            d18 = d28 + d31;
        } else {
            d17 = d27 + d32;
            d18 = d28 - d31;
        }
        double dAtan2 = Math.atan2(d21 - d18, d20 - d17);
        double dAtan22 = Math.atan2(d23 - d18, d22 - d17) - dAtan2;
        if (z11 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d33 = d17 * d14;
        double d34 = d18 * d15;
        a(q1Var, (d33 * dCos) - (d34 * dSin), (d33 * dSin) + (d34 * dCos), d14, d15, d10, d11, d19, dAtan2, dAtan22);
    }

    public static final q1 c(List<? extends h> list, q1 q1Var) {
        int i10;
        float f10;
        int i11;
        h hVar;
        float f11;
        float f12;
        float x12;
        float x22;
        float y22;
        float dy2;
        float f13;
        float f14;
        float dx1;
        float dy1;
        float dy22;
        List<? extends h> list2 = list;
        q1 q1Var2 = q1Var;
        int iO = q1Var2.o();
        q1Var2.v();
        q1Var2.g(iO);
        h hVar2 = list2.isEmpty() ? h.b.f43439c : list2.get(0);
        int size = list2.size();
        float f15 = 0.0f;
        int i12 = 0;
        float arcStartX = 0.0f;
        float arcStartY = 0.0f;
        float x10 = 0.0f;
        float y10 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i12 < size) {
            h hVar3 = list2.get(i12);
            if (hVar3 instanceof h.b) {
                q1Var2.close();
                i10 = size;
                f10 = f15;
                i11 = i12;
                hVar = hVar3;
                arcStartX = f16;
                x10 = arcStartX;
                arcStartY = f17;
            } else {
                if (hVar3 instanceof h.RelativeMoveTo) {
                    h.RelativeMoveTo relativeMoveTo = (h.RelativeMoveTo) hVar3;
                    x10 += relativeMoveTo.getDx();
                    y10 += relativeMoveTo.getDy();
                    q1Var2.c(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                    i10 = size;
                    f10 = f15;
                    i11 = i12;
                    f16 = x10;
                    f17 = y10;
                } else {
                    if (hVar3 instanceof h.MoveTo) {
                        h.MoveTo moveTo = (h.MoveTo) hVar3;
                        float x11 = moveTo.getX();
                        float y11 = moveTo.getY();
                        q1Var2.r(moveTo.getX(), moveTo.getY());
                        x10 = x11;
                        f16 = x10;
                        y10 = y11;
                        f17 = y10;
                    } else {
                        if (hVar3 instanceof h.RelativeLineTo) {
                            h.RelativeLineTo relativeLineTo = (h.RelativeLineTo) hVar3;
                            q1Var2.t(relativeLineTo.getDx(), relativeLineTo.getDy());
                            x10 += relativeLineTo.getDx();
                            dy2 = relativeLineTo.getDy();
                        } else {
                            if (hVar3 instanceof h.LineTo) {
                                h.LineTo lineTo = (h.LineTo) hVar3;
                                q1Var2.u(lineTo.getX(), lineTo.getY());
                                x22 = lineTo.getX();
                                y22 = lineTo.getY();
                            } else if (hVar3 instanceof h.RelativeHorizontalTo) {
                                h.RelativeHorizontalTo relativeHorizontalTo = (h.RelativeHorizontalTo) hVar3;
                                q1Var2.t(relativeHorizontalTo.getDx(), f15);
                                x10 += relativeHorizontalTo.getDx();
                            } else if (hVar3 instanceof h.HorizontalTo) {
                                h.HorizontalTo horizontalTo = (h.HorizontalTo) hVar3;
                                q1Var2.u(horizontalTo.getX(), y10);
                                x10 = horizontalTo.getX();
                            } else if (hVar3 instanceof h.RelativeVerticalTo) {
                                h.RelativeVerticalTo relativeVerticalTo = (h.RelativeVerticalTo) hVar3;
                                q1Var2.t(f15, relativeVerticalTo.getDy());
                                dy2 = relativeVerticalTo.getDy();
                            } else if (hVar3 instanceof h.VerticalTo) {
                                h.VerticalTo verticalTo = (h.VerticalTo) hVar3;
                                q1Var2.u(x10, verticalTo.getY());
                                y10 = verticalTo.getY();
                            } else {
                                if (hVar3 instanceof h.RelativeCurveTo) {
                                    h.RelativeCurveTo relativeCurveTo = (h.RelativeCurveTo) hVar3;
                                    q1Var2.d(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                                    dx1 = relativeCurveTo.getDx2() + x10;
                                    dy1 = relativeCurveTo.getDy2() + y10;
                                    x10 += relativeCurveTo.getDx3();
                                    dy22 = relativeCurveTo.getDy3();
                                } else {
                                    if (hVar3 instanceof h.CurveTo) {
                                        h.CurveTo curveTo = (h.CurveTo) hVar3;
                                        q1Var.s(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                        float x23 = curveTo.getX2();
                                        float y23 = curveTo.getY2();
                                        float x32 = curveTo.getX3();
                                        float y32 = curveTo.getY3();
                                        x10 = x32;
                                        y10 = y32;
                                        i10 = size;
                                        f10 = f15;
                                        i11 = i12;
                                        hVar = hVar3;
                                        arcStartX = x23;
                                        arcStartY = y23;
                                    } else if (hVar3 instanceof h.RelativeReflectiveCurveTo) {
                                        if (hVar2.getIsCurve()) {
                                            float f18 = x10 - arcStartX;
                                            f14 = y10 - arcStartY;
                                            f13 = f18;
                                        } else {
                                            f13 = f15;
                                            f14 = f13;
                                        }
                                        h.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (h.RelativeReflectiveCurveTo) hVar3;
                                        q1Var.d(f13, f14, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                        dx1 = relativeReflectiveCurveTo.getDx1() + x10;
                                        dy1 = relativeReflectiveCurveTo.getDy1() + y10;
                                        x10 += relativeReflectiveCurveTo.getDx2();
                                        dy22 = relativeReflectiveCurveTo.getDy2();
                                    } else {
                                        if (hVar3 instanceof h.ReflectiveCurveTo) {
                                            if (hVar2.getIsCurve()) {
                                                float f19 = 2;
                                                x10 = (x10 * f19) - arcStartX;
                                                y10 = (f19 * y10) - arcStartY;
                                            }
                                            h.ReflectiveCurveTo reflectiveCurveTo = (h.ReflectiveCurveTo) hVar3;
                                            q1Var.s(x10, y10, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                            x12 = reflectiveCurveTo.getX1();
                                            float y12 = reflectiveCurveTo.getY1();
                                            float x24 = reflectiveCurveTo.getX2();
                                            float y24 = reflectiveCurveTo.getY2();
                                            x10 = x24;
                                            y10 = y24;
                                            i10 = size;
                                            f10 = f15;
                                            i11 = i12;
                                            hVar = hVar3;
                                            arcStartY = y12;
                                        } else if (hVar3 instanceof h.RelativeQuadTo) {
                                            h.RelativeQuadTo relativeQuadTo = (h.RelativeQuadTo) hVar3;
                                            q1Var.m(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                            arcStartX = relativeQuadTo.getDx1() + x10;
                                            arcStartY = relativeQuadTo.getDy1() + y10;
                                            x10 += relativeQuadTo.getDx2();
                                            dy2 = relativeQuadTo.getDy2();
                                        } else if (hVar3 instanceof h.QuadTo) {
                                            h.QuadTo quadTo = (h.QuadTo) hVar3;
                                            q1Var.h(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                            arcStartX = quadTo.getX1();
                                            arcStartY = quadTo.getY1();
                                            x22 = quadTo.getX2();
                                            y22 = quadTo.getY2();
                                        } else if (hVar3 instanceof h.RelativeReflectiveQuadTo) {
                                            if (hVar2.getIsQuad()) {
                                                f11 = x10 - arcStartX;
                                                f12 = y10 - arcStartY;
                                            } else {
                                                f11 = f15;
                                                f12 = f11;
                                            }
                                            h.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (h.RelativeReflectiveQuadTo) hVar3;
                                            q1Var.m(f11, f12, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                            x12 = f11 + x10;
                                            float f20 = f12 + y10;
                                            x10 += relativeReflectiveQuadTo.getDx();
                                            y10 += relativeReflectiveQuadTo.getDy();
                                            arcStartY = f20;
                                            i10 = size;
                                            f10 = f15;
                                            i11 = i12;
                                            hVar = hVar3;
                                        } else if (hVar3 instanceof h.ReflectiveQuadTo) {
                                            if (hVar2.getIsQuad()) {
                                                float f21 = 2;
                                                x10 = (x10 * f21) - arcStartX;
                                                y10 = (f21 * y10) - arcStartY;
                                            }
                                            h.ReflectiveQuadTo reflectiveQuadTo = (h.ReflectiveQuadTo) hVar3;
                                            q1Var.h(x10, y10, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                            float f22 = x10;
                                            x10 = reflectiveQuadTo.getX();
                                            arcStartX = f22;
                                            i10 = size;
                                            f10 = f15;
                                            i11 = i12;
                                            arcStartY = y10;
                                            hVar = hVar3;
                                            y10 = reflectiveQuadTo.getY();
                                        } else if (hVar3 instanceof h.RelativeArcTo) {
                                            h.RelativeArcTo relativeArcTo = (h.RelativeArcTo) hVar3;
                                            float arcStartDx = relativeArcTo.getArcStartDx() + x10;
                                            float arcStartDy = relativeArcTo.getArcStartDy() + y10;
                                            f10 = f15;
                                            hVar = hVar3;
                                            i10 = size;
                                            i11 = i12;
                                            b(q1Var, x10, y10, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.getIsMoreThanHalf(), relativeArcTo.getIsPositiveArc());
                                            arcStartX = arcStartDx;
                                            x10 = arcStartX;
                                            arcStartY = arcStartDy;
                                        } else {
                                            i10 = size;
                                            f10 = f15;
                                            i11 = i12;
                                            hVar = hVar3;
                                            if (hVar instanceof h.ArcTo) {
                                                h.ArcTo arcTo = (h.ArcTo) hVar;
                                                b(q1Var, x10, y10, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.getIsMoreThanHalf(), arcTo.getIsPositiveArc());
                                                arcStartX = arcTo.getArcStartX();
                                                x10 = arcStartX;
                                                arcStartY = arcTo.getArcStartY();
                                            }
                                        }
                                        arcStartX = x12;
                                    }
                                    i12 = i11 + 1;
                                    q1Var2 = q1Var;
                                    hVar2 = hVar;
                                    size = i10;
                                    f15 = f10;
                                    list2 = list;
                                }
                                y10 += dy22;
                                arcStartX = dx1;
                                arcStartY = dy1;
                            }
                            y10 = y22;
                            x10 = x22;
                        }
                        y10 += dy2;
                    }
                    i10 = size;
                    f10 = f15;
                    i11 = i12;
                }
                hVar = hVar3;
                i12 = i11 + 1;
                q1Var2 = q1Var;
                hVar2 = hVar;
                size = i10;
                f15 = f10;
                list2 = list;
            }
            y10 = arcStartY;
            i12 = i11 + 1;
            q1Var2 = q1Var;
            hVar2 = hVar;
            size = i10;
            f15 = f10;
            list2 = list;
        }
        return q1Var;
    }
}
