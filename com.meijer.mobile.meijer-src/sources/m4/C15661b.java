package m4;

import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.q;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import mv.W;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Lmv/W;", "", "tag", "Lcom/google/common/util/concurrent/q;", "b", "(Lmv/W;Ljava/lang/Object;)Lcom/google/common/util/concurrent/q;", "ads-adservices-java_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: m4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15661b {

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: m4.b$a */
    static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c.a<T> f150576f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ W<T> f150577g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(c.a<T> aVar, W<? extends T> w10) {
            super(1);
            this.f150576f = aVar;
            this.f150577g = w10;
        }

        public final void a(Throwable th2) {
            if (th2 == null) {
                this.f150576f.c(this.f150577g.i());
            } else if (th2 instanceof CancellationException) {
                this.f150576f.d();
            } else {
                this.f150576f.f(th2);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    public static final <T> q<T> b(final W<? extends T> w10, final Object obj) {
        Intrinsics.j(w10, "<this>");
        q<T> qVarA = c.a(new c.InterfaceC1101c() { // from class: m4.a
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return C15661b.d(w10, obj, aVar);
            }
        });
        Intrinsics.i(qVarA, "getFuture { completer ->…      }\n        tag\n    }");
        return qVarA;
    }

    public static /* synthetic */ q c(W w10, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(w10, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(W this_asListenableFuture, Object obj, c.a completer) {
        Intrinsics.j(this_asListenableFuture, "$this_asListenableFuture");
        Intrinsics.j(completer, "completer");
        this_asListenableFuture.R(new a(completer, this_asListenableFuture));
        return obj;
    }
}
