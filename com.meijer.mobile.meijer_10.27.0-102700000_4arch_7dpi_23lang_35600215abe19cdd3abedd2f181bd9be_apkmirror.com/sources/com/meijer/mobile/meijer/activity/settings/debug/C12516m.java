package com.meijer.mobile.meijer.activity.settings.debug;

import Cs.MeijerAccount;
import Td.AbstractC5232j;
import Td.InterfaceC5229g;
import com.google.firebase.messaging.FirebaseMessaging;
import com.meijer.mobile.meijer.activity.settings.debug.AbstractC12504a;
import com.meijer.mobile.meijer.activity.settings.debug.C12505b;
import ek.NotificationData;
import j2.C14835c;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import wm.C17838h;
import yl.AbstractC18227f;
import yl.AbstractC18253g;
import yl.C18254h;
import yo.MeijerUser;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001/BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010!\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00162\u0006\u0010 \u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020&¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020:0>8F¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/debug/m;", "Landroidx/lifecycle/c0;", "Lcom/meijer/mobile/meijer/activity/settings/debug/b;", "debugFlagsProvider", "Lyl/k;", "featureManager", "Lcom/google/firebase/messaging/FirebaseMessaging;", "firebaseMessaging", "Lyo/k;", "userManager", "Lyo/f;", "storeManager", "Lcom/squareup/picasso/o;", "picasso", "LUn/b;", "emarsysManager", "Lwm/h;", "mperksNotificationManager", "<init>", "(Lcom/meijer/mobile/meijer/activity/settings/debug/b;Lyl/k;Lcom/google/firebase/messaging/FirebaseMessaging;Lyo/k;Lyo/f;Lcom/squareup/picasso/o;LUn/b;Lwm/h;)V", "Lcom/meijer/mobile/meijer/activity/settings/debug/a$e;", "action", "", "w", "(Lcom/meijer/mobile/meijer/activity/settings/debug/a$e;)V", "", "searchTerm", "A", "(Ljava/lang/String;)V", "Lyl/f;", "feature", "Lyl/g;", "state", "y", "(Lyl/f;Lyl/g;)V", "", "x", "(I)V", "Lcom/meijer/mobile/meijer/activity/settings/debug/a;", "v", "(Lcom/meijer/mobile/meijer/activity/settings/debug/a;)V", "a", "Lcom/meijer/mobile/meijer/activity/settings/debug/b;", "b", "Lyl/k;", "c", "Lcom/google/firebase/messaging/FirebaseMessaging;", "d", "Lyo/k;", "e", "Lyo/f;", "f", "Lcom/squareup/picasso/o;", "g", "LUn/b;", "h", "Lwm/h;", "Ltv/B;", "Lcom/meijer/mobile/meijer/activity/settings/debug/m$d;", "i", "Ltv/B;", "_viewState", "Ltv/P;", "u", "()Ltv/P;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.settings.debug.m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C12516m extends androidx.view.c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C12505b debugFlagsProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final FirebaseMessaging firebaseMessaging;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final yo.f storeManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final com.squareup.picasso.o picasso;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Un.b emarsysManager;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C17838h mperksNotificationManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ViewState> _viewState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsViewModel$1", f = "DebugOptionsViewModel.kt", l = {56, 57}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.m$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112211a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.m$a$a, reason: collision with other inner class name */
        static final class C1778a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C12516m f112213a;

            C1778a(C12516m c12516m) {
                this.f112213a = c12516m;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<C12505b.DebugFeatureFlag> list, Continuation<? super Unit> continuation) {
                InterfaceC17140B interfaceC17140B = this.f112213a._viewState;
                while (true) {
                    Object value = interfaceC17140B.getValue();
                    List<C12505b.DebugFeatureFlag> list2 = list;
                    if (interfaceC17140B.e(value, ViewState.b((ViewState) value, null, list2, false, null, null, false, 61, null))) {
                        return Unit.f142422a;
                    }
                    list = list2;
                }
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12516m.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (((tv.P) r5).collect(r1, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f112211a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 == r2) goto L16
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L16:
                kotlin.ResultKt.b(r5)
                goto L4c
            L1a:
                kotlin.ResultKt.b(r5)
                goto L3a
            L1e:
                kotlin.ResultKt.b(r5)
                com.meijer.mobile.meijer.activity.settings.debug.m r5 = com.meijer.mobile.meijer.activity.settings.debug.C12516m.this
                com.meijer.mobile.meijer.activity.settings.debug.b r5 = com.meijer.mobile.meijer.activity.settings.debug.C12516m.q(r5)
                tv.f r5 = r5.b()
                com.meijer.mobile.meijer.activity.settings.debug.m r1 = com.meijer.mobile.meijer.activity.settings.debug.C12516m.this
                qv.O r1 = androidx.view.d0.a(r1)
                r4.f112211a = r3
                java.lang.Object r5 = tv.C17154h.X(r5, r1, r4)
                if (r5 != r0) goto L3a
                goto L4b
            L3a:
                tv.P r5 = (tv.P) r5
                com.meijer.mobile.meijer.activity.settings.debug.m$a$a r1 = new com.meijer.mobile.meijer.activity.settings.debug.m$a$a
                com.meijer.mobile.meijer.activity.settings.debug.m r3 = com.meijer.mobile.meijer.activity.settings.debug.C12516m.this
                r1.<init>(r3)
                r4.f112211a = r2
                java.lang.Object r5 = r5.collect(r1, r4)
                if (r5 != r0) goto L4c
            L4b:
                return r0
            L4c:
                kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.settings.debug.C12516m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsViewModel$2$1", f = "DebugOptionsViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.m$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112214a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f112216c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f112216c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12516m.this.new b(this.f112216c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f112214a == 0) {
                ResultKt.b(obj);
                InterfaceC17140B interfaceC17140B = C12516m.this._viewState;
                String str = this.f112216c;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, null, null, false, str, null, false, 55, null)));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsViewModel$3", f = "DebugOptionsViewModel.kt", l = {66}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.m$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112217a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.m$c$a */
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C12516m f112219a;

            a(C12516m c12516m) {
                this.f112219a = c12516m;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(MeijerUser meijerUser, Continuation<? super Unit> continuation) {
                InterfaceC17140B interfaceC17140B = this.f112219a._viewState;
                while (true) {
                    Object value = interfaceC17140B.getValue();
                    MeijerUser meijerUser2 = meijerUser;
                    if (interfaceC17140B.e(value, ViewState.b((ViewState) value, null, null, false, null, meijerUser2, false, 47, null))) {
                        return Unit.f142422a;
                    }
                    meijerUser = meijerUser2;
                }
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12516m.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112217a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                io.reactivex.l<MeijerUser> lVarDistinctUntilChanged = C12516m.this.userManager.F().distinctUntilChanged();
                Intrinsics.i(lVarDistinctUntilChanged, "distinctUntilChanged(...)");
                InterfaceC17152f interfaceC17152fB = xv.h.b(lVarDistinctUntilChanged);
                a aVar = new a(C12516m.this);
                this.f112217a = 1;
                if (interfaceC17152fB.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJV\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b&\u0010\"¨\u0006'"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/debug/m$d;", "", "", "searchTerm", "", "Lcom/meijer/mobile/meijer/activity/settings/debug/b$a;", "featureFlags", "", "enableStockTools", "fcmToken", "Lyo/c;", "userDetails", "isPicassoLoggingEnabled", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Lyo/c;Z)V", "a", "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Lyo/c;Z)Lcom/meijer/mobile/meijer/activity/settings/debug/m$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "Z", "getEnableStockTools", "()Z", "Lyo/c;", "f", "()Lyo/c;", "g", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.m$d, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String searchTerm;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<C12505b.DebugFeatureFlag> featureFlags;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enableStockTools;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fcmToken;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final MeijerUser userDetails;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPicassoLoggingEnabled;

        public ViewState() {
            this(null, null, false, null, null, false, 63, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.searchTerm, viewState.searchTerm) && Intrinsics.e(this.featureFlags, viewState.featureFlags) && this.enableStockTools == viewState.enableStockTools && Intrinsics.e(this.fcmToken, viewState.fcmToken) && Intrinsics.e(this.userDetails, viewState.userDetails) && this.isPicassoLoggingEnabled == viewState.isPicassoLoggingEnabled;
        }

        public int hashCode() {
            int iHashCode = ((((this.searchTerm.hashCode() * 31) + this.featureFlags.hashCode()) * 31) + Boolean.hashCode(this.enableStockTools)) * 31;
            String str = this.fcmToken;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            MeijerUser meijerUser = this.userDetails;
            return ((iHashCode2 + (meijerUser != null ? meijerUser.hashCode() : 0)) * 31) + Boolean.hashCode(this.isPicassoLoggingEnabled);
        }

        public String toString() {
            return "ViewState(searchTerm=" + this.searchTerm + ", featureFlags=" + this.featureFlags + ", enableStockTools=" + this.enableStockTools + ", fcmToken=" + this.fcmToken + ", userDetails=" + this.userDetails + ", isPicassoLoggingEnabled=" + this.isPicassoLoggingEnabled + ')';
        }

        public ViewState(String searchTerm, List<C12505b.DebugFeatureFlag> featureFlags, boolean z10, String str, MeijerUser meijerUser, boolean z11) {
            Intrinsics.j(searchTerm, "searchTerm");
            Intrinsics.j(featureFlags, "featureFlags");
            this.searchTerm = searchTerm;
            this.featureFlags = featureFlags;
            this.enableStockTools = z10;
            this.fcmToken = str;
            this.userDetails = meijerUser;
            this.isPicassoLoggingEnabled = z11;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, String str, List list, boolean z10, String str2, MeijerUser meijerUser, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = viewState.searchTerm;
            }
            if ((i10 & 2) != 0) {
                list = viewState.featureFlags;
            }
            if ((i10 & 4) != 0) {
                z10 = viewState.enableStockTools;
            }
            if ((i10 & 8) != 0) {
                str2 = viewState.fcmToken;
            }
            if ((i10 & 16) != 0) {
                meijerUser = viewState.userDetails;
            }
            if ((i10 & 32) != 0) {
                z11 = viewState.isPicassoLoggingEnabled;
            }
            MeijerUser meijerUser2 = meijerUser;
            boolean z12 = z11;
            return viewState.a(str, list, z10, str2, meijerUser2, z12);
        }

        public final ViewState a(String searchTerm, List<C12505b.DebugFeatureFlag> featureFlags, boolean enableStockTools, String fcmToken, MeijerUser userDetails, boolean isPicassoLoggingEnabled) {
            Intrinsics.j(searchTerm, "searchTerm");
            Intrinsics.j(featureFlags, "featureFlags");
            return new ViewState(searchTerm, featureFlags, enableStockTools, fcmToken, userDetails, isPicassoLoggingEnabled);
        }

        /* renamed from: c, reason: from getter */
        public final String getFcmToken() {
            return this.fcmToken;
        }

        public final List<C12505b.DebugFeatureFlag> d() {
            return this.featureFlags;
        }

        /* renamed from: e, reason: from getter */
        public final String getSearchTerm() {
            return this.searchTerm;
        }

        /* renamed from: f, reason: from getter */
        public final MeijerUser getUserDetails() {
            return this.userDetails;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getIsPicassoLoggingEnabled() {
            return this.isPicassoLoggingEnabled;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ ViewState(java.lang.String r3, java.util.List r4, boolean r5, java.lang.String r6, yo.MeijerUser r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r2 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L6
                java.lang.String r3 = ""
            L6:
                r10 = r9 & 2
                if (r10 == 0) goto Le
                java.util.List r4 = kotlin.collections.CollectionsKt.m()
            Le:
                r10 = r9 & 4
                r0 = 0
                if (r10 == 0) goto L14
                r5 = r0
            L14:
                r10 = r9 & 8
                r1 = 0
                if (r10 == 0) goto L1a
                r6 = r1
            L1a:
                r10 = r9 & 16
                if (r10 == 0) goto L1f
                r7 = r1
            L1f:
                r9 = r9 & 32
                if (r9 == 0) goto L2b
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                goto L32
            L2b:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
            L32:
                r4.<init>(r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.settings.debug.C12516m.ViewState.<init>(java.lang.String, java.util.List, boolean, java.lang.String, yo.c, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsViewModel$onAction$2", f = "DebugOptionsViewModel.kt", l = {104}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.m$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112226a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12516m.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112226a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Un.b bVar = C12516m.this.emarsysManager;
                MeijerUser meijerUserD = C12516m.this.userManager.D();
                this.f112226a = 1;
                if (bVar.n(meijerUserD, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public C12516m(C12505b debugFlagsProvider, yl.k featureManager, FirebaseMessaging firebaseMessaging, yo.k userManager, yo.f storeManager, com.squareup.picasso.o picasso, Un.b emarsysManager, C17838h mperksNotificationManager) {
        Intrinsics.j(debugFlagsProvider, "debugFlagsProvider");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(firebaseMessaging, "firebaseMessaging");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(storeManager, "storeManager");
        Intrinsics.j(picasso, "picasso");
        Intrinsics.j(emarsysManager, "emarsysManager");
        Intrinsics.j(mperksNotificationManager, "mperksNotificationManager");
        this.debugFlagsProvider = debugFlagsProvider;
        this.featureManager = featureManager;
        this.firebaseMessaging = firebaseMessaging;
        this.userManager = userManager;
        this.storeManager = storeManager;
        this.picasso = picasso;
        this.emarsysManager = emarsysManager;
        this.mperksNotificationManager = mperksNotificationManager;
        this._viewState = tv.S.a(new ViewState(null, null, false, null, null, picasso.g(), 31, null));
        C16648k.d(androidx.view.d0.a(this), null, null, new a(null), 3, null);
        AbstractC5232j<String> abstractC5232jQ = firebaseMessaging.q();
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12516m.o(this.f112187a, (String) obj);
            }
        };
        abstractC5232jQ.g(new InterfaceC5229g() { // from class: com.meijer.mobile.meijer.activity.settings.debug.l
            @Override // Td.InterfaceC5229g
            public final void onSuccess(Object obj) {
                C12516m.p(function1, obj);
            }
        });
        C16648k.d(androidx.view.d0.a(this), null, null, new c(null), 3, null);
    }

    private final void w(AbstractC12504a.SendPushNotification action) {
        if (!Intrinsics.e(action.getSource(), "Emarsys")) {
            this.mperksNotificationManager.n(new NotificationData("Test Local Push", "Click on Notification for " + action.getDeepLink() + " and CTA's for respective feature navigation.\n\nSource: " + action.getSource(), action.getDeepLink(), null, null, null, null, "broadlogId", "deliveryId", "Coupons", null, "meijerapp://mperks/coupons/available", null, 5240, null), null, true);
            return;
        }
        this.emarsysManager.g(action.getContext(), new com.google.firebase.messaging.S(C14835c.b(TuplesKt.a("notification.channel_id", "debugging"), TuplesKt.a("ems.sid", "b5086_7ebSQoxqFcbs:ui_test;0;1736440699338272488928"), TuplesKt.a("notification.body", StringsKt.n("\n                            Click to navigate to " + action.getDeepLink() + " and CTA's for respective feature navigation.\n\n                            Source: " + action.getSource() + "\n                        ")), TuplesKt.a("ems.actions", "[{\"type\":\"MEAppEvent\",\"id\":\"Addresses\",\"title\":\"Button title\",\"name\":\"DeepLink\",\"payload\":{\"url\":\"meijerapp://mperks/address\"}}]"), TuplesKt.a("ems.multichannel_id", "564"), TuplesKt.a("ems.tap_actions.default_action.payload", StringsKt.n("\n                            {\"url\":\"" + action.getDeepLink() + "\"}\n                        ")), TuplesKt.a("ems.tap_actions.default_action.name", "DeepLink"), TuplesKt.a("ems.tap_actions.default_action.type", "MEAppEvent"), TuplesKt.a("ems.version", "fcmv1"), TuplesKt.a("ems.root_params", "{\"ttl\":7200,\"channel_id\":\"debugging\",\"u\":{}}"))));
    }

    public final void A(String searchTerm) {
        Intrinsics.j(searchTerm, "searchTerm");
        this.debugFlagsProvider.d(searchTerm);
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        while (true) {
            ViewState value = interfaceC17140B.getValue();
            String str = searchTerm;
            if (interfaceC17140B.e(value, ViewState.b(value, str, null, false, null, null, false, 62, null))) {
                return;
            } else {
                searchTerm = str;
            }
        }
    }

    public final tv.P<ViewState> u() {
        return C17154h.c(this._viewState);
    }

    public final void v(AbstractC12504a action) throws Throwable {
        ViewState value;
        Intrinsics.j(action, "action");
        if (Intrinsics.e(action, AbstractC12504a.c.f112127a)) {
            this.userManager.O();
            return;
        }
        if (action instanceof AbstractC12504a.Throw) {
            throw ((AbstractC12504a.Throw) action).getThrowable();
        }
        if (Intrinsics.e(action, AbstractC12504a.C1774a.f112125a)) {
            this.userManager.e0(new MeijerAccount(0L, null, null, null, null, null, null, null, null, null, null, 0, null, 0L, 0L, null, 0, null, 0L, 0, null, null, null, null, null, null, 0L, 134217727, null));
            this.storeManager.j(yo.d.f170814b);
            this.storeManager.j(yo.d.f170813a);
        } else {
            if (action instanceof AbstractC12504a.EnablePicassoLogging) {
                this.picasso.j(((AbstractC12504a.EnablePicassoLogging) action).getEnabled());
                InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, ViewState.b(value, null, null, false, null, null, this.picasso.g(), 31, null)));
                return;
            }
            if (action instanceof AbstractC12504a.d) {
                this.emarsysManager.k();
                C16648k.d(androidx.view.d0.a(this), null, null, new e(null), 3, null);
            } else {
                if (!(action instanceof AbstractC12504a.SendPushNotification)) {
                    throw new NoWhenBranchMatchedException();
                }
                w((AbstractC12504a.SendPushNotification) action);
            }
        }
    }

    public final void x(int state) {
        Iterator<T> it = this._viewState.getValue().d().iterator();
        while (it.hasNext()) {
            AbstractC18227f feature = ((C12505b.DebugFeatureFlag) it.next()).getFeature();
            AbstractC18253g abstractC18253gA = C18254h.a(state);
            if (abstractC18253gA == null) {
                abstractC18253gA = AbstractC18253g.c.f170620b;
            }
            y(feature, abstractC18253gA);
        }
    }

    public final void y(AbstractC18227f feature, AbstractC18253g state) {
        Intrinsics.j(feature, "feature");
        Intrinsics.j(state, "state");
        this.debugFlagsProvider.c(feature, state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(C12516m c12516m, String str) {
        C16648k.d(androidx.view.d0.a(c12516m), null, null, c12516m.new b(str, null), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
