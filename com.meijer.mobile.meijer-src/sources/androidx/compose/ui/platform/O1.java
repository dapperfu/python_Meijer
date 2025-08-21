package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.platform.O1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import v2.C17624a;
import v2.InterfaceC17625b;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0002\u0006\bJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/O1;", "", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "", "a", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lkotlin/jvm/functions/Function0;", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface O1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f52098a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/O1$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/O1;", "a", "()Landroidx/compose/ui/platform/O1;", "Default", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.O1$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f52098a = new Companion();

        public final O1 a() {
            return b.f52099b;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/O1$b;", "Landroidx/compose/ui/platform/O1;", "<init>", "()V", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "", "a", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lkotlin/jvm/functions/Function0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements O1 {

        /* renamed from: b, reason: collision with root package name */
        public static final b f52099b = new b();

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractComposeView f52100f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ ViewOnAttachStateChangeListenerC1072b f52101g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC17625b f52102h;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractComposeView abstractComposeView, ViewOnAttachStateChangeListenerC1072b viewOnAttachStateChangeListenerC1072b, InterfaceC17625b interfaceC17625b) {
                super(0);
                this.f52100f = abstractComposeView;
                this.f52101g = viewOnAttachStateChangeListenerC1072b;
                this.f52102h = interfaceC17625b;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f52100f.removeOnAttachStateChangeListener(this.f52101g);
                C17624a.g(this.f52100f, this.f52102h);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/O1$b$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.O1$b$b, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC1072b implements View.OnAttachStateChangeListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractComposeView f52103a;

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v10) {
            }

            ViewOnAttachStateChangeListenerC1072b(AbstractComposeView abstractComposeView) {
                this.f52103a = abstractComposeView;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v10) {
                if (C17624a.f(this.f52103a)) {
                    return;
                }
                this.f52103a.e();
            }
        }

        @Override // androidx.compose.ui.platform.O1
        public Function0<Unit> a(final AbstractComposeView view) {
            ViewOnAttachStateChangeListenerC1072b viewOnAttachStateChangeListenerC1072b = new ViewOnAttachStateChangeListenerC1072b(view);
            view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1072b);
            InterfaceC17625b interfaceC17625b = new InterfaceC17625b() { // from class: androidx.compose.ui.platform.P1
                @Override // v2.InterfaceC17625b
                public final void b() {
                    O1.b.c(view);
                }
            };
            C17624a.a(view, interfaceC17625b);
            return new a(view, viewOnAttachStateChangeListenerC1072b, interfaceC17625b);
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
