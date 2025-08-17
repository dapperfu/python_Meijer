package com.meijer.mobile.shoppinglist.teacherlists.ux;

import Ji.LocalThemeScope;
import M0.SnapshotStateList;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import ck.C6408b;
import com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity;
import com.meijer.mobile.shoppinglist.teacherlists.ux.v1;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import e.C13589e;
import java.util.ArrayList;
import java.util.Iterator;
import ji.q1;
import kotlin.C13794L;
import kotlin.InterfaceC13783A;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16623P;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001b\u0010\t\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\nJ}\u0010\u0018\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014H\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u001dH\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010!\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0014H\u0003¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020#H\u0003¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020&H\u0003¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020)H\u0003¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020,H\u0003¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020/H\u0003¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0004H\u0002¢\u0006\u0004\b2\u0010\u0003J\u0019\u00105\u001a\u00020\u00042\b\u00104\u001a\u0004\u0018\u000103H\u0014¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0004H\u0014¢\u0006\u0004\b7\u0010\u0003R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001b\u0010M\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006O²\u0006\u0010\u0010N\u001a\u0004\u0018\u00010\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/TeacherListsActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "", "m2", "LJi/M;", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f;", "event", "G1", "(LJi/M;Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f;Landroidx/compose/runtime/Composer;I)V", "", "bodyLabel", "actionLabel", "LGi/e;", "duration", "", "showCloseIcon", "Lji/q1$m$a;", "toastState", "Lkotlin/Function0;", "onLabelClicked", "onCloseClicked", "onDismiss", "L1", "(LJi/M;Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f;Ljava/lang/String;Ljava/lang/String;LGi/e;ZLji/q1$m$a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$d;", "Q1", "(Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$d;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$i;", "e2", "(Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$i;Landroidx/compose/runtime/Composer;I)V", "execute", "J1", "(Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$e;", "S1", "(Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$e;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$f;", "Y1", "(Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$f;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$j;", "V1", "(Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$j;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$h;", "b2", "(Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$h;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$g;", "g2", "(Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1$f$g;Landroidx/compose/runtime/Composer;I)V", "o2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "LAl/g;", "v", "LAl/g;", "getFeatureEntryPoint", "()LAl/g;", "setFeatureEntryPoint", "(LAl/g;)V", "featureEntryPoint", "LCl/e;", "w", "LCl/e;", "getMeijerIntent", "()LCl/e;", "setMeijerIntent", "(LCl/e;)V", "meijerIntent", "Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1;", "x", "Lkotlin/Lazy;", "n2", "()Lcom/meijer/mobile/shoppinglist/teacherlists/ux/v1;", "viewModel", "lastAction", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class TeacherListsActivity extends Hilt_TeacherListsActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Al.g featureEntryPoint;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Cl.e meijerIntent;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new androidx.view.e0(Reflection.b(v1.class), new g(this), new f(this), new h(null, this));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity$LaunchActivity$1$1", f = "TeacherListsActivity.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f117242a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f117243b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TeacherListsActivity f117244c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ v1.f f117245d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0, TeacherListsActivity teacherListsActivity, v1.f fVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f117243b = function0;
            this.f117244c = teacherListsActivity;
            this.f117245d = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f117243b, this.f117244c, this.f117245d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f117242a == 0) {
                ResultKt.b(obj);
                this.f117243b.invoke();
                this.f117244c.n2().getViewState().m().invoke(new DisposeEvent(this.f117245d));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity$LaunchToast$4$1", f = "TeacherListsActivity.kt", l = {HttpResponseStatus.SUCCESS_OK, HttpResponseStatus.SUCCESS_OK}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f117246a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f117247b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f117248c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f117249d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f117250e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Gi.e f117251f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f117252g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ q1.m.a f117253h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f117254i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ TeacherListsActivity f117255j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ v1.f f117256k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f117257l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f117258m;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f117248c, this.f117249d, this.f117250e, this.f117251f, this.f117252g, this.f117253h, this.f117254i, this.f117255j, this.f117256k, this.f117257l, this.f117258m, continuation);
            bVar.f117247b = obj;
            return bVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(LocalThemeScope localThemeScope, String str, String str2, Gi.e eVar, boolean z10, q1.m.a aVar, Function0<Unit> function0, TeacherListsActivity teacherListsActivity, v1.f fVar, Function0<Unit> function02, Function0<Unit> function03, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f117248c = localThemeScope;
            this.f117249d = str;
            this.f117250e = str2;
            this.f117251f = eVar;
            this.f117252g = z10;
            this.f117253h = aVar;
            this.f117254i = function0;
            this.f117255j = teacherListsActivity;
            this.f117256k = fVar;
            this.f117257l = function02;
            this.f117258m = function03;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean l(Function0 function0, TeacherListsActivity teacherListsActivity, v1.f fVar) {
            function0.invoke();
            teacherListsActivity.n2().getViewState().m().invoke(new DisposeEvent(fVar));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean o(Function0 function0, TeacherListsActivity teacherListsActivity, v1.f fVar) {
            function0.invoke();
            teacherListsActivity.n2().getViewState().m().invoke(new DisposeEvent(fVar));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(Function0 function0, TeacherListsActivity teacherListsActivity, v1.f fVar, InterfaceC16622O interfaceC16622O) {
            function0.invoke();
            teacherListsActivity.n2().getViewState().m().invoke(new DisposeEvent(fVar));
            C16623P.f(interfaceC16622O, null, 1, null);
            return Unit.f142422a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x007c, code lost:
        
            if (r3.h(r4, r5, r6, r7, r8, r9, r10, r11, r14) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r14.f117246a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r14.f117247b
                qv.O r0 = (qv.InterfaceC16622O) r0
                kotlin.ResultKt.b(r15)
                goto L7f
            L16:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1e:
                java.lang.Object r1 = r14.f117247b
                qv.O r1 = (qv.InterfaceC16622O) r1
                kotlin.ResultKt.b(r15)
                goto L42
            L26:
                kotlin.ResultKt.b(r15)
                java.lang.Object r15 = r14.f117247b
                r1 = r15
                qv.O r1 = (qv.InterfaceC16622O) r1
                Ji.M r15 = r14.f117248c
                r4 = 80
                float r4 = (float) r4
                float r4 = H1.h.p(r4)
                r14.f117247b = r1
                r14.f117246a = r3
                java.lang.Object r15 = r15.f(r4, r14)
                if (r15 != r0) goto L42
                goto L7e
            L42:
                r3 = r15
                Gi.i r3 = (Gi.i) r3
                java.lang.String r4 = r14.f117249d
                java.lang.String r5 = r14.f117250e
                Gi.e r6 = r14.f117251f
                boolean r7 = r14.f117252g
                ji.q1$m$a r8 = r14.f117253h
                kotlin.jvm.functions.Function0<kotlin.Unit> r15 = r14.f117254i
                com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity r9 = r14.f117255j
                com.meijer.mobile.shoppinglist.teacherlists.ux.v1$f r10 = r14.f117256k
                r11 = r9
                com.meijer.mobile.shoppinglist.teacherlists.ux.y r9 = new com.meijer.mobile.shoppinglist.teacherlists.ux.y
                r9.<init>()
                kotlin.jvm.functions.Function0<kotlin.Unit> r15 = r14.f117257l
                com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity r10 = r14.f117255j
                com.meijer.mobile.shoppinglist.teacherlists.ux.v1$f r11 = r14.f117256k
                r12 = r10
                com.meijer.mobile.shoppinglist.teacherlists.ux.z r10 = new com.meijer.mobile.shoppinglist.teacherlists.ux.z
                r10.<init>()
                kotlin.jvm.functions.Function0<kotlin.Unit> r15 = r14.f117258m
                com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity r11 = r14.f117255j
                com.meijer.mobile.shoppinglist.teacherlists.ux.v1$f r12 = r14.f117256k
                r13 = r11
                com.meijer.mobile.shoppinglist.teacherlists.ux.A r11 = new com.meijer.mobile.shoppinglist.teacherlists.ux.A
                r11.<init>()
                r14.f117247b = r1
                r14.f117246a = r2
                r12 = r14
                java.lang.Object r15 = r3.h(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                if (r15 != r0) goto L7f
            L7e:
                return r0
            L7f:
                kotlin.Unit r15 = kotlin.Unit.f142422a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity$UIFinishActivity$1$1", f = "TeacherListsActivity.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f117259a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v1.f.d f117261c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(v1.f.d dVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f117261c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TeacherListsActivity.this.new c(this.f117261c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f117259a == 0) {
                ResultKt.b(obj);
                TeacherListsActivity.this.finish();
                TeacherListsActivity.this.n2().getViewState().m().invoke(new DisposeEvent(this.f117261c));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity$UINavigateBack$1$1", f = "TeacherListsActivity.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f117262a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v1.f.i f117264c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(v1.f.i iVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f117264c = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TeacherListsActivity.this.new d(this.f117264c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f117262a == 0) {
                ResultKt.b(obj);
                if (!TeacherListsActivity.this.onNavigateUp()) {
                    bk.c.b(TeacherListsActivity.this, 1, R.anim.fade_in, R.anim.fade_out, 0, 8, null);
                    TeacherListsActivity.this.finish();
                }
                TeacherListsActivity.this.n2().getViewState().m().invoke(new DisposeEvent(this.f117264c));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TeacherListsActivity f117266a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity$e$a$a, reason: collision with other inner class name */
            static final class C1894a implements PointerInputEventHandler {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f117267a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ TeacherListsActivity f117268b;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity$onCreate$2$1$2$1$1$1", f = "TeacherListsActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity$e$a$a$a, reason: collision with other inner class name */
                static final class C1895a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f117269a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ TeacherListsActivity f117270b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1895a(TeacherListsActivity teacherListsActivity, Continuation<? super C1895a> continuation) {
                        super(2, continuation);
                        this.f117270b = teacherListsActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C1895a(this.f117270b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((C1895a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.f();
                        if (this.f117269a == 0) {
                            ResultKt.b(obj);
                            this.f117270b.m2();
                            return Unit.f142422a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity$onCreate$2$1$2$1$2$1", f = "TeacherListsActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity$e$a$a$b */
                static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f117271a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ TeacherListsActivity f117272b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(TeacherListsActivity teacherListsActivity, Continuation<? super b> continuation) {
                        super(2, continuation);
                        this.f117272b = teacherListsActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new b(this.f117272b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.f();
                        if (this.f117271a == 0) {
                            ResultKt.b(obj);
                            this.f117272b.m2();
                            return Unit.f142422a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf0/A;", "LU0/f;", "it", "", "<anonymous>", "(Lf0/A;LU0/f;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity$onCreate$2$1$2$1$3", f = "TeacherListsActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity$e$a$a$c */
                static final class c extends SuspendLambda implements Function3<InterfaceC13783A, U0.f, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f117273a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC16622O f117274b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ TeacherListsActivity f117275c;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity$onCreate$2$1$2$1$3$1", f = "TeacherListsActivity.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity$e$a$a$c$a, reason: collision with other inner class name */
                    static final class C1896a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f117276a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ TeacherListsActivity f117277b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1896a(TeacherListsActivity teacherListsActivity, Continuation<? super C1896a> continuation) {
                            super(2, continuation);
                            this.f117277b = teacherListsActivity;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C1896a(this.f117277b, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                            return ((C1896a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.f();
                            if (this.f117276a == 0) {
                                ResultKt.b(obj);
                                this.f117277b.m2();
                                return Unit.f142422a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Object invoke(InterfaceC13783A interfaceC13783A, U0.f fVar, Continuation<? super Unit> continuation) {
                        return d(interfaceC13783A, fVar.getPackedValue(), continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    c(InterfaceC16622O interfaceC16622O, TeacherListsActivity teacherListsActivity, Continuation<? super c> continuation) {
                        super(3, continuation);
                        this.f117274b = interfaceC16622O;
                        this.f117275c = teacherListsActivity;
                    }

                    public final Object d(InterfaceC13783A interfaceC13783A, long j10, Continuation<? super Unit> continuation) {
                        return new c(this.f117274b, this.f117275c, continuation).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.f();
                        if (this.f117273a == 0) {
                            ResultKt.b(obj);
                            C16648k.d(this.f117274b, null, null, new C1896a(this.f117275c, null), 3, null);
                            return Unit.f142422a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity$onCreate$2$1$2$1$4$1", f = "TeacherListsActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity$e$a$a$d */
                static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f117278a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ TeacherListsActivity f117279b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    d(TeacherListsActivity teacherListsActivity, Continuation<? super d> continuation) {
                        super(2, continuation);
                        this.f117279b = teacherListsActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new d(this.f117279b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.f();
                        if (this.f117278a == 0) {
                            ResultKt.b(obj);
                            this.f117279b.m2();
                            return Unit.f142422a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                C1894a(InterfaceC16622O interfaceC16622O, TeacherListsActivity teacherListsActivity) {
                    this.f117267a = interfaceC16622O;
                    this.f117268b = teacherListsActivity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit d(InterfaceC16622O interfaceC16622O, TeacherListsActivity teacherListsActivity, U0.f fVar) {
                    C16648k.d(interfaceC16622O, null, null, new C1895a(teacherListsActivity, null), 3, null);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(InterfaceC16622O interfaceC16622O, TeacherListsActivity teacherListsActivity, U0.f fVar) {
                    C16648k.d(interfaceC16622O, null, null, new b(teacherListsActivity, null), 3, null);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit f(InterfaceC16622O interfaceC16622O, TeacherListsActivity teacherListsActivity, U0.f fVar) {
                    C16648k.d(interfaceC16622O, null, null, new d(teacherListsActivity, null), 3, null);
                    return Unit.f142422a;
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(g1.J j10, Continuation<? super Unit> continuation) {
                    final InterfaceC16622O interfaceC16622O = this.f117267a;
                    final TeacherListsActivity teacherListsActivity = this.f117268b;
                    Function1 function1 = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.B
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TeacherListsActivity.e.a.C1894a.d(interfaceC16622O, teacherListsActivity, (U0.f) obj);
                        }
                    };
                    final InterfaceC16622O interfaceC16622O2 = this.f117267a;
                    final TeacherListsActivity teacherListsActivity2 = this.f117268b;
                    Function1 function12 = new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.C
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TeacherListsActivity.e.a.C1894a.e(interfaceC16622O2, teacherListsActivity2, (U0.f) obj);
                        }
                    };
                    c cVar = new c(this.f117267a, this.f117268b, null);
                    final InterfaceC16622O interfaceC16622O3 = this.f117267a;
                    final TeacherListsActivity teacherListsActivity3 = this.f117268b;
                    Object objL = C13794L.l(j10, function1, function12, cVar, new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.D
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TeacherListsActivity.e.a.C1894a.f(interfaceC16622O3, teacherListsActivity3, (U0.f) obj);
                        }
                    }, continuation);
                    return objL == IntrinsicsKt.f() ? objL : Unit.f142422a;
                }
            }

            a(TeacherListsActivity teacherListsActivity) {
                this.f117266a = teacherListsActivity;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-412829014, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity.onCreate.<anonymous>.<anonymous> (TeacherListsActivity.kt:83)");
                }
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composer);
                    composer.t(objB);
                }
                InterfaceC16622O interfaceC16622O = (InterfaceC16622O) objB;
                composer.startReplaceGroup(-1591685854);
                SnapshotStateList<v1.f> snapshotStateListO = this.f117266a.n2().getViewState().o();
                TeacherListsActivity teacherListsActivity = this.f117266a;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(snapshotStateListO, 10));
                Iterator<v1.f> it = snapshotStateListO.iterator();
                while (it.hasNext()) {
                    teacherListsActivity.G1(AdsTheme, it.next(), composer, LocalThemeScope.f15770g | (i10 & 14));
                    arrayList.add(Unit.f142422a);
                }
                composer.P();
                v1.d viewState = this.f117266a.n2().getViewState();
                Modifier.Companion companion = Modifier.INSTANCE;
                Unit unit = Unit.f142422a;
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(interfaceC16622O) | composer.D(this.f117266a);
                TeacherListsActivity teacherListsActivity2 = this.f117266a;
                Object objB2 = composer.B();
                if (zD || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new C1894a(interfaceC16622O, teacherListsActivity2);
                    composer.t(objB2);
                }
                composer.P();
                C12854o0.p0(AdsTheme, viewState, g1.U.c(companion, unit, (PointerInputEventHandler) objB2), composer, LocalThemeScope.f15770g | (i10 & 14), 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        e() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1492597733, i10, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity.onCreate.<anonymous> (TeacherListsActivity.kt:82)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(-412829014, true, new a(TeacherListsActivity.this), composer, 54), composer, 48, 1);
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117280f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f117280f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f117280f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117281f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f117281f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f117281f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f117282f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f117283g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f117282f = function0;
            this.f117283g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f117282f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f117283g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K1(TeacherListsActivity teacherListsActivity, v1.f fVar, Function0 function0, int i10, Composer composer, int i11) {
        teacherListsActivity.J1(fVar, function0, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void L1(final Ji.LocalThemeScope r28, com.meijer.mobile.shoppinglist.teacherlists.ux.v1.f r29, final java.lang.String r30, java.lang.String r31, Gi.e r32, boolean r33, ji.q1.m.a r34, kotlin.jvm.functions.Function0<kotlin.Unit> r35, kotlin.jvm.functions.Function0<kotlin.Unit> r36, kotlin.jvm.functions.Function0<kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity.L1(Ji.M, com.meijer.mobile.shoppinglist.teacherlists.ux.v1$f, java.lang.String, java.lang.String, Gi.e, boolean, ji.q1$m$a, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R1(TeacherListsActivity teacherListsActivity, v1.f.d dVar, int i10, Composer composer, int i11) {
        teacherListsActivity.Q1(dVar, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U1(TeacherListsActivity teacherListsActivity, v1.f.e eVar, int i10, Composer composer, int i11) {
        teacherListsActivity.S1(eVar, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X1(TeacherListsActivity teacherListsActivity, v1.f.ShopBackToSchool shopBackToSchool, int i10, Composer composer, int i11) {
        teacherListsActivity.V1(shopBackToSchool, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a2(TeacherListsActivity teacherListsActivity, v1.f.GoToCouponDetailsScreen goToCouponDetailsScreen, int i10, Composer composer, int i11) {
        teacherListsActivity.Y1(goToCouponDetailsScreen, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d2(TeacherListsActivity teacherListsActivity, v1.f.GoToPDP goToPDP, int i10, Composer composer, int i11) {
        teacherListsActivity.b2(goToPDP, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f2(TeacherListsActivity teacherListsActivity, v1.f.i iVar, int i10, Composer composer, int i11) {
        teacherListsActivity.e2(iVar, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i2(TeacherListsActivity teacherListsActivity, v1.f.GoToFindSubstitutionScreen goToFindSubstitutionScreen, int i10, Composer composer, int i11) {
        teacherListsActivity.g2(goToFindSubstitutionScreen, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview"})
    public final void G1(LocalThemeScope localThemeScope, final v1.f fVar, Composer composer, final int i10) {
        int i11;
        TeacherListsActivity teacherListsActivity;
        final TeacherListsActivity teacherListsActivity2;
        final TeacherListsActivity teacherListsActivity3 = this;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1275278383);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(fVar) : composerStartRestartGroup.D(fVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(teacherListsActivity3) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            teacherListsActivity2 = teacherListsActivity3;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1275278383, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity.ConsumeEvent (TeacherListsActivity.kt:132)");
            }
            if (fVar instanceof v1.f.AddAllToCartSuccess) {
                composerStartRestartGroup.startReplaceGroup(1462683524);
                v1.f.AddAllToCartSuccess addAllToCartSuccess = (v1.f.AddAllToCartSuccess) fVar;
                AbstractC5607a bodyLabel = addAllToCartSuccess.getBodyLabel();
                int i12 = AbstractC5607a.f45514b;
                String strA = C6408b.a(bodyLabel, composerStartRestartGroup, i12);
                String strA2 = C6408b.a(addAllToCartSuccess.getActionLabel(), composerStartRestartGroup, i12);
                q1.m.a aVar = q1.m.a.d.f140117a;
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zD = composerStartRestartGroup.D(teacherListsActivity3);
                Object objB = composerStartRestartGroup.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.p
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TeacherListsActivity.H1(this.f117459a);
                        }
                    };
                    composerStartRestartGroup.t(objB);
                }
                composerStartRestartGroup.P();
                teacherListsActivity3.L1(localThemeScope2, fVar, strA, strA2, null, false, aVar, (Function0) objB, null, null, composerStartRestartGroup, (i12 << 3) | LocalThemeScope.f15770g | (i11 & 14) | (q1.m.a.d.f140118b << 18), (i11 >> 6) & 14, HttpResponseStatus.ERROR_REQUEST_TIMEOUT);
                composerStartRestartGroup.P();
                teacherListsActivity = this;
                localThemeScope2 = localThemeScope;
            } else if (fVar instanceof v1.f.AddAllToCartPartialSuccess) {
                composerStartRestartGroup.startReplaceGroup(1463249305);
                v1.f.AddAllToCartPartialSuccess addAllToCartPartialSuccess = (v1.f.AddAllToCartPartialSuccess) fVar;
                TeacherListsActivity teacherListsActivity4 = this;
                localThemeScope2 = localThemeScope;
                teacherListsActivity4.L1(localThemeScope2, fVar, C6408b.a(AbstractC5607a.INSTANCE.d(addAllToCartPartialSuccess.getBodyLabel(), Integer.valueOf(addAllToCartPartialSuccess.getActual()), Integer.valueOf(addAllToCartPartialSuccess.getExpected())), composerStartRestartGroup, AbstractC5607a.f45514b), null, null, false, q1.m.a.e.f140119a, null, null, null, composerStartRestartGroup, LocalThemeScope.f15770g | (i11 & 14) | (q1.m.a.e.f140120b << 18), (i11 >> 6) & 14, 476);
                composerStartRestartGroup.P();
                teacherListsActivity = teacherListsActivity4;
            } else {
                TeacherListsActivity teacherListsActivity5 = this;
                if (fVar instanceof v1.f.AddAllToCartFailure) {
                    composerStartRestartGroup.startReplaceGroup(1463626978);
                    String string = teacherListsActivity5.getString(((v1.f.AddAllToCartFailure) fVar).getBodyLabel());
                    Intrinsics.i(string, "getString(...)");
                    localThemeScope2 = localThemeScope;
                    teacherListsActivity5.L1(localThemeScope2, fVar, string, null, null, false, q1.m.a.b.f140113a, null, null, null, composerStartRestartGroup, LocalThemeScope.f15770g | (i11 & 14) | (q1.m.a.b.f140114b << 18), (i11 >> 6) & 14, 476);
                    composerStartRestartGroup.P();
                    teacherListsActivity = teacherListsActivity5;
                } else {
                    localThemeScope2 = localThemeScope;
                    if (fVar instanceof v1.f.e) {
                        composerStartRestartGroup.startReplaceGroup(-1476796600);
                        teacherListsActivity5.S1((v1.f.e) fVar, composerStartRestartGroup, (i11 >> 3) & 112);
                        composerStartRestartGroup.P();
                        teacherListsActivity = teacherListsActivity5;
                    } else if (fVar instanceof v1.f.ShopBackToSchool) {
                        composerStartRestartGroup.startReplaceGroup(-1476794709);
                        teacherListsActivity5.V1((v1.f.ShopBackToSchool) fVar, composerStartRestartGroup, (i11 >> 3) & 112);
                        composerStartRestartGroup.P();
                        teacherListsActivity = teacherListsActivity5;
                    } else if (fVar instanceof v1.f.GoToPDP) {
                        composerStartRestartGroup.startReplaceGroup(-1476793023);
                        teacherListsActivity5.b2((v1.f.GoToPDP) fVar, composerStartRestartGroup, (i11 >> 3) & 112);
                        composerStartRestartGroup.P();
                        teacherListsActivity = teacherListsActivity5;
                    } else if (fVar instanceof v1.f.GoToFindSubstitutionScreen) {
                        composerStartRestartGroup.startReplaceGroup(-1476791025);
                        teacherListsActivity5.g2((v1.f.GoToFindSubstitutionScreen) fVar, composerStartRestartGroup, (i11 >> 3) & 112);
                        composerStartRestartGroup.P();
                        teacherListsActivity = teacherListsActivity5;
                    } else if (fVar instanceof v1.f.d) {
                        composerStartRestartGroup.startReplaceGroup(-1476784728);
                        teacherListsActivity5.Q1((v1.f.d) fVar, composerStartRestartGroup, (i11 >> 3) & 112);
                        composerStartRestartGroup.P();
                        teacherListsActivity = teacherListsActivity5;
                    } else if (fVar instanceof v1.f.i) {
                        composerStartRestartGroup.startReplaceGroup(-1476782970);
                        teacherListsActivity5.e2((v1.f.i) fVar, composerStartRestartGroup, (i11 >> 3) & 112);
                        composerStartRestartGroup.P();
                        teacherListsActivity = teacherListsActivity5;
                    } else {
                        if (!(fVar instanceof v1.f.GoToCouponDetailsScreen)) {
                            composerStartRestartGroup.startReplaceGroup(-1476839398);
                            composerStartRestartGroup.P();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-1476780911);
                        teacherListsActivity5.Y1((v1.f.GoToCouponDetailsScreen) fVar, composerStartRestartGroup, (i11 >> 3) & 112);
                        composerStartRestartGroup.P();
                        teacherListsActivity = teacherListsActivity5;
                    }
                }
            }
            teacherListsActivity2 = teacherListsActivity;
            if (ComposerKt.M()) {
                ComposerKt.T();
                teacherListsActivity2 = teacherListsActivity;
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TeacherListsActivity.I1(this.f117463a, localThemeScope2, fVar, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I1(TeacherListsActivity teacherListsActivity, LocalThemeScope localThemeScope, v1.f fVar, int i10, Composer composer, int i11) {
        teacherListsActivity.G1(localThemeScope, fVar, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M1(TeacherListsActivity teacherListsActivity, LocalThemeScope localThemeScope, v1.f fVar, String str, String str2, Gi.e eVar, boolean z10, q1.m.a aVar, Function0 function0, Function0 function02, Function0 function03, int i10, int i11, int i12, Composer composer, int i13) {
        teacherListsActivity.L1(localThemeScope, fVar, str, str2, eVar, z10, aVar, function0, function02, function03, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N1() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O1() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P1() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h2(v1.f.GoToFindSubstitutionScreen goToFindSubstitutionScreen, TeacherListsActivity teacherListsActivity) {
        teacherListsActivity.startActivity(Al.t.f694a.b(teacherListsActivity, goToFindSubstitutionScreen.getSubstitutionMode(), goToFindSubstitutionScreen.getProduct(), "", goToFindSubstitutionScreen.getSchoolName(), goToFindSubstitutionScreen.getClassroomName()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v1 n2() {
        return (v1) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p2(TeacherListsActivity teacherListsActivity, androidx.view.F addCallback) {
        Intrinsics.j(addCallback, "$this$addCallback");
        teacherListsActivity.n2().getViewState().m().invoke(C12817b1.f117310a);
        return Unit.f142422a;
    }

    public final Al.g getFeatureEntryPoint() {
        Al.g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.y("featureEntryPoint");
        return null;
    }

    public final Cl.e getMeijerIntent() {
        Cl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("meijerIntent");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H1(TeacherListsActivity teacherListsActivity) {
        teacherListsActivity.n2().getViewState().m().invoke(r1.f117474a);
        return Unit.f142422a;
    }

    @SuppressLint({"MissingComposePreview"})
    private final void J1(final v1.f fVar, final Function0<Unit> function0, Composer composer, final int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        boolean zD;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2082773327);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(fVar);
            } else {
                zD = composerStartRestartGroup.D(fVar);
            }
            if (zD) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(function0)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(this)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-2082773327, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity.LaunchActivity (TeacherListsActivity.kt:305)");
            }
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean z11 = false;
            if ((i11 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean zD2 = z10 | composerStartRestartGroup.D(this);
            int i15 = i11 & 14;
            if (i15 == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(fVar))) {
                z11 = true;
            }
            boolean z12 = zD2 | z11;
            Object objB = composerStartRestartGroup.B();
            if (z12 || objB == Composer.INSTANCE.a()) {
                objB = new a(function0, this, fVar, null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(fVar, (Function2) objB, composerStartRestartGroup, i15);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TeacherListsActivity.K1(this.f117410a, fVar, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @SuppressLint({"MissingComposePreview"})
    private final void Q1(final v1.f.d dVar, Composer composer, final int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(370637211);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(dVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(370637211, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity.UIFinishActivity (TeacherListsActivity.kt:244)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(this);
            int i14 = i11 & 14;
            if (i14 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = zD | z10;
            Object objB = composerStartRestartGroup.B();
            if (z11 || objB == Composer.INSTANCE.a()) {
                objB = new c(dVar, null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(dVar, (Function2) objB, composerStartRestartGroup, i14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TeacherListsActivity.R1(this.f117405a, dVar, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @SuppressLint({"MissingComposePreview"})
    private final void S1(final v1.f.e eVar, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(1637672443);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(eVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1637672443, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity.UIGoToCartScreen (TeacherListsActivity.kt:319)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD = composerStartRestartGroup.D(this);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.x
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TeacherListsActivity.T1(this.f117604a);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            J1(eVar, (Function0) objB, composerStartRestartGroup, (i11 & 14) | ((i11 << 3) & 896));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TeacherListsActivity.U1(this.f117350a, eVar, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T1(TeacherListsActivity teacherListsActivity) {
        teacherListsActivity.startActivity(teacherListsActivity.getFeatureEntryPoint().d());
        return Unit.f142422a;
    }

    @SuppressLint({"MissingComposePreview"})
    private final void V1(final v1.f.ShopBackToSchool shopBackToSchool, Composer composer, final int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1676129736);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(shopBackToSchool)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1676129736, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity.UIGoToCollectionPLP (TeacherListsActivity.kt:348)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(this);
            int i14 = i11 & 14;
            if (i14 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = zD | z10;
            Object objB = composerStartRestartGroup.B();
            if (z11 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TeacherListsActivity.W1(this.f117471a, shopBackToSchool);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            J1(shopBackToSchool, (Function0) objB, composerStartRestartGroup, ((i11 << 3) & 896) | i14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TeacherListsActivity.X1(this.f117475a, shopBackToSchool, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W1(TeacherListsActivity teacherListsActivity, v1.f.ShopBackToSchool shopBackToSchool) {
        Intent intentY = teacherListsActivity.getMeijerIntent().Y(Uri.parse(shopBackToSchool.getDeeplink()), teacherListsActivity, 4100);
        if (intentY != null) {
            teacherListsActivity.startActivity(intentY);
        }
        return Unit.f142422a;
    }

    @SuppressLint({"MissingComposePreview"})
    private final void Y1(final v1.f.GoToCouponDetailsScreen goToCouponDetailsScreen, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(1971575893);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(goToCouponDetailsScreen)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1971575893, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity.UIGoToCouponDetailsScreen (TeacherListsActivity.kt:330)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(this) | composerStartRestartGroup.D(goToCouponDetailsScreen);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TeacherListsActivity.Z1(this.f117483a, goToCouponDetailsScreen);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            J1(goToCouponDetailsScreen, (Function0) objB, composerStartRestartGroup, (i11 & 14) | ((i11 << 3) & 896));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TeacherListsActivity.a2(this.f117487a, goToCouponDetailsScreen, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z1(TeacherListsActivity teacherListsActivity, v1.f.GoToCouponDetailsScreen goToCouponDetailsScreen) {
        teacherListsActivity.startActivity(Cl.e.g(teacherListsActivity.getMeijerIntent(), goToCouponDetailsScreen.getCoupon(), true, true, false, null, 16, null));
        return Unit.f142422a;
    }

    @SuppressLint({"MissingComposePreview"})
    private final void b2(final v1.f.GoToPDP goToPDP, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(129368765);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(goToPDP)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(129368765, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity.UIGoToPDP (TeacherListsActivity.kt:365)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(this) | composerStartRestartGroup.D(goToPDP);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TeacherListsActivity.c2(this.f117493a, goToPDP);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            J1(goToPDP, (Function0) objB, composerStartRestartGroup, (i11 & 14) | ((i11 << 3) & 896));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TeacherListsActivity.d2(this.f117597a, goToPDP, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c2(TeacherListsActivity teacherListsActivity, v1.f.GoToPDP goToPDP) {
        teacherListsActivity.startActivity(Al.g.t(teacherListsActivity.getFeatureEntryPoint(), goToPDP.getProduct(), true, false, "PDP accessed from Teachers List", 4, null));
        return Unit.f142422a;
    }

    @SuppressLint({"MissingComposePreview"})
    private final void e2(final v1.f.i iVar, Composer composer, final int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-37639717);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(iVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-37639717, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity.UINavigateBack (TeacherListsActivity.kt:254)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(this);
            int i14 = i11 & 14;
            if (i14 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = zD | z10;
            Object objB = composerStartRestartGroup.B();
            if (z11 || objB == Composer.INSTANCE.a()) {
                objB = new d(iVar, null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(iVar, (Function2) objB, composerStartRestartGroup, i14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TeacherListsActivity.f2(this.f117397a, iVar, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @SuppressLint({"MissingComposePreview"})
    private final void g2(final v1.f.GoToFindSubstitutionScreen goToFindSubstitutionScreen, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-974787440);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(goToFindSubstitutionScreen)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-974787440, i11, -1, "com.meijer.mobile.shoppinglist.teacherlists.ux.TeacherListsActivity.UIOpenFindSimilarScreen (TeacherListsActivity.kt:381)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(goToFindSubstitutionScreen) | composerStartRestartGroup.D(this);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TeacherListsActivity.h2(goToFindSubstitutionScreen, this);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            J1(goToFindSubstitutionScreen, (Function0) objB, composerStartRestartGroup, (i11 & 14) | ((i11 << 3) & 896));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TeacherListsActivity.i2(this.f117391a, goToFindSubstitutionScreen, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void o2() {
        getLifecycle().a(n2());
    }

    @Override // com.meijer.mobile.shoppinglist.teacherlists.ux.Hilt_TeacherListsActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        o2();
        androidx.view.I.b(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: com.meijer.mobile.shoppinglist.teacherlists.ux.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TeacherListsActivity.p2(this.f117347a, (androidx.view.F) obj);
            }
        }, 2, null);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1492597733, true, new e()), 1, null);
    }

    @Override // com.meijer.mobile.shoppinglist.teacherlists.ux.Hilt_TeacherListsActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getLifecycle().d(n2());
    }
}
