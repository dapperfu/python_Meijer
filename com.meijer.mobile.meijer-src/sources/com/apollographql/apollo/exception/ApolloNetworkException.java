package com.apollographql.apollo.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/apollographql/apollo/exception/ApolloNetworkException;", "Lcom/apollographql/apollo/exception/ApolloException;", "", "message", "", "platformCause", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApolloNetworkException extends ApolloException {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object platformCause;

    /* JADX WARN: Multi-variable type inference failed */
    public ApolloNetworkException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ApolloNetworkException(String str, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : obj);
    }

    /* renamed from: a, reason: from getter */
    public final Object getPlatformCause() {
        return this.platformCause;
    }

    public ApolloNetworkException(String str, Object obj) {
        super(str, obj instanceof Throwable ? (Throwable) obj : null, null);
        this.platformCause = obj;
    }
}
