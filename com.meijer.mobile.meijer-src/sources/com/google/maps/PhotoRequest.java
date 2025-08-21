package com.google.maps;

import com.google.maps.ImageResult;
import com.google.maps.internal.ApiConfig;

/* loaded from: classes8.dex */
public class PhotoRequest extends PendingResultBase<ImageResult, PhotoRequest, ImageResult.Response> {
    static final ApiConfig API_CONFIG = new ApiConfig("/maps/api/place/photo");

    public PhotoRequest(GeoApiContext geoApiContext) {
        super(geoApiContext, API_CONFIG, ImageResult.Response.class);
    }

    public PhotoRequest maxHeight(int i10) {
        return param("maxheight", String.valueOf(i10));
    }

    public PhotoRequest maxWidth(int i10) {
        return param("maxwidth", String.valueOf(i10));
    }

    public PhotoRequest photoReference(String str) {
        return param("photoreference", str);
    }

    @Override // com.google.maps.PendingResultBase
    public /* bridge */ /* synthetic */ PendingResultBase channel(String str) {
        return super.channel(str);
    }

    @Override // com.google.maps.PendingResultBase
    public /* bridge */ /* synthetic */ PendingResultBase custom(String str, String str2) {
        return super.custom(str, str2);
    }

    @Override // com.google.maps.PendingResultBase
    public /* bridge */ /* synthetic */ PendingResultBase experienceIds(String[] strArr) {
        return super.experienceIds(strArr);
    }

    @Override // com.google.maps.PendingResultBase
    public /* bridge */ /* synthetic */ PendingResultBase header(String str, String str2) {
        return super.header(str, str2);
    }

    @Override // com.google.maps.PendingResultBase
    protected void validateRequest() {
        if (params().containsKey("photoreference")) {
            if (!params().containsKey("maxheight") && !params().containsKey("maxwidth")) {
                throw new IllegalArgumentException("Request must contain 'maxHeight' or 'maxWidth'.");
            }
            return;
        }
        throw new IllegalArgumentException("Request must contain 'photoReference'.");
    }
}
