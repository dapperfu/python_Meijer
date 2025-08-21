package Eh;

import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yh.C18316c;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u0017\u0010\u001dR\u0019\u0010#\u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0011\u0010\"R\u0017\u0010%\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b\u0015\u0010\u001d¨\u0006&"}, d2 = {"LEh/A;", "", "LEh/D;", "updateAccountResponse", "updatePasswordResponse", "<init>", "(LEh/D;LEh/D;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LEh/D;", "getUpdateAccountResponse", "()LEh/D;", "b", "getUpdatePasswordResponse", "c", "Z", "isAccountUpdateSuccess", "d", "isPasswordUpdateSuccess", "e", "()Z", "isSuccess", "Lbk/a;", "f", "Lbk/a;", "()Lbk/a;", "errorMessage", "g", "shouldFetchData", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eh.A, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class UpdateAccountInformationResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final UpdateConfirmationResponse updateAccountResponse;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final UpdateConfirmationResponse updatePasswordResponse;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isAccountUpdateSuccess;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isPasswordUpdateSuccess;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isSuccess;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a errorMessage;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldFetchData;

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateAccountInformationResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateAccountInformationResponse)) {
            return false;
        }
        UpdateAccountInformationResponse updateAccountInformationResponse = (UpdateAccountInformationResponse) other;
        return Intrinsics.e(this.updateAccountResponse, updateAccountInformationResponse.updateAccountResponse) && Intrinsics.e(this.updatePasswordResponse, updateAccountInformationResponse.updatePasswordResponse);
    }

    public UpdateAccountInformationResponse(UpdateConfirmationResponse updateConfirmationResponse, UpdateConfirmationResponse updateConfirmationResponse2) {
        this.updateAccountResponse = updateConfirmationResponse;
        this.updatePasswordResponse = updateConfirmationResponse2;
        boolean z10 = false;
        boolean z11 = (updateConfirmationResponse == null || updateConfirmationResponse.getIsSuccess()) ? false : true;
        this.isAccountUpdateSuccess = !z11;
        boolean z12 = (updateConfirmationResponse2 == null || updateConfirmationResponse2.getIsSuccess()) ? false : true;
        this.isPasswordUpdateSuccess = !z12;
        this.isSuccess = (z11 || z12) ? false : true;
        this.errorMessage = z11 ? AbstractC6392a.INSTANCE.d(C18316c.f171438n, new Object[0]) : z12 ? AbstractC6392a.INSTANCE.d(C18316c.f171439o, new Object[0]) : null;
        if ((updateConfirmationResponse != null && updateConfirmationResponse.getIsSuccess()) || (updateConfirmationResponse2 != null && updateConfirmationResponse2.getIsSuccess())) {
            z10 = true;
        }
        this.shouldFetchData = z10;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getShouldFetchData() {
        return this.shouldFetchData;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public int hashCode() {
        UpdateConfirmationResponse updateConfirmationResponse = this.updateAccountResponse;
        int iHashCode = (updateConfirmationResponse == null ? 0 : updateConfirmationResponse.hashCode()) * 31;
        UpdateConfirmationResponse updateConfirmationResponse2 = this.updatePasswordResponse;
        return iHashCode + (updateConfirmationResponse2 != null ? updateConfirmationResponse2.hashCode() : 0);
    }

    public String toString() {
        return "UpdateAccountInformationResponse(updateAccountResponse=" + this.updateAccountResponse + ", updatePasswordResponse=" + this.updatePasswordResponse + ')';
    }

    public /* synthetic */ UpdateAccountInformationResponse(UpdateConfirmationResponse updateConfirmationResponse, UpdateConfirmationResponse updateConfirmationResponse2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : updateConfirmationResponse, (i10 & 2) != 0 ? null : updateConfirmationResponse2);
    }
}
