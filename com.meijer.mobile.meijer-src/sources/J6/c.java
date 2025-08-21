package J6;

import A6.k;
import com.apollographql.apollo.exception.ApolloNetworkException;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"LJ6/c;", "Ljava/io/Closeable;", "Lokio/Closeable;", "LA6/i;", "request", "LA6/k;", "e3", "(LA6/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "dispose", "()V", "close", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface c extends Closeable {
    @Deprecated
    default void dispose() {
    }

    Object e3(A6.i iVar, Continuation<? super k> continuation) throws CancellationException, ApolloNetworkException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        dispose();
    }
}
