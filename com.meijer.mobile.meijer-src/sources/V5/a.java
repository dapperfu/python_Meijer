package V5;

import Y5.b;
import android.app.Application;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15784P;
import mv.C15800f0;
import mv.InterfaceC15780L;
import mv.InterfaceC15783O;
import mv.X0;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LV5/a;", "LV5/t;", "<init>", "()V", "LV5/n;", "T", "presentation", "LV5/r;", "presentationUtilityProvider", "LV5/m;", "a", "(LV5/n;LV5/r;)LV5/m;", "Lmv/L;", "Lmv/L;", "exceptionHandler", "Lmv/O;", "b", "Lkotlin/Lazy;", "c", "()Lmv/O;", "mainScope", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15780L exceptionHandler = new c(InterfaceC15780L.INSTANCE);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy mainScope = LazyKt.b(new b());

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lmv/O;", "c", "()Lmv/O;"}, k = 3, mv = {1, 5, 1})
    static final class b extends Lambda implements Function0<InterfaceC15783O> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC15783O invoke() {
            return C15784P.a(C15800f0.c().n0(X0.b(null, 1, null)).n0(a.this.exceptionHandler));
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"V5/a$c", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lmv/L;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "m0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    public static final class c extends AbstractCoroutineContextElement implements InterfaceC15780L {
        @Override // mv.InterfaceC15780L
        public void m0(CoroutineContext context, Throwable exception) {
            R5.t.b("Services", "AEPUIService", "An error occurred while processing the presentation: " + exception.getMessage(), exception);
        }

        public c(InterfaceC15780L.Companion companion) {
            super(companion);
        }
    }

    private final InterfaceC15783O c() {
        return (InterfaceC15783O) this.mainScope.getValue();
    }

    @Override // V5.t
    public <T extends n<T>> m<T> a(T presentation, r presentationUtilityProvider) {
        Intrinsics.j(presentation, "presentation");
        Intrinsics.j(presentationUtilityProvider, "presentationUtilityProvider");
        Application applicationB = presentationUtilityProvider.b();
        if (applicationB == null) {
            throw new IllegalStateException("Application is null. Please provide a valid application instance.");
        }
        b.Companion cVar = Y5.b.INSTANCE;
        cVar.a().d(applicationB);
        if (presentation instanceof j) {
            return new b6.e((j) presentation, null, presentationUtilityProvider, cVar.a(), c());
        }
        if (presentation instanceof V5.b) {
            return new W5.b((V5.b) presentation, null, presentationUtilityProvider, cVar.a(), c());
        }
        if (presentation instanceof h) {
            h hVar = (h) presentation;
            return new Z5.c(hVar, new Z5.e(hVar.getSettings()), null, presentationUtilityProvider, cVar.a(), c());
        }
        throw new IllegalArgumentException("Presentation type: " + presentation + " not supported");
    }
}
