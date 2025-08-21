package com.radiusnetworks.flybuy.api.model;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0007J\u001d\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J3\u0010\u000e\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR%\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/ErrorResponse;", "", "errors", "", "", "", "error", "(Ljava/util/Map;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getErrors", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ErrorResponse {
    private final String error;
    private final Map<String, List<String>> errors;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, Map map, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = errorResponse.errors;
        }
        if ((i10 & 2) != 0) {
            str = errorResponse.error;
        }
        return errorResponse.copy(map, str);
    }

    public final Map<String, List<String>> component1() {
        return this.errors;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final ErrorResponse copy(Map<String, ? extends List<String>> errors, String error) {
        return new ErrorResponse(errors, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) other;
        return Intrinsics.e(this.errors, errorResponse.errors) && Intrinsics.e(this.error, errorResponse.error);
    }

    public int hashCode() {
        Map<String, List<String>> map = this.errors;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.error;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ErrorResponse(errors=" + this.errors + ", error=" + this.error + ')';
    }

    public final String getError() {
        return this.error;
    }

    public final Map<String, List<String>> getErrors() {
        return this.errors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ErrorResponse(Map<String, ? extends List<String>> map, String str) {
        this.errors = map;
        this.error = str;
    }
}
