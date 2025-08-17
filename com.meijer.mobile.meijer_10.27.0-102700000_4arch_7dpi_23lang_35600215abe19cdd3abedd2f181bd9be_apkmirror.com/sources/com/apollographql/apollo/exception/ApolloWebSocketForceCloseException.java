package com.apollographql.apollo.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/apollographql/apollo/exception/ApolloWebSocketForceCloseException;", "Lcom/apollographql/apollo/exception/ApolloException;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ApolloWebSocketForceCloseException extends ApolloException {

    /* renamed from: a, reason: collision with root package name */
    public static final ApolloWebSocketForceCloseException f62996a = new ApolloWebSocketForceCloseException();

    private ApolloWebSocketForceCloseException() {
        super("closeConnection() was called", null, 2, null);
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof ApolloWebSocketForceCloseException);
    }

    public int hashCode() {
        return 1630789127;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "ApolloWebSocketForceCloseException";
    }
}
