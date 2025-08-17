package com.radiusnetworks.flybuy.api.network.common;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \n*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/radiusnetworks/flybuy/api/network/common/ApiResponse;", "T", "", "", "code", "I", "getCode", "()I", "<init>", "(I)V", "Companion", "com/radiusnetworks/flybuy/api/network/common/a", "Lcom/radiusnetworks/flybuy/api/network/common/ApiEmptyResponse;", "Lcom/radiusnetworks/flybuy/api/network/common/ApiErrorResponse;", "Lcom/radiusnetworks/flybuy/api/network/common/ApiSuccessResponse;", "api_defaultRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public abstract class ApiResponse<T> {
    public static final a Companion = new a();
    private final int code;

    private ApiResponse(int i10) {
        this.code = i10;
    }

    public int getCode() {
        return this.code;
    }

    public /* synthetic */ ApiResponse(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }
}
