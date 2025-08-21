package com.apollographql.apollo.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/apollographql/apollo/exception/NoDataException;", "Lcom/apollographql/apollo/exception/ApolloException;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NoDataException extends ApolloException {
    public NoDataException(Throwable th2) {
        super("No data was found", th2, null);
    }
}
