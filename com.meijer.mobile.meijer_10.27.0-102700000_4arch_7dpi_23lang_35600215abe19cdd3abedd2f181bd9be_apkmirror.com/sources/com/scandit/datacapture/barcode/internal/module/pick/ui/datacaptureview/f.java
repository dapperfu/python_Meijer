package com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview;

import android.content.Context;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnitUtilsKt;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final PointWithUnit f122490e;

    /* renamed from: f, reason: collision with root package name */
    public static final PointWithUnit f122491f;

    /* renamed from: g, reason: collision with root package name */
    public static final PointWithUnit f122492g;

    /* renamed from: h, reason: collision with root package name */
    public static final PointWithUnit f122493h;

    /* renamed from: i, reason: collision with root package name */
    public static final List f122494i;

    /* renamed from: j, reason: collision with root package name */
    public static final List f122495j;

    /* renamed from: k, reason: collision with root package name */
    public static final Map f122496k;

    /* renamed from: l, reason: collision with root package name */
    public static final Anchor f122497l;

    /* renamed from: m, reason: collision with root package name */
    public static final Anchor f122498m;

    /* renamed from: n, reason: collision with root package name */
    public static final Anchor f122499n;

    /* renamed from: a, reason: collision with root package name */
    public List f122500a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f122501b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f122502c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f122503d;

    static {
        MeasureUnit measureUnit = MeasureUnit.DIP;
        f122490e = PointWithUnitUtilsKt.PointWithUnit(16.0f, 16.0f, measureUnit);
        f122491f = PointWithUnitUtilsKt.PointWithUnit(0.0f, 16.0f, measureUnit);
        f122492g = PointWithUnitUtilsKt.PointWithUnit(16.0f, 0.0f, measureUnit);
        f122493h = PointWithUnitUtilsKt.PointWithUnit(40.0f, 32.0f, measureUnit);
        Anchor anchor = Anchor.TOP_LEFT;
        Anchor anchor2 = Anchor.TOP_CENTER;
        Anchor anchor3 = Anchor.TOP_RIGHT;
        Anchor anchor4 = Anchor.BOTTOM_LEFT;
        f122494i = CollectionsKt.p(anchor, anchor2, anchor3, anchor4);
        f122495j = CollectionsKt.p(anchor, anchor2, anchor3, anchor4);
        Pair pairA = TuplesKt.a(anchor, anchor4);
        Anchor anchor5 = Anchor.CENTER_LEFT;
        Pair pairA2 = TuplesKt.a(anchor2, anchor5);
        Pair pairA3 = TuplesKt.a(anchor3, anchor);
        Anchor anchor6 = Anchor.BOTTOM_CENTER;
        Pair pairA4 = TuplesKt.a(anchor5, anchor6);
        Anchor anchor7 = Anchor.CENTER;
        Pair pairA5 = TuplesKt.a(anchor7, anchor7);
        Anchor anchor8 = Anchor.CENTER_RIGHT;
        Pair pairA6 = TuplesKt.a(anchor8, anchor2);
        Anchor anchor9 = Anchor.BOTTOM_RIGHT;
        f122496k = MapsKt.o(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, TuplesKt.a(anchor4, anchor9), TuplesKt.a(anchor6, anchor8), TuplesKt.a(anchor9, anchor3));
        f122497l = anchor4;
        f122498m = anchor;
        f122499n = anchor;
    }

    public f(Context context) {
        Intrinsics.j(context, "context");
        this.f122500a = CollectionsKt.m();
        this.f122501b = LazyKt.b(new e(context));
        this.f122502c = LazyKt.b(new d(context));
        this.f122503d = LazyKt.b(new c(context));
    }
}
