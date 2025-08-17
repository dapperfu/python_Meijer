package zh;

import Eh.BarcodeResponse;
import Pu.o;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import io.reactivex.q;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import rk.EnumC16795a;
import yh.InterfaceC18213a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lzh/i;", "", "Lyh/a;", "accountServerAPIObservable", "LXi/a;", "userTokenGatewayRxJava", "<init>", "(Lyh/a;LXi/a;)V", "Lio/reactivex/l;", "LEh/a;", "e", "()Lio/reactivex/l;", "a", "Lyh/a;", "b", "LXi/a;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18213a accountServerAPIObservable;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Xi.a userTokenGatewayRxJava;

    public i(InterfaceC18213a accountServerAPIObservable, Xi.a userTokenGatewayRxJava) {
        Intrinsics.j(accountServerAPIObservable, "accountServerAPIObservable");
        Intrinsics.j(userTokenGatewayRxJava, "userTokenGatewayRxJava");
        this.accountServerAPIObservable = accountServerAPIObservable;
        this.userTokenGatewayRxJava = userTokenGatewayRxJava;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q f(i iVar, BearerToken token) {
        Intrinsics.j(token, "token");
        return iVar.accountServerAPIObservable.a(token);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q g(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return (q) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BarcodeResponse h(ResponseBody data) {
        Intrinsics.j(data, "data");
        try {
            try {
                byte[] bArrBytes = data.bytes();
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrBytes, 0, bArrBytes.length);
                data.close();
                return new BarcodeResponse(bitmapDecodeByteArray);
            } catch (IOException e10) {
                uw.a.INSTANCE.t(e10);
                throw RetrofitException.INSTANCE.e(EnumC16795a.f159035m, e10);
            }
        } catch (Throwable th2) {
            data.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BarcodeResponse i(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return (BarcodeResponse) function1.invoke(p02);
    }

    public final io.reactivex.l<BarcodeResponse> e() {
        io.reactivex.l<BearerToken> lVarA = this.userTokenGatewayRxJava.a();
        final Function1 function1 = new Function1() { // from class: zh.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.f(this.f171965a, (BearerToken) obj);
            }
        };
        io.reactivex.l<R> lVarFlatMap = lVarA.flatMap(new o() { // from class: zh.f
            @Override // Pu.o
            public final Object apply(Object obj) {
                return i.g(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: zh.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.h((ResponseBody) obj);
            }
        };
        io.reactivex.l<BarcodeResponse> map = lVarFlatMap.map(new o() { // from class: zh.h
            @Override // Pu.o
            public final Object apply(Object obj) {
                return i.i(function12, obj);
            }
        });
        Intrinsics.i(map, "map(...)");
        return map;
    }
}
