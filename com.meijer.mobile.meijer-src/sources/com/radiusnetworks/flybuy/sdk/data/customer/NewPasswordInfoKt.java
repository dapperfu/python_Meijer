package com.radiusnetworks.flybuy.sdk.data.customer;

import com.radiusnetworks.flybuy.api.model.SetNewPasswordRequestData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toApiNewPassword", "Lcom/radiusnetworks/flybuy/api/model/SetNewPasswordRequestData;", "Lcom/radiusnetworks/flybuy/sdk/data/customer/NewPasswordInfo;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NewPasswordInfoKt {
    public static final SetNewPasswordRequestData toApiNewPassword(NewPasswordInfo newPasswordInfo) {
        Intrinsics.j(newPasswordInfo, "<this>");
        return new SetNewPasswordRequestData(newPasswordInfo.getResetPasswordToken(), newPasswordInfo.getPassword(), newPasswordInfo.getConfirmPassword());
    }
}
