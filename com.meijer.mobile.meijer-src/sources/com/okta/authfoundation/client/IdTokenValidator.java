package com.okta.authfoundation.client;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0002\u000b\tJ(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/okta/authfoundation/client/IdTokenValidator;", "", "Lcom/okta/authfoundation/client/h;", "client", "Lbt/b;", "idToken", "Lcom/okta/authfoundation/client/IdTokenValidator$a;", "parameters", "", "a", "(Lcom/okta/authfoundation/client/h;Lbt/b;Lcom/okta/authfoundation/client/IdTokenValidator$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Error", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface IdTokenValidator {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\bB\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/okta/authfoundation/client/IdTokenValidator$Error;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "message", "identifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "b", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends IllegalStateException {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String identifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Error(String message, String identifier) {
            super(message);
            Intrinsics.j(message, "message");
            Intrinsics.j(identifier, "identifier");
            this.identifier = identifier;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/okta/authfoundation/client/IdTokenValidator$a;", "", "", "nonce", "", "maxAge", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String nonce;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Integer maxAge;

        /* renamed from: a, reason: from getter */
        public final Integer getMaxAge() {
            return this.maxAge;
        }

        /* renamed from: b, reason: from getter */
        public final String getNonce() {
            return this.nonce;
        }

        public a(String str, Integer num) {
            this.nonce = str;
            this.maxAge = num;
        }
    }

    Object a(h hVar, bt.b bVar, a aVar, Continuation<? super Unit> continuation);
}
