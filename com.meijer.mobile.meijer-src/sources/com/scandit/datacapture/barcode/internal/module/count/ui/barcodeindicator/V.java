package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final int f122364a;

    /* renamed from: b, reason: collision with root package name */
    public final Quadrilateral f122365b;

    /* renamed from: c, reason: collision with root package name */
    public final Point f122366c;

    /* renamed from: d, reason: collision with root package name */
    public final float f122367d;

    public V(int i10, Quadrilateral position, Point centerPosition, float f10) {
        Intrinsics.j(position, "position");
        Intrinsics.j(centerPosition, "centerPosition");
        this.f122364a = i10;
        this.f122365b = position;
        this.f122366c = centerPosition;
        this.f122367d = f10;
    }
}
