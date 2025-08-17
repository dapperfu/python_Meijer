package com.meijer.mobile.meijer.activity.settings.debug;

import Ji.LocalThemeScope;
import P0.e;
import V2.CreationExtras;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import com.fullstory.FS;
import com.fullstory.FSPage;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.settings.debug.C12505b;
import com.meijer.mobile.meijer.activity.settings.debug.C12516m;
import com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity;
import e.C13589e;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14810b;
import java.util.List;
import ji.C14936g0;
import ji.InterfaceC14934f0;
import ji.q1;
import kotlin.C17921a1;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import mk.l;
import oc.C16020i;
import oc.InterfaceC16016e;
import oc.PagerState;
import oi.C16078d;
import qv.C16648k;
import qv.InterfaceC16622O;
import wm.C17838h;
import yl.AbstractC18227f;
import yl.AbstractC18253g;
import yo.MeijerUser;
import yr.C18299z;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0015¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0003R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00109\u001a\n 6*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/debug/DebugOptionsActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "", "J1", "", "link", "L1", "(Ljava/lang/String;)V", "action", "K1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroy", "LTq/j;", "s", "LTq/j;", "I1", "()LTq/j;", "setStoreProvider", "(LTq/j;)V", "storeProvider", "Lwm/h;", "t", "Lwm/h;", "getMperksNotificationManager", "()Lwm/h;", "setMperksNotificationManager", "(Lwm/h;)V", "mperksNotificationManager", "Lcom/squareup/picasso/o;", "u", "Lcom/squareup/picasso/o;", "getPicasso", "()Lcom/squareup/picasso/o;", "setPicasso", "(Lcom/squareup/picasso/o;)V", "picasso", "Lcom/meijer/mobile/meijer/activity/settings/debug/m;", "v", "Lkotlin/Lazy;", "H1", "()Lcom/meijer/mobile/meijer/activity/settings/debug/m;", "debugOptionsViewModel", "LNu/a;", "w", "LNu/a;", "disposables", "Lcom/fullstory/FSPage;", "kotlin.jvm.PlatformType", "x", "Lcom/fullstory/FSPage;", "page", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class DebugOptionsActivity extends Hilt_DebugOptionsActivity {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public Tq.j storeProvider;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public C17838h mperksNotificationManager;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public com.squareup.picasso.o picasso;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy debugOptionsViewModel = new androidx.view.e0(Reflection.b(C12516m.class), new d(this), new c(this), new e(null, this));

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables = new Nu.a();

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final FSPage page = FS.page("Debug Options");

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a, reason: collision with other inner class name */
        static final class C1759a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ DebugOptionsActivity f111943a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PagerState f111944b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<String> f111945c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f111946d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ z1<C12516m.ViewState> f111947e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$a, reason: collision with other inner class name */
            static final class C1760a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111948a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ DebugOptionsActivity f111949b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C1761a extends FunctionReferenceImpl implements Function0<Unit> {
                    C1761a(Object obj) {
                        super(0, obj, DebugOptionsActivity.class, "launchSearch", "launchSearch()V", 0);
                    }

                    public final void a() {
                        ((DebugOptionsActivity) this.receiver).J1();
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        a();
                        return Unit.f142422a;
                    }
                }

                C1760a(LocalThemeScope localThemeScope, DebugOptionsActivity debugOptionsActivity) {
                    this.f111948a = localThemeScope;
                    this.f111949b = debugOptionsActivity;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1743774310, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (DebugOptionsActivity.kt:104)");
                    }
                    LocalThemeScope localThemeScope = this.f111948a;
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f111949b);
                    final DebugOptionsActivity debugOptionsActivity = this.f111949b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DebugOptionsActivity.a.C1759a.C1760a.c(debugOptionsActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    Function0 function0 = (Function0) objB;
                    composer.P();
                    DebugOptionsActivity debugOptionsActivity2 = this.f111949b;
                    composer.startReplaceGroup(5004770);
                    boolean zD2 = composer.D(debugOptionsActivity2);
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new C1761a(debugOptionsActivity2);
                        composer.t(objB2);
                    }
                    composer.P();
                    C12511h.c(localThemeScope, null, function0, (Function0) ((KFunction) objB2), composer, LocalThemeScope.f15770g, 1);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(DebugOptionsActivity debugOptionsActivity) {
                    if (!debugOptionsActivity.onNavigateUp()) {
                        debugOptionsActivity.finish();
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$b */
            static final class b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111950a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ PagerState f111951b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ List<String> f111952c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f111953d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ DebugOptionsActivity f111954e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ z1<C12516m.ViewState> f111955f;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$b$a, reason: collision with other inner class name */
                static final class C1762a implements Function3<InterfaceC14810b, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f111956a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ PagerState f111957b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ List<String> f111958c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ InterfaceC16622O f111959d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ DebugOptionsActivity f111960e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ z1<C12516m.ViewState> f111961f;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$b$a$a, reason: collision with other inner class name */
                    static final class C1763a implements Function3<InterfaceC14934f0, Composer, Integer, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f111962a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ PagerState f111963b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ List<String> f111964c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ InterfaceC16622O f111965d;

                        /* renamed from: e, reason: collision with root package name */
                        final /* synthetic */ DebugOptionsActivity f111966e;

                        /* renamed from: f, reason: collision with root package name */
                        final /* synthetic */ z1<C12516m.ViewState> f111967f;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$b$a$a$a, reason: collision with other inner class name */
                        static final class C1764a implements Function2<Composer, Integer, Unit> {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ List<String> f111968a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ LocalThemeScope f111969b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ InterfaceC14934f0 f111970c;

                            /* renamed from: d, reason: collision with root package name */
                            final /* synthetic */ PagerState f111971d;

                            /* renamed from: e, reason: collision with root package name */
                            final /* synthetic */ InterfaceC16622O f111972e;

                            /* renamed from: f, reason: collision with root package name */
                            final /* synthetic */ DebugOptionsActivity f111973f;

                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$onCreate$1$1$2$1$1$1$1$1$1$1$1", f = "DebugOptionsActivity.kt", l = {132}, m = "invokeSuspend")
                            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$b$a$a$a$a, reason: collision with other inner class name */
                            static final class C1765a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                                /* renamed from: a, reason: collision with root package name */
                                int f111974a;

                                /* renamed from: b, reason: collision with root package name */
                                final /* synthetic */ PagerState f111975b;

                                /* renamed from: c, reason: collision with root package name */
                                final /* synthetic */ int f111976c;

                                /* renamed from: d, reason: collision with root package name */
                                final /* synthetic */ DebugOptionsActivity f111977d;

                                /* renamed from: e, reason: collision with root package name */
                                final /* synthetic */ String f111978e;

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C1765a(this.f111975b, this.f111976c, this.f111977d, this.f111978e, continuation);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C1765a(PagerState pagerState, int i10, DebugOptionsActivity debugOptionsActivity, String str, Continuation<? super C1765a> continuation) {
                                    super(2, continuation);
                                    this.f111975b = pagerState;
                                    this.f111976c = i10;
                                    this.f111977d = debugOptionsActivity;
                                    this.f111978e = str;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                                    return ((C1765a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    C1765a c1765a;
                                    Object objF = IntrinsicsKt.f();
                                    int i10 = this.f111974a;
                                    if (i10 != 0) {
                                        if (i10 == 1) {
                                            ResultKt.b(obj);
                                            c1765a = this;
                                        } else {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    } else {
                                        ResultKt.b(obj);
                                        PagerState pagerState = this.f111975b;
                                        int i11 = this.f111976c;
                                        this.f111974a = 1;
                                        c1765a = this;
                                        if (PagerState.w(pagerState, i11, 0.0f, c1765a, 2, null) == objF) {
                                            return objF;
                                        }
                                    }
                                    c1765a.f111977d.page.updateProperties(MapsKt.g(TuplesKt.a("active_tab", c1765a.f111978e)));
                                    return Unit.f142422a;
                                }
                            }

                            C1764a(List<String> list, LocalThemeScope localThemeScope, InterfaceC14934f0 interfaceC14934f0, PagerState pagerState, InterfaceC16622O interfaceC16622O, DebugOptionsActivity debugOptionsActivity) {
                                this.f111968a = list;
                                this.f111969b = localThemeScope;
                                this.f111970c = interfaceC14934f0;
                                this.f111971d = pagerState;
                                this.f111972e = interfaceC16622O;
                                this.f111973f = debugOptionsActivity;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit c(InterfaceC16622O interfaceC16622O, PagerState pagerState, int i10, DebugOptionsActivity debugOptionsActivity, String str) {
                                C16648k.d(interfaceC16622O, null, null, new C1765a(pagerState, i10, debugOptionsActivity, str, null), 3, null);
                                return Unit.f142422a;
                            }

                            public final void b(Composer composer, int i10) {
                                Composer composer2 = composer;
                                if ((i10 & 3) == 2 && composer2.j()) {
                                    composer2.K();
                                    return;
                                }
                                if (ComposerKt.M()) {
                                    ComposerKt.U(1146288908, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DebugOptionsActivity.kt:125)");
                                }
                                List<String> list = this.f111968a;
                                LocalThemeScope localThemeScope = this.f111969b;
                                InterfaceC14934f0 interfaceC14934f0 = this.f111970c;
                                final PagerState pagerState = this.f111971d;
                                final InterfaceC16622O interfaceC16622O = this.f111972e;
                                final DebugOptionsActivity debugOptionsActivity = this.f111973f;
                                final int i11 = 0;
                                for (Object obj : list) {
                                    int i12 = i11 + 1;
                                    if (i11 < 0) {
                                        CollectionsKt.w();
                                    }
                                    final String str = (String) obj;
                                    q1.TabTemplate tabTemplate = interfaceC14934f0.getTabTemplate();
                                    boolean z10 = pagerState.k() == i11;
                                    composer2.startReplaceGroup(-1224400529);
                                    boolean zD = composer2.D(interfaceC16622O) | composer2.V(pagerState) | composer2.d(i11) | composer2.D(debugOptionsActivity) | composer2.V(str);
                                    Object objB = composer2.B();
                                    if (zD || objB == Composer.INSTANCE.a()) {
                                        Function0 function0 = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.d
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return DebugOptionsActivity.a.C1759a.b.C1762a.C1763a.C1764a.c(interfaceC16622O, pagerState, i11, debugOptionsActivity, str);
                                            }
                                        };
                                        composer2.t(function0);
                                        objB = function0;
                                    }
                                    composer2.P();
                                    ui.g.i(localThemeScope, tabTemplate, z10, (Function0) objB, true, str, composer2, LocalThemeScope.f15770g | 24576 | (q1.TabTemplate.f140161g << 3));
                                    composer2 = composer;
                                    i11 = i12;
                                }
                                if (ComposerKt.M()) {
                                    ComposerKt.T();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                b(composer, num.intValue());
                                return Unit.f142422a;
                            }
                        }

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$b$a$a$b, reason: collision with other inner class name */
                        static final class C1766b implements Function4<InterfaceC16016e, Integer, Composer, Integer, Unit> {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ LocalThemeScope f111979a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ z1<C12516m.ViewState> f111980b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ DebugOptionsActivity f111981c;

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$b$a$a$b$a, reason: collision with other inner class name */
                            /* synthetic */ class C1767a extends FunctionReferenceImpl implements Function1<String, Unit> {
                                C1767a(Object obj) {
                                    super(1, obj, C12516m.class, "setSearch", "setSearch(Ljava/lang/String;)V", 0);
                                }

                                public final void a(String p02) {
                                    Intrinsics.j(p02, "p0");
                                    ((C12516m) this.receiver).A(p02);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                                    a(str);
                                    return Unit.f142422a;
                                }
                            }

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$b$a$a$b$b, reason: collision with other inner class name */
                            /* synthetic */ class C1768b extends FunctionReferenceImpl implements Function2<AbstractC18227f, AbstractC18253g, Unit> {
                                C1768b(Object obj) {
                                    super(2, obj, C12516m.class, "setFeatureState", "setFeatureState(Lcom/meijer/mobile/featureflag/Feature;Lcom/meijer/mobile/featureflag/FeatureFlag;)V", 0);
                                }

                                public final void a(AbstractC18227f p02, AbstractC18253g p12) {
                                    Intrinsics.j(p02, "p0");
                                    Intrinsics.j(p12, "p1");
                                    ((C12516m) this.receiver).y(p02, p12);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(AbstractC18227f abstractC18227f, AbstractC18253g abstractC18253g) {
                                    a(abstractC18227f, abstractC18253g);
                                    return Unit.f142422a;
                                }
                            }

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$b$a$a$b$c */
                            /* synthetic */ class c extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                                c(Object obj) {
                                    super(1, obj, C12516m.class, "setAllFeatureStates", "setAllFeatureStates(I)V", 0);
                                }

                                public final void a(int i10) {
                                    ((C12516m) this.receiver).x(i10);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                    a(num.intValue());
                                    return Unit.f142422a;
                                }
                            }

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$b$a$a$b$d */
                            /* synthetic */ class d extends FunctionReferenceImpl implements Function1<String, Unit> {
                                d(Object obj) {
                                    super(1, obj, DebugOptionsActivity.class, "onNavigateToAction", "onNavigateToAction(Ljava/lang/String;)V", 0);
                                }

                                public final void a(String p02) {
                                    Intrinsics.j(p02, "p0");
                                    ((DebugOptionsActivity) this.receiver).K1(p02);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                                    a(str);
                                    return Unit.f142422a;
                                }
                            }

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$b$a$a$b$e */
                            /* synthetic */ class e extends FunctionReferenceImpl implements Function1<String, Unit> {
                                e(Object obj) {
                                    super(1, obj, DebugOptionsActivity.class, "testUniversalLink", "testUniversalLink(Ljava/lang/String;)V", 0);
                                }

                                public final void a(String p02) {
                                    Intrinsics.j(p02, "p0");
                                    ((DebugOptionsActivity) this.receiver).L1(p02);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                                    a(str);
                                    return Unit.f142422a;
                                }
                            }

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$b$a$a$b$f */
                            /* synthetic */ class f extends FunctionReferenceImpl implements Function1<AbstractC12504a, Unit> {
                                f(Object obj) {
                                    super(1, obj, C12516m.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/settings/debug/DebugControlAction;)V", 0);
                                }

                                public final void a(AbstractC12504a p02) throws Throwable {
                                    Intrinsics.j(p02, "p0");
                                    ((C12516m) this.receiver).v(p02);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(AbstractC12504a abstractC12504a) throws Throwable {
                                    a(abstractC12504a);
                                    return Unit.f142422a;
                                }
                            }

                            C1766b(LocalThemeScope localThemeScope, z1<C12516m.ViewState> z1Var, DebugOptionsActivity debugOptionsActivity) {
                                this.f111979a = localThemeScope;
                                this.f111980b = z1Var;
                                this.f111981c = debugOptionsActivity;
                            }

                            public final void a(InterfaceC16016e AdsHorizontalPager, int i10, Composer composer, int i11) {
                                int i12;
                                Intrinsics.j(AdsHorizontalPager, "$this$AdsHorizontalPager");
                                if ((i11 & 48) == 0) {
                                    i12 = (composer.d(i10) ? 32 : 16) | i11;
                                } else {
                                    i12 = i11;
                                }
                                if ((i12 & 145) == 144 && composer.j()) {
                                    composer.K();
                                    return;
                                }
                                if (ComposerKt.M()) {
                                    ComposerKt.U(-1211576118, i12, -1, "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DebugOptionsActivity.kt:146)");
                                }
                                if (i10 == 0) {
                                    composer.startReplaceGroup(-388507960);
                                    LocalThemeScope localThemeScope = this.f111979a;
                                    String searchTerm = this.f111980b.getValue().getSearchTerm();
                                    List<C12505b.DebugFeatureFlag> listD = this.f111980b.getValue().d();
                                    C12516m c12516mH1 = this.f111981c.H1();
                                    composer.startReplaceGroup(5004770);
                                    boolean zD = composer.D(c12516mH1);
                                    Object objB = composer.B();
                                    if (zD || objB == Composer.INSTANCE.a()) {
                                        objB = new C1767a(c12516mH1);
                                        composer.t(objB);
                                    }
                                    composer.P();
                                    Function1 function1 = (Function1) ((KFunction) objB);
                                    C12516m c12516mH12 = this.f111981c.H1();
                                    composer.startReplaceGroup(5004770);
                                    boolean zD2 = composer.D(c12516mH12);
                                    Object objB2 = composer.B();
                                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                                        objB2 = new C1768b(c12516mH12);
                                        composer.t(objB2);
                                    }
                                    composer.P();
                                    Function2 function2 = (Function2) ((KFunction) objB2);
                                    C12516m c12516mH13 = this.f111981c.H1();
                                    composer.startReplaceGroup(5004770);
                                    boolean zD3 = composer.D(c12516mH13);
                                    Object objB3 = composer.B();
                                    if (zD3 || objB3 == Composer.INSTANCE.a()) {
                                        objB3 = new c(c12516mH13);
                                        composer.t(objB3);
                                    }
                                    composer.P();
                                    p0.i(localThemeScope, searchTerm, listD, null, function1, function2, (Function1) ((KFunction) objB3), composer, LocalThemeScope.f15770g, 4);
                                    composer.P();
                                } else if (i10 != 1) {
                                    composer.startReplaceGroup(842350552);
                                    composer.P();
                                } else {
                                    composer.startReplaceGroup(-388489059);
                                    LocalThemeScope localThemeScope2 = this.f111979a;
                                    MeijerUser userDetails = this.f111980b.getValue().getUserDetails();
                                    String fcmToken = this.f111980b.getValue().getFcmToken();
                                    boolean isPicassoLoggingEnabled = this.f111980b.getValue().getIsPicassoLoggingEnabled();
                                    DebugOptionsActivity debugOptionsActivity = this.f111981c;
                                    composer.startReplaceGroup(5004770);
                                    boolean zD4 = composer.D(debugOptionsActivity);
                                    Object objB4 = composer.B();
                                    if (zD4 || objB4 == Composer.INSTANCE.a()) {
                                        objB4 = new d(debugOptionsActivity);
                                        composer.t(objB4);
                                    }
                                    composer.P();
                                    Function1 function12 = (Function1) ((KFunction) objB4);
                                    DebugOptionsActivity debugOptionsActivity2 = this.f111981c;
                                    composer.startReplaceGroup(5004770);
                                    boolean zD5 = composer.D(debugOptionsActivity2);
                                    Object objB5 = composer.B();
                                    if (zD5 || objB5 == Composer.INSTANCE.a()) {
                                        objB5 = new e(debugOptionsActivity2);
                                        composer.t(objB5);
                                    }
                                    composer.P();
                                    Function1 function13 = (Function1) ((KFunction) objB5);
                                    C12516m c12516mH14 = this.f111981c.H1();
                                    composer.startReplaceGroup(5004770);
                                    boolean zD6 = composer.D(c12516mH14);
                                    Object objB6 = composer.B();
                                    if (zD6 || objB6 == Composer.INSTANCE.a()) {
                                        objB6 = new f(c12516mH14);
                                        composer.t(objB6);
                                    }
                                    composer.P();
                                    K.o(localThemeScope2, userDetails, fcmToken, isPicassoLoggingEnabled, null, function12, function13, (Function1) ((KFunction) objB6), composer, LocalThemeScope.f15770g, 8);
                                    composer.P();
                                }
                                if (ComposerKt.M()) {
                                    ComposerKt.T();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC16016e interfaceC16016e, Integer num, Composer composer, Integer num2) {
                                a(interfaceC16016e, num.intValue(), composer, num2.intValue());
                                return Unit.f142422a;
                            }
                        }

                        C1763a(LocalThemeScope localThemeScope, PagerState pagerState, List<String> list, InterfaceC16622O interfaceC16622O, DebugOptionsActivity debugOptionsActivity, z1<C12516m.ViewState> z1Var) {
                            this.f111962a = localThemeScope;
                            this.f111963b = pagerState;
                            this.f111964c = list;
                            this.f111965d = interfaceC16622O;
                            this.f111966e = debugOptionsActivity;
                            this.f111967f = z1Var;
                        }

                        public final void a(InterfaceC14934f0 Assemble, Composer composer, int i10) {
                            Intrinsics.j(Assemble, "$this$Assemble");
                            if (ComposerKt.M()) {
                                ComposerKt.U(-2142442328, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DebugOptionsActivity.kt:119)");
                            }
                            LocalThemeScope localThemeScope = this.f111962a;
                            PagerState pagerState = this.f111963b;
                            List<String> list = this.f111964c;
                            InterfaceC16622O interfaceC16622O = this.f111965d;
                            DebugOptionsActivity debugOptionsActivity = this.f111966e;
                            z1<C12516m.ViewState> z1Var = this.f111967f;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            C5658d.m mVarH = C5658d.f48555a.h();
                            e.Companion companion2 = P0.e.INSTANCE;
                            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
                            int iA = C5717f.a(composer, 0);
                            InterfaceC5742s interfaceC5742sR = composer.r();
                            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
                            Function0<InterfaceC5811g> function0A = companion3.a();
                            if (composer.k() == null) {
                                C5717f.c();
                            }
                            composer.F();
                            if (composer.h()) {
                                composer.I(function0A);
                            } else {
                                composer.s();
                            }
                            Composer composerA = D1.a(composer);
                            D1.c(composerA, measurePolicyA, companion3.e());
                            D1.c(composerA, interfaceC5742sR, companion3.g());
                            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
                            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                                composerA.t(Integer.valueOf(iA));
                                composerA.n(Integer.valueOf(iA), function2B);
                            }
                            D1.c(composerA, modifierE, companion3.f());
                            C14815g c14815g = C14815g.f139108a;
                            q1.TabRowTemplate tabRowTemplate = Assemble.getTabRowTemplate();
                            int iK = pagerState.k();
                            ComposableLambda composableLambdaC = ComposableLambdaKt.c(1146288908, true, new C1764a(list, localThemeScope, Assemble, pagerState, interfaceC16622O, debugOptionsActivity), composer, 54);
                            int i11 = LocalThemeScope.f15770g;
                            ui.g.k(localThemeScope, tabRowTemplate, iK, pagerState, null, composableLambdaC, composer, i11 | 196608 | (q1.TabRowTemplate.f140151g << 3), 8);
                            ui.g.e(localThemeScope, androidx.compose.foundation.b.d(companion, localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), null, 2, null), q1.HorizontalPagerTemplate.y(Assemble.getHorizontalPagerTemplate(), null, false, 0.0f, null, companion2.l(), null, null, 111, null), list.size(), pagerState, ComposableLambdaKt.c(-1211576118, true, new C1766b(localThemeScope, z1Var, debugOptionsActivity), composer, 54), composer, i11 | 196608 | (q1.HorizontalPagerTemplate.f140051h << 6));
                            composer.v();
                            if (ComposerKt.M()) {
                                ComposerKt.T();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14934f0 interfaceC14934f0, Composer composer, Integer num) {
                            a(interfaceC14934f0, composer, num.intValue());
                            return Unit.f142422a;
                        }
                    }

                    C1762a(LocalThemeScope localThemeScope, PagerState pagerState, List<String> list, InterfaceC16622O interfaceC16622O, DebugOptionsActivity debugOptionsActivity, z1<C12516m.ViewState> z1Var) {
                        this.f111956a = localThemeScope;
                        this.f111957b = pagerState;
                        this.f111958c = list;
                        this.f111959d = interfaceC16622O;
                        this.f111960e = debugOptionsActivity;
                        this.f111961f = z1Var;
                    }

                    public final void a(InterfaceC14810b AdsBox, Composer composer, int i10) {
                        Intrinsics.j(AdsBox, "$this$AdsBox");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1913289727, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DebugOptionsActivity.kt:118)");
                        }
                        LocalThemeScope localThemeScope = this.f111956a;
                        Ji.Q.e(localThemeScope, C14936g0.f139813a, ComposableLambdaKt.c(-2142442328, true, new C1763a(localThemeScope, this.f111957b, this.f111958c, this.f111959d, this.f111960e, this.f111961f), composer, 54), composer, LocalThemeScope.f15770g | 384 | (C14936g0.f139814b << 3));
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14810b interfaceC14810b, Composer composer, Integer num) {
                        a(interfaceC14810b, composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                b(LocalThemeScope localThemeScope, PagerState pagerState, List<String> list, InterfaceC16622O interfaceC16622O, DebugOptionsActivity debugOptionsActivity, z1<C12516m.ViewState> z1Var) {
                    this.f111950a = localThemeScope;
                    this.f111951b = pagerState;
                    this.f111952c = list;
                    this.f111953d = interfaceC16622O;
                    this.f111954e = debugOptionsActivity;
                    this.f111955f = z1Var;
                }

                public final void a(InterfaceC14794C paddingValues, Composer composer, int i10) {
                    int i11;
                    Intrinsics.j(paddingValues, "paddingValues");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (composer.V(paddingValues) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1339980513, i11, -1, "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (DebugOptionsActivity.kt:110)");
                    }
                    C16078d.c(this.f111950a, new q1.Box(androidx.compose.foundation.layout.J.d(androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues), 0.0f, 1, null), null, false, 6, null), ComposableLambdaKt.c(1913289727, true, new C1762a(this.f111950a, this.f111951b, this.f111952c, this.f111953d, this.f111954e, this.f111955f), composer, 54), composer, LocalThemeScope.f15770g | 384 | (q1.Box.f139936d << 3));
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
                    a(interfaceC14794C, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            C1759a(DebugOptionsActivity debugOptionsActivity, PagerState pagerState, List<String> list, InterfaceC16622O interfaceC16622O, z1<C12516m.ViewState> z1Var) {
                this.f111943a = debugOptionsActivity;
                this.f111944b = pagerState;
                this.f111945c = list;
                this.f111946d = interfaceC16622O;
                this.f111947e = z1Var;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2074890783, i11, -1, "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity.onCreate.<anonymous>.<anonymous> (DebugOptionsActivity.kt:99)");
                }
                C17921a1.a(C18299z.c(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), false, 1, null), null, ComposableLambdaKt.c(1743774310, true, new C1760a(AdsTheme, this.f111943a), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-1339980513, true, new b(AdsTheme, this.f111944b, this.f111945c, this.f111946d, this.f111943a, this.f111947e), composer, 54), composer, 384, 12582912, 131066);
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
                ComposerKt.U(-350544110, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity.onCreate.<anonymous> (DebugOptionsActivity.kt:93)");
            }
            z1 z1VarB = o1.b(DebugOptionsActivity.this.H1().u(), null, composer, 0, 1);
            List listP = CollectionsKt.p("Feature Flags", "Stuff");
            PagerState pagerStateA = C16020i.a(0, composer, 0, 1);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composer);
                composer.t(objB);
            }
            Ji.K.b(null, ComposableLambdaKt.c(-2074890783, true, new C1759a(DebugOptionsActivity.this, pagerStateA, listP, (InterfaceC16622O) objB, z1VarB), composer, 54), composer, 48, 1);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$onNavigateToAction$1", f = "DebugOptionsActivity.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111982a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f111983b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ DebugOptionsActivity f111984c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, DebugOptionsActivity debugOptionsActivity, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f111983b = str;
            this.f111984c = debugOptionsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f111983b, this.f111984c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f111982a == 0) {
                ResultKt.b(obj);
                if (Intrinsics.e(this.f111983b, "action.com.meijer.mobile.personalized_shoppinglist")) {
                    Intent intent = new Intent(this.f111983b);
                    intent.putExtra("personalizedShoppingListProductType", new l.Personalized(mk.d.f150120a));
                    this.f111984c.startActivity(intent);
                } else {
                    this.f111984c.startActivity(new Intent(this.f111983b).setPackage(this.f111984c.getPackageName()));
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111985f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f111985f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f111985f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111986f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f111986f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f111986f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f111987f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111988g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f111987f = function0;
            this.f111988g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f111987f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f111988g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C12516m H1() {
        return (C12516m) this.debugOptionsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L1(String link) {
        startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(link)));
    }

    public final Tq.j I1() {
        Tq.j jVar = this.storeProvider;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.y("storeProvider");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        this.disposables.d();
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J1() {
        if (I1().d()) {
            if (getFeatureManager().e(AbstractC18227f.t0.f170605h)) {
                startActivity(Al.h.c(this, Pp.b.f28356a, null, null, false, null, 60, null));
                return;
            } else {
                startActivity(Al.h.g(this, Pp.b.f28356a, null, null, false, null, 60, null));
                return;
            }
        }
        new Bl.a(this, 536872912).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K1(String action) {
        C16648k.d(C6031t.a(this), null, null, new b(action, this, null), 3, null);
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"CheckResult"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-350544110, true, new a()), 1, null);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.page.end();
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.page.start();
    }
}
