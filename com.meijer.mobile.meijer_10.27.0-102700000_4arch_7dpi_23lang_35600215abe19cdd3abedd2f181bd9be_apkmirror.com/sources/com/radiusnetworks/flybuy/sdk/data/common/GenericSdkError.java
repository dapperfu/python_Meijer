package com.radiusnetworks.flybuy.sdk.data.common;

import androidx.annotation.Keep;
import com.radiusnetworks.flybuy.sdk.jobs.ResponseEventType;
import java.lang.Enum;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0005\b\u0017\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\n0\b¢\u0006\u0002\u0010\u000bR\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/common/GenericSdkError;", "T", "", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "type", "Lcom/radiusnetworks/flybuy/sdk/jobs/ResponseEventType;", "errorType", "messages", "", "", "", "(Lcom/radiusnetworks/flybuy/sdk/jobs/ResponseEventType;Ljava/lang/Enum;Ljava/util/Map;)V", "getErrorType", "()Ljava/lang/Enum;", "Ljava/lang/Enum;", "common_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class GenericSdkError<T extends Enum<T>> extends SdkError {
    private final T errorType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericSdkError(ResponseEventType type, T errorType, Map<String, ? extends List<String>> messages) {
        super(type, errorType.ordinal(), messages);
        Intrinsics.j(type, "type");
        Intrinsics.j(errorType, "errorType");
        Intrinsics.j(messages, "messages");
        this.errorType = errorType;
    }

    public final T getErrorType() {
        return this.errorType;
    }
}
