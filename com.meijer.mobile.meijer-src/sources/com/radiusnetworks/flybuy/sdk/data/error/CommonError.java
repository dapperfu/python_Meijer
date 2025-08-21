package com.radiusnetworks.flybuy.sdk.data.error;

import androidx.annotation.Keep;
import com.radiusnetworks.flybuy.sdk.data.common.GenericSdkError;
import com.radiusnetworks.flybuy.sdk.jobs.ResponseEventType;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/error/CommonError;", "Lcom/radiusnetworks/flybuy/sdk/data/common/GenericSdkError;", "Lcom/radiusnetworks/flybuy/sdk/data/error/CommonErrorType;", "errorType", "responseEventType", "Lcom/radiusnetworks/flybuy/sdk/jobs/ResponseEventType;", "(Lcom/radiusnetworks/flybuy/sdk/data/error/CommonErrorType;Lcom/radiusnetworks/flybuy/sdk/jobs/ResponseEventType;)V", "description", "", "Companion", "common_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CommonError extends GenericSdkError<CommonErrorType> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/error/CommonError$Companion;", "", "()V", "exceptionWith", "Lcom/radiusnetworks/flybuy/sdk/data/error/CommonError;", "description", "", "common_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final CommonError exceptionWith(String description) {
            CommonErrorType commonErrorType = CommonErrorType.EXCEPTION;
            if (description == null) {
                description = "Unknown Exception";
            }
            commonErrorType.setDescription(description);
            return new CommonError(commonErrorType, null, 2, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ CommonError(CommonErrorType commonErrorType, ResponseEventType responseEventType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(commonErrorType, (i10 & 2) != 0 ? ResponseEventType.FAILED : responseEventType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonError(CommonErrorType errorType, ResponseEventType responseEventType) {
        super(responseEventType, errorType, MapsKt.g(new Pair("error", CollectionsKt.e(errorType.getDescription()))));
        Intrinsics.j(errorType, "errorType");
        Intrinsics.j(responseEventType, "responseEventType");
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.common.SdkError
    public String description() {
        return getErrorType().getDescription();
    }
}
