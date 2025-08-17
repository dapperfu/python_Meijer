package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.S;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u008b\u0001\u0010\u0012\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002K\u0010\u000b\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\u0019\b\u0002\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aÃ\u0001\u0010\u0016\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002K\u0010\u000b\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\u001b\b\u0002\u0010\u0014\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0002\b\u00102\u0019\b\u0002\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u00102\u0019\b\u0002\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a%\u0010\u001a\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001d\u0010\u001c\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a+\u0010!\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LJ4/a;", "T", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Lkotlin/ParameterName;", "name", "inflater", "Landroid/view/ViewGroup;", "parent", "", "attachToParent", "factory", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "update", "a", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "onReset", "onRelease", "b", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroid/view/View;", "binding", "h", "(Landroid/view/View;LJ4/a;)V", "g", "(Landroid/view/View;)LJ4/a;", "viewGroup", "Landroidx/fragment/app/FragmentContainerView;", "action", "f", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "ui-viewbinding_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.viewinterop.a$a, reason: collision with other inner class name */
    static final class C1076a<T> extends Lambda implements Function1<T, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final C1076a f52765f = new C1076a();

        C1076a() {
            super(1);
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        public final void a(J4.a aVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a((J4.a) obj);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function3<LayoutInflater, ViewGroup, Boolean, T> f52766f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f52767g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f52768h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f52769i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f52770j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> function3, Modifier modifier, Function1<? super T, Unit> function1, int i10, int i11) {
            super(2);
            this.f52766f = function3;
            this.f52767g = modifier;
            this.f52768h = function1;
            this.f52769i = i10;
            this.f52770j = i11;
        }

        public final void a(Composer composer, int i10) {
            a.a(this.f52766f, this.f52767g, this.f52768h, composer, J0.a(this.f52769i | 1), this.f52770j);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c<T> extends Lambda implements Function1<T, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f52771f = new c();

        c() {
            super(1);
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        public final void a(J4.a aVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a((J4.a) obj);
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d<T> extends Lambda implements Function1<T, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f52772f = new d();

        d() {
            super(1);
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        public final void a(J4.a aVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a((J4.a) obj);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LJ4/a;", "T", "Landroid/content/Context;", "context", "Landroid/view/View;", "a", "(Landroid/content/Context;)Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class e extends Lambda implements Function1<Context, View> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Fragment f52773f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function3<LayoutInflater, ViewGroup, Boolean, T> f52774g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Fragment fragment, Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> function3) {
            super(1);
            this.f52773f = fragment;
            this.f52774g = function3;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(Context context) {
            LayoutInflater layoutInflaterFrom;
            Fragment fragment = this.f52773f;
            if (fragment == null || (layoutInflaterFrom = fragment.getLayoutInflater()) == null) {
                layoutInflaterFrom = LayoutInflater.from(context);
            }
            J4.a aVar = (J4.a) this.f52774g.invoke(layoutInflaterFrom, new FrameLayout(context), Boolean.FALSE);
            View root = aVar.getRoot();
            a.h(root, aVar);
            return root;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LJ4/a;", "T", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends Lambda implements Function1<View, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f52775f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Function1<? super T, Unit> function1) {
            super(1);
            this.f52775f = function1;
        }

        public final void a(View view) {
            this.f52775f.invoke(a.g(view));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LJ4/a;", "T", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends Lambda implements Function1<View, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f52776f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Fragment f52777g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Context f52778h;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LJ4/a;", "T", "Landroidx/fragment/app/FragmentContainerView;", "container", "", "a", "(Landroidx/fragment/app/FragmentContainerView;)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: androidx.compose.ui.viewinterop.a$g$a, reason: collision with other inner class name */
        static final class C1077a extends Lambda implements Function1<FragmentContainerView, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FragmentManager f52779f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1077a(FragmentManager fragmentManager) {
                super(1);
                this.f52779f = fragmentManager;
            }

            public final void a(FragmentContainerView fragmentContainerView) {
                FragmentManager fragmentManager = this.f52779f;
                Fragment fragmentFindFragmentById = fragmentManager != null ? fragmentManager.findFragmentById(fragmentContainerView.getId()) : null;
                if (fragmentFindFragmentById == null || this.f52779f.isStateSaved()) {
                    return;
                }
                S sBeginTransaction = this.f52779f.beginTransaction();
                Intrinsics.i(sBeginTransaction, "beginTransaction()");
                sBeginTransaction.q(fragmentFindFragmentById);
                sBeginTransaction.j();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FragmentContainerView fragmentContainerView) {
                a(fragmentContainerView);
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Function1<? super T, Unit> function1, Fragment fragment, Context context) {
            super(1);
            this.f52776f = function1;
            this.f52777g = fragment;
            this.f52778h = context;
        }

        public final void a(View view) {
            FragmentManager childFragmentManager;
            this.f52776f.invoke(a.g(view));
            FragmentManager supportFragmentManager = null;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                Fragment fragment = this.f52777g;
                Context context = this.f52778h;
                if (fragment == null || (childFragmentManager = fragment.getChildFragmentManager()) == null) {
                    FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
                    if (fragmentActivity != null) {
                        supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                    }
                } else {
                    supportFragmentManager = childFragmentManager;
                }
                a.f(viewGroup, new C1077a(supportFragmentManager));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LJ4/a;", "T", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    static final class h extends Lambda implements Function1<View, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f52780f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(Function1<? super T, Unit> function1) {
            super(1);
            this.f52780f = function1;
        }

        public final void a(View view) {
            this.f52780f.invoke(a.g(view));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class i extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function3<LayoutInflater, ViewGroup, Boolean, T> f52781f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f52782g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f52783h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f52784i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f52785j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f52786k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f52787l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> function3, Modifier modifier, Function1<? super T, Unit> function1, Function1<? super T, Unit> function12, Function1<? super T, Unit> function13, int i10, int i11) {
            super(2);
            this.f52781f = function3;
            this.f52782g = modifier;
            this.f52783h = function1;
            this.f52784i = function12;
            this.f52785j = function13;
            this.f52786k = i10;
            this.f52787l = i11;
        }

        public final void a(Composer composer, int i10) {
            a.b(this.f52781f, this.f52782g, this.f52783h, this.f52784i, this.f52785j, composer, J0.a(this.f52786k | 1), this.f52787l);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final <T extends J4.a> void a(Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> function3, Modifier modifier, Function1<? super T, Unit> function1, Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        Function1<? super T, Unit> function12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1985291610);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.D(function3) ? 4 : 2) | i10;
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
            i12 |= composerStartRestartGroup.D(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.p((i12 & 147) != 146, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            Function1<? super T, Unit> function13 = i14 != 0 ? C1076a.f52765f : function1;
            if (ComposerKt.M()) {
                ComposerKt.U(-1985291610, i12, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:77)");
            }
            b(function3, modifier3, null, null, function13, composerStartRestartGroup, (i12 & 14) | 384 | (i12 & 112) | (57344 & (i12 << 6)), 8);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
            function12 = function13;
        } else {
            composerStartRestartGroup.K();
            modifier2 = modifier;
            function12 = function1;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new b(function3, modifier2, function12, i10, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends J4.a> void b(kotlin.jvm.functions.Function3<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends T> r19, androidx.compose.ui.Modifier r20, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r21, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r22, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.a.b(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ViewGroup viewGroup, Function1<? super FragmentContainerView, Unit> function1) {
        if (viewGroup instanceof FragmentContainerView) {
            function1.invoke(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof ViewGroup) {
                f((ViewGroup) childAt, function1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends J4.a> T g(View view) {
        Object tag = view.getTag(K1.a.f16268a);
        Intrinsics.h(tag, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding");
        return (T) tag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends J4.a> void h(View view, T t10) {
        view.setTag(K1.a.f16268a, t10);
    }
}
