package com.okta.webauthenticationui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/okta/webauthenticationui/c;", "T", "", "<init>", "()V", "b", "a", "Lcom/okta/webauthenticationui/c$a;", "Lcom/okta/webauthenticationui/c$b;", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class c<T> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/okta/webauthenticationui/c$a;", "T", "Lcom/okta/webauthenticationui/c;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> extends c<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Exception exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exception) {
            super(null);
            Intrinsics.j(exception, "exception");
            this.exception = exception;
        }

        /* renamed from: a, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/okta/webauthenticationui/c$b;", "T", "Lcom/okta/webauthenticationui/c;", "Lokhttp3/HttpUrl;", "url", "flowContext", "<init>", "(Lokhttp3/HttpUrl;Ljava/lang/Object;)V", "a", "Lokhttp3/HttpUrl;", "b", "()Lokhttp3/HttpUrl;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b<T> extends c<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final HttpUrl url;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final T flowContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HttpUrl url, T t10) {
            super(null);
            Intrinsics.j(url, "url");
            this.url = url;
            this.flowContext = t10;
        }

        public final T a() {
            return this.flowContext;
        }

        /* renamed from: b, reason: from getter */
        public final HttpUrl getUrl() {
            return this.url;
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
