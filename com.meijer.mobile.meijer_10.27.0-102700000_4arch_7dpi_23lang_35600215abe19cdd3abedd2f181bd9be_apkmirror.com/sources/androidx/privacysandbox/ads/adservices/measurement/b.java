package androidx.privacysandbox.ads.adservices.measurement;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import com.fullstory.FS;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import l4.C15363a;
import l4.C15364b;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/b;", "", "<init>", "()V", "Landroidx/privacysandbox/ads/adservices/measurement/a;", "deletionRequest", "", "a", "(Landroidx/privacysandbox/ads/adservices/measurement/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trigger", "e", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/n;", "request", "f", "(Landroidx/privacysandbox/ads/adservices/measurement/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/o;", "g", "(Landroidx/privacysandbox/ads/adservices/measurement/o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/m;", "d", "(Landroidx/privacysandbox/ads/adservices/measurement/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/b$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/privacysandbox/ads/adservices/measurement/b;", "a", "(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/measurement/b;", "", "MEASUREMENT_API_STATE_DISABLED", "I", "MEASUREMENT_API_STATE_ENABLED", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.measurement.b$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "it", "Landroidx/privacysandbox/ads/adservices/measurement/d;", "a", "(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/measurement/d;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.privacysandbox.ads.adservices.measurement.b$a$a, reason: collision with other inner class name */
        static final class C1130a extends Lambda implements Function1<Context, d> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Context f57750f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1130a(Context context) {
                super(1);
                this.f57750f = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(Context it) {
                Intrinsics.j(it, "it");
                return new d(this.f57750f);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final b a(Context context) {
            Intrinsics.j(context, "context");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AdServicesInfo.version=");
            C15363a c15363a = C15363a.f148504a;
            sb2.append(c15363a.a());
            FS.log_d("MeasurementManager", sb2.toString());
            if (c15363a.a() >= 5) {
                return new g(context);
            }
            if (c15363a.b() >= 9) {
                return (b) C15364b.f148507a.a(context, "MeasurementManager", new C1130a(context));
            }
            return null;
        }
    }

    public abstract Object a(a aVar, Continuation<? super Unit> continuation);

    public abstract Object b(Continuation<? super Integer> continuation);

    public abstract Object c(Uri uri, InputEvent inputEvent, Continuation<? super Unit> continuation);

    public abstract Object d(m mVar, Continuation<? super Unit> continuation);

    public abstract Object e(Uri uri, Continuation<? super Unit> continuation);

    public abstract Object f(n nVar, Continuation<? super Unit> continuation);

    public abstract Object g(o oVar, Continuation<? super Unit> continuation);
}
