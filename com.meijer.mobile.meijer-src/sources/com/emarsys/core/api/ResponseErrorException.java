package com.emarsys.core.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0012\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/emarsys/core/api/ResponseErrorException;", "Ljava/lang/Exception;", "", "statusCode", "", "statusMessage", "body", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ResponseErrorException extends Exception {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int statusCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String statusMessage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String body;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseErrorException)) {
            return false;
        }
        ResponseErrorException responseErrorException = (ResponseErrorException) other;
        return this.statusCode == responseErrorException.statusCode && Intrinsics.e(this.statusMessage, responseErrorException.statusMessage) && Intrinsics.e(this.body, responseErrorException.body);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.statusCode) * 31;
        String str = this.statusMessage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.body;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "ResponseErrorException(statusCode=" + this.statusCode + ", statusMessage=" + this.statusMessage + ", body=" + this.body + ")";
    }

    /* renamed from: a, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* renamed from: b, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    /* renamed from: c, reason: from getter */
    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public ResponseErrorException(int i10, String str, String str2) {
        super(str);
        this.statusCode = i10;
        this.statusMessage = str;
        this.body = str2;
    }
}
