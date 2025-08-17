package com.meijer.mobile.accounts.payments.api.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import uh.PaymentInfoResponse;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0015B?\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJH\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0015\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/accounts/payments/api/models/network/SavePaymentDTO;", "", "", "success", "isCardValid", "", "errorMessage", "token", "tokenType", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/accounts/payments/api/models/network/SavePaymentDTO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "e", "c", "Ljava/lang/String;", "d", "f", "payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SavePaymentDTO {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean success;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCardValid;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorMessage;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String token;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tokenType;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/accounts/payments/api/models/network/SavePaymentDTO$a;", "", "<init>", "()V", "Lcom/meijer/mobile/accounts/payments/api/models/network/SavePaymentDTO;", "savePaymentDTO", "Luh/f;", "a", "(Lcom/meijer/mobile/accounts/payments/api/models/network/SavePaymentDTO;)Luh/f;", "payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.payments.api.models.network.SavePaymentDTO$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PaymentInfoResponse a(SavePaymentDTO savePaymentDTO) {
            Intrinsics.j(savePaymentDTO, "savePaymentDTO");
            return new PaymentInfoResponse(savePaymentDTO.getSuccess(), savePaymentDTO.getIsCardValid(), savePaymentDTO.getErrorMessage(), savePaymentDTO.getToken(), savePaymentDTO.getTokenType());
        }
    }

    public SavePaymentDTO() {
        this(false, false, null, null, null, 31, null);
    }

    public final SavePaymentDTO copy(@g(name = "success") boolean success, @g(name = "isCardValid") boolean isCardValid, @g(name = "errorMessage") String errorMessage, @g(name = "token") String token, @g(name = "tokenType") String tokenType) {
        return new SavePaymentDTO(success, isCardValid, errorMessage, token, tokenType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavePaymentDTO)) {
            return false;
        }
        SavePaymentDTO savePaymentDTO = (SavePaymentDTO) other;
        return this.success == savePaymentDTO.success && this.isCardValid == savePaymentDTO.isCardValid && Intrinsics.e(this.errorMessage, savePaymentDTO.errorMessage) && Intrinsics.e(this.token, savePaymentDTO.token) && Intrinsics.e(this.tokenType, savePaymentDTO.tokenType);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.success) * 31) + Boolean.hashCode(this.isCardValid)) * 31;
        String str = this.errorMessage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.token;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tokenType;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SavePaymentDTO(success=" + this.success + ", isCardValid=" + this.isCardValid + ", errorMessage=" + this.errorMessage + ", token=" + this.token + ", tokenType=" + this.tokenType + ')';
    }

    public SavePaymentDTO(@g(name = "success") boolean z10, @g(name = "isCardValid") boolean z11, @g(name = "errorMessage") String str, @g(name = "token") String str2, @g(name = "tokenType") String str3) {
        this.success = z10;
        this.isCardValid = z11;
        this.errorMessage = str;
        this.token = str2;
        this.tokenType = str3;
    }

    /* renamed from: a, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: c, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: d, reason: from getter */
    public final String getTokenType() {
        return this.tokenType;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsCardValid() {
        return this.isCardValid;
    }

    public /* synthetic */ SavePaymentDTO(boolean z10, boolean z11, String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3);
    }
}
