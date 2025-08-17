package com.radiusnetworks.flybuy.sdk.data.customer;

import com.radiusnetworks.flybuy.api.model.LoginRequestData;
import com.radiusnetworks.flybuy.api.model.SignUpRequestData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000¨\u0006\u0005"}, d2 = {"toApiLogin", "Lcom/radiusnetworks/flybuy/api/model/LoginRequestData;", "Lcom/radiusnetworks/flybuy/sdk/data/customer/LoginInfo;", "toApiSignUp", "Lcom/radiusnetworks/flybuy/api/model/SignUpRequestData;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LoginInfoKt {
    public static final LoginRequestData toApiLogin(LoginInfo loginInfo) {
        Intrinsics.j(loginInfo, "<this>");
        return new LoginRequestData(loginInfo.getEmail(), loginInfo.getPassword());
    }

    public static final SignUpRequestData toApiSignUp(LoginInfo loginInfo) {
        Intrinsics.j(loginInfo, "<this>");
        return new SignUpRequestData(loginInfo.getEmail(), loginInfo.getPassword(), loginInfo.getPassword());
    }
}
