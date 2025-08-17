package com.radiusnetworks.flybuy.api.model;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003¢\u0006\u0002\u0010\u0006J\u001b\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003HÆ\u0003J%\u0010\n\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R#\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/ErrorResponse;", "", "errors", "", "", "", "(Ljava/util/Map;)V", "getErrors", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ErrorResponse {
    private final Map<String, List<String>> errors;

    /* JADX WARN: Multi-variable type inference failed */
    public ErrorResponse(Map<String, ? extends List<String>> errors) {
        Intrinsics.j(errors, "errors");
        this.errors = errors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = errorResponse.errors;
        }
        return errorResponse.copy(map);
    }

    public final Map<String, List<String>> component1() {
        return this.errors;
    }

    public final ErrorResponse copy(Map<String, ? extends List<String>> errors) {
        Intrinsics.j(errors, "errors");
        return new ErrorResponse(errors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ErrorResponse) && Intrinsics.e(this.errors, ((ErrorResponse) other).errors);
    }

    public final Map<String, List<String>> getErrors() {
        return this.errors;
    }

    public int hashCode() {
        return this.errors.hashCode();
    }

    public String toString() {
        return "ErrorResponse(errors=" + this.errors + ')';
    }
}
