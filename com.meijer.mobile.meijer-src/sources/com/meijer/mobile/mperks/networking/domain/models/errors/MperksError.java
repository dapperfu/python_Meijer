package com.meijer.mobile.mperks.networking.domain.models.errors;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/errors/MperksError;", "", "code", "Lcom/meijer/mobile/mperks/networking/domain/models/errors/MperksErrorCode;", "error", "", "message", "<init>", "(Lcom/meijer/mobile/mperks/networking/domain/models/errors/MperksErrorCode;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Lcom/meijer/mobile/mperks/networking/domain/models/errors/MperksErrorCode;", "getError", "()Ljava/lang/String;", "getMessage", "toException", "Lcom/meijer/mobile/mperks/networking/domain/models/errors/MperksApiException;", "cause", "", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MperksError {
    private final MperksErrorCode code;
    private final String error;
    private final String message;

    public static /* synthetic */ MperksError copy$default(MperksError mperksError, MperksErrorCode mperksErrorCode, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mperksErrorCode = mperksError.code;
        }
        if ((i10 & 2) != 0) {
            str = mperksError.error;
        }
        if ((i10 & 4) != 0) {
            str2 = mperksError.message;
        }
        return mperksError.copy(mperksErrorCode, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final MperksErrorCode getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final MperksError copy(MperksErrorCode code, String error, String message) {
        Intrinsics.j(code, "code");
        Intrinsics.j(error, "error");
        Intrinsics.j(message, "message");
        return new MperksError(code, error, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksError)) {
            return false;
        }
        MperksError mperksError = (MperksError) other;
        return this.code == mperksError.code && Intrinsics.e(this.error, mperksError.error) && Intrinsics.e(this.message, mperksError.message);
    }

    public int hashCode() {
        return (((this.code.hashCode() * 31) + this.error.hashCode()) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "MperksError(code=" + this.code + ", error=" + this.error + ", message=" + this.message + ')';
    }

    public MperksError(MperksErrorCode code, String error, String message) {
        Intrinsics.j(code, "code");
        Intrinsics.j(error, "error");
        Intrinsics.j(message, "message");
        this.code = code;
        this.error = error;
        this.message = message;
    }

    public static /* synthetic */ MperksApiException toException$default(MperksError mperksError, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        return mperksError.toException(th2);
    }

    public final MperksErrorCode getCode() {
        return this.code;
    }

    public final String getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }

    public final MperksApiException toException(Throwable cause) {
        return new MperksApiException(this, cause);
    }
}
