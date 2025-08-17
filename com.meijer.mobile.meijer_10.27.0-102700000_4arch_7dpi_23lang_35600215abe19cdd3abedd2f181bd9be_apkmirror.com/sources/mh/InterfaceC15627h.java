package mh;

import com.launchdarkly.sdk.EvaluationReason;
import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.LDValue;
import java.io.Closeable;

/* renamed from: mh.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC15627h extends Closeable {
    void I3(LDContext lDContext, String str, int i10, int i11, LDValue lDValue, EvaluationReason evaluationReason, LDValue lDValue2, boolean z10, Long l10);

    void a3(LDContext lDContext);

    void k1(boolean z10);

    void w3(boolean z10);
}
