package androidx.compose.ui.viewinterop;

import H1.t;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.runtime.AbstractC5727k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.InterfaceC6030s;
import j1.C14832a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aM\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a{\u0010\r\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a^\u0010 \u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a#\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010$\"(\u0010)\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0002\b%8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroid/view/View;", "T", "Lkotlin/Function1;", "Landroid/content/Context;", "factory", "Landroidx/compose/ui/Modifier;", "modifier", "", "update", "a", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "onReset", "onRelease", "b", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "d", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "Landroidx/compose/runtime/D1;", "", "compositeKeyHash", "LH1/d;", "density", "Landroidx/lifecycle/s;", "lifecycleOwner", "Lx4/i;", "savedStateRegistryOwner", "LH1/t;", "layoutDirection", "Landroidx/compose/runtime/s;", "compositionLocalMap", "g", "(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;ILH1/d;Landroidx/lifecycle/s;Lx4/i;LH1/t;Landroidx/compose/runtime/s;)V", "Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "f", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function1;", "e", "()Lkotlin/jvm/functions/Function1;", "NoOpUpdate", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Function1<View, Unit> f52791a = h.f52809f;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Context, T> f52792f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f52793g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f52794h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f52795i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f52796j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super Context, ? extends T> function1, Modifier modifier, Function1<? super T, Unit> function12, int i10, int i11) {
            super(2);
            this.f52792f = function1;
            this.f52793g = modifier;
            this.f52794h = function12;
            this.f52795i = i10;
            this.f52796j = i11;
        }

        public final void a(Composer composer, int i10) {
            e.a(this.f52792f, this.f52793g, this.f52794h, composer, J0.a(this.f52795i | 1), this.f52796j);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "", "it", "a", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function1;)V"}, k = 3, mv = {1, 9, 0})
    static final class b<T> extends Lambda implements Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f52797f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
            a(layoutNode, (Function1) obj);
            return Unit.f142422a;
        }

        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function1) {
            e.f(layoutNode).setResetBlock(function1);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "", "it", "a", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function1;)V"}, k = 3, mv = {1, 9, 0})
    static final class c<T> extends Lambda implements Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f52798f = new c();

        c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
            a(layoutNode, (Function1) obj);
            return Unit.f142422a;
        }

        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function1) {
            e.f(layoutNode).setUpdateBlock(function1);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "", "it", "a", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function1;)V"}, k = 3, mv = {1, 9, 0})
    static final class d<T> extends Lambda implements Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f52799f = new d();

        d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
            a(layoutNode, (Function1) obj);
            return Unit.f142422a;
        }

        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function1) {
            e.f(layoutNode).setReleaseBlock(function1);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "", "it", "a", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function1;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.viewinterop.e$e, reason: collision with other inner class name */
    static final class C1078e<T> extends Lambda implements Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final C1078e f52800f = new C1078e();

        C1078e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
            a(layoutNode, (Function1) obj);
            return Unit.f142422a;
        }

        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function1) {
            e.f(layoutNode).setUpdateBlock(function1);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "", "it", "a", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function1;)V"}, k = 3, mv = {1, 9, 0})
    static final class f<T> extends Lambda implements Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final f f52801f = new f();

        f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
            a(layoutNode, (Function1) obj);
            return Unit.f142422a;
        }

        public final void a(LayoutNode layoutNode, Function1<? super T, Unit> function1) {
            e.f(layoutNode).setReleaseBlock(function1);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Context, T> f52802f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f52803g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f52804h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f52805i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f52806j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f52807k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f52808l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Function1<? super Context, ? extends T> function1, Modifier modifier, Function1<? super T, Unit> function12, Function1<? super T, Unit> function13, Function1<? super T, Unit> function14, int i10, int i11) {
            super(2);
            this.f52802f = function1;
            this.f52803g = modifier;
            this.f52804h = function12;
            this.f52805i = function13;
            this.f52806j = function14;
            this.f52807k = i10;
            this.f52808l = i11;
        }

        public final void a(Composer composer, int i10) {
            e.b(this.f52802f, this.f52803g, this.f52804h, this.f52805i, this.f52806j, composer, J0.a(this.f52807k | 1), this.f52808l);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    static final class h extends Lambda implements Function1<View, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final h f52809f = new h();

        h() {
            super(1);
        }

        public final void a(View view) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "c", "()Landroidx/compose/ui/node/LayoutNode;"}, k = 3, mv = {1, 9, 0})
    static final class i extends Lambda implements Function0<LayoutNode> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f52810f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Context, T> f52811g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ AbstractC5727k f52812h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ L0.h f52813i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f52814j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ View f52815k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(Context context, Function1<? super Context, ? extends T> function1, AbstractC5727k abstractC5727k, L0.h hVar, int i10, View view) {
            super(0);
            this.f52810f = context;
            this.f52811g = function1;
            this.f52812h = abstractC5727k;
            this.f52813i = hVar;
            this.f52814j = i10;
            this.f52815k = view;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final LayoutNode invoke() {
            Context context = this.f52810f;
            Function1<Context, T> function1 = this.f52811g;
            AbstractC5727k abstractC5727k = this.f52812h;
            L0.h hVar = this.f52813i;
            int i10 = this.f52814j;
            KeyEvent.Callback callback = this.f52815k;
            Intrinsics.h(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
            return new ViewFactoryHolder(context, function1, abstractC5727k, hVar, i10, (Owner) callback).getLayoutNode();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/Modifier;", "it", "", "a", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/Modifier;)V"}, k = 3, mv = {1, 9, 0})
    static final class j extends Lambda implements Function2<LayoutNode, Modifier, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final j f52816f = new j();

        j() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Modifier modifier) {
            a(layoutNode, modifier);
            return Unit.f142422a;
        }

        public final void a(LayoutNode layoutNode, Modifier modifier) {
            e.f(layoutNode).setModifier(modifier);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "LH1/d;", "it", "", "a", "(Landroidx/compose/ui/node/LayoutNode;LH1/d;)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends Lambda implements Function2<LayoutNode, H1.d, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final k f52817f = new k();

        k() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, H1.d dVar) {
            a(layoutNode, dVar);
            return Unit.f142422a;
        }

        public final void a(LayoutNode layoutNode, H1.d dVar) {
            e.f(layoutNode).setDensity(dVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/lifecycle/s;", "it", "", "a", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/lifecycle/s;)V"}, k = 3, mv = {1, 9, 0})
    static final class l extends Lambda implements Function2<LayoutNode, InterfaceC6030s, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final l f52818f = new l();

        l() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, InterfaceC6030s interfaceC6030s) {
            a(layoutNode, interfaceC6030s);
            return Unit.f142422a;
        }

        public final void a(LayoutNode layoutNode, InterfaceC6030s interfaceC6030s) {
            e.f(layoutNode).setLifecycleOwner(interfaceC6030s);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Lx4/i;", "it", "", "a", "(Landroidx/compose/ui/node/LayoutNode;Lx4/i;)V"}, k = 3, mv = {1, 9, 0})
    static final class m extends Lambda implements Function2<LayoutNode, x4.i, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final m f52819f = new m();

        m() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, x4.i iVar) {
            a(layoutNode, iVar);
            return Unit.f142422a;
        }

        public final void a(LayoutNode layoutNode, x4.i iVar) {
            e.f(layoutNode).setSavedStateRegistryOwner(iVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "LH1/t;", "it", "", "a", "(Landroidx/compose/ui/node/LayoutNode;LH1/t;)V"}, k = 3, mv = {1, 9, 0})
    static final class n extends Lambda implements Function2<LayoutNode, t, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final n f52820f = new n();

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[t.values().length];
                try {
                    iArr[t.f12006a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[t.f12007b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        n() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, t tVar) {
            a(layoutNode, tVar);
            return Unit.f142422a;
        }

        public final void a(LayoutNode layoutNode, t tVar) {
            ViewFactoryHolder viewFactoryHolderF = e.f(layoutNode);
            int i10 = a.$EnumSwitchMapping$0[tVar.ordinal()];
            int i11 = 1;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i11 = 0;
            }
            viewFactoryHolderF.setLayoutDirection(i11);
        }
    }

    public static final <T extends View> void a(Function1<? super Context, ? extends T> function1, Modifier modifier, Function1<? super T, Unit> function12, Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        Function1<? super T, Unit> function13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1783766393);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.D(function1) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(function12) ? 256 : 128;
        }
        if (composerStartRestartGroup.p((i12 & 147) != 146, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            Function1<? super T, Unit> function14 = i14 != 0 ? f52791a : function12;
            if (ComposerKt.M()) {
                ComposerKt.U(-1783766393, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:104)");
            }
            b(function1, modifier3, null, f52791a, function14, composerStartRestartGroup, (i12 & 14) | 3072 | (i12 & 112) | (57344 & (i12 << 6)), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
            function13 = function14;
        } else {
            composerStartRestartGroup.K();
            modifier2 = modifier;
            function13 = function12;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new a(function1, modifier2, function13, i10, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends android.view.View> void b(kotlin.jvm.functions.Function1<? super android.content.Context, ? extends T> r24, androidx.compose.ui.Modifier r25, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r26, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r27, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.e.b(kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Function1<View, Unit> e() {
        return f52791a;
    }

    private static final <T extends View> void g(Composer composer, Modifier modifier, int i10, H1.d dVar, InterfaceC6030s interfaceC6030s, x4.i iVar, t tVar, InterfaceC5742s interfaceC5742s) {
        InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
        D1.c(composer, interfaceC5742s, companion.g());
        D1.c(composer, modifier, j.f52816f);
        D1.c(composer, dVar, k.f52817f);
        D1.c(composer, interfaceC6030s, l.f52818f);
        D1.c(composer, iVar, m.f52819f);
        D1.c(composer, tVar, n.f52820f);
        Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
        if (composer.h() || !Intrinsics.e(composer.B(), Integer.valueOf(i10))) {
            composer.t(Integer.valueOf(i10));
            composer.n(Integer.valueOf(i10), function2B);
        }
    }

    private static final <T extends View> Function0<LayoutNode> d(Function1<? super Context, ? extends T> function1, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(2030558801, i10, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:252)");
        }
        boolean z10 = false;
        int iA = C5717f.a(composer, 0);
        Context context = (Context) composer.o(AndroidCompositionLocals_androidKt.g());
        AbstractC5727k abstractC5727kD = C5717f.d(composer, 0);
        L0.h hVar = (L0.h) composer.o(L0.j.e());
        View view = (View) composer.o(AndroidCompositionLocals_androidKt.k());
        boolean zD = composer.D(context);
        if ((((i10 & 14) ^ 6) > 4 && composer.V(function1)) || (i10 & 6) == 4) {
            z10 = true;
        }
        boolean zD2 = zD | z10 | composer.D(abstractC5727kD) | composer.D(hVar) | composer.d(iA) | composer.D(view);
        Object objB = composer.B();
        if (zD2 || objB == Composer.INSTANCE.a()) {
            Object iVar = new i(context, function1, abstractC5727kD, hVar, iA, view);
            composer.t(iVar);
            objB = iVar;
        }
        Function0<LayoutNode> function0 = (Function0) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends View> ViewFactoryHolder<T> f(LayoutNode layoutNode) {
        AndroidViewHolder interopViewFactoryHolder = layoutNode.getInteropViewFactoryHolder();
        if (interopViewFactoryHolder != null) {
            return (ViewFactoryHolder) interopViewFactoryHolder;
        }
        C14832a.c("Required value was null.");
        throw new KotlinNothingValueException();
    }
}
