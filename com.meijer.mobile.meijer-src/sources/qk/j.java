package qk;

import Lu.o;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import io.reactivex.l;
import io.reactivex.u;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/* loaded from: classes8.dex */
public class j extends CallAdapter.Factory {

    /* renamed from: a, reason: collision with root package name */
    private final RxJava2CallAdapterFactory f158529a = RxJava2CallAdapterFactory.create();

    /* JADX INFO: Access modifiers changed from: private */
    static class a<T> implements CallAdapter<T, Object> {

        /* renamed from: a, reason: collision with root package name */
        private CallAdapter<T, Object> f158530a;

        @Override // retrofit2.CallAdapter
        public Object adapt(Call<T> call) {
            return this.f158530a.adapt(call) instanceof u ? ((u) this.f158530a.adapt(call)).l(new o() { // from class: qk.g
                @Override // Lu.o
                public final Object apply(Object obj) {
                    return u.g(j.a((Throwable) obj));
                }
            }) : this.f158530a.adapt(call) instanceof io.reactivex.b ? ((io.reactivex.b) this.f158530a.adapt(call)).f(new o() { // from class: qk.h
                @Override // Lu.o
                public final Object apply(Object obj) {
                    return io.reactivex.b.c(j.a((Throwable) obj));
                }
            }) : ((l) this.f158530a.adapt(call)).onErrorResumeNext(new o() { // from class: qk.i
                @Override // Lu.o
                public final Object apply(Object obj) {
                    return l.error(j.a((Throwable) obj));
                }
            });
        }

        @Override // retrofit2.CallAdapter
        public Type responseType() {
            return this.f158530a.responseType();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(CallAdapter<?, ?> callAdapter) {
            this.f158530a = callAdapter;
        }
    }

    public static CallAdapter.Factory b() {
        return new j();
    }

    @Override // retrofit2.CallAdapter.Factory
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new a(this.f158529a.get(type, annotationArr, retrofit));
    }

    private j() {
    }

    public static RetrofitException a(Throwable th2) {
        return com.meijer.mobile.core.networking.exceptions.a.a(th2);
    }
}
