package F6;

import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.OfflineException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\b¨\u0006\n"}, d2 = {"LF6/a;", "a", "()LF6/a;", "Lcom/apollographql/apollo/exception/ApolloException;", "", "c", "(Lcom/apollographql/apollo/exception/ApolloException;)Z", "Lcom/apollographql/apollo/exception/ApolloNetworkException;", "Lcom/apollographql/apollo/exception/ApolloNetworkException;", "OfflineApolloException", "apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final ApolloNetworkException f9083a = new ApolloNetworkException("The device is offline", OfflineException.f63837a);

    public static final a a() {
        return new d(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(ApolloException apolloException) {
        return apolloException instanceof ApolloNetworkException;
    }
}
