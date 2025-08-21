package com.meijer.mobile.mperks.networking.domain.models.errors;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/errors/MperksApiException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "details", "Lcom/meijer/mobile/mperks/networking/domain/models/errors/MperksError;", "cause", "", "<init>", "(Lcom/meijer/mobile/mperks/networking/domain/models/errors/MperksError;Ljava/lang/Throwable;)V", "getDetails", "()Lcom/meijer/mobile/mperks/networking/domain/models/errors/MperksError;", "getCause", "()Ljava/lang/Throwable;", "message", "", "getMessage", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MperksApiException extends RuntimeException {
    private final Throwable cause;
    private final MperksError details;

    public /* synthetic */ MperksApiException(MperksError mperksError, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mperksError, (i10 & 2) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MperksApiException(MperksError details, Throwable th2) {
        super(details.getMessage(), th2);
        Intrinsics.j(details, "details");
        this.details = details;
        this.cause = th2;
    }

    public boolean equals(Object other) {
        if (!(other instanceof MperksApiException)) {
            return false;
        }
        MperksApiException mperksApiException = (MperksApiException) other;
        if (!Intrinsics.e(this.details, mperksApiException.details)) {
            return false;
        }
        if (Intrinsics.e(getCause(), mperksApiException.getCause())) {
            return true;
        }
        if (getCause() == null || mperksApiException.getCause() == null) {
            return false;
        }
        return Intrinsics.e(getCause().getMessage(), mperksApiException.getCause().getMessage());
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public final MperksError getDetails() {
        return this.details;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.details.getMessage();
    }

    public int hashCode() {
        int iHashCode = this.details.hashCode() * 31;
        Throwable cause = getCause();
        return ((iHashCode + (cause != null ? cause.hashCode() : 0)) * 31) + getMessage().hashCode();
    }
}
