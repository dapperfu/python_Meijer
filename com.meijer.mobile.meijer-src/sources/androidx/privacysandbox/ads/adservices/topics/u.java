package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import l4.C15453a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/u;", "", "<init>", "()V", "Landroidx/privacysandbox/ads/adservices/topics/b;", "request", "Landroidx/privacysandbox/ads/adservices/topics/h;", "a", "(Landroidx/privacysandbox/ads/adservices/topics/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/u$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/privacysandbox/ads/adservices/topics/u;", "a", "(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/topics/u;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.topics.u$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "it", "Landroidx/privacysandbox/ads/adservices/topics/w;", "a", "(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/topics/w;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.privacysandbox.ads.adservices.topics.u$a$a, reason: collision with other inner class name */
        static final class C1145a extends Lambda implements Function1<Context, w> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Context f58009f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1145a(Context context) {
                super(1);
                this.f58009f = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final w invoke(Context it) {
                Intrinsics.j(it, "it");
                return new w(this.f58009f);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "it", "Landroidx/privacysandbox/ads/adservices/topics/x;", "a", "(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/topics/x;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.privacysandbox.ads.adservices.topics.u$a$b */
        static final class b extends Lambda implements Function1<Context, x> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Context f58010f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context) {
                super(1);
                this.f58010f = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x invoke(Context it) {
                Intrinsics.j(it, "it");
                return new x(this.f58010f);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final u a(Context context) {
            Intrinsics.j(context, "context");
            C15453a c15453a = C15453a.f149291a;
            if (c15453a.a() >= 11) {
                return new A(context);
            }
            if (c15453a.a() >= 5) {
                return new C(context);
            }
            if (c15453a.a() == 4) {
                return new B(context);
            }
            if (c15453a.b() >= 11) {
                return (u) l4.b.f149294a.a(context, "TopicsManager", new C1145a(context));
            }
            if (c15453a.b() >= 9) {
                return (u) l4.b.f149294a.a(context, "TopicsManager", new b(context));
            }
            return null;
        }
    }

    public abstract Object a(C6245b c6245b, Continuation<? super h> continuation);
}
