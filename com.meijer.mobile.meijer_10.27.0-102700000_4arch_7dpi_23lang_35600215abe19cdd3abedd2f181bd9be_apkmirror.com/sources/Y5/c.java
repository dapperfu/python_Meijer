package Y5;

import U0.f;
import U5.h;
import U5.n;
import U5.o;
import U5.r;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import java.util.List;
import kotlin.C6307U;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0005*\u0001#\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u00020\u00152\u0010\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"LY5/c;", "LX5/a;", "LU5/h;", "floatingButton", "LY5/e;", "floatingButtonViewModel", "LU5/o;", "presentationDelegate", "LU5/r;", "presentationUtilityProvider", "LX5/b;", "appLifecycleProvider", "Lqv/O;", "mainScope", "<init>", "(LU5/h;LY5/e;LU5/o;LU5/r;LX5/b;Lqv/O;)V", "Landroid/content/Context;", "activityContext", "Landroidx/compose/ui/platform/ComposeView;", "s", "(Landroid/content/Context;)Landroidx/compose/ui/platform/ComposeView;", "", "r", "()Z", "A", "()LU5/h;", "", "LU5/n;", "visiblePresentations", "v", "(Ljava/util/List;)Z", "k", "LU5/h;", "l", "LY5/e;", "Y5/c$a", "m", "LY5/c$a;", "floatingButtonEventHandler", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends X5.a<h> {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final h floatingButton;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final e floatingButtonViewModel;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final a floatingButtonEventHandler;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Y5/c$a", "LY5/a;", "Landroid/graphics/Bitmap;", "graphic", "", "a", "(Landroid/graphics/Bitmap;)V", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements Y5.a {
        a() {
        }

        @Override // Y5.a
        public void a(Bitmap graphic) {
            Intrinsics.j(graphic, "graphic");
            c.this.floatingButtonViewModel.d(graphic);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 5, 1})
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        static final class a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ c f40122f;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(0);
                this.f40122f = cVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f40122f.floatingButton.getEventListener().d(this.f40122f);
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: Y5.c$b$b, reason: collision with other inner class name */
        static final class C0863b extends Lambda implements Function1<f, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ c f40123f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0863b(c cVar) {
                super(1);
                this.f40123f = cVar;
            }

            public final void a(long j10) {
                this.f40123f.floatingButton.getEventListener().i(this.f40123f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f fVar) {
                a(fVar.getPackedValue());
                return Unit.f142422a;
            }
        }

        b() {
            super(2);
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 11) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(302621519, i10, -1, "com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonPresentable.getContent.<anonymous>.<anonymous> (FloatingButtonPresentable.kt:65)");
            }
            Z5.b.a(c.this.getPresentationStateManager(), c.this.floatingButton.getSettings(), c.this.floatingButtonViewModel, new a(c.this), new C0863b(c.this), composer, C6307U.f60956d | 576);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Override // X5.a
    public boolean r() {
        return false;
    }

    @Override // X5.a
    public boolean v(List<? extends n<?>> visiblePresentations) {
        Intrinsics.j(visiblePresentations, "visiblePresentations");
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h floatingButton, e floatingButtonViewModel, o oVar, r presentationUtilityProvider, X5.b appLifecycleProvider, InterfaceC16622O mainScope) {
        super(floatingButton, presentationUtilityProvider, oVar, appLifecycleProvider, mainScope);
        Intrinsics.j(floatingButton, "floatingButton");
        Intrinsics.j(floatingButtonViewModel, "floatingButtonViewModel");
        Intrinsics.j(presentationUtilityProvider, "presentationUtilityProvider");
        Intrinsics.j(appLifecycleProvider, "appLifecycleProvider");
        Intrinsics.j(mainScope, "mainScope");
        this.floatingButton = floatingButton;
        this.floatingButtonViewModel = floatingButtonViewModel;
        a aVar = new a();
        this.floatingButtonEventHandler = aVar;
        floatingButton.f(aVar);
        floatingButtonViewModel.d(floatingButton.getSettings().getInitialGraphic());
    }

    @Override // U5.m
    /* renamed from: A, reason: from getter and merged with bridge method [inline-methods] */
    public h getInAppMessage() {
        return this.floatingButton;
    }

    @Override // X5.a
    public ComposeView s(Context activityContext) {
        Intrinsics.j(activityContext, "activityContext");
        ComposeView composeView = new ComposeView(u(activityContext), null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(302621519, true, new b()));
        return composeView;
    }
}
