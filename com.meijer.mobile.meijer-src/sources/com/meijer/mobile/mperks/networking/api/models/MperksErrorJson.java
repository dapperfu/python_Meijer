package com.meijer.mobile.mperks.networking.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/MperksErrorJson;", "", "", "code", "", "error", "message", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/mperks/networking/api/models/MperksErrorJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "c", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MperksErrorJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String error;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    public MperksErrorJson(@g(name = "code") Integer num, @g(name = "error") String error, @g(name = "message") String message) {
        Intrinsics.j(error, "error");
        Intrinsics.j(message, "message");
        this.code = num;
        this.error = error;
        this.message = message;
    }

    public final MperksErrorJson copy(@g(name = "code") Integer code, @g(name = "error") String error, @g(name = "message") String message) {
        Intrinsics.j(error, "error");
        Intrinsics.j(message, "message");
        return new MperksErrorJson(code, error, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksErrorJson)) {
            return false;
        }
        MperksErrorJson mperksErrorJson = (MperksErrorJson) other;
        return Intrinsics.e(this.code, mperksErrorJson.code) && Intrinsics.e(this.error, mperksErrorJson.error) && Intrinsics.e(this.message, mperksErrorJson.message);
    }

    public int hashCode() {
        Integer num = this.code;
        return ((((num == null ? 0 : num.hashCode()) * 31) + this.error.hashCode()) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "MperksErrorJson(code=" + this.code + ", error=" + this.error + ", message=" + this.message + ')';
    }

    /* renamed from: a, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    /* renamed from: b, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: c, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public /* synthetic */ MperksErrorJson(Integer num, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, str, str2);
    }
}
