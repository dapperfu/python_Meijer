package com.apollographql.apollo.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/apollographql/apollo/exception/SubscriptionOperationException;", "Lcom/apollographql/apollo/exception/ApolloException;", "", "operationName", "", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "getPayload", "()Ljava/lang/Object;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SubscriptionOperationException extends ApolloException {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object payload;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionOperationException(String operationName, Object obj) {
        super("Operation error " + operationName, null, 2, null);
        Intrinsics.j(operationName, "operationName");
        this.payload = obj;
    }
}
