package com.scandit.datacapture.core.internal.module.https;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import java.util.HashMap;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class NativeHttpsRequest {
    final byte[] body;
    final HashMap<String, String> headers;
    final NativeHttpsMethod method;
    final String url;

    public byte[] getBody() {
        return this.body;
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    public NativeHttpsMethod getMethod() {
        return this.method;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "NativeHttpsRequest{method=" + this.method + ",url=" + this.url + ",headers=" + this.headers + ",body=" + this.body + "}";
    }

    public NativeHttpsRequest(NativeHttpsMethod nativeHttpsMethod, String str, HashMap<String, String> map, byte[] bArr) {
        this.method = nativeHttpsMethod;
        this.url = str;
        this.headers = map;
        this.body = bArr;
    }
}
