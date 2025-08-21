package com.meijer.mobile.reviews.ux.productreview;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "digit", "", "b", "(D)Ljava/lang/String;", "a", "(D)D", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class V0 {
    public static final String b(double d10) {
        return d10 % ((double) 1) == 0.0d ? String.valueOf((int) d10) : String.valueOf(d10);
    }

    public static final double a(double d10) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f143748a;
        String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d10)}, 1));
        Intrinsics.i(str, "format(...)");
        return Double.parseDouble(str);
    }
}
