package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.sdk.common.geometry.Vector;
import com.scandit.datacapture.core.internal.sdk.extensions.PointExtensionsKt;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes12.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public Point f122314a;

    /* renamed from: b, reason: collision with root package name */
    public float f122315b;

    /* renamed from: c, reason: collision with root package name */
    public Vector f122316c;

    /* renamed from: d, reason: collision with root package name */
    public final z f122317d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f122318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ G f122319f;

    public static float a(float f10, int i10) {
        S.f122360a.getClass();
        return RangesKt.n((f10 / (((Number) Q.f122359b.getValue()).floatValue() * i10)) * 1.2f, 0.5f, 1.0f);
    }

    public E(G g10, Point center, float f10, Vector normalizedVector, z clusterIndicatorInfo) {
        Intrinsics.j(center, "center");
        Intrinsics.j(normalizedVector, "normalizedVector");
        Intrinsics.j(clusterIndicatorInfo, "clusterIndicatorInfo");
        this.f122319f = g10;
        this.f122314a = center;
        this.f122315b = f10;
        this.f122316c = normalizedVector;
        this.f122317d = clusterIndicatorInfo;
        this.f122318e = new ArrayList();
    }

    public static Point a(int i10, Point point, float f10, int i11, Vector vector) {
        S.f122360a.getClass();
        float fFloatValue = ((Number) Q.f122359b.getValue()).floatValue() * (((-i11) / 2.0f) + i10 + 0.5f) * f10;
        return PointExtensionsKt.plus(point, new Point(vector.getDx() * fFloatValue, vector.getDy() * fFloatValue));
    }

    public final L a(int i10, Function0 function0) {
        L l10 = (L) CollectionsKt.v0(this.f122318e, i10);
        if (l10 != null) {
            return l10;
        }
        Object objInvoke = function0.invoke();
        G g10 = this.f122319f;
        L l11 = (L) objInvoke;
        g10.f122321a.addView(l11);
        this.f122318e.add(l11);
        if (g10.f122323c) {
            l11.b(false);
            l11.a(true);
            return l11;
        }
        L.b(l11.f122341b, true);
        l11.f122342c.a(true);
        return l11;
    }
}
