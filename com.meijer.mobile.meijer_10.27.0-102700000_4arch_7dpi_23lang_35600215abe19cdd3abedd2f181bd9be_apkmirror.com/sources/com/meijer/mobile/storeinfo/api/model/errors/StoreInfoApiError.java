package com.meijer.mobile.storeinfo.api.model.errors;

import ar.InterfaceC6146b;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJT\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001d\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006!"}, d2 = {"Lcom/meijer/mobile/storeinfo/api/model/errors/StoreInfoApiError;", "Lar/b;", "", "message", "type", "reason", "subject", "subjectType", "", "statusCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/meijer/mobile/storeinfo/api/model/errors/StoreInfoApiError;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMessage", "b", "e", "c", "d", "f", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "storeinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class StoreInfoApiError implements InterfaceC6146b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reason;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subject;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subjectType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer statusCode;

    public StoreInfoApiError(@g(name = "message") String message, @g(name = "type") String type, @g(name = "reason") String str, @g(name = "subject") String str2, @g(name = "subjectType") String str3, @g(name = "statusCode") Integer num) {
        Intrinsics.j(message, "message");
        Intrinsics.j(type, "type");
        this.message = message;
        this.type = type;
        this.reason = str;
        this.subject = str2;
        this.subjectType = str3;
        this.statusCode = num;
    }

    public final StoreInfoApiError copy(@g(name = "message") String message, @g(name = "type") String type, @g(name = "reason") String reason, @g(name = "subject") String subject, @g(name = "subjectType") String subjectType, @g(name = "statusCode") Integer statusCode) {
        Intrinsics.j(message, "message");
        Intrinsics.j(type, "type");
        return new StoreInfoApiError(message, type, reason, subject, subjectType, statusCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreInfoApiError)) {
            return false;
        }
        StoreInfoApiError storeInfoApiError = (StoreInfoApiError) other;
        return Intrinsics.e(this.message, storeInfoApiError.message) && Intrinsics.e(this.type, storeInfoApiError.type) && Intrinsics.e(this.reason, storeInfoApiError.reason) && Intrinsics.e(this.subject, storeInfoApiError.subject) && Intrinsics.e(this.subjectType, storeInfoApiError.subjectType) && Intrinsics.e(this.statusCode, storeInfoApiError.statusCode);
    }

    public int hashCode() {
        int iHashCode = ((this.message.hashCode() * 31) + this.type.hashCode()) * 31;
        String str = this.reason;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subject;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subjectType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.statusCode;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "StoreInfoApiError(message=" + this.message + ", type=" + this.type + ", reason=" + this.reason + ", subject=" + this.subject + ", subjectType=" + this.subjectType + ", statusCode=" + this.statusCode + ')';
    }

    /* renamed from: a, reason: from getter */
    public String getReason() {
        return this.reason;
    }

    /* renamed from: b, reason: from getter */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /* renamed from: c, reason: from getter */
    public String getSubject() {
        return this.subject;
    }

    /* renamed from: d, reason: from getter */
    public String getSubjectType() {
        return this.subjectType;
    }

    /* renamed from: e, reason: from getter */
    public String getType() {
        return this.type;
    }

    @Override // ar.InterfaceC6146b
    public String getMessage() {
        return this.message;
    }

    public /* synthetic */ StoreInfoApiError(String str, String str2, String str3, String str4, String str5, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? "UnspecifiedError" : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : num);
    }
}
