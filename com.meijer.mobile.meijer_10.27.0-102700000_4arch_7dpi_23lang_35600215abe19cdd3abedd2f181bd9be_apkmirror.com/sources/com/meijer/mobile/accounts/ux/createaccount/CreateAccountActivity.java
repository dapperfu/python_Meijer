package com.meijer.mobile.accounts.ux.createaccount;

import Fh.a;
import Ji.K;
import Ji.LocalThemeScope;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.meijer.mobile.accounts.ux.createaccount.CreateAccountActivity;
import com.meijer.mobile.accounts.ux.createaccount.t;
import e.C13589e;
import kotlin.AbstractC14653B;
import kotlin.C14677u;
import kotlin.C14680x;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import qv.InterfaceC16622O;
import tv.C17154h;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/accounts/ux/createaccount/CreateAccountActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "LFh/a;", "request", "", "o1", "(LFh/a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "LCl/e;", "v", "LCl/e;", "getMeijerIntent", "()LCl/e;", "setMeijerIntent", "(LCl/e;)V", "meijerIntent", "Lcom/meijer/mobile/accounts/ux/createaccount/t;", "w", "Lcom/meijer/mobile/accounts/ux/createaccount/t;", "n1", "()Lcom/meijer/mobile/accounts/ux/createaccount/t;", "setNavigationManager$ux_release", "(Lcom/meijer/mobile/accounts/ux/createaccount/t;)V", "navigationManager", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateAccountActivity extends Hilt_CreateAccountActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Cl.e meijerIntent;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public t navigationManager;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.accounts.ux.createaccount.CreateAccountActivity$a$a, reason: collision with other inner class name */
        static final class C1325a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CreateAccountActivity f94311a;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.accounts.ux.createaccount.CreateAccountActivity$onCreate$1$1$1$1", f = "CreateAccountActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.accounts.ux.createaccount.CreateAccountActivity$a$a$a, reason: collision with other inner class name */
            static final class C1326a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f94312a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f94313b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ CreateAccountActivity f94314c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C14677u f94315d;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/accounts/ux/createaccount/t$a;", "screen", "", "<anonymous>", "(Lcom/meijer/mobile/accounts/ux/createaccount/t$a;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.accounts.ux.createaccount.CreateAccountActivity$onCreate$1$1$1$1$1", f = "CreateAccountActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.accounts.ux.createaccount.CreateAccountActivity$a$a$a$a, reason: collision with other inner class name */
                static final class C1327a extends SuspendLambda implements Function2<t.a, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f94316a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f94317b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ C14677u f94318c;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C1327a c1327a = new C1327a(this.f94318c, continuation);
                        c1327a.f94317b = obj;
                        return c1327a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(t.a aVar, Continuation<? super Unit> continuation) {
                        return ((C1327a) create(aVar, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1327a(C14677u c14677u, Continuation<? super C1327a> continuation) {
                        super(2, continuation);
                        this.f94318c = c14677u;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit k(t.a aVar, C14680x c14680x) {
                        C14680x.e(c14680x, aVar.getRoute(), null, 2, null);
                        c14680x.f(true);
                        return Unit.f142422a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                        IntrinsicsKt.f();
                        if (this.f94316a == 0) {
                            ResultKt.b(obj);
                            final t.a aVar = (t.a) this.f94317b;
                            this.f94318c.S(aVar.getRoute(), new Function1() { // from class: com.meijer.mobile.accounts.ux.createaccount.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return CreateAccountActivity.a.C1325a.C1326a.C1327a.k(aVar, (C14680x) obj2);
                                }
                            });
                            return Unit.f142422a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1326a c1326a = new C1326a(this.f94314c, this.f94315d, continuation);
                    c1326a.f94313b = obj;
                    return c1326a;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1326a(CreateAccountActivity createAccountActivity, C14677u c14677u, Continuation<? super C1326a> continuation) {
                    super(2, continuation);
                    this.f94314c = createAccountActivity;
                    this.f94315d = c14677u;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C1326a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f94312a == 0) {
                        ResultKt.b(obj);
                        C17154h.J(C17154h.O(this.f94314c.n1().a(), new C1327a(this.f94315d, null)), (InterfaceC16622O) this.f94313b);
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.accounts.ux.createaccount.CreateAccountActivity$a$a$b */
            /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Fh.a, Unit> {
                b(Object obj) {
                    super(1, obj, CreateAccountActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/accounts/ux/AccountNavigationRequest;)V", 0);
                }

                public final void a(Fh.a p02) {
                    Intrinsics.j(p02, "p0");
                    ((CreateAccountActivity) this.receiver).o1(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Fh.a aVar) {
                    a(aVar);
                    return Unit.f142422a;
                }
            }

            C1325a(CreateAccountActivity createAccountActivity) {
                this.f94311a = createAccountActivity;
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
                    ComposerKt.U(1791120282, i10, -1, "com.meijer.mobile.accounts.ux.createaccount.CreateAccountActivity.onCreate.<anonymous>.<anonymous> (CreateAccountActivity.kt:43)");
                }
                C14677u c14677uE = j4.j.e(new AbstractC14653B[0], composer, 0);
                Unit unit = Unit.f142422a;
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f94311a) | composer.D(c14677uE);
                CreateAccountActivity createAccountActivity = this.f94311a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C1326a(createAccountActivity, c14677uE, null);
                    composer.t(objB);
                }
                composer.P();
                J.g(unit, (Function2) objB, composer, 6);
                Object obj = this.f94311a;
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(obj);
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new b(obj);
                    composer.t(objB2);
                }
                composer.P();
                s.c(AdsTheme, c14677uE, (Function1) ((KFunction) objB2), composer, (i10 & 14) | LocalThemeScope.f15770g);
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

        a() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1756289033, i10, -1, "com.meijer.mobile.accounts.ux.createaccount.CreateAccountActivity.onCreate.<anonymous> (CreateAccountActivity.kt:42)");
            }
            K.b(null, ComposableLambdaKt.c(1791120282, true, new C1325a(CreateAccountActivity.this), composer, 54), composer, 48, 1);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void o1(Fh.a request) {
        if (request instanceof a.k) {
            finish();
            return;
        }
        if (request instanceof a.s) {
            startActivity(Al.k.b(this, false, null, null, null, null, null, 126, null));
            return;
        }
        if (request instanceof a.e) {
            startActivity(Al.k.b(this, false, null, null, null, null, null, 126, null));
            finish();
        } else if (request instanceof a.u) {
            getMeijerIntent().f0(this);
        } else if (request instanceof a.o) {
            getMeijerIntent().e0(this);
        }
    }

    public final Cl.e getMeijerIntent() {
        Cl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("meijerIntent");
        return null;
    }

    public final t n1() {
        t tVar = this.navigationManager;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.y("navigationManager");
        return null;
    }

    @Override // com.meijer.mobile.accounts.ux.createaccount.Hilt_CreateAccountActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1756289033, true, new a()), 1, null);
    }
}
