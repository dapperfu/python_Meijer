package com.google.maps;

import com.google.maps.errors.ApiException;
import com.google.maps.internal.ApiConfig;
import com.google.maps.internal.ApiResponse;
import com.google.maps.model.DistanceMatrix;
import com.google.maps.model.DistanceMatrixRow;

/* loaded from: classes8.dex */
public class DistanceMatrixApi {
    static final ApiConfig API_CONFIG = new ApiConfig("/maps/api/distancematrix/json");

    public static class Response implements ApiResponse<DistanceMatrix> {
        public String[] destinationAddresses;
        public String errorMessage;
        public String[] originAddresses;
        public DistanceMatrixRow[] rows;
        public String status;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.maps.internal.ApiResponse
        public DistanceMatrix getResult() {
            return new DistanceMatrix(this.originAddresses, this.destinationAddresses, this.rows);
        }

        @Override // com.google.maps.internal.ApiResponse
        public boolean successful() {
            return "OK".equals(this.status);
        }

        @Override // com.google.maps.internal.ApiResponse
        public ApiException getError() {
            if (successful()) {
                return null;
            }
            return ApiException.from(this.status, this.errorMessage);
        }
    }

    public static DistanceMatrixApiRequest newRequest(GeoApiContext geoApiContext) {
        return new DistanceMatrixApiRequest(geoApiContext);
    }

    private DistanceMatrixApi() {
    }

    public static DistanceMatrixApiRequest getDistanceMatrix(GeoApiContext geoApiContext, String[] strArr, String[] strArr2) {
        return newRequest(geoApiContext).origins(strArr).destinations(strArr2);
    }
}
