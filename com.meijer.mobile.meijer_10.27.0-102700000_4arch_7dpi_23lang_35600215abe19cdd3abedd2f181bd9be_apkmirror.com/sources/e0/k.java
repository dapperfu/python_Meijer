package e0;

import V0.C5346q0;
import V0.C5349s0;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.p;
import androidx.compose.ui.window.q;
import androidx.recyclerview.widget.RecyclerView;
import j0.InterfaceC14814f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001aH\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aP\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a:\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001af\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00052%\b\u0002\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010$\u001a\u00020\r2\b\b\u0003\u0010\"\u001a\u00020!2\b\b\u0003\u0010#\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%\u001a2\u0010*\u001a\u00020\u0019*\u00020&2\b\b\u0001\u0010'\u001a\u00020!2\b\b\u0001\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a)\u0010-\u001a\u0004\u0018\u00010,*\u00020&2\b\b\u0001\u0010'\u001a\u00020!2\b\b\u0001\u0010(\u001a\u00020!H\u0002¢\u0006\u0004\b-\u0010.\u001a \u0010/\u001a\u00020\u0019*\u0004\u0018\u00010,2\u0006\u0010)\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a \u00101\u001a\u00020\u0019*\u0004\u0018\u00010,2\u0006\u0010)\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00100\"\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00103\" \u0010:\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001f\u00105\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006;"}, d2 = {"Landroidx/compose/ui/window/p;", "popupPositionProvider", "Lkotlin/Function0;", "", "onDismiss", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Le0/g;", "Lkotlin/ExtensionFunctionType;", "contextMenuBuilderBlock", "d", "(Landroidx/compose/ui/window/p;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Le0/b;", "colors", "c", "(Landroidx/compose/ui/window/p;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Le0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lj0/f;", "content", "a", "(Le0/b;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "label", "", "enabled", "LV0/q0;", "Lkotlin/ParameterName;", "name", "iconColor", "leadingIcon", "onClick", "b", "(Ljava/lang/String;ZLe0/b;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "backgroundStyleId", "foregroundStyleId", "e", "(IILandroidx/compose/runtime/Composer;II)Le0/b;", "Landroid/content/Context;", "resId", "attrId", "defaultColor", "h", "(Landroid/content/Context;IIJ)J", "Landroid/content/res/ColorStateList;", "i", "(Landroid/content/Context;II)Landroid/content/res/ColorStateList;", "g", "(Landroid/content/res/ColorStateList;J)J", "f", "Landroidx/compose/ui/window/q;", "Landroidx/compose/ui/window/q;", "DefaultPopupProperties", "Le0/b;", "getDefaultContextMenuColors", "()Le0/b;", "getDefaultContextMenuColors$annotations", "()V", "DefaultContextMenuColors", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final q f127736a = new q(true, false, false, false, 14, (DefaultConstructorMarker) null);

    /* renamed from: b, reason: collision with root package name */
    private static final ContextMenuColors f127737b;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ContextMenuColors f127738f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f127739g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14814f, Composer, Integer, Unit> f127740h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f127741i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f127742j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ContextMenuColors contextMenuColors, Modifier modifier, Function3<? super InterfaceC14814f, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f127738f = contextMenuColors;
            this.f127739g = modifier;
            this.f127740h = function3;
            this.f127741i = i10;
            this.f127742j = i11;
        }

        public final void a(Composer composer, int i10) {
            k.a(this.f127738f, this.f127739g, this.f127740h, composer, J0.a(this.f127741i | 1), this.f127742j);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f127743f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f127744g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, Function0<Unit> function0) {
            super(0);
            this.f127743f = z10;
            this.f127744g = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.f127743f) {
                this.f127744g.invoke();
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f127745f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f127746g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ContextMenuColors f127747h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Modifier f127748i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function3<C5346q0, Composer, Integer, Unit> f127749j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f127750k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f127751l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f127752m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(String str, boolean z10, ContextMenuColors contextMenuColors, Modifier modifier, Function3<? super C5346q0, ? super Composer, ? super Integer, Unit> function3, Function0<Unit> function0, int i10, int i11) {
            super(2);
            this.f127745f = str;
            this.f127746g = z10;
            this.f127747h = contextMenuColors;
            this.f127748i = modifier;
            this.f127749j = function3;
            this.f127750k = function0;
            this.f127751l = i10;
            this.f127752m = i11;
        }

        public final void a(Composer composer, int i10) {
            k.b(this.f127745f, this.f127746g, this.f127747h, this.f127748i, this.f127749j, this.f127750k, composer, J0.a(this.f127751l | 1), this.f127752m);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ p f127753f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f127754g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f127755h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<C13600g, Unit> f127756i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f127757j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f127758k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(p pVar, Function0<Unit> function0, Modifier modifier, Function1<? super C13600g, Unit> function1, int i10, int i11) {
            super(2);
            this.f127753f = pVar;
            this.f127754g = function0;
            this.f127755h = modifier;
            this.f127756i = function1;
            this.f127757j = i10;
            this.f127758k = i11;
        }

        public final void a(Composer composer, int i10) {
            k.d(this.f127753f, this.f127754g, this.f127755h, this.f127756i, composer, J0.a(this.f127757j | 1), this.f127758k);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ContextMenuColors f127759f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f127760g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<C13600g, Unit> f127761h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj0/f;", "", "a", "(Lj0/f;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        static final class a extends Lambda implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1<C13600g, Unit> f127762f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ ContextMenuColors f127763g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super C13600g, Unit> function1, ContextMenuColors contextMenuColors) {
                super(3);
                this.f127762f = function1;
                this.f127763g = contextMenuColors;
            }

            public final void a(InterfaceC14814f interfaceC14814f, Composer composer, int i10) {
                if (!composer.p((i10 & 17) != 16, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1156688164, i10, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous>.<anonymous> (ContextMenuUi.android.kt:131)");
                }
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new C13600g();
                    composer.t(objB);
                }
                C13600g c13600g = (C13600g) objB;
                Function1<C13600g, Unit> function1 = this.f127762f;
                ContextMenuColors contextMenuColors = this.f127763g;
                c13600g.b();
                function1.invoke(c13600g);
                c13600g.a(contextMenuColors, composer, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                a(interfaceC14814f, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(ContextMenuColors contextMenuColors, Modifier modifier, Function1<? super C13600g, Unit> function1) {
            super(2);
            this.f127759f = contextMenuColors;
            this.f127760g = modifier;
            this.f127761h = function1;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(795909757, i10, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous> (ContextMenuUi.android.kt:130)");
            }
            ContextMenuColors contextMenuColors = this.f127759f;
            k.a(contextMenuColors, this.f127760g, ComposableLambdaKt.c(1156688164, true, new a(this.f127761h, contextMenuColors), composer, 54), composer, 384, 0);
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ p f127764f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f127765g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f127766h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ContextMenuColors f127767i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<C13600g, Unit> f127768j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f127769k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f127770l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(p pVar, Function0<Unit> function0, Modifier modifier, ContextMenuColors contextMenuColors, Function1<? super C13600g, Unit> function1, int i10, int i11) {
            super(2);
            this.f127764f = pVar;
            this.f127765g = function0;
            this.f127766h = modifier;
            this.f127767i = contextMenuColors;
            this.f127768j = function1;
            this.f127769k = i10;
            this.f127770l = i11;
        }

        public final void a(Composer composer, int i10) {
            k.c(this.f127764f, this.f127765g, this.f127766h, this.f127767i, this.f127768j, composer, J0.a(this.f127769k | 1), this.f127770l);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    static {
        C5346q0.Companion companion = C5346q0.INSTANCE;
        f127737b = new ContextMenuColors(companion.k(), companion.a(), companion.a(), C5346q0.q(companion.a(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), C5346q0.q(companion.a(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(e0.ContextMenuColors r28, androidx.compose.ui.Modifier r29, kotlin.jvm.functions.Function3<? super j0.InterfaceC14814f, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.k.a(e0.b, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    @android.annotation.SuppressLint({"ComposableLambdaParameterPosition"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r23, boolean r24, e0.ContextMenuColors r25, androidx.compose.ui.Modifier r26, kotlin.jvm.functions.Function3<? super V0.C5346q0, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, kotlin.jvm.functions.Function0<kotlin.Unit> r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.k.b(java.lang.String, boolean, e0.b, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(androidx.compose.ui.window.p r14, kotlin.jvm.functions.Function0<kotlin.Unit> r15, androidx.compose.ui.Modifier r16, e0.ContextMenuColors r17, kotlin.jvm.functions.Function1<? super e0.C13600g, kotlin.Unit> r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.k.c(androidx.compose.ui.window.p, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, e0.b, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final ContextMenuColors e(int i10, int i11, Composer composer, int i12, int i13) throws Resources.NotFoundException {
        int i14 = (i13 & 1) != 0 ? R.style.Widget.PopupMenu : i10;
        int i15 = (i13 & 2) != 0 ? R.style.TextAppearance.Widget.PopupMenu.Large : i11;
        if (ComposerKt.M()) {
            ComposerKt.U(1689505294, i12, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:363)");
        }
        Context context = (Context) composer.o(AndroidCompositionLocals_androidKt.g());
        boolean zV = composer.V((Configuration) composer.o(AndroidCompositionLocals_androidKt.f())) | composer.V(context);
        Object objB = composer.B();
        if (zV || objB == Composer.INSTANCE.a()) {
            ContextMenuColors contextMenuColors = f127737b;
            long jH = h(context, i14, R.attr.colorBackground, contextMenuColors.getBackgroundColor());
            ColorStateList colorStateListI = i(context, i15, R.attr.textColorPrimary);
            long jG = g(colorStateListI, contextMenuColors.getTextColor());
            long jF = f(colorStateListI, contextMenuColors.getDisabledTextColor());
            Object contextMenuColors2 = new ContextMenuColors(jH, jG, jG, jF, jF, null);
            composer.t(contextMenuColors2);
            objB = contextMenuColors2;
        }
        ContextMenuColors contextMenuColors3 = (ContextMenuColors) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return contextMenuColors3;
    }

    public static final void d(p pVar, Function0<Unit> function0, Modifier modifier, Function1<? super C13600g, Unit> function1, Composer composer, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        Function0<Unit> function02;
        Function1<? super C13600g, Unit> function12;
        p pVar2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(712057293);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(pVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(function0)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (composerStartRestartGroup.D(function1)) {
                i16 = RecyclerView.m.FLAG_MOVED;
            } else {
                i16 = 1024;
            }
            i12 |= i16;
        }
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i12 & 1)) {
            if (i17 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(712057293, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:106)");
            }
            function02 = function0;
            c(pVar, function02, modifier3, e(0, 0, composerStartRestartGroup, 0, 3), function1, composerStartRestartGroup, (i12 & 1022) | ((i12 << 3) & 57344), 0);
            pVar2 = pVar;
            function12 = function1;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        } else {
            function02 = function0;
            function12 = function1;
            pVar2 = pVar;
            composerStartRestartGroup.K();
            modifier2 = modifier;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new d(pVar2, function02, modifier2, function12, i10, i11));
        }
    }

    private static final long f(ColorStateList colorStateList, long j10) {
        Integer numValueOf;
        int iJ = C5349s0.j(j10);
        if (colorStateList != null) {
            numValueOf = Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iJ));
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() != iJ) {
            return C5349s0.b(numValueOf.intValue());
        }
        return j10;
    }

    private static final long g(ColorStateList colorStateList, long j10) {
        Integer numValueOf;
        int iJ = C5349s0.j(j10);
        if (colorStateList != null) {
            numValueOf = Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iJ));
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() != iJ) {
            return C5349s0.b(numValueOf.intValue());
        }
        return j10;
    }

    private static final long h(Context context, int i10, int i11, long j10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, new int[]{i11});
        int iJ = C5349s0.j(j10);
        int color = typedArrayObtainStyledAttributes.getColor(0, iJ);
        typedArrayObtainStyledAttributes.recycle();
        if (color == iJ) {
            return j10;
        }
        return C5349s0.b(color);
    }

    private static final ColorStateList i(Context context, int i10, int i11) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, new int[]{i11});
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        return colorStateList;
    }
}
