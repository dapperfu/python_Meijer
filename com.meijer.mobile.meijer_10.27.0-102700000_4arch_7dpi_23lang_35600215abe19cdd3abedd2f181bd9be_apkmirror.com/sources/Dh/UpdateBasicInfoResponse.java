package Dh;

import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import xh.C18054c;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0017\u0010!\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010 R\u0019\u0010&\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0012\u0010%R\u0019\u0010(\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b\u0016\u0010%R\u0017\u0010*\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b)\u0010\u001b\u001a\u0004\b\u001a\u0010 ¨\u0006+"}, d2 = {"LDh/B;", "", "LDh/C;", "accountUpdateResponse", "LEh/f;", "phoneUpdateResponse", "<init>", "(LDh/C;LEh/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LDh/C;", "getAccountUpdateResponse", "()LDh/C;", "b", "LEh/f;", "getPhoneUpdateResponse", "()LEh/f;", "c", "Z", "isAccountUpdateSuccess", "d", "isPhoneUpdateSuccess", "e", "()Z", "isSuccess", "Lak/a;", "f", "Lak/a;", "()Lak/a;", "errorMessage", "g", "phoneConflictErrorMessage", "h", "shouldFetchData", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Dh.B, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class UpdateBasicInfoResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final UpdateConfirmationResponse accountUpdateResponse;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Eh.f phoneUpdateResponse;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isAccountUpdateSuccess;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isPhoneUpdateSuccess;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isSuccess;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a errorMessage;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a phoneConflictErrorMessage;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldFetchData;

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateBasicInfoResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateBasicInfoResponse)) {
            return false;
        }
        UpdateBasicInfoResponse updateBasicInfoResponse = (UpdateBasicInfoResponse) other;
        return Intrinsics.e(this.accountUpdateResponse, updateBasicInfoResponse.accountUpdateResponse) && this.phoneUpdateResponse == updateBasicInfoResponse.phoneUpdateResponse;
    }

    public UpdateBasicInfoResponse(UpdateConfirmationResponse updateConfirmationResponse, Eh.f fVar) {
        this.accountUpdateResponse = updateConfirmationResponse;
        this.phoneUpdateResponse = fVar;
        boolean z10 = true;
        boolean z11 = (updateConfirmationResponse == null || updateConfirmationResponse.getIsSuccess()) ? false : true;
        this.isAccountUpdateSuccess = !z11;
        boolean z12 = fVar == null || fVar == Eh.f.f9055a;
        this.isPhoneUpdateSuccess = z12;
        this.isSuccess = !z11 && z12;
        this.errorMessage = (z11 || fVar == Eh.f.f9057c) ? AbstractC5607a.INSTANCE.d(C18054c.f169661n, new Object[0]) : null;
        this.phoneConflictErrorMessage = fVar == Eh.f.f9056b ? AbstractC5607a.INSTANCE.d(C18054c.f169657j, new Object[0]) : null;
        if ((updateConfirmationResponse == null || !updateConfirmationResponse.getIsSuccess()) && fVar != Eh.f.f9055a) {
            z10 = false;
        }
        this.shouldFetchData = z10;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getPhoneConflictErrorMessage() {
        return this.phoneConflictErrorMessage;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getShouldFetchData() {
        return this.shouldFetchData;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public int hashCode() {
        UpdateConfirmationResponse updateConfirmationResponse = this.accountUpdateResponse;
        int iHashCode = (updateConfirmationResponse == null ? 0 : updateConfirmationResponse.hashCode()) * 31;
        Eh.f fVar = this.phoneUpdateResponse;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "UpdateBasicInfoResponse(accountUpdateResponse=" + this.accountUpdateResponse + ", phoneUpdateResponse=" + this.phoneUpdateResponse + ')';
    }

    public /* synthetic */ UpdateBasicInfoResponse(UpdateConfirmationResponse updateConfirmationResponse, Eh.f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : updateConfirmationResponse, (i10 & 2) != 0 ? null : fVar);
    }
}
