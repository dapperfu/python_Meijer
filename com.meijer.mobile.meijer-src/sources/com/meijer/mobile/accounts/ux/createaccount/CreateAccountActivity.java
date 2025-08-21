package com.meijer.mobile.accounts.ux.createaccount;

import Gh.a;
import Ki.K;
import Ki.LocalThemeScope;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.meijer.mobile.accounts.ux.createaccount.CreateAccountActivity;
import com.meijer.mobile.accounts.ux.createaccount.t;
import e.C13737e;
import kotlin.AbstractC14656B;
import kotlin.C14680u;
import kotlin.C14683x;
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
import mv.InterfaceC15783O;
import pv.C16563h;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/accounts/ux/createaccount/CreateAccountActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "LGh/a;", "request", "", "o1", "(LGh/a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "LDl/e;", "v", "LDl/e;", "getMeijerIntent", "()LDl/e;", "setMeijerIntent", "(LDl/e;)V", "meijerIntent", "Lcom/meijer/mobile/accounts/ux/createaccount/t;", "w", "Lcom/meijer/mobile/accounts/ux/createaccount/t;", "n1", "()Lcom/meijer/mobile/accounts/ux/createaccount/t;", "setNavigationManager$ux_release", "(Lcom/meijer/mobile/accounts/ux/createaccount/t;)V", "navigationManager", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CreateAccountActivity extends Hilt_CreateAccountActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public t navigationManager;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.accounts.ux.createaccount.CreateAccountActivity$a$a, reason: collision with other inner class name */
        static final class C1334a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CreateAccountActivity f95156a;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.accounts.ux.createaccount.CreateAccountActivity$onCreate$1$1$1$1", f = "CreateAccountActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.accounts.ux.createaccount.CreateAccountActivity$a$a$a, reason: collision with other inner class name */
            static final class C1335a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f95157a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f95158b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ CreateAccountActivity f95159c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C14680u f95160d;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/accounts/ux/createaccount/t$a;", "screen", "", "<anonymous>", "(Lcom/meijer/mobile/accounts/ux/createaccount/t$a;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.accounts.ux.createaccount.CreateAccountActivity$onCreate$1$1$1$1$1", f = "CreateAccountActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.accounts.ux.createaccount.CreateAccountActivity$a$a$a$a, reason: collision with other inner class name */
                static final class C1336a extends SuspendLambda implements Function2<t.a, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f95161a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f95162b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ C14680u f95163c;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C1336a c1336a = new C1336a(this.f95163c, continuation);
                        c1336a.f95162b = obj;
                        return c1336a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(t.a aVar, Continuation<? super Unit> continuation) {
                        return ((C1336a) create(aVar, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1336a(C14680u c14680u, Continuation<? super C1336a> continuation) {
                        super(2, continuation);
                        this.f95163c = c14680u;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit k(t.a aVar, C14683x c14683x) {
                        C14683x.e(c14683x, aVar.getRoute(), null, 2, null);
                        c14683x.f(true);
                        return Unit.f143329a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                        IntrinsicsKt.f();
                        if (this.f95161a == 0) {
                            ResultKt.b(obj);
                            final t.a aVar = (t.a) this.f95162b;
                            this.f95163c.S(aVar.getRoute(), new Function1() { // from class: com.meijer.mobile.accounts.ux.createaccount.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return CreateAccountActivity.a.C1334a.C1335a.C1336a.k(aVar, (C14683x) obj2);
                                }
                            });
                            return Unit.f143329a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1335a c1335a = new C1335a(this.f95159c, this.f95160d, continuation);
                    c1335a.f95158b = obj;
                    return c1335a;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1335a(CreateAccountActivity createAccountActivity, C14680u c14680u, Continuation<? super C1335a> continuation) {
                    super(2, continuation);
                    this.f95159c = createAccountActivity;
                    this.f95160d = c14680u;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C1335a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f95157a == 0) {
                        ResultKt.b(obj);
                        C16563h.J(C16563h.O(this.f95159c.n1().a(), new C1336a(this.f95160d, null)), (InterfaceC15783O) this.f95158b);
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.accounts.ux.createaccount.CreateAccountActivity$a$a$b */
            /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Gh.a, Unit> {
                b(Object obj) {
                    super(1, obj, CreateAccountActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/accounts/ux/AccountNavigationRequest;)V", 0);
                }

                public final void a(Gh.a p02) {
                    Intrinsics.j(p02, "p0");
                    ((CreateAccountActivity) this.receiver).o1(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Gh.a aVar) {
                    a(aVar);
                    return Unit.f143329a;
                }
            }

            C1334a(CreateAccountActivity createAccountActivity) {
                this.f95156a = createAccountActivity;
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
                C14680u c14680uE = j4.j.e(new AbstractC14656B[0], composer, 0);
                Unit unit = Unit.f143329a;
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f95156a) | composer.D(c14680uE);
                CreateAccountActivity createAccountActivity = this.f95156a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C1335a(createAccountActivity, c14680uE, null);
                    composer.t(objB);
                }
                composer.P();
                J.g(unit, (Function2) objB, composer, 6);
                Object obj = this.f95156a;
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(obj);
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new b(obj);
                    composer.t(objB2);
                }
                composer.P();
                s.c(AdsTheme, c14680uE, (Function1) ((KFunction) objB2), composer, (i10 & 14) | LocalThemeScope.f17314g);
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
            K.b(null, ComposableLambdaKt.c(1791120282, true, new C1334a(CreateAccountActivity.this), composer, 54), composer, 48, 1);
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
    public final void o1(Gh.a request) {
        if (request instanceof a.k) {
            finish();
            return;
        }
        if (request instanceof a.s) {
            startActivity(Bl.k.b(this, false, null, null, null, null, null, 126, null));
            return;
        }
        if (request instanceof a.e) {
            startActivity(Bl.k.b(this, false, null, null, null, null, null, 126, null));
            finish();
        } else if (request instanceof a.u) {
            getMeijerIntent().g0(this);
        } else if (request instanceof a.o) {
            getMeijerIntent().f0(this);
        }
    }

    public final Dl.e getMeijerIntent() {
        Dl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("meijerIntent");
        return null;
    }

    public final t n1() {
        t tVar = this.navigationManager;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.x("navigationManager");
        return null;
    }

    @Override // com.meijer.mobile.accounts.ux.createaccount.Hilt_CreateAccountActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1756289033, true, new a()), 1, null);
    }
}
