package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder;

import com.scandit.datacapture.core.common.geometry.Point;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class g extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final g f123670a = new g();

    public g() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        Intrinsics.j((Point) obj, "<anonymous parameter 0>");
        return Boolean.FALSE;
    }
}
