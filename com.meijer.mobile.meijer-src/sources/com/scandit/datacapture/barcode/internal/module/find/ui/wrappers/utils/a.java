package com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.utils;

import com.scandit.datacapture.core.common.geometry.Anchor;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f123325a;

    static {
        Anchor anchor = Anchor.TOP_LEFT;
        Anchor anchor2 = Anchor.BOTTOM_LEFT;
        f123325a = MapsKt.o(TuplesKt.a(anchor, anchor2), TuplesKt.a(Anchor.TOP_CENTER, Anchor.CENTER_LEFT), TuplesKt.a(Anchor.TOP_RIGHT, anchor), TuplesKt.a(anchor2, Anchor.BOTTOM_RIGHT));
    }
}
