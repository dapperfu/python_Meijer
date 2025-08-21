package com.apollographql.apollo.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002B!\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0013\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/apollographql/apollo/exception/ApolloException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/apollographql/apollo/exception/ApolloCompositeException;", "Lcom/apollographql/apollo/exception/ApolloGraphQLException;", "Lcom/apollographql/apollo/exception/ApolloHttpException;", "Lcom/apollographql/apollo/exception/ApolloNetworkException;", "Lcom/apollographql/apollo/exception/ApolloParseException;", "Lcom/apollographql/apollo/exception/ApolloWebSocketClosedException;", "Lcom/apollographql/apollo/exception/ApolloWebSocketForceCloseException;", "Lcom/apollographql/apollo/exception/AutoPersistedQueriesNotSupported;", "Lcom/apollographql/apollo/exception/CacheMissException;", "Lcom/apollographql/apollo/exception/DefaultApolloException;", "Lcom/apollographql/apollo/exception/HttpCacheMissException;", "Lcom/apollographql/apollo/exception/JsonDataException;", "Lcom/apollographql/apollo/exception/JsonEncodingException;", "Lcom/apollographql/apollo/exception/MissingValueException;", "Lcom/apollographql/apollo/exception/NoDataException;", "Lcom/apollographql/apollo/exception/NullOrMissingField;", "Lcom/apollographql/apollo/exception/RouterError;", "Lcom/apollographql/apollo/exception/SubscriptionConnectionException;", "Lcom/apollographql/apollo/exception/SubscriptionOperationException;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ApolloException extends RuntimeException {
    public /* synthetic */ ApolloException(String str, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th2);
    }

    private ApolloException(String str, Throwable th2) {
        super(str, th2);
    }

    public /* synthetic */ ApolloException(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th2, null);
    }
}
