package q5;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.Response;
import qv.InterfaceC16654n;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012#\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\bB\u001d\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lq5/k;", "LQv/b;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "Lokhttp3/d;", "call", "Lqv/n;", "Lokhttp3/Response;", "continuation", "<init>", "(Lokhttp3/d;Lqv/n;)V", "response", "onResponse", "(Lokhttp3/d;Lokhttp3/Response;)V", "Ljava/io/IOException;", "e", "onFailure", "(Lokhttp3/d;Ljava/io/IOException;)V", "a", "(Ljava/lang/Throwable;)V", "Lokhttp3/d;", "b", "Lqv/n;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: q5.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16459k implements Qv.b, Function1<Throwable, Unit> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.d call;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16654n<Response> continuation;

    public void a(Throwable cause) {
        try {
            this.call.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        a(th2);
        return Unit.f142422a;
    }

    @Override // Qv.b
    public void onResponse(okhttp3.d call, Response response) {
        this.continuation.resumeWith(Result.b(response));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C16459k(okhttp3.d dVar, InterfaceC16654n<? super Response> interfaceC16654n) {
        this.call = dVar;
        this.continuation = interfaceC16654n;
    }

    @Override // Qv.b
    public void onFailure(okhttp3.d call, IOException e10) {
        if (!call.getCanceled()) {
            InterfaceC16654n<Response> interfaceC16654n = this.continuation;
            Result.Companion companion = Result.INSTANCE;
            interfaceC16654n.resumeWith(Result.b(ResultKt.a(e10)));
        }
    }
}
