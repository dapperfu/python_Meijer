package androidx.view;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.view.AbstractC6023l;
import androidx.view.G;
import androidx.view.InterfaceC6027p;
import androidx.view.InterfaceC6030s;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o2.InterfaceC15993a;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u000458\u001c#B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0007¢\u0006\u0004\b%\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001a0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00109¨\u0006<"}, d2 = {"Landroidx/activity/G;", "", "Ljava/lang/Runnable;", "fallbackOnBackPressed", "Lo2/a;", "", "onHasEnabledCallbacksChanged", "<init>", "(Ljava/lang/Runnable;Lo2/a;)V", "(Ljava/lang/Runnable;)V", "shouldBeRegistered", "", "p", "(Z)V", "q", "()V", "Landroidx/activity/b;", "backEvent", "n", "(Landroidx/activity/b;)V", "m", "k", "Landroid/window/OnBackInvokedDispatcher;", "invoker", "o", "(Landroid/window/OnBackInvokedDispatcher;)V", "Landroidx/activity/F;", "onBackPressedCallback", "h", "(Landroidx/activity/F;)V", "Landroidx/activity/c;", "j", "(Landroidx/activity/F;)Landroidx/activity/c;", "Landroidx/lifecycle/s;", "owner", "i", "(Landroidx/lifecycle/s;Landroidx/activity/F;)V", "l", "a", "Ljava/lang/Runnable;", "b", "Lo2/a;", "Lkotlin/collections/ArrayDeque;", "c", "Lkotlin/collections/ArrayDeque;", "onBackPressedCallbacks", "d", "Landroidx/activity/F;", "inProgressCallback", "Landroid/window/OnBackInvokedCallback;", "e", "Landroid/window/OnBackInvokedCallback;", "onBackInvokedCallback", "f", "Landroid/window/OnBackInvokedDispatcher;", "invokedDispatcher", "g", "Z", "backInvokedCallbackRegistered", "hasEnabledCallbacks", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Runnable fallbackOnBackPressed;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15993a<Boolean> onHasEnabledCallbacksChanged;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<F> onBackPressedCallbacks;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private F inProgressCallback;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private OnBackInvokedCallback onBackInvokedCallback;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private OnBackInvokedDispatcher invokedDispatcher;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean backInvokedCallbackRegistered;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean hasEnabledCallbacks;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/activity/b;", "backEvent", "", "a", "(Landroidx/activity/b;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements Function1<C5614b, Unit> {
        a() {
            super(1);
        }

        public final void a(C5614b backEvent) {
            Intrinsics.j(backEvent, "backEvent");
            G.this.n(backEvent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C5614b c5614b) {
            a(c5614b);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/activity/b;", "backEvent", "", "a", "(Landroidx/activity/b;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends Lambda implements Function1<C5614b, Unit> {
        b() {
            super(1);
        }

        public final void a(C5614b backEvent) {
            Intrinsics.j(backEvent, "backEvent");
            G.this.m(backEvent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C5614b c5614b) {
            a(c5614b);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends Lambda implements Function0<Unit> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            G.this.l();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends Lambda implements Function0<Unit> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            G.this.k();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends Lambda implements Function0<Unit> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            G.this.l();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/activity/G$f;", "", "<init>", "()V", "dispatcher", "", "priority", "callback", "", "d", "(Ljava/lang/Object;ILjava/lang/Object;)V", "e", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "onBackInvoked", "Landroid/window/OnBackInvokedCallback;", "b", "(Lkotlin/jvm/functions/Function0;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f45678a = new f();

        public final OnBackInvokedCallback b(final Function0<Unit> onBackInvoked) {
            Intrinsics.j(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.H
                public final void onBackInvoked() {
                    G.f.c(onBackInvoked);
                }
            };
        }

        public final void d(Object dispatcher, int priority, Object callback) {
            Intrinsics.j(dispatcher, "dispatcher");
            Intrinsics.j(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(priority, (OnBackInvokedCallback) callback);
        }

        public final void e(Object dispatcher, Object callback) {
            Intrinsics.j(dispatcher, "dispatcher");
            Intrinsics.j(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Function0 function0) {
            function0.invoke();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jo\u0010\u0010\u001a\u00020\u000f2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00042!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/activity/G$g;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/activity/b;", "Lkotlin/ParameterName;", "name", "backEvent", "", "onBackStarted", "onBackProgressed", "Lkotlin/Function0;", "onBackInvoked", "onBackCancelled", "Landroid/window/OnBackInvokedCallback;", "a", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f45679a = new g();

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"androidx/activity/G$g$a", "Landroid/window/OnBackAnimationCallback;", "Landroid/window/BackEvent;", "backEvent", "", "onBackStarted", "(Landroid/window/BackEvent;)V", "onBackProgressed", "onBackInvoked", "()V", "onBackCancelled", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<C5614b, Unit> f45680a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<C5614b, Unit> f45681b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f45682c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f45683d;

            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super C5614b, Unit> function1, Function1<? super C5614b, Unit> function12, Function0<Unit> function0, Function0<Unit> function02) {
                this.f45680a = function1;
                this.f45681b = function12;
                this.f45682c = function0;
                this.f45683d = function02;
            }

            public void onBackCancelled() {
                this.f45683d.invoke();
            }

            public void onBackInvoked() {
                this.f45682c.invoke();
            }

            public void onBackProgressed(BackEvent backEvent) {
                Intrinsics.j(backEvent, "backEvent");
                this.f45681b.invoke(new C5614b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                Intrinsics.j(backEvent, "backEvent");
                this.f45680a.invoke(new C5614b(backEvent));
            }
        }

        public final OnBackInvokedCallback a(Function1<? super C5614b, Unit> onBackStarted, Function1<? super C5614b, Unit> onBackProgressed, Function0<Unit> onBackInvoked, Function0<Unit> onBackCancelled) {
            Intrinsics.j(onBackStarted, "onBackStarted");
            Intrinsics.j(onBackProgressed, "onBackProgressed");
            Intrinsics.j(onBackInvoked, "onBackInvoked");
            Intrinsics.j(onBackCancelled, "onBackCancelled");
            return new a(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
        }

        private g() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/activity/G$h;", "Landroidx/lifecycle/p;", "Landroidx/activity/c;", "Landroidx/lifecycle/l;", "lifecycle", "Landroidx/activity/F;", "onBackPressedCallback", "<init>", "(Landroidx/activity/G;Landroidx/lifecycle/l;Landroidx/activity/F;)V", "Landroidx/lifecycle/s;", "source", "Landroidx/lifecycle/l$a;", "event", "", "onStateChanged", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "cancel", "()V", "a", "Landroidx/lifecycle/l;", "b", "Landroidx/activity/F;", "c", "Landroidx/activity/c;", "currentCancellable", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class h implements InterfaceC6027p, InterfaceC5615c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AbstractC6023l lifecycle;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final F onBackPressedCallback;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private InterfaceC5615c currentCancellable;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G f45687d;

        public h(G g10, AbstractC6023l lifecycle, F onBackPressedCallback) {
            Intrinsics.j(lifecycle, "lifecycle");
            Intrinsics.j(onBackPressedCallback, "onBackPressedCallback");
            this.f45687d = g10;
            this.lifecycle = lifecycle;
            this.onBackPressedCallback = onBackPressedCallback;
            lifecycle.a(this);
        }

        @Override // androidx.view.InterfaceC5615c
        public void cancel() {
            this.lifecycle.d(this);
            this.onBackPressedCallback.removeCancellable(this);
            InterfaceC5615c interfaceC5615c = this.currentCancellable;
            if (interfaceC5615c != null) {
                interfaceC5615c.cancel();
            }
            this.currentCancellable = null;
        }

        @Override // androidx.view.InterfaceC6027p
        public void onStateChanged(InterfaceC6030s source, AbstractC6023l.a event) {
            Intrinsics.j(source, "source");
            Intrinsics.j(event, "event");
            if (event == AbstractC6023l.a.ON_START) {
                this.currentCancellable = this.f45687d.j(this.onBackPressedCallback);
                return;
            }
            if (event != AbstractC6023l.a.ON_STOP) {
                if (event == AbstractC6023l.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                InterfaceC5615c interfaceC5615c = this.currentCancellable;
                if (interfaceC5615c != null) {
                    interfaceC5615c.cancel();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/activity/G$i;", "Landroidx/activity/c;", "Landroidx/activity/F;", "onBackPressedCallback", "<init>", "(Landroidx/activity/G;Landroidx/activity/F;)V", "", "cancel", "()V", "a", "Landroidx/activity/F;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class i implements InterfaceC5615c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final F onBackPressedCallback;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G f45689b;

        public i(G g10, F onBackPressedCallback) {
            Intrinsics.j(onBackPressedCallback, "onBackPressedCallback");
            this.f45689b = g10;
            this.onBackPressedCallback = onBackPressedCallback;
        }

        @Override // androidx.view.InterfaceC5615c
        public void cancel() {
            this.f45689b.onBackPressedCallbacks.remove(this.onBackPressedCallback);
            if (Intrinsics.e(this.f45689b.inProgressCallback, this.onBackPressedCallback)) {
                this.onBackPressedCallback.handleOnBackCancelled();
                this.f45689b.inProgressCallback = null;
            }
            this.onBackPressedCallback.removeCancellable(this);
            Function0<Unit> enabledChangedCallback$activity_release = this.onBackPressedCallback.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.onBackPressedCallback.setEnabledChangedCallback$activity_release(null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class j extends FunctionReferenceImpl implements Function0<Unit> {
        j(Object obj) {
            super(0, obj, G.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void a() {
            ((G) this.receiver).q();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class k extends FunctionReferenceImpl implements Function0<Unit> {
        k(Object obj) {
            super(0, obj, G.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        public final void a() {
            ((G) this.receiver).q();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public G() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public G(Runnable runnable, InterfaceC15993a<Boolean> interfaceC15993a) {
        this.fallbackOnBackPressed = runnable;
        this.onHasEnabledCallbacksChanged = interfaceC15993a;
        this.onBackPressedCallbacks = new ArrayDeque<>();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.onBackInvokedCallback = i10 >= 34 ? g.f45679a.a(new a(), new b(), new c(), new d()) : f.f45678a.b(new e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        F fPrevious;
        F f10 = this.inProgressCallback;
        if (f10 == null) {
            ArrayDeque<F> arrayDeque = this.onBackPressedCallbacks;
            ListIterator<F> listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    fPrevious = null;
                    break;
                } else {
                    fPrevious = listIterator.previous();
                    if (fPrevious.getIsEnabled()) {
                        break;
                    }
                }
            }
            f10 = fPrevious;
        }
        this.inProgressCallback = null;
        if (f10 != null) {
            f10.handleOnBackCancelled();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(C5614b backEvent) {
        F fPrevious;
        F f10 = this.inProgressCallback;
        if (f10 == null) {
            ArrayDeque<F> arrayDeque = this.onBackPressedCallbacks;
            ListIterator<F> listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    fPrevious = null;
                    break;
                } else {
                    fPrevious = listIterator.previous();
                    if (fPrevious.getIsEnabled()) {
                        break;
                    }
                }
            }
            f10 = fPrevious;
        }
        if (f10 != null) {
            f10.handleOnBackProgressed(backEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(C5614b backEvent) {
        F fPrevious;
        ArrayDeque<F> arrayDeque = this.onBackPressedCallbacks;
        ListIterator<F> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                fPrevious = null;
                break;
            } else {
                fPrevious = listIterator.previous();
                if (fPrevious.getIsEnabled()) {
                    break;
                }
            }
        }
        F f10 = fPrevious;
        if (this.inProgressCallback != null) {
            k();
        }
        this.inProgressCallback = f10;
        if (f10 != null) {
            f10.handleOnBackStarted(backEvent);
        }
    }

    private final void p(boolean shouldBeRegistered) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.invokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (shouldBeRegistered && !this.backInvokedCallbackRegistered) {
            f.f45678a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = true;
        } else {
            if (shouldBeRegistered || !this.backInvokedCallbackRegistered) {
                return;
            }
            f.f45678a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        boolean z10 = this.hasEnabledCallbacks;
        ArrayDeque<F> arrayDeque = this.onBackPressedCallbacks;
        boolean z11 = false;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            Iterator<F> it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().getIsEnabled()) {
                    z11 = true;
                    break;
                }
            }
        }
        this.hasEnabledCallbacks = z11;
        if (z11 != z10) {
            InterfaceC15993a<Boolean> interfaceC15993a = this.onHasEnabledCallbacksChanged;
            if (interfaceC15993a != null) {
                interfaceC15993a.accept(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                p(z11);
            }
        }
    }

    public final void h(F onBackPressedCallback) {
        Intrinsics.j(onBackPressedCallback, "onBackPressedCallback");
        j(onBackPressedCallback);
    }

    public final void i(InterfaceC6030s owner, F onBackPressedCallback) {
        Intrinsics.j(owner, "owner");
        Intrinsics.j(onBackPressedCallback, "onBackPressedCallback");
        AbstractC6023l lifecycle = owner.getLifecycle();
        if (lifecycle.getState() == AbstractC6023l.b.f55275a) {
            return;
        }
        onBackPressedCallback.addCancellable(new h(this, lifecycle, onBackPressedCallback));
        q();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new j(this));
    }

    public final InterfaceC5615c j(F onBackPressedCallback) {
        Intrinsics.j(onBackPressedCallback, "onBackPressedCallback");
        this.onBackPressedCallbacks.add(onBackPressedCallback);
        i iVar = new i(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(iVar);
        q();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new k(this));
        return iVar;
    }

    public final void l() {
        F fPrevious;
        F f10 = this.inProgressCallback;
        if (f10 == null) {
            ArrayDeque<F> arrayDeque = this.onBackPressedCallbacks;
            ListIterator<F> listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    fPrevious = null;
                    break;
                } else {
                    fPrevious = listIterator.previous();
                    if (fPrevious.getIsEnabled()) {
                        break;
                    }
                }
            }
            f10 = fPrevious;
        }
        this.inProgressCallback = null;
        if (f10 != null) {
            f10.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.fallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void o(OnBackInvokedDispatcher invoker) {
        Intrinsics.j(invoker, "invoker");
        this.invokedDispatcher = invoker;
        p(this.hasEnabledCallbacks);
    }

    @JvmOverloads
    public G(Runnable runnable) {
        this(runnable, null);
    }

    public /* synthetic */ G(Runnable runnable, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : runnable);
    }
}
