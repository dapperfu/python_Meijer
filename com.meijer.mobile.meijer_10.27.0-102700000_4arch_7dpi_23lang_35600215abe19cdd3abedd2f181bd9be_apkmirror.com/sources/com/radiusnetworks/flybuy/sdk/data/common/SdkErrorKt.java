package com.radiusnetworks.flybuy.sdk.data.common;

import com.radiusnetworks.flybuy.sdk.data.error.CommonError;
import com.radiusnetworks.flybuy.sdk.data.error.CommonErrorType;
import com.radiusnetworks.flybuy.sdk.jobs.ResponseEventType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006H\u0007\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\u00060\tj\u0002`\nH\u0007¨\u0006\u000b"}, d2 = {"toSdkError", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "Lcom/radiusnetworks/flybuy/sdk/jobs/ResponseEventType;", "code", "", "messages", "", "", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "common_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SdkErrorKt {
    public static final SdkError toSdkError(ResponseEventType responseEventType, int i10, Map<String, ? extends List<String>> messages) {
        Intrinsics.j(responseEventType, "<this>");
        Intrinsics.j(messages, "messages");
        return new SdkError(responseEventType, i10, messages);
    }

    public static final SdkError toSdkError(Exception exc) {
        Intrinsics.j(exc, "<this>");
        String localizedMessage = exc.getLocalizedMessage();
        return localizedMessage != null ? new SdkError(ResponseEventType.FAILED, exc.hashCode(), MapsKt.g(new Pair(exc.getClass().getSimpleName(), CollectionsKt.e(localizedMessage)))) : new CommonError(CommonErrorType.UNKNOWN_ERROR, null, 2, null);
    }
}
