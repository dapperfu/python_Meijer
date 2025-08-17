package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final int f121412a;

    /* renamed from: b, reason: collision with root package name */
    public final Quadrilateral f121413b;

    /* renamed from: c, reason: collision with root package name */
    public final Point f121414c;

    /* renamed from: d, reason: collision with root package name */
    public final float f121415d;

    public V(int i10, Quadrilateral position, Point centerPosition, float f10) {
        Intrinsics.j(position, "position");
        Intrinsics.j(centerPosition, "centerPosition");
        this.f121412a = i10;
        this.f121413b = position;
        this.f121414c = centerPosition;
        this.f121415d = f10;
    }
}
