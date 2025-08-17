package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.platform.O1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import v2.C17485a;
import v2.InterfaceC17486b;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0002\u0006\bJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/O1;", "", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "", "a", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lkotlin/jvm/functions/Function0;", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface O1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f51874a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/O1$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/O1;", "a", "()Landroidx/compose/ui/platform/O1;", "Default", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.O1$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f51874a = new Companion();

        public final O1 a() {
            return b.f51875b;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/O1$b;", "Landroidx/compose/ui/platform/O1;", "<init>", "()V", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "", "a", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lkotlin/jvm/functions/Function0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements O1 {

        /* renamed from: b, reason: collision with root package name */
        public static final b f51875b = new b();

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractComposeView f51876f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ ViewOnAttachStateChangeListenerC1059b f51877g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC17486b f51878h;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractComposeView abstractComposeView, ViewOnAttachStateChangeListenerC1059b viewOnAttachStateChangeListenerC1059b, InterfaceC17486b interfaceC17486b) {
                super(0);
                this.f51876f = abstractComposeView;
                this.f51877g = viewOnAttachStateChangeListenerC1059b;
                this.f51878h = interfaceC17486b;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f51876f.removeOnAttachStateChangeListener(this.f51877g);
                C17485a.g(this.f51876f, this.f51878h);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/O1$b$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.O1$b$b, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC1059b implements View.OnAttachStateChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractComposeView f51879a;

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v10) {
            }

            ViewOnAttachStateChangeListenerC1059b(AbstractComposeView abstractComposeView) {
                this.f51879a = abstractComposeView;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v10) {
                if (C17485a.f(this.f51879a)) {
                    return;
                }
                this.f51879a.e();
            }
        }

        @Override // androidx.compose.ui.platform.O1
        public Function0<Unit> a(final AbstractComposeView view) {
            ViewOnAttachStateChangeListenerC1059b viewOnAttachStateChangeListenerC1059b = new ViewOnAttachStateChangeListenerC1059b(view);
            view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1059b);
            InterfaceC17486b interfaceC17486b = new InterfaceC17486b() { // from class: androidx.compose.ui.platform.P1
                @Override // v2.InterfaceC17486b
                public final void b() {
                    O1.b.c(view);
                }
            };
            C17485a.a(view, interfaceC17486b);
            return new a(view, viewOnAttachStateChangeListenerC1059b, interfaceC17486b);
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(AbstractComposeView abstractComposeView) {
            abstractComposeView.e();
        }
    }

    Function0<Unit> a(AbstractComposeView view);
}
