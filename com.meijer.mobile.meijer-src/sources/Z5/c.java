package Z5;

import U0.f;
import V5.h;
import V5.n;
import V5.o;
import V5.r;
import a6.C5663b;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import java.util.List;
import kotlin.C6433U;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0005*\u0001#\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u00020\u00152\u0010\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"LZ5/c;", "LY5/a;", "LV5/h;", "floatingButton", "LZ5/e;", "floatingButtonViewModel", "LV5/o;", "presentationDelegate", "LV5/r;", "presentationUtilityProvider", "LY5/b;", "appLifecycleProvider", "Lmv/O;", "mainScope", "<init>", "(LV5/h;LZ5/e;LV5/o;LV5/r;LY5/b;Lmv/O;)V", "Landroid/content/Context;", "activityContext", "Landroidx/compose/ui/platform/ComposeView;", "s", "(Landroid/content/Context;)Landroidx/compose/ui/platform/ComposeView;", "", "r", "()Z", "A", "()LV5/h;", "", "LV5/n;", "visiblePresentations", "v", "(Ljava/util/List;)Z", "k", "LV5/h;", "l", "LZ5/e;", "Z5/c$a", "m", "LZ5/c$a;", "floatingButtonEventHandler", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends Y5.a<h> {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final h floatingButton;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final e floatingButtonViewModel;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final a floatingButtonEventHandler;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Z5/c$a", "LZ5/a;", "Landroid/graphics/Bitmap;", "graphic", "", "a", "(Landroid/graphics/Bitmap;)V", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements Z5.a {
        a() {
        }

        @Override // Z5.a
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
            final /* synthetic */ c f43620f;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(0);
                this.f43620f = cVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f43620f.floatingButton.getEventListener().c(this.f43620f);
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: Z5.c$b$b, reason: collision with other inner class name */
        static final class C0926b extends Lambda implements Function1<f, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ c f43621f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0926b(c cVar) {
                super(1);
                this.f43621f = cVar;
            }

            public final void a(long j10) {
                this.f43621f.floatingButton.getEventListener().f(this.f43621f);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f fVar) {
                a(fVar.getPackedValue());
                return Unit.f143329a;
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
            C5663b.a(c.this.getPresentationStateManager(), c.this.floatingButton.getSettings(), c.this.floatingButtonViewModel, new a(c.this), new C0926b(c.this), composer, C6433U.f60755d | 576);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Override // Y5.a
    public boolean r() {
        return false;
    }

    @Override // Y5.a
    public boolean v(List<? extends n<?>> visiblePresentations) {
        Intrinsics.j(visiblePresentations, "visiblePresentations");
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h floatingButton, e floatingButtonViewModel, o oVar, r presentationUtilityProvider, Y5.b appLifecycleProvider, InterfaceC15783O mainScope) {
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

    @Override // V5.m
    /* renamed from: A, reason: from getter and merged with bridge method [inline-methods] */
    public h getInAppMessage() {
        return this.floatingButton;
    }

    @Override // Y5.a
    public ComposeView s(Context activityContext) {
        Intrinsics.j(activityContext, "activityContext");
        ComposeView composeView = new ComposeView(u(activityContext), null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(302621519, true, new b()));
        return composeView;
    }
}
