package com.google.maps;

import com.google.maps.errors.ApiException;
import com.google.maps.internal.ApiResponse;
import java.io.Serializable;

/* loaded from: classes8.dex */
public class ImageResult implements Serializable {
    private static final long serialVersionUID = 1;
    public final String contentType;
    public final byte[] imageData;

    public static class Response implements ApiResponse<ImageResult> {
        @Override // com.google.maps.internal.ApiResponse
        public ApiException getError() {
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.maps.internal.ApiResponse
        public ImageResult getResult() {
            return null;
        }

        @Override // com.google.maps.internal.ApiResponse
        public boolean successful() {
            return true;
        }
    }

    public ImageResult(String str, byte[] bArr) {
        this.imageData = bArr;
        this.contentType = str;
    }
}
