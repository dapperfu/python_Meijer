package com.okta.authfoundation.client;

import com.okta.authfoundation.client.AccessTokenValidator;
import gw.C14419h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/okta/authfoundation/client/a;", "Lcom/okta/authfoundation/client/AccessTokenValidator;", "<init>", "()V", "Lcom/okta/authfoundation/client/h;", "client", "", "accessToken", "Lbt/b;", "idToken", "", "a", "(Lcom/okta/authfoundation/client/h;Ljava/lang/String;Lbt/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements AccessTokenValidator {
    @Override // com.okta.authfoundation.client.AccessTokenValidator
    public Object a(h hVar, String str, bt.b bVar, Continuation<? super Unit> continuation) {
        if (Intrinsics.e(bVar.getAlgorithm(), "RS256")) {
            String atHash = ((e) bVar.a(e.INSTANCE.serializer())).getAtHash();
            if (atHash == null) {
                return Unit.f143329a;
            }
            C14419h.Companion companion = C14419h.INSTANCE;
            byte[] bytes = str.getBytes(Charsets.US_ASCII);
            Intrinsics.i(bytes, "getBytes(...)");
            C14419h c14419hU = C14419h.Companion.g(companion, bytes, 0, 0, 3, null).U();
            if (Intrinsics.e(StringsKt.E1(c14419hU.Y(0, c14419hU.V() / 2).b(), '='), atHash)) {
                return Unit.f143329a;
            }
            throw new AccessTokenValidator.Error("ID Token at_hash didn't match the access token.");
        }
        throw new AccessTokenValidator.Error("Unsupported algorithm");
    }
}
