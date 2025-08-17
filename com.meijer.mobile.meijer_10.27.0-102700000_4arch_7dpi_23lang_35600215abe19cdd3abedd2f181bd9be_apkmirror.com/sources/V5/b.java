package V5;

import U5.j;
import U5.n;
import U5.o;
import U5.r;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C6307U;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001b\u001a\u00020\u00132\u0010\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017¨\u0006 "}, d2 = {"LV5/b;", "LX5/a;", "LU5/b;", "alert", "LU5/o;", "presentationDelegate", "LU5/r;", "presentationUtilityProvider", "LX5/b;", "appLifecycleProvider", "Lqv/O;", "mainScope", "<init>", "(LU5/b;LU5/o;LU5/r;LX5/b;Lqv/O;)V", "Landroid/content/Context;", "activityContext", "Landroidx/compose/ui/platform/ComposeView;", "s", "(Landroid/content/Context;)Landroidx/compose/ui/platform/ComposeView;", "", "r", "()Z", "z", "()LU5/b;", "", "LU5/n;", "visiblePresentations", "v", "(Ljava/util/List;)Z", "k", "LU5/b;", "y", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class b extends X5.a<U5.b> {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final U5.b alert;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 5, 1})
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: V5.b$a$a, reason: collision with other inner class name */
        static final class C0805a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f36909f;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0805a(b bVar) {
                super(0);
                this.f36909f = bVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f36909f.getAlert().getEventListener().j(this.f36909f);
                this.f36909f.dismiss();
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: V5.b$a$b, reason: collision with other inner class name */
        static final class C0806b extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f36910f;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0806b(b bVar) {
                super(0);
                this.f36910f = bVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f36910f.getAlert().getEventListener().h(this.f36910f);
                this.f36910f.dismiss();
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        static final class c extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f36911f;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b bVar) {
                super(0);
                this.f36911f = bVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f36911f.dismiss();
            }
        }

        a() {
            super(2);
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 11) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1228840351, i10, -1, "com.adobe.marketing.mobile.services.ui.alert.AlertPresentable.getContent.<anonymous>.<anonymous> (AlertPresentable.kt:47)");
            }
            W5.a.a(b.this.getPresentationStateManager(), b.this.getAlert().getSettings(), new C0805a(b.this), new C0806b(b.this), new c(b.this), composer, C6307U.f60956d);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(U5.b alert, o oVar, r presentationUtilityProvider, X5.b appLifecycleProvider, InterfaceC16622O mainScope) {
        super(alert, presentationUtilityProvider, oVar, appLifecycleProvider, mainScope);
        Intrinsics.j(alert, "alert");
        Intrinsics.j(presentationUtilityProvider, "presentationUtilityProvider");
        Intrinsics.j(appLifecycleProvider, "appLifecycleProvider");
        Intrinsics.j(mainScope, "mainScope");
        this.alert = alert;
    }

    @Override // X5.a
    public ComposeView s(Context activityContext) {
        Intrinsics.j(activityContext, "activityContext");
        ComposeView composeView = new ComposeView(activityContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1228840351, true, new a()));
        return composeView;
    }

    @Override // X5.a
    public boolean v(List<? extends n<?>> visiblePresentations) {
        Intrinsics.j(visiblePresentations, "visiblePresentations");
        List<? extends n<?>> list = visiblePresentations;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if ((nVar instanceof U5.b) || (nVar instanceof j)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y, reason: from getter */
    public final U5.b getAlert() {
        return this.alert;
    }

    @Override // U5.m
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public U5.b getInAppMessage() {
        return this.alert;
    }
}
