package com.scandit.datacapture.core.internal.module.https;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import java.util.HashMap;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class NativeHttpsResponse {
    final byte[] body;
    final HashMap<String, String> headers;
    final int statusCode;

    public byte[] getBody() {
        return this.body;
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String toString() {
        return "NativeHttpsResponse{statusCode=" + this.statusCode + ",headers=" + this.headers + ",body=" + this.body + "}";
    }

    public NativeHttpsResponse(int i10, HashMap<String, String> map, byte[] bArr) {
        this.statusCode = i10;
        this.headers = map;
        this.body = bArr;
    }
}
