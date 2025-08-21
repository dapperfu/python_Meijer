package com.radiusnetworks.flybuy.api.network.common;

import androidx.annotation.Keep;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/radiusnetworks/flybuy/api/network/common/ApiEmptyResponse;", "T", "Lcom/radiusnetworks/flybuy/api/network/common/ApiResponse;", "code", "", "(I)V", "getCode", "()I", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ApiEmptyResponse<T> extends ApiResponse<T> {
    private final int code;

    public ApiEmptyResponse(int i10) {
        super(i10, null);
        this.code = i10;
    }

    @Override // com.radiusnetworks.flybuy.api.network.common.ApiResponse
    public int getCode() {
        return this.code;
    }
}
