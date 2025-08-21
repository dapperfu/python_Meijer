package Vo;

import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloHttpException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.ApolloWebSocketClosedException;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import gw.InterfaceC14418g;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.Response;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\u000b\u001a\u00020\u0001*\u00020\n¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/apollographql/apollo/exception/ApolloHttpException;", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "b", "(Lcom/apollographql/apollo/exception/ApolloHttpException;)Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "Lcom/apollographql/apollo/exception/ApolloNetworkException;", "c", "(Lcom/apollographql/apollo/exception/ApolloNetworkException;)Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "Lcom/apollographql/apollo/exception/ApolloWebSocketClosedException;", "d", "(Lcom/apollographql/apollo/exception/ApolloWebSocketClosedException;)Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "Lcom/apollographql/apollo/exception/ApolloException;", "a", "(Lcom/apollographql/apollo/exception/ApolloException;)Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "apollo_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {
    public static final RetrofitException a(ApolloException apolloException) {
        Intrinsics.j(apolloException, "<this>");
        return apolloException instanceof ApolloHttpException ? b((ApolloHttpException) apolloException) : apolloException instanceof ApolloNetworkException ? c((ApolloNetworkException) apolloException) : apolloException instanceof ApolloWebSocketClosedException ? d((ApolloWebSocketClosedException) apolloException) : com.meijer.mobile.core.networking.exceptions.a.a(apolloException);
    }

    private static final RetrofitException b(ApolloHttpException apolloHttpException) throws IOException {
        String strG2;
        String message = apolloHttpException.getMessage();
        int statusCode = apolloHttpException.getStatusCode();
        ResponseBody.Companion companion = ResponseBody.INSTANCE;
        InterfaceC14418g body = apolloHttpException.getBody();
        if (body != null) {
            Charset charsetDefaultCharset = Charset.defaultCharset();
            Intrinsics.i(charsetDefaultCharset, "defaultCharset(...)");
            strG2 = body.G2(charsetDefaultCharset);
        } else {
            strG2 = null;
        }
        if (strG2 == null) {
            strG2 = "";
        }
        Response responseError = Response.error(statusCode, ResponseBody.Companion.j(companion, strG2, null, 1, null));
        int statusCode2 = apolloHttpException.getStatusCode();
        return new RetrofitException(message, null, responseError, (statusCode2 == 401 || statusCode2 == 403) ? RetrofitException.b.f97006h : RetrofitException.b.f97001c, apolloHttpException, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    private static final RetrofitException c(ApolloNetworkException apolloNetworkException) {
        ApolloNetworkException apolloNetworkException2;
        Object platformCause = apolloNetworkException.getPlatformCause();
        if (platformCause instanceof IOException) {
            return RetrofitException.INSTANCE.c((IOException) platformCause);
        }
        RetrofitException.b bVar = RetrofitException.b.f97000b;
        if (platformCause instanceof Throwable) {
            apolloNetworkException2 = (Throwable) platformCause;
        } else {
            apolloNetworkException2 = null;
        }
        if (apolloNetworkException2 != null) {
            apolloNetworkException = apolloNetworkException2;
        }
        return new RetrofitException(bVar, apolloNetworkException);
    }

    private static final RetrofitException d(ApolloWebSocketClosedException apolloWebSocketClosedException) {
        if (apolloWebSocketClosedException.getCause() instanceof IOException) {
            RetrofitException.Companion companion = RetrofitException.INSTANCE;
            Throwable cause = apolloWebSocketClosedException.getCause();
            Intrinsics.h(cause, "null cannot be cast to non-null type java.io.IOException");
            return companion.c((IOException) cause);
        }
        return new RetrofitException(RetrofitException.b.f97003e, apolloWebSocketClosedException.getCause());
    }
}
