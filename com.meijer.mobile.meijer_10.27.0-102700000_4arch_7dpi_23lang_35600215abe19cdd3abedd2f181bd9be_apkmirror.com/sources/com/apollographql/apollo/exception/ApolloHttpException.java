package com.apollographql.apollo.exception;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kw.InterfaceC15330g;
import z6.HttpHeader;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000f\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/apollographql/apollo/exception/ApolloHttpException;", "Lcom/apollographql/apollo/exception/ApolloException;", "", "statusCode", "", "Lz6/f;", "headers", "Lkw/g;", "body", "", "message", "", "cause", "<init>", "(ILjava/util/List;Lkw/g;Ljava/lang/String;Ljava/lang/Throwable;)V", "a", "I", "b", "()I", "Ljava/util/List;", "getHeaders", "()Ljava/util/List;", "c", "Lkw/g;", "()Lkw/g;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApolloHttpException extends ApolloException {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int statusCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<HttpHeader> headers;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15330g body;

    public /* synthetic */ ApolloHttpException(int i10, List list, InterfaceC15330g interfaceC15330g, String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, list, interfaceC15330g, str, (i11 & 16) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloHttpException(int i10, List<HttpHeader> headers, InterfaceC15330g interfaceC15330g, String message, Throwable th2) {
        super(message, th2, null);
        Intrinsics.j(headers, "headers");
        Intrinsics.j(message, "message");
        this.statusCode = i10;
        this.headers = headers;
        this.body = interfaceC15330g;
    }

    /* renamed from: a, reason: from getter */
    public final InterfaceC15330g getBody() {
        return this.body;
    }

    /* renamed from: b, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }
}
