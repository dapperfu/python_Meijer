package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.view.InterfaceC6172s;
import c1.InterfaceC6470a;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16334c;
import p1.C16336e;
import x4.InterfaceC18089i;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00168\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\" \u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019\" \u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u00168\u0006¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b)\u0010\u0019\" \u0010/\u001a\b\u0012\u0004\u0012\u00020+0\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u0019¨\u00060²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "Lkotlin/Function0;", "", "content", "a", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroid/content/Context;", "context", "Lp1/e;", "n", "(Landroid/content/Context;Landroidx/compose/runtime/Composer;I)Lp1/e;", "Landroid/content/res/Configuration;", "configuration", "Lp1/c;", "m", "(Landroid/content/Context;Landroid/content/res/Configuration;Landroidx/compose/runtime/Composer;I)Lp1/c;", "", "name", "", "l", "(Ljava/lang/String;)Ljava/lang/Void;", "Landroidx/compose/runtime/F0;", "Landroidx/compose/runtime/F0;", "f", "()Landroidx/compose/runtime/F0;", "LocalConfiguration", "b", "g", "LocalContext", "c", "h", "LocalImageVectorCache", "d", "i", "LocalResourceIdCache", "Lx4/i;", "e", "j", "LocalSavedStateRegistryOwner", "Landroid/view/View;", "k", "LocalView", "Landroidx/lifecycle/s;", "getLocalLifecycleOwner", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<Configuration> f51953a = androidx.compose.runtime.r.d(null, a.f51959f, 1, null);

    /* renamed from: b, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<Context> f51954b = androidx.compose.runtime.r.f(b.f51960f);

    /* renamed from: c, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<C16334c> f51955c = androidx.compose.runtime.r.f(c.f51961f);

    /* renamed from: d, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<C16336e> f51956d = androidx.compose.runtime.r.f(d.f51962f);

    /* renamed from: e, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<InterfaceC18089i> f51957e = androidx.compose.runtime.r.f(e.f51963f);

    /* renamed from: f, reason: collision with root package name */
    private static final androidx.compose.runtime.F0<View> f51958f = androidx.compose.runtime.r.f(f.f51964f);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/res/Configuration;", "c", "()Landroid/content/res/Configuration;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function0<Configuration> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f51959f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.l("LocalConfiguration");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Context;", "c", "()Landroid/content/Context;"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function0<Context> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f51960f = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.l("LocalContext");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp1/c;", "c", "()Lp1/c;"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function0<C16334c> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f51961f = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C16334c invoke() {
            AndroidCompositionLocals_androidKt.l("LocalImageVectorCache");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp1/e;", "c", "()Lp1/e;"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function0<C16336e> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f51962f = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C16336e invoke() {
            AndroidCompositionLocals_androidKt.l("LocalResourceIdCache");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx4/i;", "c", "()Lx4/i;"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function0<InterfaceC18089i> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f51963f = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC18089i invoke() {
            AndroidCompositionLocals_androidKt.l("LocalSavedStateRegistryOwner");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "c", "()Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
    static final class f extends Lambda implements Function0<View> {

        /* renamed from: f, reason: collision with root package name */
        public static final f f51964f = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            AndroidCompositionLocals_androidKt.l("LocalView");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Configuration;", "it", "", "a", "(Landroid/content/res/Configuration;)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends Lambda implements Function1<Configuration, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Configuration> f51965f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC5872l0<Configuration> interfaceC5872l0) {
            super(1);
            this.f51965f = interfaceC5872l0;
        }

        public final void a(Configuration configuration) {
            AndroidCompositionLocals_androidKt.c(this.f51965f, new Configuration(configuration));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
            a(configuration);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class h extends Lambda implements Function1<androidx.compose.runtime.F, androidx.compose.runtime.E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6046x0 f51966f;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$h$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements androidx.compose.runtime.E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6046x0 f51967a;

            public a(C6046x0 c6046x0) {
                this.f51967a = c6046x0;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                this.f51967a.c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C6046x0 c6046x0) {
            super(1);
            this.f51966f = c6046x0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.E invoke(androidx.compose.runtime.F f10) {
            return new a(this.f51966f);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f51968f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ T f51969g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f51970h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(AndroidComposeView androidComposeView, T t10, Function2<? super Composer, ? super Integer, Unit> function2) {
            super(2);
            this.f51968f = androidComposeView;
            this.f51969g = t10;
            this.f51970h = function2;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1471621628, i10, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:121)");
            }
            C6034t0.a(this.f51968f, this.f51969g, this.f51970h, composer, 0);
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f51971f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f51972g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f51973h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(AndroidComposeView androidComposeView, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f51971f = androidComposeView;
            this.f51972g = function2;
            this.f51973h = i10;
        }

        public final void a(Composer composer, int i10) {
            AndroidCompositionLocals_androidKt.a(this.f51971f, this.f51972g, composer, androidx.compose.runtime.J0.a(this.f51973h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class k extends Lambda implements Function1<androidx.compose.runtime.F, androidx.compose.runtime.E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f51974f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ l f51975g;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$k$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements androidx.compose.runtime.E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f51976a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f51977b;

            public a(Context context, l lVar) {
                this.f51976a = context;
                this.f51977b = lVar;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                this.f51976a.getApplicationContext().unregisterComponentCallbacks(this.f51977b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Context context, l lVar) {
            super(1);
            this.f51974f = context;
            this.f51975g = lVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.E invoke(androidx.compose.runtime.F f10) {
            this.f51974f.getApplicationContext().registerComponentCallbacks(this.f51975g);
            return new a(this.f51974f, this.f51975g);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$l", "Landroid/content/ComponentCallbacks2;", "Landroid/content/res/Configuration;", "configuration", "", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "level", "onTrimMemory", "(I)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l implements ComponentCallbacks2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Configuration f51978a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C16334c f51979b;

        l(Configuration configuration, C16334c c16334c) {
            this.f51978a = configuration;
            this.f51979b = c16334c;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            this.f51979b.c(this.f51978a.updateFrom(configuration));
            this.f51978a.setTo(configuration);
        }

        @Override // android.content.ComponentCallbacks
        @Deprecated
        public void onLowMemory() {
            this.f51979b.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            this.f51979b.a();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class m extends Lambda implements Function1<androidx.compose.runtime.F, androidx.compose.runtime.E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f51980f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ n f51981g;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$m$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements androidx.compose.runtime.E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f51982a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f51983b;

            public a(Context context, n nVar) {
                this.f51982a = context;
                this.f51983b = nVar;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                this.f51982a.getApplicationContext().unregisterComponentCallbacks(this.f51983b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Context context, n nVar) {
            super(1);
            this.f51980f = context;
            this.f51981g = nVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.E invoke(androidx.compose.runtime.F f10) {
            this.f51980f.getApplicationContext().registerComponentCallbacks(this.f51981g);
            return new a(this.f51980f, this.f51981g);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$n", "Landroid/content/ComponentCallbacks2;", "Landroid/content/res/Configuration;", "newConfig", "", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "level", "onTrimMemory", "(I)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class n implements ComponentCallbacks2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C16336e f51984a;

        n(C16336e c16336e) {
            this.f51984a = c16336e;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
            this.f51984a.a();
        }

        @Override // android.content.ComponentCallbacks
        @Deprecated
        public void onLowMemory() {
            this.f51984a.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            this.f51984a.a();
        }
    }

    public static final void a(AndroidComposeView androidComposeView, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1396852028);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.D(androidComposeView) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(function2) ? 32 : 16;
        }
        if (composerStartRestartGroup.p((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(1396852028, i11, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:76)");
            }
            Context context = androidComposeView.getContext();
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = androidx.compose.runtime.t1.e(new Configuration(context.getResources().getConfiguration()), null, 2, null);
                composerStartRestartGroup.t(objB);
            }
            InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new g(interfaceC5872l0);
                composerStartRestartGroup.t(objB2);
            }
            androidComposeView.setConfigurationChangeObserver((Function1) objB2);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = new T(context);
                composerStartRestartGroup.t(objB3);
            }
            T t10 = (T) objB3;
            AndroidComposeView.C5973b viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object objB4 = composerStartRestartGroup.B();
            if (objB4 == companion.a()) {
                objB4 = C6052z0.b(androidComposeView, viewTreeOwners.getSavedStateRegistryOwner());
                composerStartRestartGroup.t(objB4);
            }
            C6046x0 c6046x0 = (C6046x0) objB4;
            Unit unit = Unit.f143329a;
            boolean zD = composerStartRestartGroup.D(c6046x0);
            Object objB5 = composerStartRestartGroup.B();
            if (zD || objB5 == companion.a()) {
                objB5 = new h(c6046x0);
                composerStartRestartGroup.t(objB5);
            }
            androidx.compose.runtime.J.c(unit, (Function1) objB5, composerStartRestartGroup, 6);
            Object objB6 = composerStartRestartGroup.B();
            if (objB6 == companion.a()) {
                objB6 = H0.f52043a.a(context) ? new C6037u0(androidComposeView.getView()) : new X0();
                composerStartRestartGroup.t(objB6);
            }
            androidx.compose.runtime.r.b(new androidx.compose.runtime.G0[]{f51953a.d(b(interfaceC5872l0)), f51954b.d(context), S2.c.c().d(viewTreeOwners.getLifecycleOwner()), f51957e.d(viewTreeOwners.getSavedStateRegistryOwner()), L0.j.e().d(c6046x0), f51958f.d(androidComposeView.getView()), f51955c.d(m(context, b(interfaceC5872l0), composerStartRestartGroup, 0)), f51956d.d(n(context, composerStartRestartGroup, 0)), C6034t0.o().d(Boolean.valueOf(((Boolean) composerStartRestartGroup.o(C6034t0.p())).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release())), C6034t0.k().d((InterfaceC6470a) objB6)}, ComposableLambdaKt.c(1471621628, true, new i(androidComposeView, t10, function2), composerStartRestartGroup, 54), composerStartRestartGroup, androidx.compose.runtime.G0.f50200i | 48);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new j(androidComposeView, function2, i10));
        }
    }

    public static final androidx.compose.runtime.F0<Configuration> f() {
        return f51953a;
    }

    public static final androidx.compose.runtime.F0<Context> g() {
        return f51954b;
    }

    public static final androidx.compose.runtime.F0<C16334c> h() {
        return f51955c;
    }

    public static final androidx.compose.runtime.F0<C16336e> i() {
        return f51956d;
    }

    public static final androidx.compose.runtime.F0<InterfaceC18089i> j() {
        return f51957e;
    }

    public static final androidx.compose.runtime.F0<View> k() {
        return f51958f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void l(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    private static final Configuration b(InterfaceC5872l0<Configuration> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC5872l0<Configuration> interfaceC5872l0, Configuration configuration) {
        interfaceC5872l0.setValue(configuration);
    }

    public static final androidx.compose.runtime.F0<InterfaceC6172s> getLocalLifecycleOwner() {
        return S2.c.c();
    }

    private static final C16334c m(Context context, Configuration configuration, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-485908294, i10, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:157)");
        }
        Object objB = composer.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            objB = new C16334c();
            composer.t(objB);
        }
        C16334c c16334c = (C16334c) objB;
        Object objB2 = composer.B();
        Object obj = objB2;
        if (objB2 == companion.a()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            composer.t(configuration2);
            obj = configuration2;
        }
        Configuration configuration3 = (Configuration) obj;
        Object objB3 = composer.B();
        if (objB3 == companion.a()) {
            objB3 = new l(configuration3, c16334c);
            composer.t(objB3);
        }
        l lVar = (l) objB3;
        boolean zD = composer.D(context);
        Object objB4 = composer.B();
        if (zD || objB4 == companion.a()) {
            objB4 = new k(context, lVar);
            composer.t(objB4);
        }
        androidx.compose.runtime.J.c(c16334c, (Function1) objB4, composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c16334c;
    }

    private static final C16336e n(Context context, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-1348507246, i10, -1, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:127)");
        }
        Object objB = composer.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            objB = new C16336e();
            composer.t(objB);
        }
        C16336e c16336e = (C16336e) objB;
        Object objB2 = composer.B();
        if (objB2 == companion.a()) {
            objB2 = new n(c16336e);
            composer.t(objB2);
        }
        n nVar = (n) objB2;
        boolean zD = composer.D(context);
        Object objB3 = composer.B();
        if (zD || objB3 == companion.a()) {
            objB3 = new m(context, nVar);
            composer.t(objB3);
        }
        androidx.compose.runtime.J.c(c16336e, (Function1) objB3, composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c16336e;
    }
}
