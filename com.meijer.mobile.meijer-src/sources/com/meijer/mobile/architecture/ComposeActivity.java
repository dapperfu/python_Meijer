package com.meijer.mobile.architecture;

import Ki.K;
import Ki.LocalThemeScope;
import Wi.o;
import android.R;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.platform.D1;
import bk.AbstractC6392a;
import com.meijer.mobile.architecture.ComposeActivity;
import com.meijer.mobile.architecture.j;
import dk.C13698b;
import e.C13737e;
import g.AbstractC14276c;
import g.C14274a;
import g.InterfaceC14275b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import le.C15485b;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b'\u0018\u0000 J*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0003*\b\b\u0002\u0010\u0005*\u00028\u00012\u00020\u00062\u00020\u0007:\u0001KB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\f*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\f*\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u001eH\u0003¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020!H\u0003¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020$H\u0003¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020'H\u0003¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020*H\u0003¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020-H\u0003¢\u0006\u0004\b.\u0010/J!\u00101\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u000200H$¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\fH$¢\u0006\u0004\b3\u0010\tJ\u0013\u00104\u001a\u00020\f*\u00020\u000fH%¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\f2\b\u00107\u001a\u0004\u0018\u000106H\u0015¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\fH\u0015¢\u0006\u0004\b:\u0010\tJ\u000f\u0010;\u001a\u00020\fH\u0016¢\u0006\u0004\b;\u0010\tR\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R-\u0010D\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u00102R!\u0010I\u001a\u00028\u00018DX\u0085\u0084\u0002¢\u0006\u0012\n\u0004\bE\u0010B\u0012\u0004\bH\u0010\t\u001a\u0004\bF\u0010G¨\u0006L"}, d2 = {"Lcom/meijer/mobile/architecture/ComposeActivity;", "", "VSU", "LWi/o;", "IVS", "VS", "Landroidx/appcompat/app/AppCompatActivity;", "LWi/a;", "<init>", "()V", "Lg/a;", "result", "", "e2", "(Lg/a;)V", "LKi/M;", "Lcom/meijer/mobile/architecture/j;", "effect", "C1", "(LKi/M;Lcom/meijer/mobile/architecture/j;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/architecture/j$i;", "vse", "V1", "(LKi/M;Lcom/meijer/mobile/architecture/j$i;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/architecture/j$c;", "N1", "(Lcom/meijer/mobile/architecture/j$c;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/architecture/j$f;", "P1", "(Lcom/meijer/mobile/architecture/j$f;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/architecture/j$a;", "F1", "(Lcom/meijer/mobile/architecture/j$a;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/architecture/j$b;", "H1", "(Lcom/meijer/mobile/architecture/j$b;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/architecture/j$d;", "J1", "(Lcom/meijer/mobile/architecture/j$d;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/architecture/j$h;", "T1", "(Lcom/meijer/mobile/architecture/j$h;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/architecture/j$e;", "L1", "(Lcom/meijer/mobile/architecture/j$e;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/architecture/j$g;", "R1", "(Lcom/meijer/mobile/architecture/j$g;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/architecture/i;", "f2", "()Lcom/meijer/mobile/architecture/i;", "d2", "E1", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "H", "Lg/c;", "Landroid/content/Intent;", "r", "Lg/c;", "activityResultLauncher", "s", "Lkotlin/Lazy;", "b2", "viewModel", "t", "c2", "()LWi/o;", "getViewState$annotations", "viewState", "u", "a", "architecture_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public abstract class ComposeActivity<VSU, IVS extends o<VSU>, VS extends IVS> extends AppCompatActivity implements Wi.a {

    /* renamed from: u, reason: collision with root package name */
    private static final a f95919u = new a(null);

    /* renamed from: v, reason: collision with root package name */
    public static final int f95920v = 8;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> activityResultLauncher = registerForActivityResult(new h.i(), new k(this));

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = LazyKt.b(new Function0() { // from class: Wi.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComposeActivity.g2(this.f41106a);
        }
    });

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewState = LazyKt.b(new Function0() { // from class: Wi.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ComposeActivity.h2(this.f41107a);
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/architecture/ComposeActivity$a;", "", "<init>", "()V", "", "REQUEST_CODE_KEY", "Ljava/lang/String;", "architecture_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.architecture.ComposeActivity$UIActivityResult$1$1", f = "ComposeActivity.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f95924a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComposeActivity<VSU, IVS, VS> f95925b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j.ActivityResultEffect f95926c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ComposeActivity<VSU, IVS, VS> composeActivity, j.ActivityResultEffect activityResultEffect, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f95925b = composeActivity;
            this.f95926c = activityResultEffect;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f95925b, this.f95926c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f95924a == 0) {
                ResultKt.b(obj);
                ComposeActivity<VSU, IVS, VS> composeActivity = this.f95925b;
                composeActivity.setIntent(composeActivity.getIntent().putExtra("request_code_key", this.f95926c.getRequestCode()));
                Intent intentC = this.f95926c.c(this.f95925b);
                if (intentC != null) {
                    ((ComposeActivity) this.f95925b).activityResultLauncher.a(intentC);
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.architecture.ComposeActivity$UIAnnounceForAccessibility$1$1", f = "ComposeActivity.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f95927a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f95928b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f95929c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ j.AnnounceForAccessibility f95930d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ComposeActivity<VSU, IVS, VS> f95931e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(View view, String str, j.AnnounceForAccessibility announceForAccessibility, ComposeActivity<VSU, IVS, VS> composeActivity, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f95928b = view;
            this.f95929c = str;
            this.f95930d = announceForAccessibility;
            this.f95931e = composeActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f95928b, this.f95929c, this.f95930d, this.f95931e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f95927a == 0) {
                ResultKt.b(obj);
                this.f95928b.announceForAccessibility(this.f95929c);
                this.f95930d.b();
                this.f95931e.b2().o(this.f95930d);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.architecture.ComposeActivity$UIDismissKeyboard$1$1", f = "ComposeActivity.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f95932a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D1 f95933b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j.DismissKeyboard f95934c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ComposeActivity<VSU, IVS, VS> f95935d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(D1 d12, j.DismissKeyboard dismissKeyboard, ComposeActivity<VSU, IVS, VS> composeActivity, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f95933b = d12;
            this.f95934c = dismissKeyboard;
            this.f95935d = composeActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f95933b, this.f95934c, this.f95935d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f95932a == 0) {
                ResultKt.b(obj);
                D1 d12 = this.f95933b;
                if (d12 != null) {
                    d12.b();
                }
                this.f95934c.b();
                this.f95935d.b2().o(this.f95934c);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.architecture.ComposeActivity$UIFinishActivity$1$1", f = "ComposeActivity.kt", l = {}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f95936a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j.FinishActivity f95937b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComposeActivity<VSU, IVS, VS> f95938c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(j.FinishActivity finishActivity, ComposeActivity<VSU, IVS, VS> composeActivity, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f95937b = finishActivity;
            this.f95938c = composeActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.f95937b, this.f95938c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f95936a == 0) {
                ResultKt.b(obj);
                this.f95937b.b(this.f95938c);
                this.f95938c.finish();
                ck.c.b(this.f95938c, 1, R.anim.fade_in, R.anim.fade_out, 0, 8, null);
                this.f95938c.b2().o(this.f95937b);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.architecture.ComposeActivity$UIMaterialAlertDialog$1$1", f = "ComposeActivity.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f95939a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComposeActivity<VSU, IVS, VS> f95940b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j.Dialog f95941c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ComposeActivity<VSU, IVS, VS> composeActivity, j.Dialog dialog, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f95940b = composeActivity;
            this.f95941c = dialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f95940b, this.f95941c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(j.Dialog dialog, ComposeActivity composeActivity, DialogInterface dialogInterface) {
            Intrinsics.g(dialogInterface);
            dialog.d(dialogInterface);
            composeActivity.b2().o(dialog);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(j.Dialog dialog, ComposeActivity composeActivity, DialogInterface dialogInterface, int i10) {
            Intrinsics.g(dialogInterface);
            dialog.f(dialogInterface, i10);
            composeActivity.b2().o(dialog);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(j.Dialog dialog, ComposeActivity composeActivity, DialogInterface dialogInterface, int i10) {
            Intrinsics.g(dialogInterface);
            dialog.c(dialogInterface, i10);
            composeActivity.b2().o(dialog);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(j.Dialog dialog, ComposeActivity composeActivity, DialogInterface dialogInterface, int i10) {
            Intrinsics.g(dialogInterface);
            dialog.b(dialogInterface, i10);
            composeActivity.b2().o(dialog);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(j.Dialog dialog, ComposeActivity composeActivity, DialogInterface dialogInterface) {
            Intrinsics.g(dialogInterface);
            dialog.e(dialogInterface);
            composeActivity.b2().o(dialog);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f95939a == 0) {
                ResultKt.b(obj);
                C15485b c15485b = new C15485b(this.f95940b);
                final j.Dialog dialog = this.f95941c;
                final ComposeActivity<VSU, IVS, VS> composeActivity = this.f95940b;
                AbstractC6392a titleResId = dialog.getTitleResId();
                if (titleResId != null) {
                    c15485b.setTitle(titleResId.b(composeActivity));
                }
                AbstractC6392a messageResId = dialog.getMessageResId();
                if (messageResId != null) {
                    c15485b.setMessage(messageResId.b(composeActivity));
                }
                c15485b.setCancelable(dialog.getCancellable());
                Integer icon = dialog.getIcon();
                if (icon != null) {
                    c15485b.setIcon(icon.intValue());
                }
                AbstractC6392a positiveButtonResId = dialog.getPositiveButtonResId();
                if (positiveButtonResId != null) {
                    c15485b.setPositiveButton(positiveButtonResId.d(composeActivity), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.architecture.a
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            ComposeActivity.f.q(dialog, composeActivity, dialogInterface, i10);
                        }
                    });
                }
                AbstractC6392a neutralButtonResId = dialog.getNeutralButtonResId();
                if (neutralButtonResId != null) {
                    c15485b.setNeutralButton(neutralButtonResId.d(composeActivity), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.architecture.b
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            ComposeActivity.f.r(dialog, composeActivity, dialogInterface, i10);
                        }
                    });
                }
                AbstractC6392a negativeButtonResId = dialog.getNegativeButtonResId();
                if (negativeButtonResId != null) {
                    c15485b.setNegativeButton(negativeButtonResId.d(composeActivity), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.architecture.c
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            ComposeActivity.f.s(dialog, composeActivity, dialogInterface, i10);
                        }
                    });
                }
                c15485b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.meijer.mobile.architecture.d
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        ComposeActivity.f.t(dialog, composeActivity, dialogInterface);
                    }
                });
                c15485b.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meijer.mobile.architecture.e
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        ComposeActivity.f.p(dialog, composeActivity, dialogInterface);
                    }
                });
                c15485b.show();
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.architecture.ComposeActivity$UINavigateTo$1$1", f = "ComposeActivity.kt", l = {}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f95942a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j.NavigateTo f95943b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComposeActivity<VSU, IVS, VS> f95944c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(j.NavigateTo navigateTo, ComposeActivity<VSU, IVS, VS> composeActivity, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f95943b = navigateTo;
            this.f95944c = composeActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new g(this.f95943b, this.f95944c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f95942a == 0) {
                ResultKt.b(obj);
                Intent intentB = this.f95943b.b(this.f95944c);
                if (intentB != null) {
                    this.f95944c.startActivity(intentB);
                }
                this.f95944c.b2().o(this.f95943b);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.architecture.ComposeActivity$UINavigateUp$1$1", f = "ComposeActivity.kt", l = {}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f95945a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j.NavigateUp f95946b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComposeActivity<VSU, IVS, VS> f95947c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(j.NavigateUp navigateUp, ComposeActivity<VSU, IVS, VS> composeActivity, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f95946b = navigateUp;
            this.f95947c = composeActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new h(this.f95946b, this.f95947c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f95945a == 0) {
                ResultKt.b(obj);
                this.f95946b.b(this.f95947c);
                if (!this.f95947c.onNavigateUp()) {
                    this.f95947c.finish();
                }
                ck.c.b(this.f95947c, 1, R.anim.fade_in, R.anim.fade_out, 0, 8, null);
                this.f95947c.b2().o(this.f95946b);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.architecture.ComposeActivity$UIOpenKeyboard$1$1", f = "ComposeActivity.kt", l = {}, m = "invokeSuspend")
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f95948a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D1 f95949b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j.OpenKeyboard f95950c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ComposeActivity<VSU, IVS, VS> f95951d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(D1 d12, j.OpenKeyboard openKeyboard, ComposeActivity<VSU, IVS, VS> composeActivity, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f95949b = d12;
            this.f95950c = openKeyboard;
            this.f95951d = composeActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new i(this.f95949b, this.f95950c, this.f95951d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f95948a == 0) {
                ResultKt.b(obj);
                D1 d12 = this.f95949b;
                if (d12 != null) {
                    d12.a();
                }
                this.f95950c.b();
                this.f95951d.b2().o(this.f95950c);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.architecture.ComposeActivity$UIToast$1$1", f = "ComposeActivity.kt", l = {185, 185}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f95952a;

        /* renamed from: b, reason: collision with root package name */
        Object f95953b;

        /* renamed from: c, reason: collision with root package name */
        Object f95954c;

        /* renamed from: d, reason: collision with root package name */
        Object f95955d;

        /* renamed from: e, reason: collision with root package name */
        int f95956e;

        /* renamed from: f, reason: collision with root package name */
        int f95957f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ j.Toast f95958g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f95959h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ComposeActivity<VSU, IVS, VS> f95960i;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new j(this.f95958g, this.f95959h, this.f95960i, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(j.Toast toast, LocalThemeScope localThemeScope, ComposeActivity<VSU, IVS, VS> composeActivity, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f95958g = toast;
            this.f95959h = localThemeScope;
            this.f95960i = composeActivity;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00b6, code lost:
        
            if (r2.h(r7, r2, r12, r13, r14, r15, r7, r8, r18) == r10) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r9 = r18
                java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r9.f95957f
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L41
                if (r0 == r2) goto L25
                if (r0 != r1) goto L1d
                java.lang.Object r0 = r9.f95953b
                com.meijer.mobile.architecture.j$i r0 = (com.meijer.mobile.architecture.j.Toast) r0
                java.lang.Object r0 = r9.f95952a
                com.meijer.mobile.architecture.j$i r0 = (com.meijer.mobile.architecture.j.Toast) r0
                kotlin.ResultKt.b(r19)
                goto Lb9
            L1d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L25:
                int r0 = r9.f95956e
                java.lang.Object r2 = r9.f95955d
                com.meijer.mobile.architecture.j$i r2 = (com.meijer.mobile.architecture.j.Toast) r2
                java.lang.Object r3 = r9.f95954c
                com.meijer.mobile.architecture.j$i r3 = (com.meijer.mobile.architecture.j.Toast) r3
                java.lang.Object r4 = r9.f95953b
                com.meijer.mobile.architecture.ComposeActivity r4 = (com.meijer.mobile.architecture.ComposeActivity) r4
                java.lang.Object r5 = r9.f95952a
                com.meijer.mobile.architecture.j$i r5 = (com.meijer.mobile.architecture.j.Toast) r5
                kotlin.ResultKt.b(r19)
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r19
                goto L67
            L41:
                kotlin.ResultKt.b(r19)
                com.meijer.mobile.architecture.j$i r0 = r9.f95958g
                Ki.M r3 = r9.f95959h
                com.meijer.mobile.architecture.ComposeActivity<VSU, IVS extends Wi.o<VSU>, VS extends IVS> r4 = r9.f95960i
                float r5 = r0.getBottomMargin()
                r9.f95952a = r0
                r9.f95953b = r4
                r9.f95954c = r0
                r9.f95955d = r0
                r6 = 0
                r9.f95956e = r6
                r9.f95957f = r2
                java.lang.Object r2 = r3.f(r5, r9)
                if (r2 != r10) goto L62
                goto Lb8
            L62:
                r3 = r0
                r5 = r4
                r4 = r3
                r0 = r6
                r6 = r4
            L67:
                Hi.i r2 = (Hi.i) r2
                bk.a r7 = r3.getBodyLabel()
                java.lang.String r7 = r7.b(r5)
                bk.a r8 = r3.getActionLabel()
                r11 = 0
                if (r8 == 0) goto L7d
                java.lang.String r8 = r8.b(r5)
                goto L7e
            L7d:
                r8 = r11
            L7e:
                Hi.e r12 = r3.getDuration()
                boolean r13 = r3.getShowCloseIcon()
                ki.q1$m$a r14 = r3.getToastState()
                com.meijer.mobile.architecture.f r15 = new com.meijer.mobile.architecture.f
                r15.<init>()
                r16 = r7
                com.meijer.mobile.architecture.g r7 = new com.meijer.mobile.architecture.g
                r7.<init>()
                r17 = r2
                r2 = r8
                com.meijer.mobile.architecture.h r8 = new com.meijer.mobile.architecture.h
                r8.<init>()
                r9.f95952a = r6
                r9.f95953b = r3
                r9.f95954c = r11
                r9.f95955d = r11
                r9.f95956e = r0
                r9.f95957f = r1
                r3 = r12
                r4 = r13
                r5 = r14
                r6 = r15
                r1 = r16
                r0 = r17
                java.lang.Object r0 = r0.h(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                if (r0 != r10) goto Lb9
            Lb8:
                return r10
            Lb9:
                kotlin.Unit r0 = kotlin.Unit.f143329a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.architecture.ComposeActivity.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean l(j.Toast toast, ComposeActivity composeActivity, j.Toast toast2) {
            boolean zF = toast.f();
            composeActivity.b2().o(toast2);
            return zF;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean o(j.Toast toast, ComposeActivity composeActivity, j.Toast toast2) {
            boolean zD = toast.d();
            composeActivity.b2().o(toast2);
            return zD;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(j.Toast toast, ComposeActivity composeActivity, j.Toast toast2) {
            toast.e();
            composeActivity.b2().o(toast2);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class k implements InterfaceC14275b, FunctionAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComposeActivity<VSU, IVS, VS> f95961a;

        k(ComposeActivity<VSU, IVS, VS> composeActivity) {
            this.f95961a = composeActivity;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.f95961a, ComposeActivity.class, "processActivityResult", "processActivityResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            this.f95961a.e2(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class l implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComposeActivity<VSU, IVS, VS> f95962a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ComposeActivity<VSU, IVS, VS> f95963a;

            a(ComposeActivity<VSU, IVS, VS> composeActivity) {
                this.f95963a = composeActivity;
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
                    ComposerKt.U(-1464715849, i10, -1, "com.meijer.mobile.architecture.ComposeActivity.onCreate.<anonymous>.<anonymous> (ComposeActivity.kt:115)");
                }
                composer.startReplaceGroup(1157343990);
                Map<UUID, com.meijer.mobile.architecture.j> mapQ = this.f95963a.b2().q();
                ComposeActivity<VSU, IVS, VS> composeActivity = this.f95963a;
                ArrayList arrayList = new ArrayList(mapQ.size());
                for (Map.Entry<UUID, com.meijer.mobile.architecture.j> entry : mapQ.entrySet()) {
                    composer.startMovableGroup(-674583529, entry.getKey());
                    composeActivity.C1(AdsTheme, entry.getValue(), composer, LocalThemeScope.f17314g | (i10 & 14));
                    composer.T();
                    arrayList.add(Unit.f143329a);
                }
                composer.P();
                this.f95963a.E1(AdsTheme, composer, (i10 & 14) | LocalThemeScope.f17314g);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        l(ComposeActivity<VSU, IVS, VS> composeActivity) {
            this.f95962a = composeActivity;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-877483416, i10, -1, "com.meijer.mobile.architecture.ComposeActivity.onCreate.<anonymous> (ComposeActivity.kt:114)");
            }
            K.b(null, ComposableLambdaKt.c(-1464715849, true, new a(this.f95962a), composer, 54), composer, 48, 1);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G1(ComposeActivity composeActivity, j.ActivityResultEffect activityResultEffect, int i10, Composer composer, int i11) {
        composeActivity.F1(activityResultEffect, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I1(ComposeActivity composeActivity, j.AnnounceForAccessibility announceForAccessibility, int i10, Composer composer, int i11) {
        composeActivity.H1(announceForAccessibility, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K1(ComposeActivity composeActivity, j.DismissKeyboard dismissKeyboard, int i10, Composer composer, int i11) {
        composeActivity.J1(dismissKeyboard, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M1(ComposeActivity composeActivity, j.FinishActivity finishActivity, int i10, Composer composer, int i11) {
        composeActivity.L1(finishActivity, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O1(ComposeActivity composeActivity, j.Dialog dialog, int i10, Composer composer, int i11) {
        composeActivity.N1(dialog, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q1(ComposeActivity composeActivity, j.NavigateTo navigateTo, int i10, Composer composer, int i11) {
        composeActivity.P1(navigateTo, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S1(ComposeActivity composeActivity, j.NavigateUp navigateUp, int i10, Composer composer, int i11) {
        composeActivity.R1(navigateUp, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U1(ComposeActivity composeActivity, j.OpenKeyboard openKeyboard, int i10, Composer composer, int i11) {
        composeActivity.T1(openKeyboard, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    @SuppressLint({"MissingComposePreview"})
    protected abstract void E1(LocalThemeScope localThemeScope, Composer composer, int i10);

    @Override // Wi.a
    public void H() {
        setResult(-1);
    }

    protected abstract void d2();

    protected abstract com.meijer.mobile.architecture.i<VSU, IVS, VS> f2();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D1(ComposeActivity composeActivity, LocalThemeScope localThemeScope, com.meijer.mobile.architecture.j jVar, int i10, Composer composer, int i11) {
        composeActivity.C1(localThemeScope, jVar, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W1(ComposeActivity composeActivity, LocalThemeScope localThemeScope, j.Toast toast, int i10, Composer composer, int i11) {
        composeActivity.V1(localThemeScope, toast, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.meijer.mobile.architecture.i<VSU, IVS, VS> b2() {
        return (com.meijer.mobile.architecture.i) this.viewModel.getValue();
    }

    protected final IVS c2() {
        return (IVS) this.viewState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingComposePreview"})
    public final void C1(final LocalThemeScope localThemeScope, final com.meijer.mobile.architecture.j jVar, Composer composer, final int i10) {
        int i11;
        int i12;
        boolean zD;
        int i13;
        boolean zD2;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1094947375);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD2 = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD2 = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD2) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                zD = composerStartRestartGroup.V(jVar);
            } else {
                zD = composerStartRestartGroup.D(jVar);
            }
            if (zD) {
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
                ComposerKt.U(-1094947375, i11, -1, "com.meijer.mobile.architecture.ComposeActivity.ConsumeEffect (ComposeActivity.kt:165)");
            }
            if (jVar instanceof j.Toast) {
                composerStartRestartGroup.startReplaceGroup(22565856);
                V1(localThemeScope, (j.Toast) jVar, composerStartRestartGroup, (i11 & 896) | LocalThemeScope.f17314g | (i11 & 14));
                composerStartRestartGroup.P();
            } else if (jVar instanceof j.Dialog) {
                composerStartRestartGroup.startReplaceGroup(22567470);
                N1((j.Dialog) jVar, composerStartRestartGroup, (i11 >> 3) & 112);
                composerStartRestartGroup.P();
            } else if (jVar instanceof j.NavigateTo) {
                composerStartRestartGroup.startReplaceGroup(22569637);
                P1((j.NavigateTo) jVar, composerStartRestartGroup, (i11 >> 3) & 112);
                composerStartRestartGroup.P();
            } else if (jVar instanceof j.ActivityResultEffect) {
                composerStartRestartGroup.startReplaceGroup(22571849);
                F1((j.ActivityResultEffect) jVar, composerStartRestartGroup, (i11 >> 3) & 112);
                composerStartRestartGroup.P();
            } else if (jVar instanceof j.AnnounceForAccessibility) {
                composerStartRestartGroup.startReplaceGroup(22574323);
                H1((j.AnnounceForAccessibility) jVar, composerStartRestartGroup, (i11 >> 3) & 112);
                composerStartRestartGroup.P();
            } else if (jVar instanceof j.DismissKeyboard) {
                composerStartRestartGroup.startReplaceGroup(22576810);
                J1((j.DismissKeyboard) jVar, composerStartRestartGroup, (i11 >> 3) & 112);
                composerStartRestartGroup.P();
            } else if (jVar instanceof j.OpenKeyboard) {
                composerStartRestartGroup.startReplaceGroup(22578919);
                T1((j.OpenKeyboard) jVar, composerStartRestartGroup, (i11 >> 3) & 112);
                composerStartRestartGroup.P();
            } else if (jVar instanceof j.FinishActivity) {
                composerStartRestartGroup.startReplaceGroup(22581001);
                L1((j.FinishActivity) jVar, composerStartRestartGroup, (i11 >> 3) & 112);
                composerStartRestartGroup.P();
            } else if (jVar instanceof j.NavigateUp) {
                composerStartRestartGroup.startReplaceGroup(22583013);
                R1((j.NavigateUp) jVar, composerStartRestartGroup, (i11 >> 3) & 112);
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(22564888);
                composerStartRestartGroup.P();
                throw new NoWhenBranchMatchedException();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Wi.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeActivity.D1(this.f41095a, localThemeScope, jVar, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @SuppressLint({"MissingComposePreview"})
    private final void F1(final j.ActivityResultEffect activityResultEffect, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(2117458201);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(activityResultEffect)) {
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
                ComposerKt.U(2117458201, i11, -1, "com.meijer.mobile.architecture.ComposeActivity.UIActivityResult (ComposeActivity.kt:289)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(this) | composerStartRestartGroup.D(activityResultEffect);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new b(this, activityResultEffect, null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            J.g(activityResultEffect, (Function2) objB, composerStartRestartGroup, i11 & 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Wi.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeActivity.G1(this.f41103a, activityResultEffect, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @SuppressLint({"MissingComposePreview"})
    private final void H1(j.AnnounceForAccessibility announceForAccessibility, Composer composer, final int i10) {
        int i11;
        final j.AnnounceForAccessibility announceForAccessibility2;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1140706584);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(announceForAccessibility)) {
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
            announceForAccessibility2 = announceForAccessibility;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1140706584, i11, -1, "com.meijer.mobile.architecture.ComposeActivity.UIAnnounceForAccessibility (ComposeActivity.kt:309)");
            }
            String strA = C13698b.a(announceForAccessibility.getToAnnounce(), composerStartRestartGroup, AbstractC6392a.f60445b);
            View view = (View) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.k());
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zD = composerStartRestartGroup.D(view) | composerStartRestartGroup.V(strA) | composerStartRestartGroup.D(announceForAccessibility) | composerStartRestartGroup.D(this);
            Object objB = composerStartRestartGroup.B();
            if (!zD && objB != Composer.INSTANCE.a()) {
                announceForAccessibility2 = announceForAccessibility;
            } else {
                announceForAccessibility2 = announceForAccessibility;
                c cVar = new c(view, strA, announceForAccessibility2, this, null);
                composerStartRestartGroup.t(cVar);
                objB = cVar;
            }
            composerStartRestartGroup.P();
            J.g(announceForAccessibility2, (Function2) objB, composerStartRestartGroup, i11 & 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Wi.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeActivity.I1(this.f41120a, announceForAccessibility2, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @SuppressLint({"MissingComposePreview"})
    private final void J1(final j.DismissKeyboard dismissKeyboard, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-852511046);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(dismissKeyboard)) {
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
                ComposerKt.U(-852511046, i11, -1, "com.meijer.mobile.architecture.ComposeActivity.UIDismissKeyboard (ComposeActivity.kt:323)");
            }
            D1 d12 = (D1) composerStartRestartGroup.o(C6034t0.q());
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zV = composerStartRestartGroup.V(d12) | composerStartRestartGroup.D(dismissKeyboard) | composerStartRestartGroup.D(this);
            Object objB = composerStartRestartGroup.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new d(d12, dismissKeyboard, this, null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            J.g(dismissKeyboard, (Function2) objB, composerStartRestartGroup, i11 & 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Wi.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeActivity.K1(this.f41111a, dismissKeyboard, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @SuppressLint({"MissingComposePreview"})
    private final void L1(final j.FinishActivity finishActivity, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1896267800);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(finishActivity)) {
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
                ComposerKt.U(-1896267800, i11, -1, "com.meijer.mobile.architecture.ComposeActivity.UIFinishActivity (ComposeActivity.kt:349)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(finishActivity) | composerStartRestartGroup.D(this);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new e(finishActivity, this, null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            J.g(finishActivity, (Function2) objB, composerStartRestartGroup, i11 & 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Wi.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeActivity.M1(this.f41114a, finishActivity, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @SuppressLint({"MissingComposePreview"})
    private final void N1(final j.Dialog dialog, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-309766857);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(dialog)) {
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
                ComposerKt.U(-309766857, i11, -1, "com.meijer.mobile.architecture.ComposeActivity.UIMaterialAlertDialog (ComposeActivity.kt:223)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(this) | composerStartRestartGroup.D(dialog);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new f(this, dialog, null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            J.g(dialog, (Function2) objB, composerStartRestartGroup, i11 & 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Wi.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeActivity.O1(this.f41126a, dialog, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @SuppressLint({"MissingComposePreview"})
    private final void P1(final j.NavigateTo navigateTo, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(1608365736);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(navigateTo)) {
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
                ComposerKt.U(1608365736, i11, -1, "com.meijer.mobile.architecture.ComposeActivity.UINavigateTo (ComposeActivity.kt:276)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(navigateTo) | composerStartRestartGroup.D(this);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new g(navigateTo, this, null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            J.g(navigateTo, (Function2) objB, composerStartRestartGroup, i11 & 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Wi.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeActivity.Q1(this.f41117a, navigateTo, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @SuppressLint({"MissingComposePreview"})
    private final void R1(final j.NavigateUp navigateUp, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(380199592);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(navigateUp)) {
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
                ComposerKt.U(380199592, i11, -1, "com.meijer.mobile.architecture.ComposeActivity.UINavigateUp (ComposeActivity.kt:367)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(navigateUp) | composerStartRestartGroup.D(this);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new h(navigateUp, this, null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            J.g(navigateUp, (Function2) objB, composerStartRestartGroup, i11 & 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Wi.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeActivity.S1(this.f41123a, navigateUp, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @SuppressLint({"MissingComposePreview"})
    private final void T1(final j.OpenKeyboard openKeyboard, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-319102776);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(openKeyboard)) {
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
                ComposerKt.U(-319102776, i11, -1, "com.meijer.mobile.architecture.ComposeActivity.UIOpenKeyboard (ComposeActivity.kt:336)");
            }
            D1 d12 = (D1) composerStartRestartGroup.o(C6034t0.q());
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zV = composerStartRestartGroup.V(d12) | composerStartRestartGroup.D(openKeyboard) | composerStartRestartGroup.D(this);
            Object objB = composerStartRestartGroup.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new i(d12, openKeyboard, this, null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            J.g(openKeyboard, (Function2) objB, composerStartRestartGroup, i11 & 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Wi.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeActivity.U1(this.f41108a, openKeyboard, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @SuppressLint({"MissingComposePreview"})
    private final void V1(final LocalThemeScope localThemeScope, final j.Toast toast, Composer composer, final int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        boolean zD;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1765387154);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
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
            if (composerStartRestartGroup.D(toast)) {
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
                ComposerKt.U(-1765387154, i11, -1, "com.meijer.mobile.architecture.ComposeActivity.UIToast (ComposeActivity.kt:181)");
            }
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zD2 = composerStartRestartGroup.D(toast);
            if ((i11 & 14) != 4 && ((i11 & 8) == 0 || !composerStartRestartGroup.D(localThemeScope))) {
                z10 = false;
            } else {
                z10 = true;
            }
            boolean zD3 = zD2 | z10 | composerStartRestartGroup.D(this);
            Object objB = composerStartRestartGroup.B();
            if (zD3 || objB == Composer.INSTANCE.a()) {
                objB = new j(toast, localThemeScope, this, null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            J.g(toast, (Function2) objB, composerStartRestartGroup, (i11 >> 3) & 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Wi.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeActivity.W1(this.f41099a, localThemeScope, toast, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e2(C14274a result) {
        Object next;
        String stringExtra = getIntent().getStringExtra("request_code_key");
        if (stringExtra != null) {
            Collection<com.meijer.mobile.architecture.j> collectionValues = b2().q().values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                if (obj instanceof j.ActivityResultEffect) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.e(((j.ActivityResultEffect) next).getRequestCode(), stringExtra)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            j.ActivityResultEffect activityResultEffect = (j.ActivityResultEffect) next;
            if (activityResultEffect != null) {
                activityResultEffect.b(result);
                b2().o(activityResultEffect);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.meijer.mobile.architecture.i g2(ComposeActivity composeActivity) {
        return composeActivity.f2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o h2(ComposeActivity composeActivity) {
        return composeActivity.b2().r();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().a(b2());
        d2();
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-877483416, true, new l(this)), 1, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getLifecycle().d(b2());
    }
}
