package retrofit2.adapter.rxjava2;

import io.reactivex.b;
import io.reactivex.f;
import io.reactivex.h;
import io.reactivex.l;
import io.reactivex.t;
import io.reactivex.u;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;

/* loaded from: classes14.dex */
public final class RxJava2CallAdapterFactory extends CallAdapter.Factory {
    private final boolean isAsync;
    private final t scheduler;

    public static RxJava2CallAdapterFactory create() {
        return new RxJava2CallAdapterFactory(null, false);
    }

    public static RxJava2CallAdapterFactory createAsync() {
        return new RxJava2CallAdapterFactory(null, true);
    }

    public static RxJava2CallAdapterFactory createWithScheduler(t tVar) {
        if (tVar != null) {
            return new RxJava2CallAdapterFactory(tVar, false);
        }
        throw new NullPointerException("scheduler == null");
    }

    private RxJava2CallAdapterFactory(t tVar, boolean z10) {
        this.scheduler = tVar;
        this.isAsync = z10;
    }

    @Override // retrofit2.CallAdapter.Factory
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        boolean z10;
        boolean z11;
        boolean z12;
        Type parameterUpperBound;
        boolean z13;
        boolean z14;
        String str;
        Class<?> rawType = CallAdapter.Factory.getRawType(type);
        if (rawType == b.class) {
            return new RxJava2CallAdapter(Void.class, this.scheduler, this.isAsync, false, true, false, false, false, true);
        }
        if (rawType == f.class) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rawType == u.class) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rawType == h.class) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (rawType != l.class && !z10 && !z11 && !z12) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (!z10) {
                if (!z11) {
                    if (z12) {
                        str = "Maybe";
                    } else {
                        str = "Observable";
                    }
                } else {
                    str = "Single";
                }
            } else {
                str = "Flowable";
            }
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type parameterUpperBound2 = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type);
        Class<?> rawType2 = CallAdapter.Factory.getRawType(parameterUpperBound2);
        if (rawType2 == Response.class) {
            if (parameterUpperBound2 instanceof ParameterizedType) {
                parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound2);
                z14 = false;
                z13 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (rawType2 == Result.class) {
            if (parameterUpperBound2 instanceof ParameterizedType) {
                parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound2);
                z14 = true;
                z13 = false;
            } else {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
        } else {
            parameterUpperBound = parameterUpperBound2;
            z13 = true;
            z14 = false;
        }
        return new RxJava2CallAdapter(parameterUpperBound, this.scheduler, this.isAsync, z14, z13, z10, z11, z12, false);
    }
}
