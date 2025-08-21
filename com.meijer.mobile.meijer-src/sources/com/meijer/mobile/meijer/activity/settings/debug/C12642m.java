package com.meijer.mobile.meijer.activity.settings.debug;

import Cs.MeijerAccount;
import Vd.AbstractC5516j;
import Vd.InterfaceC5513g;
import com.google.firebase.messaging.FirebaseMessaging;
import com.meijer.mobile.meijer.activity.settings.debug.AbstractC12630a;
import com.meijer.mobile.meijer.activity.settings.debug.C12631b;
import fk.NotificationData;
import j2.C14923c;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import xm.C18197h;
import yo.MeijerUser;
import zl.AbstractC18503f;
import zl.AbstractC18529g;
import zl.C18530h;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001-BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000206058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u0002060:8F¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/debug/m;", "Landroidx/lifecycle/c0;", "Lcom/meijer/mobile/meijer/activity/settings/debug/b;", "debugFlagsProvider", "Lzl/k;", "featureManager", "Lcom/google/firebase/messaging/FirebaseMessaging;", "firebaseMessaging", "Lyo/k;", "userManager", "Lyo/f;", "storeManager", "LVn/b;", "emarsysManager", "Lxm/h;", "mperksNotificationManager", "<init>", "(Lcom/meijer/mobile/meijer/activity/settings/debug/b;Lzl/k;Lcom/google/firebase/messaging/FirebaseMessaging;Lyo/k;Lyo/f;LVn/b;Lxm/h;)V", "Lcom/meijer/mobile/meijer/activity/settings/debug/a$d;", "action", "", "w", "(Lcom/meijer/mobile/meijer/activity/settings/debug/a$d;)V", "", "searchTerm", "A", "(Ljava/lang/String;)V", "Lzl/f;", "feature", "Lzl/g;", "state", "y", "(Lzl/f;Lzl/g;)V", "", "x", "(I)V", "Lcom/meijer/mobile/meijer/activity/settings/debug/a;", "v", "(Lcom/meijer/mobile/meijer/activity/settings/debug/a;)V", "a", "Lcom/meijer/mobile/meijer/activity/settings/debug/b;", "b", "Lzl/k;", "c", "Lcom/google/firebase/messaging/FirebaseMessaging;", "d", "Lyo/k;", "e", "Lyo/f;", "f", "LVn/b;", "g", "Lxm/h;", "Lpv/B;", "Lcom/meijer/mobile/meijer/activity/settings/debug/m$d;", "h", "Lpv/B;", "_viewState", "Lpv/P;", "u", "()Lpv/P;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.settings.debug.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12642m extends androidx.view.c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C12631b debugFlagsProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final FirebaseMessaging firebaseMessaging;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final yo.f storeManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Vn.b emarsysManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C18197h mperksNotificationManager;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsViewModel$1", f = "DebugOptionsViewModel.kt", l = {54, 55}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.m$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f113065a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.m$a$a, reason: collision with other inner class name */
        static final class C1786a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C12642m f113067a;

            C1786a(C12642m c12642m) {
                this.f113067a = c12642m;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<C12631b.DebugFeatureFlag> list, Continuation<? super Unit> continuation) {
                InterfaceC16549B interfaceC16549B = this.f113067a._viewState;
                while (true) {
                    Object value = interfaceC16549B.getValue();
                    List<C12631b.DebugFeatureFlag> list2 = list;
                    if (interfaceC16549B.e(value, ViewState.b((ViewState) value, null, list2, false, null, null, 29, null))) {
                        return Unit.f143329a;
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
            return C12642m.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (((pv.P) r5).collect(r1, r4) == r0) goto L15;
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
                int r1 = r4.f113065a
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
                com.meijer.mobile.meijer.activity.settings.debug.m r5 = com.meijer.mobile.meijer.activity.settings.debug.C12642m.this
                com.meijer.mobile.meijer.activity.settings.debug.b r5 = com.meijer.mobile.meijer.activity.settings.debug.C12642m.q(r5)
                pv.f r5 = r5.b()
                com.meijer.mobile.meijer.activity.settings.debug.m r1 = com.meijer.mobile.meijer.activity.settings.debug.C12642m.this
                mv.O r1 = androidx.view.d0.a(r1)
                r4.f113065a = r3
                java.lang.Object r5 = pv.C16563h.X(r5, r1, r4)
                if (r5 != r0) goto L3a
                goto L4b
            L3a:
                pv.P r5 = (pv.P) r5
                com.meijer.mobile.meijer.activity.settings.debug.m$a$a r1 = new com.meijer.mobile.meijer.activity.settings.debug.m$a$a
                com.meijer.mobile.meijer.activity.settings.debug.m r3 = com.meijer.mobile.meijer.activity.settings.debug.C12642m.this
                r1.<init>(r3)
                r4.f113065a = r2
                java.lang.Object r5 = r5.collect(r1, r4)
                if (r5 != r0) goto L4c
            L4b:
                return r0
            L4c:
                kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.settings.debug.C12642m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsViewModel$2$1", f = "DebugOptionsViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.m$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f113068a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f113070c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f113070c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12642m.this.new b(this.f113070c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f113068a == 0) {
                ResultKt.b(obj);
                InterfaceC16549B interfaceC16549B = C12642m.this._viewState;
                String str = this.f113070c;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, null, false, str, null, 23, null)));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsViewModel$3", f = "DebugOptionsViewModel.kt", l = {64}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.m$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f113071a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.m$c$a */
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C12642m f113073a;

            a(C12642m c12642m) {
                this.f113073a = c12642m;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(MeijerUser meijerUser, Continuation<? super Unit> continuation) {
                InterfaceC16549B interfaceC16549B = this.f113073a._viewState;
                while (true) {
                    Object value = interfaceC16549B.getValue();
                    MeijerUser meijerUser2 = meijerUser;
                    if (interfaceC16549B.e(value, ViewState.b((ViewState) value, null, null, false, null, meijerUser2, 15, null))) {
                        return Unit.f143329a;
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
            return C12642m.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f113071a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                io.reactivex.l<MeijerUser> lVarDistinctUntilChanged = C12642m.this.userManager.F().distinctUntilChanged();
                Intrinsics.i(lVarDistinctUntilChanged, "distinctUntilChanged(...)");
                InterfaceC16561f interfaceC16561fB = tv.h.b(lVarDistinctUntilChanged);
                a aVar = new a(C12642m.this);
                this.f113071a = 1;
                if (interfaceC16561fB.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJL\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001e\u0010\u0011R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/debug/m$d;", "", "", "searchTerm", "", "Lcom/meijer/mobile/meijer/activity/settings/debug/b$a;", "featureFlags", "", "enableStockTools", "fcmToken", "Lyo/c;", "userDetails", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Lyo/c;)V", "a", "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Lyo/c;)Lcom/meijer/mobile/meijer/activity/settings/debug/m$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "Z", "getEnableStockTools", "()Z", "Lyo/c;", "f", "()Lyo/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.m$d, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String searchTerm;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<C12631b.DebugFeatureFlag> featureFlags;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enableStockTools;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fcmToken;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final MeijerUser userDetails;

        public ViewState() {
            this(null, null, false, null, null, 31, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.searchTerm, viewState.searchTerm) && Intrinsics.e(this.featureFlags, viewState.featureFlags) && this.enableStockTools == viewState.enableStockTools && Intrinsics.e(this.fcmToken, viewState.fcmToken) && Intrinsics.e(this.userDetails, viewState.userDetails);
        }

        public int hashCode() {
            int iHashCode = ((((this.searchTerm.hashCode() * 31) + this.featureFlags.hashCode()) * 31) + Boolean.hashCode(this.enableStockTools)) * 31;
            String str = this.fcmToken;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            MeijerUser meijerUser = this.userDetails;
            return iHashCode2 + (meijerUser != null ? meijerUser.hashCode() : 0);
        }

        public String toString() {
            return "ViewState(searchTerm=" + this.searchTerm + ", featureFlags=" + this.featureFlags + ", enableStockTools=" + this.enableStockTools + ", fcmToken=" + this.fcmToken + ", userDetails=" + this.userDetails + ')';
        }

        public ViewState(String searchTerm, List<C12631b.DebugFeatureFlag> featureFlags, boolean z10, String str, MeijerUser meijerUser) {
            Intrinsics.j(searchTerm, "searchTerm");
            Intrinsics.j(featureFlags, "featureFlags");
            this.searchTerm = searchTerm;
            this.featureFlags = featureFlags;
            this.enableStockTools = z10;
            this.fcmToken = str;
            this.userDetails = meijerUser;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, String str, List list, boolean z10, String str2, MeijerUser meijerUser, int i10, Object obj) {
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
            MeijerUser meijerUser2 = meijerUser;
            boolean z11 = z10;
            return viewState.a(str, list, z11, str2, meijerUser2);
        }

        public final ViewState a(String searchTerm, List<C12631b.DebugFeatureFlag> featureFlags, boolean enableStockTools, String fcmToken, MeijerUser userDetails) {
            Intrinsics.j(searchTerm, "searchTerm");
            Intrinsics.j(featureFlags, "featureFlags");
            return new ViewState(searchTerm, featureFlags, enableStockTools, fcmToken, userDetails);
        }

        /* renamed from: c, reason: from getter */
        public final String getFcmToken() {
            return this.fcmToken;
        }

        public final List<C12631b.DebugFeatureFlag> d() {
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

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ ViewState(java.lang.String r2, java.util.List r3, boolean r4, java.lang.String r5, yo.MeijerUser r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r8 = r7 & 2
                if (r8 == 0) goto Le
                java.util.List r3 = kotlin.collections.CollectionsKt.m()
            Le:
                r8 = r7 & 4
                if (r8 == 0) goto L13
                r4 = 0
            L13:
                r8 = r7 & 8
                r0 = 0
                if (r8 == 0) goto L19
                r5 = r0
            L19:
                r7 = r7 & 16
                if (r7 == 0) goto L24
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L2a
            L24:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L2a:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.settings.debug.C12642m.ViewState.<init>(java.lang.String, java.util.List, boolean, java.lang.String, yo.c, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsViewModel$onAction$1", f = "DebugOptionsViewModel.kt", l = {97}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.m$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f113079a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12642m.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f113079a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Vn.b bVar = C12642m.this.emarsysManager;
                MeijerUser meijerUserD = C12642m.this.userManager.D();
                this.f113079a = 1;
                if (bVar.n(meijerUserD, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public C12642m(C12631b debugFlagsProvider, zl.k featureManager, FirebaseMessaging firebaseMessaging, yo.k userManager, yo.f storeManager, Vn.b emarsysManager, C18197h mperksNotificationManager) {
        Intrinsics.j(debugFlagsProvider, "debugFlagsProvider");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(firebaseMessaging, "firebaseMessaging");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(storeManager, "storeManager");
        Intrinsics.j(emarsysManager, "emarsysManager");
        Intrinsics.j(mperksNotificationManager, "mperksNotificationManager");
        this.debugFlagsProvider = debugFlagsProvider;
        this.featureManager = featureManager;
        this.firebaseMessaging = firebaseMessaging;
        this.userManager = userManager;
        this.storeManager = storeManager;
        this.emarsysManager = emarsysManager;
        this.mperksNotificationManager = mperksNotificationManager;
        this._viewState = pv.S.a(new ViewState(null, null, false, null, null, 31, null));
        C15809k.d(androidx.view.d0.a(this), null, null, new a(null), 3, null);
        AbstractC5516j<String> abstractC5516jS = firebaseMessaging.s();
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.debug.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12642m.o(this.f113050a, (String) obj);
            }
        };
        abstractC5516jS.g(new InterfaceC5513g() { // from class: com.meijer.mobile.meijer.activity.settings.debug.l
            @Override // Vd.InterfaceC5513g
            public final void onSuccess(Object obj) {
                C12642m.p(function1, obj);
            }
        });
        C15809k.d(androidx.view.d0.a(this), null, null, new c(null), 3, null);
    }

    private final void w(AbstractC12630a.SendPushNotification action) {
        if (!Intrinsics.e(action.getSource(), "Emarsys")) {
            this.mperksNotificationManager.n(new NotificationData("Test Local Push", "Click on Notification for " + action.getDeepLink() + " and CTA's for respective feature navigation.\n\nSource: " + action.getSource(), action.getDeepLink(), null, null, null, null, "broadlogId", "deliveryId", "Coupons", null, "meijerapp://mperks/coupons/available", null, 5240, null), null, true);
            return;
        }
        this.emarsysManager.g(action.getContext(), new com.google.firebase.messaging.U(C14923c.b(TuplesKt.a("notification.channel_id", "debugging"), TuplesKt.a("ems.sid", "b5086_7ebSQoxqFcbs:ui_test;0;1736440699338272488928"), TuplesKt.a("notification.body", StringsKt.n("\n                            Click to navigate to " + action.getDeepLink() + " and CTA's for respective feature navigation.\n\n                            Source: " + action.getSource() + "\n                        ")), TuplesKt.a("ems.actions", "[{\"type\":\"MEAppEvent\",\"id\":\"Addresses\",\"title\":\"Button title\",\"name\":\"DeepLink\",\"payload\":{\"url\":\"meijerapp://mperks/address\"}}]"), TuplesKt.a("ems.multichannel_id", "564"), TuplesKt.a("ems.tap_actions.default_action.payload", StringsKt.n("\n                            {\"url\":\"" + action.getDeepLink() + "\"}\n                        ")), TuplesKt.a("ems.tap_actions.default_action.name", "DeepLink"), TuplesKt.a("ems.tap_actions.default_action.type", "MEAppEvent"), TuplesKt.a("ems.version", "fcmv1"), TuplesKt.a("ems.root_params", "{\"ttl\":7200,\"channel_id\":\"debugging\",\"u\":{}}"))));
    }

    public final void A(String searchTerm) {
        Intrinsics.j(searchTerm, "searchTerm");
        this.debugFlagsProvider.d(searchTerm);
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        while (true) {
            ViewState value = interfaceC16549B.getValue();
            String str = searchTerm;
            if (interfaceC16549B.e(value, ViewState.b(value, str, null, false, null, null, 30, null))) {
                return;
            } else {
                searchTerm = str;
            }
        }
    }

    public final pv.P<ViewState> u() {
        return C16563h.c(this._viewState);
    }

    public final void v(AbstractC12630a action) throws Throwable {
        Intrinsics.j(action, "action");
        if (Intrinsics.e(action, AbstractC12630a.b.f112984a)) {
            this.userManager.O();
            return;
        }
        if (action instanceof AbstractC12630a.Throw) {
            throw ((AbstractC12630a.Throw) action).getThrowable();
        }
        if (Intrinsics.e(action, AbstractC12630a.C1782a.f112983a)) {
            this.userManager.e0(new MeijerAccount(0L, null, null, null, null, null, null, null, null, null, null, 0, null, 0L, 0L, null, 0, null, 0L, 0, null, null, null, null, null, null, 0L, 134217727, null));
            this.storeManager.j(yo.d.f171589b);
            this.storeManager.j(yo.d.f171588a);
        } else if (action instanceof AbstractC12630a.c) {
            this.emarsysManager.k();
            C15809k.d(androidx.view.d0.a(this), null, null, new e(null), 3, null);
        } else {
            if (!(action instanceof AbstractC12630a.SendPushNotification)) {
                throw new NoWhenBranchMatchedException();
            }
            w((AbstractC12630a.SendPushNotification) action);
        }
    }

    public final void x(int state) {
        Iterator<T> it = this._viewState.getValue().d().iterator();
        while (it.hasNext()) {
            AbstractC18503f feature = ((C12631b.DebugFeatureFlag) it.next()).getFeature();
            AbstractC18529g abstractC18529gA = C18530h.a(state);
            if (abstractC18529gA == null) {
                abstractC18529gA = AbstractC18529g.c.f172920b;
            }
            y(feature, abstractC18529gA);
        }
    }

    public final void y(AbstractC18503f feature, AbstractC18529g state) {
        Intrinsics.j(feature, "feature");
        Intrinsics.j(state, "state");
        this.debugFlagsProvider.c(feature, state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(C12642m c12642m, String str) {
        C15809k.d(androidx.view.d0.a(c12642m), null, null, c12642m.new b(str, null), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
