package Fu;

import io.constructor.data.remote.ConstructorApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LFu/a;", "", "<init>", "()V", "Lretrofit2/Retrofit;", "retrofit", "Lio/constructor/data/remote/ConstructorApi;", "a", "(Lretrofit2/Retrofit;)Lio/constructor/data/remote/ConstructorApi;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11074a = new a();

    public final ConstructorApi a(Retrofit retrofit) throws SecurityException {
        Intrinsics.j(retrofit, "retrofit");
        Object objCreate = retrofit.create(ConstructorApi.class);
        Intrinsics.i(objCreate, "retrofit.create(ConstructorApi::class.java)");
        return (ConstructorApi) objCreate;
    }

    private a() {
    }
}
