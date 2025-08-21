package com.okta.authfoundation.client;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u000bJ(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/okta/authfoundation/client/DeviceSecretValidator;", "", "Lcom/okta/authfoundation/client/h;", "client", "", "deviceSecret", "Lbt/b;", "idToken", "", "a", "(Lcom/okta/authfoundation/client/h;Ljava/lang/String;Lbt/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Error", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface DeviceSecretValidator {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/okta/authfoundation/client/DeviceSecretValidator$Error;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "message", "", "<init>", "(Ljava/lang/String;)V", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends IllegalStateException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String message) {
            super(message);
            Intrinsics.j(message, "message");
        }
    }

    Object a(h hVar, String str, bt.b bVar, Continuation<? super Unit> continuation);
}
