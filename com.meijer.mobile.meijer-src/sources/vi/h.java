package vi;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import ki.q1;
import kotlin.D1;
import kotlin.Metadata;
import kotlin.TabPosition;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BX\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012'\u0010\u000e\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR8\u0010\u000e\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0017R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lvi/h;", "LJi/h;", "", "Lki/q1$p;", "template", "", "selectedTabIndex", "Lkotlin/Function1;", "", "Lx0/B1;", "Lkotlin/ParameterName;", "name", "tabPositions", "", "indicator", "Lkotlin/Function0;", "tabs", "LKi/M;", "localThemeScope", "<init>", "(Lki/q1$p;ILkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;LKi/M;)V", "Landroidx/compose/ui/Modifier;", "a", "()Lkotlin/jvm/functions/Function3;", "b", "Lki/q1$p;", "B0", "()Lki/q1$p;", "c", "I", "z0", "()I", "d", "Lkotlin/jvm/functions/Function3;", "y0", "e", "Lkotlin/jvm/functions/Function2;", "A0", "()Lkotlin/jvm/functions/Function2;", "f", "LKi/M;", "getLocalThemeScope", "()LKi/M;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class h implements Ji.h, Ji.b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q1.TabRowTemplate template;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int selectedTabIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function3<List<TabPosition>, Composer, Integer, Unit> indicator;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function2<Composer, Integer, Unit> tabs;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final LocalThemeScope localThemeScope;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<Modifier, Composer, Integer, Unit> {
        public final void a(Modifier it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1348771581, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.tab.TabRowScopeImpl.getComposer.<anonymous> (TabScopes.kt:68)");
            }
            D1.b(h.this.getSelectedTabIndex(), h.this.getTemplate().getModifier(), h.this.getTemplate().x().invoke(composer, 0).getValue(), h.this.getTemplate().y().invoke(composer, 0).getValue(), h.this.y0(), h.this.getTemplate().z(), h.this.A0(), composer, 0, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        a() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
            a(modifier, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(q1.TabRowTemplate template, int i10, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> indicator, Function2<? super Composer, ? super Integer, Unit> tabs, LocalThemeScope localThemeScope) {
        Intrinsics.j(template, "template");
        Intrinsics.j(indicator, "indicator");
        Intrinsics.j(tabs, "tabs");
        Intrinsics.j(localThemeScope, "localThemeScope");
        this.template = template;
        this.selectedTabIndex = i10;
        this.indicator = indicator;
        this.tabs = tabs;
        this.localThemeScope = localThemeScope;
    }

    public final Function2<Composer, Integer, Unit> A0() {
        return this.tabs;
    }

    /* renamed from: B0, reason: from getter */
    public q1.TabRowTemplate getTemplate() {
        return this.template;
    }

    @Override // Ji.b
    public Function3<Modifier, Composer, Integer, Unit> a() {
        return ComposableLambdaKt.composableLambdaInstance(1348771581, true, new a());
    }

    public final Function3<List<TabPosition>, Composer, Integer, Unit> y0() {
        return this.indicator;
    }

    /* renamed from: z0, reason: from getter */
    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }
}
