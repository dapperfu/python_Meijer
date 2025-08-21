package vi;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import qc.C16621b;
import qc.InterfaceC16624e;
import qc.PagerState;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B]\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012,\u0010\u0012\u001a(\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\u0002\b\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R=\u0010\u0012\u001a(\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lvi/a;", "LJi/h;", "", "Lki/q1$g;", "template", "", "count", "Landroidx/compose/ui/Modifier;", "modifier", "Lqc/g;", "state", "Lkotlin/Function2;", "Lqc/e;", "Lkotlin/ParameterName;", "name", "page", "", "Lkotlin/ExtensionFunctionType;", "content", "LKi/M;", "localThemeScope", "<init>", "(Lki/q1$g;ILandroidx/compose/ui/Modifier;Lqc/g;Lkotlin/jvm/functions/Function4;LKi/M;)V", "Lkotlin/Function1;", "a", "()Lkotlin/jvm/functions/Function3;", "b", "Lki/q1$g;", "C0", "()Lki/q1$g;", "c", "I", "z0", "()I", "d", "Landroidx/compose/ui/Modifier;", "A0", "()Landroidx/compose/ui/Modifier;", "e", "Lqc/g;", "B0", "()Lqc/g;", "f", "Lkotlin/jvm/functions/Function4;", "y0", "()Lkotlin/jvm/functions/Function4;", "g", "LKi/M;", "getLocalThemeScope", "()LKi/M;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vi.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C17679a implements Ji.h, Ji.b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q1.HorizontalPagerTemplate template;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int count;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Modifier modifier;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final PagerState state;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Function4<InterfaceC16624e, Integer, Composer, Integer, Unit> content;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final LocalThemeScope localThemeScope;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vi.a$a, reason: collision with other inner class name */
    static final class C2623a implements Function3<Modifier, Composer, Integer, Unit> {
        C2623a() {
        }

        public final void a(Modifier it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1138128387, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.tab.HorizontalPagerScopeImpl.getComposer.<anonymous> (TabScopes.kt:113)");
            }
            C16621b.a(C17679a.this.getCount(), C17679a.this.getModifier(), C17679a.this.getState(), C17679a.this.getTemplate().getReverseLayout(), C17679a.this.getTemplate().getItemSpacing(), C17679a.this.getTemplate().getContentPadding(), C17679a.this.getTemplate().getVerticalAlignment(), C17679a.this.getTemplate().z().invoke(C17679a.this.getState(), composer, 0), C17679a.this.getTemplate().B(), false, C17679a.this.y0(), composer, 0, 0, 512);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
            a(modifier, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C17679a(q1.HorizontalPagerTemplate template, int i10, Modifier modifier, PagerState state, Function4<? super InterfaceC16624e, ? super Integer, ? super Composer, ? super Integer, Unit> content, LocalThemeScope localThemeScope) {
        Intrinsics.j(template, "template");
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(state, "state");
        Intrinsics.j(content, "content");
        Intrinsics.j(localThemeScope, "localThemeScope");
        this.template = template;
        this.count = i10;
        this.modifier = modifier;
        this.state = state;
        this.content = content;
        this.localThemeScope = localThemeScope;
    }

    /* renamed from: A0, reason: from getter */
    public final Modifier getModifier() {
        return this.modifier;
    }

    /* renamed from: B0, reason: from getter */
    public final PagerState getState() {
        return this.state;
    }

    /* renamed from: C0, reason: from getter */
    public q1.HorizontalPagerTemplate getTemplate() {
        return this.template;
    }

    @Override // Ji.b
    public Function3<Modifier, Composer, Integer, Unit> a() {
        return ComposableLambdaKt.composableLambdaInstance(-1138128387, true, new C2623a());
    }

    public final Function4<InterfaceC16624e, Integer, Composer, Integer, Unit> y0() {
        return this.content;
    }

    /* renamed from: z0, reason: from getter */
    public final int getCount() {
        return this.count;
    }
}
