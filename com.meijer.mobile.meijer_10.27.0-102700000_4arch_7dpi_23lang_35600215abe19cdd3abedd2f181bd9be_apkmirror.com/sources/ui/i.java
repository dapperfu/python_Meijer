package ui;

import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import ji.q1;
import kotlin.A1;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u0019\u0010)¨\u0006*"}, d2 = {"Lui/i;", "LIi/h;", "", "Lji/q1$q;", "template", "", "selected", "Lkotlin/Function0;", "", "onClick", "enabled", "", "text", "LJi/M;", "localThemeScope", "<init>", "(Lji/q1$q;ZLkotlin/jvm/functions/Function0;ZLjava/lang/String;LJi/M;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "a", "()Lkotlin/jvm/functions/Function3;", "b", "Lji/q1$q;", "z0", "()Lji/q1$q;", "c", "Z", "y0", "()Z", "d", "Lkotlin/jvm/functions/Function0;", "l", "()Lkotlin/jvm/functions/Function0;", "e", "h", "f", "Ljava/lang/String;", "A0", "()Ljava/lang/String;", "g", "LJi/M;", "()LJi/M;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class i implements Ii.h, Ii.b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q1.TabTemplate template;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean selected;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onClick;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String text;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final LocalThemeScope localThemeScope;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<Modifier, Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ui.i$a$a, reason: collision with other inner class name */
        static final class C2579a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f163082a;

            C2579a(i iVar) {
                this.f163082a = iVar;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(852664045, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.tab.TabScopeImpl.getComposer.<anonymous>.<anonymous> (TabScopes.kt:40)");
                }
                N1.b(this.f163082a.getText(), androidx.compose.foundation.b.d(Modifier.INSTANCE, this.f163082a.getLocalThemeScope().getAdsColors().getAdsColorTransparent().getColor(), null, 2, null), this.f163082a.getSelected() ? this.f163082a.getTemplate().getSelectedTextColor() : this.f163082a.getTemplate().getUnselectedTextColor(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, this.f163082a.getLocalThemeScope().getAdsTypography().getHeadings().getSeven().getStyle(), composer, 0, 0, 65528);
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

        a() {
        }

        public final void a(Modifier it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1434962157, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.tab.TabScopeImpl.getComposer.<anonymous> (TabScopes.kt:34)");
            }
            A1.b(i.this.getSelected(), i.this.l(), i.this.getTemplate().getModifier(), i.this.getEnabled(), ComposableLambdaKt.c(852664045, true, new C2579a(i.this), composer, 54), null, i.this.getTemplate().x().invoke(composer, 0), 0L, 0L, composer, 221184, 384);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
            a(modifier, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public i(q1.TabTemplate template, boolean z10, Function0<Unit> onClick, boolean z11, String text, LocalThemeScope localThemeScope) {
        Intrinsics.j(template, "template");
        Intrinsics.j(onClick, "onClick");
        Intrinsics.j(text, "text");
        Intrinsics.j(localThemeScope, "localThemeScope");
        this.template = template;
        this.selected = z10;
        this.onClick = onClick;
        this.enabled = z11;
        this.text = text;
        this.localThemeScope = localThemeScope;
    }

    /* renamed from: A0, reason: from getter */
    public String getText() {
        return this.text;
    }

    @Override // Ii.b
    public Function3<Modifier, Composer, Integer, Unit> a() {
        return ComposableLambdaKt.composableLambdaInstance(-1434962157, true, new a());
    }

    @Override // Ii.h
    /* renamed from: c, reason: from getter */
    public LocalThemeScope getLocalThemeScope() {
        return this.localThemeScope;
    }

    /* renamed from: h, reason: from getter */
    public boolean getEnabled() {
        return this.enabled;
    }

    public final Function0<Unit> l() {
        return this.onClick;
    }

    /* renamed from: y0, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* renamed from: z0, reason: from getter */
    public q1.TabTemplate getTemplate() {
        return this.template;
    }
}
