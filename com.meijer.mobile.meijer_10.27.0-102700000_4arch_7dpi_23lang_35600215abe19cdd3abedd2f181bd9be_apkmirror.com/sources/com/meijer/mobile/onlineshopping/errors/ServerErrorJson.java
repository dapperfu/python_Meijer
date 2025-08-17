package com.meijer.mobile.onlineshopping.errors;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJJ\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/onlineshopping/errors/ServerErrorJson;", "", "", "errorMessage", "message", "exception", "type", "", "statusCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/meijer/mobile/onlineshopping/errors/ServerErrorJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "errors_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ServerErrorJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorMessage;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String exception;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer statusCode;

    public ServerErrorJson() {
        this(null, null, null, null, null, 31, null);
    }

    public final ServerErrorJson copy(@g(name = "errorMessage") String errorMessage, @g(name = "message") String message, @g(name = "exception") String exception, @g(name = "type") String type, @g(name = "statusCode") Integer statusCode) {
        Intrinsics.j(type, "type");
        return new ServerErrorJson(errorMessage, message, exception, type, statusCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerErrorJson)) {
            return false;
        }
        ServerErrorJson serverErrorJson = (ServerErrorJson) other;
        return Intrinsics.e(this.errorMessage, serverErrorJson.errorMessage) && Intrinsics.e(this.message, serverErrorJson.message) && Intrinsics.e(this.exception, serverErrorJson.exception) && Intrinsics.e(this.type, serverErrorJson.type) && Intrinsics.e(this.statusCode, serverErrorJson.statusCode);
    }

    public int hashCode() {
        String str = this.errorMessage;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.exception;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.type.hashCode()) * 31;
        Integer num = this.statusCode;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ServerErrorJson(errorMessage=" + this.errorMessage + ", message=" + this.message + ", exception=" + this.exception + ", type=" + this.type + ", statusCode=" + this.statusCode + ')';
    }

    public ServerErrorJson(@g(name = "errorMessage") String str, @g(name = "message") String str2, @g(name = "exception") String str3, @g(name = "type") String type, @g(name = "statusCode") Integer num) {
        Intrinsics.j(type, "type");
        this.errorMessage = str;
        this.message = str2;
        this.exception = str3;
        this.type = type;
        this.statusCode = num;
    }

    /* renamed from: a, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: b, reason: from getter */
    public final String getException() {
        return this.exception;
    }

    /* renamed from: c, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    /* renamed from: e, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public /* synthetic */ ServerErrorJson(String str, String str2, String str3, String str4, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? "ServerError" : str4, (i10 & 16) != 0 ? null : num);
    }
}
