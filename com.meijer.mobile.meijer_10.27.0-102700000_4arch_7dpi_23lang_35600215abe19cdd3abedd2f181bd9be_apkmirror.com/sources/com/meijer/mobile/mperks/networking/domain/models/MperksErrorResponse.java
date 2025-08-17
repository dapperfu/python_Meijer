package com.meijer.mobile.mperks.networking.domain.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperksErrorResponse;", "", "success", "", "error", "Lcom/meijer/mobile/mperks/networking/domain/models/Error;", "<init>", "(Ljava/lang/Boolean;Lcom/meijer/mobile/mperks/networking/domain/models/Error;)V", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getError", "()Lcom/meijer/mobile/mperks/networking/domain/models/Error;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Lcom/meijer/mobile/mperks/networking/domain/models/Error;)Lcom/meijer/mobile/mperks/networking/domain/models/MperksErrorResponse;", "equals", "other", "hashCode", "", "toString", "", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MperksErrorResponse {
    private final Error error;
    private final Boolean success;

    /* JADX WARN: Multi-variable type inference failed */
    public MperksErrorResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MperksErrorResponse copy$default(MperksErrorResponse mperksErrorResponse, Boolean bool, Error error, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = mperksErrorResponse.success;
        }
        if ((i10 & 2) != 0) {
            error = mperksErrorResponse.error;
        }
        return mperksErrorResponse.copy(bool, error);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component2, reason: from getter */
    public final Error getError() {
        return this.error;
    }

    public final MperksErrorResponse copy(@g(name = "success") Boolean success, @g(name = "payload") Error error) {
        return new MperksErrorResponse(success, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksErrorResponse)) {
            return false;
        }
        MperksErrorResponse mperksErrorResponse = (MperksErrorResponse) other;
        return Intrinsics.e(this.success, mperksErrorResponse.success) && Intrinsics.e(this.error, mperksErrorResponse.error);
    }

    public int hashCode() {
        Boolean bool = this.success;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Error error = this.error;
        return iHashCode + (error != null ? error.hashCode() : 0);
    }

    public String toString() {
        return "MperksErrorResponse(success=" + this.success + ", error=" + this.error + ')';
    }

    public MperksErrorResponse(@g(name = "success") Boolean bool, @g(name = "payload") Error error) {
        this.success = bool;
        this.error = error;
    }

    public final Error getError() {
        return this.error;
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public /* synthetic */ MperksErrorResponse(Boolean bool, Error error, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? new Error(null, null, 3, null) : error);
    }
}
