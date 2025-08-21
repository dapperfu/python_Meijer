package com.google.android.libraries.places.widget.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/google/android/libraries/places/widget/kotlin/PlaceSelectionError;", "Lcom/google/android/libraries/places/widget/kotlin/PlaceSelectionResult;", "status", "Lcom/google/android/gms/common/api/Status;", "<init>", "(Lcom/google/android/gms/common/api/Status;)V", "getStatus", "()Lcom/google/android/gms/common/api/Status;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "java.com.google.android.libraries.places.widget.kotlin_kotlin_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PlaceSelectionError extends PlaceSelectionResult {

    /* renamed from: zza, reason: from toString */
    private final Status status;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceSelectionError(@RecentlyNonNull Status status) {
        super(null);
        Intrinsics.j(status, "status");
        this.status = status;
    }

    @RecentlyNonNull
    public static /* synthetic */ PlaceSelectionError copy$default(@RecentlyNonNull PlaceSelectionError placeSelectionError, @RecentlyNonNull Status status, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 1) != 0) {
            status = placeSelectionError.status;
        }
        return placeSelectionError.copy(status);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final PlaceSelectionError copy(@RecentlyNonNull Status status) {
        Intrinsics.j(status, "status");
        return new PlaceSelectionError(status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PlaceSelectionError) && Intrinsics.e(this.status, ((PlaceSelectionError) other).status);
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    public String toString() {
        Status status = this.status;
        StringBuilder sb2 = new StringBuilder(String.valueOf(status).length() + 28);
        sb2.append("PlaceSelectionError(status=");
        sb2.append(status);
        sb2.append(")");
        return sb2.toString();
    }
}
