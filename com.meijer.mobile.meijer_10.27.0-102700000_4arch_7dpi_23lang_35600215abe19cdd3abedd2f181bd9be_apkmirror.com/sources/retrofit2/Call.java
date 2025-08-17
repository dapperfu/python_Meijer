package retrofit2;

import java.io.IOException;
import kw.K;
import okhttp3.Request;

/* loaded from: classes13.dex */
public interface Call<T> extends Cloneable {
    void cancel();

    Call<T> clone();

    void enqueue(Callback<T> callback);

    Response<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    K timeout();
}
