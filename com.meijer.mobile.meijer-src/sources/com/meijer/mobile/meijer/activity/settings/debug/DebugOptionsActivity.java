package com.meijer.mobile.meijer.activity.settings.debug;

import Ki.LocalThemeScope;
import P0.e;
import V2.CreationExtras;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import com.fullstory.FS;
import com.fullstory.FSPage;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.settings.debug.C12631b;
import com.meijer.mobile.meijer.activity.settings.debug.C12642m;
import com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity;
import e.C13737e;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14898b;
import java.util.List;
import ki.C15170g0;
import ki.InterfaceC15168f0;
import ki.q1;
import kotlin.C17987a1;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import nk.l;
import pi.C16443d;
import qc.C16628i;
import qc.InterfaceC16624e;
import qc.PagerState;
import yo.MeijerUser;
import yr.C18370z;
import zl.AbstractC18503f;
import zl.AbstractC18529g;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0015¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0003R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010)\u001a\n &*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/debug/DebugOptionsActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "", "J1", "", "link", "L1", "(Ljava/lang/String;)V", "action", "K1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroy", "LTq/j;", "s", "LTq/j;", "I1", "()LTq/j;", "setStoreProvider", "(LTq/j;)V", "storeProvider", "Lcom/meijer/mobile/meijer/activity/settings/debug/m;", "t", "Lkotlin/Lazy;", "H1", "()Lcom/meijer/mobile/meijer/activity/settings/debug/m;", "debugOptionsViewModel", "LJu/a;", "u", "LJu/a;", "disposables", "Lcom/fullstory/FSPage;", "kotlin.jvm.PlatformType", "v", "Lcom/fullstory/FSPage;", "page", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class DebugOptionsActivity extends Hilt_DebugOptionsActivity {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public Tq.j storeProvider;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy debugOptionsViewModel = new androidx.view.e0(Reflection.b(C12642m.class), new d(this), new c(this), new e(null, this));

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables = new Ju.a();

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final FSPage page = FS.page("Debug Options");

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a, reason: collision with other inner class name */
        static final class C1768a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ DebugOptionsActivity f112808a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ PagerState f112809b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<String> f112810c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f112811d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ z1<C12642m.ViewState> f112812e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$a, reason: collision with other inner class name */
            static final class C1769a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f112813a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ DebugOptionsActivity f112814b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C1770a extends FunctionReferenceImpl implements Function0<Unit> {
                    C1770a(Object obj) {
                        super(0, obj, DebugOptionsActivity.class, "launchSearch", "launchSearch()V", 0);
                    }

                    public final void a() {
                        ((DebugOptionsActivity) this.receiver).J1();
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        a();
                        return Unit.f143329a;
                    }
                }

                C1769a(LocalThemeScope localThemeScope, DebugOptionsActivity debugOptionsActivity) {
                    this.f112813a = localThemeScope;
                    this.f112814b = debugOptionsActivity;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1743774310, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (DebugOptionsActivity.kt:96)");
                    }
                    LocalThemeScope localThemeScope = this.f112813a;
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f112814b);
                    final DebugOptionsActivity debugOptionsActivity = this.f112814b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DebugOptionsActivity.a.C1768a.C1769a.c(debugOptionsActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    Function0 function0 = (Function0) objB;
                    composer.P();
                    DebugOptionsActivity debugOptionsActivity2 = this.f112814b;
                    composer.startReplaceGroup(5004770);
                    boolean zD2 = composer.D(debugOptionsActivity2);
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new C1770a(debugOptionsActivity2);
                        composer.t(objB2);
                    }
                    composer.P();
                    C12637h.c(localThemeScope, null, function0, (Function0) ((KFunction) objB2), composer, LocalThemeScope.f17314g, 1);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(DebugOptionsActivity debugOptionsActivity) {
                    if (!debugOptionsActivity.onNavigateUp()) {
                        debugOptionsActivity.finish();
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$b */
            static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f112815a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ PagerState f112816b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ List<String> f112817c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC15783O f112818d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ DebugOptionsActivity f112819e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ z1<C12642m.ViewState> f112820f;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$b$a, reason: collision with other inner class name */
                static final class C1771a implements Function3<InterfaceC14898b, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f112821a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ PagerState f112822b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ List<String> f112823c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ InterfaceC15783O f112824d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ DebugOptionsActivity f112825e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ z1<C12642m.ViewState> f112826f;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$b$a$a, reason: collision with other inner class name */
                    static final class C1772a implements Function3<InterfaceC15168f0, Composer, Integer, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f112827a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ PagerState f112828b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ List<String> f112829c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ InterfaceC15783O f112830d;

                        /* renamed from: e, reason: collision with root package name */
                        final /* synthetic */ DebugOptionsActivity f112831e;

                        /* renamed from: f, reason: collision with root package name */
                        final /* synthetic */ z1<C12642m.ViewState> f112832f;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$b$a$a$a, reason: collision with other inner class name */
                        static final class C1773a implements Function2<Composer, Integer, Unit> {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ List<String> f112833a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ LocalThemeScope f112834b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ InterfaceC15168f0 f112835c;

                            /* renamed from: d, reason: collision with root package name */
                            final /* synthetic */ PagerState f112836d;

                            /* renamed from: e, reason: collision with root package name */
                            final /* synthetic */ InterfaceC15783O f112837e;

                            /* renamed from: f, reason: collision with root package name */
                            final /* synthetic */ DebugOptionsActivity f112838f;

                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$onCreate$1$1$2$1$1$1$1$1$1$1$1", f = "DebugOptionsActivity.kt", l = {124}, m = "invokeSuspend")
                            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$b$a$a$a$a, reason: collision with other inner class name */
                            static final class C1774a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                                /* renamed from: a, reason: collision with root package name */
                                int f112839a;

                                /* renamed from: b, reason: collision with root package name */
                                final /* synthetic */ PagerState f112840b;

                                /* renamed from: c, reason: collision with root package name */
                                final /* synthetic */ int f112841c;

                                /* renamed from: d, reason: collision with root package name */
                                final /* synthetic */ DebugOptionsActivity f112842d;

                                /* renamed from: e, reason: collision with root package name */
                                final /* synthetic */ String f112843e;

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C1774a(this.f112840b, this.f112841c, this.f112842d, this.f112843e, continuation);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C1774a(PagerState pagerState, int i10, DebugOptionsActivity debugOptionsActivity, String str, Continuation<? super C1774a> continuation) {
                                    super(2, continuation);
                                    this.f112840b = pagerState;
                                    this.f112841c = i10;
                                    this.f112842d = debugOptionsActivity;
                                    this.f112843e = str;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                                    return ((C1774a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    C1774a c1774a;
                                    Object objF = IntrinsicsKt.f();
                                    int i10 = this.f112839a;
                                    if (i10 != 0) {
                                        if (i10 == 1) {
                                            ResultKt.b(obj);
                                            c1774a = this;
                                        } else {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    } else {
                                        ResultKt.b(obj);
                                        PagerState pagerState = this.f112840b;
                                        int i11 = this.f112841c;
                                        this.f112839a = 1;
                                        c1774a = this;
                                        if (PagerState.w(pagerState, i11, 0.0f, c1774a, 2, null) == objF) {
                                            return objF;
                                        }
                                    }
                                    c1774a.f112842d.page.updateProperties(MapsKt.g(TuplesKt.a("active_tab", c1774a.f112843e)));
                                    return Unit.f143329a;
                                }
                            }

                            C1773a(List<String> list, LocalThemeScope localThemeScope, InterfaceC15168f0 interfaceC15168f0, PagerState pagerState, InterfaceC15783O interfaceC15783O, DebugOptionsActivity debugOptionsActivity) {
                                this.f112833a = list;
                                this.f112834b = localThemeScope;
                                this.f112835c = interfaceC15168f0;
                                this.f112836d = pagerState;
                                this.f112837e = interfaceC15783O;
                                this.f112838f = debugOptionsActivity;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit c(InterfaceC15783O interfaceC15783O, PagerState pagerState, int i10, DebugOptionsActivity debugOptionsActivity, String str) {
                                C15809k.d(interfaceC15783O, null, null, new C1774a(pagerState, i10, debugOptionsActivity, str, null), 3, null);
                                return Unit.f143329a;
                            }

                            public final void b(Composer composer, int i10) {
                                Composer composer2 = composer;
                                if ((i10 & 3) == 2 && composer2.j()) {
                                    composer2.K();
                                    return;
                                }
                                if (ComposerKt.M()) {
                                    ComposerKt.U(1146288908, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DebugOptionsActivity.kt:117)");
                                }
                                List<String> list = this.f112833a;
                                LocalThemeScope localThemeScope = this.f112834b;
                                InterfaceC15168f0 interfaceC15168f0 = this.f112835c;
                                final PagerState pagerState = this.f112836d;
                                final InterfaceC15783O interfaceC15783O = this.f112837e;
                                final DebugOptionsActivity debugOptionsActivity = this.f112838f;
                                final int i11 = 0;
                                for (Object obj : list) {
                                    int i12 = i11 + 1;
                                    if (i11 < 0) {
                                        CollectionsKt.w();
                                    }
                                    final String str = (String) obj;
                                    q1.TabTemplate tabTemplate = interfaceC15168f0.getTabTemplate();
                                    boolean z10 = pagerState.k() == i11;
                                    composer2.startReplaceGroup(-1224400529);
                                    boolean zD = composer2.D(interfaceC15783O) | composer2.V(pagerState) | composer2.d(i11) | composer2.D(debugOptionsActivity) | composer2.V(str);
                                    Object objB = composer2.B();
                                    if (zD || objB == Composer.INSTANCE.a()) {
                                        Function0 function0 = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.debug.d
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return DebugOptionsActivity.a.C1768a.b.C1771a.C1772a.C1773a.c(interfaceC15783O, pagerState, i11, debugOptionsActivity, str);
                                            }
                                        };
                                        composer2.t(function0);
                                        objB = function0;
                                    }
                                    composer2.P();
                                    vi.g.i(localThemeScope, tabTemplate, z10, (Function0) objB, true, str, composer2, LocalThemeScope.f17314g | 24576 | (q1.TabTemplate.f142416g << 3));
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
                                return Unit.f143329a;
                            }
                        }

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$b$a$a$b, reason: collision with other inner class name */
                        static final class C1775b implements Function4<InterfaceC16624e, Integer, Composer, Integer, Unit> {

                            /* renamed from: a, reason: collision with root package name */
                            final /* synthetic */ LocalThemeScope f112844a;

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ z1<C12642m.ViewState> f112845b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ DebugOptionsActivity f112846c;

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$b$a$a$b$a, reason: collision with other inner class name */
                            /* synthetic */ class C1776a extends FunctionReferenceImpl implements Function1<String, Unit> {
                                C1776a(Object obj) {
                                    super(1, obj, C12642m.class, "setSearch", "setSearch(Ljava/lang/String;)V", 0);
                                }

                                public final void a(String p02) {
                                    Intrinsics.j(p02, "p0");
                                    ((C12642m) this.receiver).A(p02);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                                    a(str);
                                    return Unit.f143329a;
                                }
                            }

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$b$a$a$b$b, reason: collision with other inner class name */
                            /* synthetic */ class C1777b extends FunctionReferenceImpl implements Function2<AbstractC18503f, AbstractC18529g, Unit> {
                                C1777b(Object obj) {
                                    super(2, obj, C12642m.class, "setFeatureState", "setFeatureState(Lcom/meijer/mobile/featureflag/Feature;Lcom/meijer/mobile/featureflag/FeatureFlag;)V", 0);
                                }

                                public final void a(AbstractC18503f p02, AbstractC18529g p12) {
                                    Intrinsics.j(p02, "p0");
                                    Intrinsics.j(p12, "p1");
                                    ((C12642m) this.receiver).y(p02, p12);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(AbstractC18503f abstractC18503f, AbstractC18529g abstractC18529g) {
                                    a(abstractC18503f, abstractC18529g);
                                    return Unit.f143329a;
                                }
                            }

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$b$a$a$b$c */
                            /* synthetic */ class c extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                                c(Object obj) {
                                    super(1, obj, C12642m.class, "setAllFeatureStates", "setAllFeatureStates(I)V", 0);
                                }

                                public final void a(int i10) {
                                    ((C12642m) this.receiver).x(i10);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                    a(num.intValue());
                                    return Unit.f143329a;
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
                                    return Unit.f143329a;
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
                                    return Unit.f143329a;
                                }
                            }

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$a$a$b$a$a$b$f */
                            /* synthetic */ class f extends FunctionReferenceImpl implements Function1<AbstractC12630a, Unit> {
                                f(Object obj) {
                                    super(1, obj, C12642m.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/settings/debug/DebugControlAction;)V", 0);
                                }

                                public final void a(AbstractC12630a p02) throws Throwable {
                                    Intrinsics.j(p02, "p0");
                                    ((C12642m) this.receiver).v(p02);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(AbstractC12630a abstractC12630a) throws Throwable {
                                    a(abstractC12630a);
                                    return Unit.f143329a;
                                }
                            }

                            C1775b(LocalThemeScope localThemeScope, z1<C12642m.ViewState> z1Var, DebugOptionsActivity debugOptionsActivity) {
                                this.f112844a = localThemeScope;
                                this.f112845b = z1Var;
                                this.f112846c = debugOptionsActivity;
                            }

                            public final void a(InterfaceC16624e AdsHorizontalPager, int i10, Composer composer, int i11) {
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
                                    ComposerKt.U(-1211576118, i12, -1, "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DebugOptionsActivity.kt:138)");
                                }
                                if (i10 == 0) {
                                    composer.startReplaceGroup(-388507960);
                                    LocalThemeScope localThemeScope = this.f112844a;
                                    String searchTerm = this.f112845b.getValue().getSearchTerm();
                                    List<C12631b.DebugFeatureFlag> listD = this.f112845b.getValue().d();
                                    C12642m c12642mH1 = this.f112846c.H1();
                                    composer.startReplaceGroup(5004770);
                                    boolean zD = composer.D(c12642mH1);
                                    Object objB = composer.B();
                                    if (zD || objB == Composer.INSTANCE.a()) {
                                        objB = new C1776a(c12642mH1);
                                        composer.t(objB);
                                    }
                                    composer.P();
                                    Function1 function1 = (Function1) ((KFunction) objB);
                                    C12642m c12642mH12 = this.f112846c.H1();
                                    composer.startReplaceGroup(5004770);
                                    boolean zD2 = composer.D(c12642mH12);
                                    Object objB2 = composer.B();
                                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                                        objB2 = new C1777b(c12642mH12);
                                        composer.t(objB2);
                                    }
                                    composer.P();
                                    Function2 function2 = (Function2) ((KFunction) objB2);
                                    C12642m c12642mH13 = this.f112846c.H1();
                                    composer.startReplaceGroup(5004770);
                                    boolean zD3 = composer.D(c12642mH13);
                                    Object objB3 = composer.B();
                                    if (zD3 || objB3 == Composer.INSTANCE.a()) {
                                        objB3 = new c(c12642mH13);
                                        composer.t(objB3);
                                    }
                                    composer.P();
                                    o0.i(localThemeScope, searchTerm, listD, null, function1, function2, (Function1) ((KFunction) objB3), composer, LocalThemeScope.f17314g, 4);
                                    composer.P();
                                } else if (i10 != 1) {
                                    composer.startReplaceGroup(842247384);
                                    composer.P();
                                } else {
                                    composer.startReplaceGroup(-388489163);
                                    LocalThemeScope localThemeScope2 = this.f112844a;
                                    MeijerUser userDetails = this.f112845b.getValue().getUserDetails();
                                    String fcmToken = this.f112845b.getValue().getFcmToken();
                                    DebugOptionsActivity debugOptionsActivity = this.f112846c;
                                    composer.startReplaceGroup(5004770);
                                    boolean zD4 = composer.D(debugOptionsActivity);
                                    Object objB4 = composer.B();
                                    if (zD4 || objB4 == Composer.INSTANCE.a()) {
                                        objB4 = new d(debugOptionsActivity);
                                        composer.t(objB4);
                                    }
                                    composer.P();
                                    Function1 function12 = (Function1) ((KFunction) objB4);
                                    DebugOptionsActivity debugOptionsActivity2 = this.f112846c;
                                    composer.startReplaceGroup(5004770);
                                    boolean zD5 = composer.D(debugOptionsActivity2);
                                    Object objB5 = composer.B();
                                    if (zD5 || objB5 == Composer.INSTANCE.a()) {
                                        objB5 = new e(debugOptionsActivity2);
                                        composer.t(objB5);
                                    }
                                    composer.P();
                                    Function1 function13 = (Function1) ((KFunction) objB5);
                                    C12642m c12642mH14 = this.f112846c.H1();
                                    composer.startReplaceGroup(5004770);
                                    boolean zD6 = composer.D(c12642mH14);
                                    Object objB6 = composer.B();
                                    if (zD6 || objB6 == Composer.INSTANCE.a()) {
                                        objB6 = new f(c12642mH14);
                                        composer.t(objB6);
                                    }
                                    composer.P();
                                    K.o(localThemeScope2, userDetails, fcmToken, null, function12, function13, (Function1) ((KFunction) objB6), composer, LocalThemeScope.f17314g, 4);
                                    composer.P();
                                }
                                if (ComposerKt.M()) {
                                    ComposerKt.T();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC16624e interfaceC16624e, Integer num, Composer composer, Integer num2) {
                                a(interfaceC16624e, num.intValue(), composer, num2.intValue());
                                return Unit.f143329a;
                            }
                        }

                        C1772a(LocalThemeScope localThemeScope, PagerState pagerState, List<String> list, InterfaceC15783O interfaceC15783O, DebugOptionsActivity debugOptionsActivity, z1<C12642m.ViewState> z1Var) {
                            this.f112827a = localThemeScope;
                            this.f112828b = pagerState;
                            this.f112829c = list;
                            this.f112830d = interfaceC15783O;
                            this.f112831e = debugOptionsActivity;
                            this.f112832f = z1Var;
                        }

                        public final void a(InterfaceC15168f0 Assemble, Composer composer, int i10) {
                            Intrinsics.j(Assemble, "$this$Assemble");
                            if (ComposerKt.M()) {
                                ComposerKt.U(-2142442328, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DebugOptionsActivity.kt:111)");
                            }
                            LocalThemeScope localThemeScope = this.f112827a;
                            PagerState pagerState = this.f112828b;
                            List<String> list = this.f112829c;
                            InterfaceC15783O interfaceC15783O = this.f112830d;
                            DebugOptionsActivity debugOptionsActivity = this.f112831e;
                            z1<C12642m.ViewState> z1Var = this.f112832f;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            C5800d.m mVarH = C5800d.f48779a.h();
                            e.Companion companion2 = P0.e.INSTANCE;
                            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
                            int iA = C5859f.a(composer, 0);
                            InterfaceC5884s interfaceC5884sR = composer.r();
                            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
                            Function0<InterfaceC5953g> function0A = companion3.a();
                            if (composer.k() == null) {
                                C5859f.c();
                            }
                            composer.F();
                            if (composer.h()) {
                                composer.I(function0A);
                            } else {
                                composer.s();
                            }
                            Composer composerA = D1.a(composer);
                            D1.c(composerA, measurePolicyA, companion3.e());
                            D1.c(composerA, interfaceC5884sR, companion3.g());
                            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
                            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                                composerA.t(Integer.valueOf(iA));
                                composerA.n(Integer.valueOf(iA), function2B);
                            }
                            D1.c(composerA, modifierE, companion3.f());
                            C14903g c14903g = C14903g.f139698a;
                            q1.TabRowTemplate tabRowTemplate = Assemble.getTabRowTemplate();
                            int iK = pagerState.k();
                            ComposableLambda composableLambdaC = ComposableLambdaKt.c(1146288908, true, new C1773a(list, localThemeScope, Assemble, pagerState, interfaceC15783O, debugOptionsActivity), composer, 54);
                            int i11 = LocalThemeScope.f17314g;
                            vi.g.k(localThemeScope, tabRowTemplate, iK, pagerState, null, composableLambdaC, composer, i11 | 196608 | (q1.TabRowTemplate.f142406g << 3), 8);
                            vi.g.e(localThemeScope, androidx.compose.foundation.b.d(companion, localThemeScope.getAdsColors().getAdsColorTransparent().getColor(), null, 2, null), q1.HorizontalPagerTemplate.y(Assemble.getHorizontalPagerTemplate(), null, false, 0.0f, null, companion2.l(), null, null, 111, null), list.size(), pagerState, ComposableLambdaKt.c(-1211576118, true, new C1775b(localThemeScope, z1Var, debugOptionsActivity), composer, 54), composer, i11 | 196608 | (q1.HorizontalPagerTemplate.f142306h << 6));
                            composer.v();
                            if (ComposerKt.M()) {
                                ComposerKt.T();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15168f0 interfaceC15168f0, Composer composer, Integer num) {
                            a(interfaceC15168f0, composer, num.intValue());
                            return Unit.f143329a;
                        }
                    }

                    C1771a(LocalThemeScope localThemeScope, PagerState pagerState, List<String> list, InterfaceC15783O interfaceC15783O, DebugOptionsActivity debugOptionsActivity, z1<C12642m.ViewState> z1Var) {
                        this.f112821a = localThemeScope;
                        this.f112822b = pagerState;
                        this.f112823c = list;
                        this.f112824d = interfaceC15783O;
                        this.f112825e = debugOptionsActivity;
                        this.f112826f = z1Var;
                    }

                    public final void a(InterfaceC14898b AdsBox, Composer composer, int i10) {
                        Intrinsics.j(AdsBox, "$this$AdsBox");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1913289727, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DebugOptionsActivity.kt:110)");
                        }
                        LocalThemeScope localThemeScope = this.f112821a;
                        Ki.Q.e(localThemeScope, C15170g0.f142068a, ComposableLambdaKt.c(-2142442328, true, new C1772a(localThemeScope, this.f112822b, this.f112823c, this.f112824d, this.f112825e, this.f112826f), composer, 54), composer, LocalThemeScope.f17314g | 384 | (C15170g0.f142069b << 3));
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14898b interfaceC14898b, Composer composer, Integer num) {
                        a(interfaceC14898b, composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                b(LocalThemeScope localThemeScope, PagerState pagerState, List<String> list, InterfaceC15783O interfaceC15783O, DebugOptionsActivity debugOptionsActivity, z1<C12642m.ViewState> z1Var) {
                    this.f112815a = localThemeScope;
                    this.f112816b = pagerState;
                    this.f112817c = list;
                    this.f112818d = interfaceC15783O;
                    this.f112819e = debugOptionsActivity;
                    this.f112820f = z1Var;
                }

                public final void a(InterfaceC14882C paddingValues, Composer composer, int i10) {
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
                        ComposerKt.U(-1339980513, i11, -1, "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (DebugOptionsActivity.kt:102)");
                    }
                    C16443d.c(this.f112815a, new q1.Box(androidx.compose.foundation.layout.J.d(androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues), 0.0f, 1, null), null, false, 6, null), ComposableLambdaKt.c(1913289727, true, new C1771a(this.f112815a, this.f112816b, this.f112817c, this.f112818d, this.f112819e, this.f112820f), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.Box.f142191d << 3));
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                    a(interfaceC14882C, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            C1768a(DebugOptionsActivity debugOptionsActivity, PagerState pagerState, List<String> list, InterfaceC15783O interfaceC15783O, z1<C12642m.ViewState> z1Var) {
                this.f112808a = debugOptionsActivity;
                this.f112809b = pagerState;
                this.f112810c = list;
                this.f112811d = interfaceC15783O;
                this.f112812e = z1Var;
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
                    ComposerKt.U(-2074890783, i11, -1, "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity.onCreate.<anonymous>.<anonymous> (DebugOptionsActivity.kt:91)");
                }
                C17987a1.a(C18370z.c(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), false, 1, null), null, ComposableLambdaKt.c(1743774310, true, new C1769a(AdsTheme, this.f112808a), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-1339980513, true, new b(AdsTheme, this.f112809b, this.f112810c, this.f112811d, this.f112808a, this.f112812e), composer, 54), composer, 384, 12582912, 131066);
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
                ComposerKt.U(-350544110, i10, -1, "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity.onCreate.<anonymous> (DebugOptionsActivity.kt:85)");
            }
            z1 z1VarB = o1.b(DebugOptionsActivity.this.H1().u(), null, composer, 0, 1);
            List listP = CollectionsKt.p("Feature Flags", "Stuff");
            PagerState pagerStateA = C16628i.a(0, composer, 0, 1);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composer);
                composer.t(objB);
            }
            Ki.K.b(null, ComposableLambdaKt.c(-2074890783, true, new C1768a(DebugOptionsActivity.this, pagerStateA, listP, (InterfaceC15783O) objB, z1VarB), composer, 54), composer, 48, 1);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.debug.DebugOptionsActivity$onNavigateToAction$1", f = "DebugOptionsActivity.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112847a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f112848b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ DebugOptionsActivity f112849c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, DebugOptionsActivity debugOptionsActivity, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f112848b = str;
            this.f112849c = debugOptionsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f112848b, this.f112849c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f112847a == 0) {
                ResultKt.b(obj);
                if (Intrinsics.e(this.f112848b, "action.com.meijer.mobile.personalized_shoppinglist")) {
                    Intent intent = new Intent(this.f112848b);
                    intent.putExtra("personalizedShoppingListProductType", new l.Personalized(nk.d.f152478a));
                    this.f112849c.startActivity(intent);
                } else {
                    this.f112849c.startActivity(new Intent(this.f112848b).setPackage(this.f112849c.getPackageName()));
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f112850f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f112850f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f112850f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f112851f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f112851f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f112851f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f112852f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f112853g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f112852f = function0;
            this.f112853g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f112852f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f112853g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C12642m H1() {
        return (C12642m) this.debugOptionsViewModel.getValue();
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
        Intrinsics.x("storeProvider");
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
            if (getFeatureManager().e(AbstractC18503f.t0.f172905h)) {
                startActivity(Bl.h.c(this, Pp.b.f26238a, null, null, false, null, 60, null));
                return;
            } else {
                startActivity(Bl.h.g(this, Pp.b.f26238a, null, null, false, null, 60, null));
                return;
            }
        }
        new Cl.a(this, 536872912).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K1(String action) {
        C15809k.d(C6173t.a(this), null, null, new b(action, this, null), 3, null);
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"CheckResult"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-350544110, true, new a()), 1, null);
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
