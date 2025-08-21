package com.radiusnetworks.flybuy.sdk.data.error;

import androidx.annotation.Keep;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.jobs.ResponseEventType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u0005¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/error/ApiError;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "code", "", "descriptions", "", "", "", "(ILjava/util/Map;)V", "common_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ApiError extends SdkError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiError(int i10, Map<String, ? extends List<String>> descriptions) {
        super(ResponseEventType.FAILED, i10, descriptions);
        Intrinsics.j(descriptions, "descriptions");
    }
}
