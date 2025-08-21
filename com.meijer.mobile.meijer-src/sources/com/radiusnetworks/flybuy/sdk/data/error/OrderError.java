package com.radiusnetworks.flybuy.sdk.data.error;

import androidx.annotation.Keep;
import com.radiusnetworks.flybuy.sdk.data.common.GenericSdkError;
import com.radiusnetworks.flybuy.sdk.jobs.ResponseEventType;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/error/OrderError;", "Lcom/radiusnetworks/flybuy/sdk/data/common/GenericSdkError;", "Lcom/radiusnetworks/flybuy/sdk/data/error/OrderErrorType;", "errorType", "(Lcom/radiusnetworks/flybuy/sdk/data/error/OrderErrorType;)V", "description", "", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderError extends GenericSdkError<OrderErrorType> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderError(OrderErrorType errorType) {
        super(ResponseEventType.FAILED, errorType, MapsKt.g(new Pair("error", CollectionsKt.e(errorType.getDescription()))));
        Intrinsics.j(errorType, "errorType");
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.common.SdkError
    public String description() {
        return getErrorType().getDescription();
    }
}
