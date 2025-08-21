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

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final PointWithUnit f123442e;

    /* renamed from: f, reason: collision with root package name */
    public static final PointWithUnit f123443f;

    /* renamed from: g, reason: collision with root package name */
    public static final PointWithUnit f123444g;

    /* renamed from: h, reason: collision with root package name */
    public static final PointWithUnit f123445h;

    /* renamed from: i, reason: collision with root package name */
    public static final List f123446i;

    /* renamed from: j, reason: collision with root package name */
    public static final List f123447j;

    /* renamed from: k, reason: collision with root package name */
    public static final Map f123448k;

    /* renamed from: l, reason: collision with root package name */
    public static final Anchor f123449l;

    /* renamed from: m, reason: collision with root package name */
    public static final Anchor f123450m;

    /* renamed from: n, reason: collision with root package name */
    public static final Anchor f123451n;

    /* renamed from: a, reason: collision with root package name */
    public List f123452a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f123453b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f123454c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f123455d;

    static {
        MeasureUnit measureUnit = MeasureUnit.DIP;
        f123442e = PointWithUnitUtilsKt.PointWithUnit(16.0f, 16.0f, measureUnit);
        f123443f = PointWithUnitUtilsKt.PointWithUnit(0.0f, 16.0f, measureUnit);
        f123444g = PointWithUnitUtilsKt.PointWithUnit(16.0f, 0.0f, measureUnit);
        f123445h = PointWithUnitUtilsKt.PointWithUnit(40.0f, 32.0f, measureUnit);
        Anchor anchor = Anchor.TOP_LEFT;
        Anchor anchor2 = Anchor.TOP_CENTER;
        Anchor anchor3 = Anchor.TOP_RIGHT;
        Anchor anchor4 = Anchor.BOTTOM_LEFT;
        f123446i = CollectionsKt.p(anchor, anchor2, anchor3, anchor4);
        f123447j = CollectionsKt.p(anchor, anchor2, anchor3, anchor4);
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
        f123448k = MapsKt.o(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, TuplesKt.a(anchor4, anchor9), TuplesKt.a(anchor6, anchor8), TuplesKt.a(anchor9, anchor3));
        f123449l = anchor4;
        f123450m = anchor;
        f123451n = anchor;
    }

    public f(Context context) {
        Intrinsics.j(context, "context");
        this.f123452a = CollectionsKt.m();
        this.f123453b = LazyKt.b(new e(context));
        this.f123454c = LazyKt.b(new d(context));
        this.f123455d = LazyKt.b(new c(context));
    }
}
