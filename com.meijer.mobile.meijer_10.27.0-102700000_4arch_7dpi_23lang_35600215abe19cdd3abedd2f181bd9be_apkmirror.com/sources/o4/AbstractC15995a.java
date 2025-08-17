package o4;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.C6103b;
import androidx.privacysandbox.ads.adservices.topics.h;
import androidx.privacysandbox.ads.adservices.topics.u;
import com.google.common.util.concurrent.q;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m4.C15550b;
import qv.C16623P;
import qv.C16639f0;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \n2\u00020\u0001:\u0002\n\bB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lo4/a;", "", "<init>", "()V", "Landroidx/privacysandbox/ads/adservices/topics/b;", "request", "Lcom/google/common/util/concurrent/q;", "Landroidx/privacysandbox/ads/adservices/topics/h;", "b", "(Landroidx/privacysandbox/ads/adservices/topics/b;)Lcom/google/common/util/concurrent/q;", "a", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: o4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC15995a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lo4/a$a;", "Lo4/a;", "Landroidx/privacysandbox/ads/adservices/topics/u;", "mTopicsManager", "<init>", "(Landroidx/privacysandbox/ads/adservices/topics/u;)V", "Landroidx/privacysandbox/ads/adservices/topics/b;", "request", "Lcom/google/common/util/concurrent/q;", "Landroidx/privacysandbox/ads/adservices/topics/h;", "b", "(Landroidx/privacysandbox/ads/adservices/topics/b;)Lcom/google/common/util/concurrent/q;", "Landroidx/privacysandbox/ads/adservices/topics/u;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: o4.a$a, reason: collision with other inner class name */
    private static final class C2377a extends AbstractC15995a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final u mTopicsManager;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Landroidx/privacysandbox/ads/adservices/topics/h;", "<anonymous>", "(Lqv/O;)Landroidx/privacysandbox/ads/adservices/topics/h;"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1", f = "TopicsManagerFutures.kt", l = {55}, m = "invokeSuspend")
        /* renamed from: o4.a$a$a, reason: collision with other inner class name */
        static final class C2378a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super h>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f153167a;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C6103b f153169c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2378a(C6103b c6103b, Continuation<? super C2378a> continuation) {
                super(2, continuation);
                this.f153169c = c6103b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return C2377a.this.new C2378a(this.f153169c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super h> continuation) {
                return ((C2378a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f153167a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                u uVar = C2377a.this.mTopicsManager;
                C6103b c6103b = this.f153169c;
                this.f153167a = 1;
                Object objA = uVar.a(c6103b, this);
                if (objA == objF) {
                    return objF;
                }
                return objA;
            }
        }

        public C2377a(u mTopicsManager) {
            Intrinsics.j(mTopicsManager, "mTopicsManager");
            this.mTopicsManager = mTopicsManager;
        }

        @Override // o4.AbstractC15995a
        public q<h> b(C6103b request) {
            Intrinsics.j(request, "request");
            return C15550b.c(C16648k.b(C16623P.a(C16639f0.c()), null, null, new C2378a(request, null), 3, null), null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo4/a$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lo4/a;", "a", "(Landroid/content/Context;)Lo4/a;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: o4.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AbstractC15995a a(Context context) {
            Intrinsics.j(context, "context");
            u uVarA = u.INSTANCE.a(context);
            if (uVarA != null) {
                return new C2377a(uVarA);
            }
            return null;
        }
    }

    @JvmStatic
    public static final AbstractC15995a a(Context context) {
        return INSTANCE.a(context);
    }

    public abstract q<h> b(C6103b request);
}
