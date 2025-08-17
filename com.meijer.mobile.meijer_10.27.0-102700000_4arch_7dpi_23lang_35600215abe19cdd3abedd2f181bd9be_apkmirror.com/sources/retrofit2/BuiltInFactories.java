package retrofit2;

import android.annotation.TargetApi;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* loaded from: classes13.dex */
class BuiltInFactories {

    @TargetApi(24)
    static final class Java8 extends BuiltInFactories {
        @Override // retrofit2.BuiltInFactories
        List<? extends CallAdapter.Factory> createDefaultCallAdapterFactories(Executor executor) {
            return Arrays.asList(new CompletableFutureCallAdapterFactory(), new DefaultCallAdapterFactory(executor));
        }

        @Override // retrofit2.BuiltInFactories
        List<? extends Converter.Factory> createDefaultConverterFactories() {
            return Collections.singletonList(new OptionalConverterFactory());
        }

        Java8() {
        }
    }

    List<? extends CallAdapter.Factory> createDefaultCallAdapterFactories(Executor executor) {
        return Collections.singletonList(new DefaultCallAdapterFactory(executor));
    }

    List<? extends Converter.Factory> createDefaultConverterFactories() {
        return Collections.EMPTY_LIST;
    }

    BuiltInFactories() {
    }
}
