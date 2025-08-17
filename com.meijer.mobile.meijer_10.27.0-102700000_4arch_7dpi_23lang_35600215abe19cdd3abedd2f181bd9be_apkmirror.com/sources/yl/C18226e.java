package yl;

import com.launchdarkly.sdk.LDValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/launchdarkly/sdk/LDValue;", "", "a", "(Lcom/launchdarkly/sdk/LDValue;)Z", "featureflag_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: yl.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C18226e {
    public static final boolean a(LDValue lDValue) {
        Intrinsics.j(lDValue, "<this>");
        return lDValue.k() || lDValue.w() == 0;
    }
}
