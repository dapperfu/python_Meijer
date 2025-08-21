package sn;

import Hk.UIEvent;
import Rn.FlyBuyState;
import hi.InterfaceC14523a;
import kn.C15297b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0003!\u001d\u001bB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020 0$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lsn/l;", "Landroidx/lifecycle/c0;", "Lkn/b;", "navigationCommandManager", "LRn/I;", "flyBuyManager", "Lhi/a;", "analyticsEngine", "LDl/e;", "meijerIntent", "<init>", "(Lkn/b;LRn/I;Lhi/a;LDl/e;)V", "LRn/K;", "flyBuyState", "", "r", "(LRn/K;)V", "Lsn/l$d;", "action", "q", "(Lsn/l$d;)V", "onCleared", "()V", "a", "Lkn/b;", "b", "LRn/I;", "c", "Lhi/a;", "d", "LDl/e;", "Lpv/B;", "Lsn/l$e;", "e", "Lpv/B;", "_viewState", "Lpv/P;", "f", "Lpv/P;", "p", "()Lpv/P;", "viewState", "LJu/a;", "g", "LJu/a;", "compositeDisposable", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: sn.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C17096l extends androidx.view.c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15297b navigationCommandManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Rn.I flyBuyManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Dl.e meijerIntent;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final pv.P<ViewState> viewState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Ju.a compositeDisposable;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sn.l$a */
    /* synthetic */ class a extends AdaptedFunctionReference implements Function2<FlyBuyState, Continuation<? super Unit>, Object>, SuspendFunction {
        a(Object obj) {
            super(2, obj, C17096l.class, "onNewFlyBuyState", "onNewFlyBuyState(Lcom/meijer/mobile/meijer/managers/FlyBuyState;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlyBuyState flyBuyState, Continuation<? super Unit> continuation) {
            return C17096l.m((C17096l) this.f143708a, flyBuyState, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpv/g;", "LRn/K;", "kotlin.jvm.PlatformType", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.FlyBuyConfirmationViewModel$3", f = "FlyBuyConfirmationViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: sn.l$b */
    static final class b extends SuspendLambda implements Function3<InterfaceC16562g<? super FlyBuyState>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f161422a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f161423b;

        b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super FlyBuyState> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            b bVar = new b(continuation);
            bVar.f161423b = th2;
            return bVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f161422a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.f((Throwable) this.f161423b, "Error in flybuy state flow", new Object[0]);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lsn/l$c;", "", "<init>", "()V", "a", "c", "b", "Lsn/l$c$a;", "Lsn/l$c$b;", "Lsn/l$c$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sn.l$c */
    public static abstract class c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/l$c$a;", "Lsn/l$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.l$c$a */
        public static final /* data */ class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final a f161424a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public String toString() {
                return "NavigateToCheckIn";
            }

            public int hashCode() {
                return -1827642141;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lsn/l$c$b;", "Lsn/l$c;", "LDl/e;", "meijerIntent", "<init>", "(LDl/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LDl/e;", "()LDl/e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.l$c$b, reason: from toString */
        public static final /* data */ class NavigateToHome extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Dl.e meijerIntent;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigateToHome) && Intrinsics.e(this.meijerIntent, ((NavigateToHome) other).meijerIntent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToHome(Dl.e meijerIntent) {
                super(null);
                Intrinsics.j(meijerIntent, "meijerIntent");
                this.meijerIntent = meijerIntent;
            }

            /* renamed from: a, reason: from getter */
            public final Dl.e getMeijerIntent() {
                return this.meijerIntent;
            }

            public int hashCode() {
                return this.meijerIntent.hashCode();
            }

            public String toString() {
                return "NavigateToHome(meijerIntent=" + this.meijerIntent + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/l$c$c;", "Lsn/l$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.l$c$c, reason: collision with other inner class name */
        public static final /* data */ class C2520c extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final C2520c f161426a = new C2520c();

            private C2520c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2520c);
            }

            public String toString() {
                return "NavigateToOrderDetails";
            }

            public int hashCode() {
                return 642393150;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lsn/l$d;", "", "<init>", "()V", "c", "b", "a", "d", "Lsn/l$d$a;", "Lsn/l$d$b;", "Lsn/l$d$c;", "Lsn/l$d$d;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sn.l$d */
    public static abstract class d {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/l$d$a;", "Lsn/l$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.l$d$a */
        public static final /* data */ class a extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final a f161427a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public String toString() {
                return "GoToHome";
            }

            public int hashCode() {
                return 944975125;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/l$d$b;", "Lsn/l$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.l$d$b */
        public static final /* data */ class b extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final b f161428a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public String toString() {
                return "GoToOrderDetails";
            }

            public int hashCode() {
                return -960532150;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/l$d$c;", "Lsn/l$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.l$d$c */
        public static final /* data */ class c extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final c f161429a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public String toString() {
                return "GoToParkingSpot";
            }

            public int hashCode() {
                return -2107784220;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/l$d$d;", "Lsn/l$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.l$d$d, reason: collision with other inner class name */
        public static final /* data */ class C2521d extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final C2521d f161430a = new C2521d();

            private C2521d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2521d);
            }

            public String toString() {
                return "RouteToCheckIn";
            }

            public int hashCode() {
                return 1640250076;
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lsn/l$e;", "", "LHk/a;", "Lsn/l$c;", "confirmUIEvents", "LRn/K;", "flyBuyState", "<init>", "(LHk/a;LRn/K;)V", "a", "(LHk/a;LRn/K;)Lsn/l$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LHk/a;", "c", "()LHk/a;", "b", "LRn/K;", "d", "()LRn/K;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sn.l$e, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final UIEvent<c> confirmUIEvents;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FlyBuyState flyBuyState;

        /* JADX WARN: Multi-variable type inference failed */
        public ViewState() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.confirmUIEvents, viewState.confirmUIEvents) && Intrinsics.e(this.flyBuyState, viewState.flyBuyState);
        }

        public ViewState(UIEvent<c> confirmUIEvents, FlyBuyState flyBuyState) {
            Intrinsics.j(confirmUIEvents, "confirmUIEvents");
            this.confirmUIEvents = confirmUIEvents;
            this.flyBuyState = flyBuyState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ViewState b(ViewState viewState, UIEvent uIEvent, FlyBuyState flyBuyState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uIEvent = viewState.confirmUIEvents;
            }
            if ((i10 & 2) != 0) {
                flyBuyState = viewState.flyBuyState;
            }
            return viewState.a(uIEvent, flyBuyState);
        }

        public final ViewState a(UIEvent<c> confirmUIEvents, FlyBuyState flyBuyState) {
            Intrinsics.j(confirmUIEvents, "confirmUIEvents");
            return new ViewState(confirmUIEvents, flyBuyState);
        }

        public final UIEvent<c> c() {
            return this.confirmUIEvents;
        }

        /* renamed from: d, reason: from getter */
        public final FlyBuyState getFlyBuyState() {
            return this.flyBuyState;
        }

        public int hashCode() {
            int iHashCode = this.confirmUIEvents.hashCode() * 31;
            FlyBuyState flyBuyState = this.flyBuyState;
            return iHashCode + (flyBuyState == null ? 0 : flyBuyState.hashCode());
        }

        public String toString() {
            return "ViewState(confirmUIEvents=" + this.confirmUIEvents + ", flyBuyState=" + this.flyBuyState + ')';
        }

        public /* synthetic */ ViewState(UIEvent uIEvent, FlyBuyState flyBuyState, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new UIEvent(null, 1, null) : uIEvent, (i10 & 2) != 0 ? null : flyBuyState);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: sn.l$f */
    public static final class f implements InterfaceC16561f<FlyBuyState> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f161433a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17096l f161434b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: sn.l$f$a */
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f161435a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17096l f161436b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.FlyBuyConfirmationViewModel$special$$inlined$filter$1$2", f = "FlyBuyConfirmationViewModel.kt", l = {50}, m = "emit")
            /* renamed from: sn.l$f$a$a, reason: collision with other inner class name */
            public static final class C2522a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f161437a;

                /* renamed from: b, reason: collision with root package name */
                int f161438b;

                /* renamed from: c, reason: collision with root package name */
                Object f161439c;

                /* renamed from: d, reason: collision with root package name */
                Object f161440d;

                /* renamed from: f, reason: collision with root package name */
                Object f161442f;

                /* renamed from: g, reason: collision with root package name */
                Object f161443g;

                /* renamed from: h, reason: collision with root package name */
                int f161444h;

                public C2522a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f161437a = obj;
                    this.f161438b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g, C17096l c17096l) {
                this.f161435a = interfaceC16562g;
                this.f161436b = c17096l;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof sn.C17096l.f.a.C2522a
                    if (r0 == 0) goto L13
                    r0 = r7
                    sn.l$f$a$a r0 = (sn.C17096l.f.a.C2522a) r0
                    int r1 = r0.f161438b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f161438b = r1
                    goto L18
                L13:
                    sn.l$f$a$a r0 = new sn.l$f$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f161437a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f161438b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r6 = r0.f161443g
                    pv.g r6 = (pv.InterfaceC16562g) r6
                    java.lang.Object r6 = r0.f161440d
                    sn.l$f$a$a r6 = (sn.C17096l.f.a.C2522a) r6
                    kotlin.ResultKt.b(r7)
                    goto L77
                L31:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L39:
                    kotlin.ResultKt.b(r7)
                    pv.g r7 = r5.f161435a
                    r2 = r6
                    Rn.K r2 = (Rn.FlyBuyState) r2
                    java.lang.String r2 = r2.getParkingSpot()
                    sn.l r4 = r5.f161436b
                    pv.B r4 = sn.C17096l.o(r4)
                    java.lang.Object r4 = r4.getValue()
                    sn.l$e r4 = (sn.C17096l.ViewState) r4
                    Rn.K r4 = r4.getFlyBuyState()
                    if (r4 == 0) goto L5c
                    java.lang.String r4 = r4.getParkingSpot()
                    goto L5d
                L5c:
                    r4 = 0
                L5d:
                    boolean r2 = kotlin.jvm.internal.Intrinsics.e(r2, r4)
                    if (r2 != 0) goto L77
                    r0.f161439c = r6
                    r0.f161440d = r0
                    r0.f161442f = r6
                    r0.f161443g = r7
                    r2 = 0
                    r0.f161444h = r2
                    r0.f161438b = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L77
                    return r1
                L77:
                    kotlin.Unit r6 = kotlin.Unit.f143329a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: sn.C17096l.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public f(InterfaceC16561f interfaceC16561f, C17096l c17096l) {
            this.f161433a = interfaceC16561f;
            this.f161434b = c17096l;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super FlyBuyState> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f161433a.collect(new a(interfaceC16562g, this.f161434b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C17096l(C15297b navigationCommandManager, Rn.I flyBuyManager, InterfaceC14523a analyticsEngine, Dl.e meijerIntent) {
        Intrinsics.j(navigationCommandManager, "navigationCommandManager");
        Intrinsics.j(flyBuyManager, "flyBuyManager");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(meijerIntent, "meijerIntent");
        this.navigationCommandManager = navigationCommandManager;
        this.flyBuyManager = flyBuyManager;
        this.analyticsEngine = analyticsEngine;
        this.meijerIntent = meijerIntent;
        InterfaceC16549B<ViewState> interfaceC16549BA = pv.S.a(new ViewState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
        this.compositeDisposable = new Ju.a();
        C16563h.J(C16563h.g(C16563h.O(new f(tv.h.b(flyBuyManager.J()), this), new a(this)), new b(null)), androidx.view.d0.a(this));
    }

    public final pv.P<ViewState> p() {
        return this.viewState;
    }

    public final void q(d action) {
        ViewState value;
        ViewState value2;
        ViewState value3;
        Intrinsics.j(action, "action");
        if (action instanceof d.b) {
            this.flyBuyManager.v0(true);
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
            do {
                value3 = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value3, ViewState.b(value3, new UIEvent(c.C2520c.f161426a), null, 2, null)));
            return;
        }
        if (action instanceof d.a) {
            this.flyBuyManager.v0(true);
            FlyBuyState flyBuyState = this._viewState.getValue().getFlyBuyState();
            if (flyBuyState != null) {
                this.analyticsEngine.k(Kn.n.f17594a.M(flyBuyState));
            }
            InterfaceC16549B<ViewState> interfaceC16549B2 = this._viewState;
            do {
                value2 = interfaceC16549B2.getValue();
            } while (!interfaceC16549B2.e(value2, ViewState.b(value2, new UIEvent(new c.NavigateToHome(this.meijerIntent)), null, 2, null)));
            return;
        }
        if (!(action instanceof d.c)) {
            if (!(action instanceof d.C2521d)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navigationCommandManager.d(on.T.f154906a.a());
            return;
        }
        FlyBuyState flyBuyState2 = this._viewState.getValue().getFlyBuyState();
        if (flyBuyState2 != null) {
            this.analyticsEngine.k(Kn.n.f17594a.n(flyBuyState2));
        }
        this.flyBuyManager.v0(false);
        InterfaceC16549B<ViewState> interfaceC16549B3 = this._viewState;
        do {
            value = interfaceC16549B3.getValue();
        } while (!interfaceC16549B3.e(value, ViewState.b(value, new UIEvent(c.a.f161424a), null, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object m(C17096l c17096l, FlyBuyState flyBuyState, Continuation continuation) {
        c17096l.r(flyBuyState);
        return Unit.f143329a;
    }

    private final void r(FlyBuyState flyBuyState) {
        ViewState value;
        if (flyBuyState.getIsCheckInConfirmParkingSpotTrackStateEnable()) {
            this.analyticsEngine.k(Kn.n.f17594a.r(flyBuyState));
            this.flyBuyManager.p0(false);
        }
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, flyBuyState, 1, null)));
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        super.onCleared();
        this.compositeDisposable.d();
    }
}
