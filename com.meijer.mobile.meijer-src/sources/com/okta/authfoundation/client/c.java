package com.okta.authfoundation.client;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/okta/authfoundation/client/c;", "Lcom/okta/authfoundation/client/IdTokenValidator;", "<init>", "()V", "Lcom/okta/authfoundation/client/h;", "client", "Lbt/b;", "idToken", "Lcom/okta/authfoundation/client/IdTokenValidator$a;", "parameters", "", "a", "(Lcom/okta/authfoundation/client/h;Lbt/b;Lcom/okta/authfoundation/client/IdTokenValidator$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements IdTokenValidator {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.authfoundation.client.DefaultIdTokenValidator", f = "IdTokenValidator.kt", l = {102}, m = "validate")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f120609a;

        /* renamed from: b, reason: collision with root package name */
        Object f120610b;

        /* renamed from: c, reason: collision with root package name */
        Object f120611c;

        /* renamed from: d, reason: collision with root package name */
        Object f120612d;

        /* renamed from: e, reason: collision with root package name */
        Object f120613e;

        /* renamed from: f, reason: collision with root package name */
        Object f120614f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f120615g;

        /* renamed from: i, reason: collision with root package name */
        int f120617i;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f120615g = obj;
            this.f120617i |= Integer.MIN_VALUE;
            return c.this.a(null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.okta.authfoundation.client.IdTokenValidator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.okta.authfoundation.client.h r8, bt.b r9, com.okta.authfoundation.client.IdTokenValidator.a r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okta.authfoundation.client.c.a(com.okta.authfoundation.client.h, bt.b, com.okta.authfoundation.client.IdTokenValidator$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
