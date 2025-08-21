package qp;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Url;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0097A¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lqp/b;", "Lqp/a;", "beaconApi", "<init>", "(Lqp/a;)V", "", "url", "Lretrofit2/Response;", "Ljava/lang/Void;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqp/a;", "sponsored_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qp.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C16753b implements InterfaceC16752a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16752a beaconApi;

    public C16753b(InterfaceC16752a beaconApi) {
        Intrinsics.j(beaconApi, "beaconApi");
        this.beaconApi = beaconApi;
    }

    @Override // qp.InterfaceC16752a
    @GET
    public Object a(@Url String str, Continuation<? super Response<Void>> continuation) {
        return this.beaconApi.a(str, continuation);
    }
}
