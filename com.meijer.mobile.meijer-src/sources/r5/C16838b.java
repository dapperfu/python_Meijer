package r5;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15819p;
import okhttp3.Response;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/d;", "Lokhttp3/Response;", "a", "(Lokhttp3/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: r5.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16838b {
    public static final Object a(okhttp3.d dVar, Continuation<? super Response> continuation) {
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        C16847k c16847k = new C16847k(dVar, c15819p);
        FirebasePerfOkHttpClient.enqueue(dVar, c16847k);
        c15819p.F(c16847k);
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU;
    }
}
