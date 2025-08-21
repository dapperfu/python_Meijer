package xi;

import Ki.LocalThemeScope;
import Ki.T;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import j0.InterfaceC14898b;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import qi.C16671b;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0001\u0018\u00002\u00020\u00012\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lxi/i;", "", "LKi/M;", "localThemeScope", "", "quantity", "maxQuantity", "Lki/q1$b;", "template", "Lkotlin/Function0;", "", "onClick", "Lki/q1$h$b;", "iconTemplate", "<init>", "(LKi/M;Ljava/lang/Integer;ILki/q1$b;Lkotlin/jvm/functions/Function0;Lki/q1$h$b;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "a", "()Lkotlin/jvm/functions/Function3;", "b", "LKi/M;", "c", "()LKi/M;", "Ljava/lang/Integer;", "A0", "()Ljava/lang/Integer;", "d", "I", "z0", "()I", "e", "Lki/q1$b;", "B0", "()Lki/q1$b;", "f", "Lkotlin/jvm/functions/Function0;", "l", "()Lkotlin/jvm/functions/Function0;", "g", "Lki/q1$h$b;", "y0", "()Lki/q1$h$b;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class i implements Ji.h, Ji.b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LocalThemeScope localThemeScope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Integer quantity;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int maxQuantity;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final q1.Badge template;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onClick;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final q1.h.DrawableIcon iconTemplate;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<Modifier, Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: xi.i$a$a, reason: collision with other inner class name */
        static final class C2741a implements Function3<InterfaceC14898b, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f170812a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f170813b;

            C2741a(i iVar, LocalThemeScope localThemeScope) {
                this.f170812a = iVar;
                this.f170813b = localThemeScope;
            }

            public final void a(InterfaceC14898b AdsBadgedBoxLayout, Composer composer, int i10) {
                Intrinsics.j(AdsBadgedBoxLayout, "$this$AdsBadgedBoxLayout");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1255803174, i10, -1, "com.meijer.mobile.android_acres_library.composables.BadgeScopeImpl.getComposer.<anonymous>.<anonymous>.<anonymous> (Badge.kt:68)");
                }
                T badgeBackground = this.f170812a.getTemplate().getBadgeBackground();
                q1.Label countLabel = this.f170812a.getTemplate().getCountLabel();
                int maxQuantity = this.f170812a.getMaxQuantity();
                d.c(this.f170813b, null, badgeBackground, countLabel, this.f170812a.getQuantity(), maxQuantity, composer, 0, 1);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function3<InterfaceC14898b, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f170814a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f170815b;

            b(LocalThemeScope localThemeScope, i iVar) {
                this.f170814a = localThemeScope;
                this.f170815b = iVar;
            }

            public final void a(InterfaceC14898b AdsBadgedBoxLayout, Composer composer, int i10) {
                Intrinsics.j(AdsBadgedBoxLayout, "$this$AdsBadgedBoxLayout");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-123982139, i10, -1, "com.meijer.mobile.android_acres_library.composables.BadgeScopeImpl.getComposer.<anonymous>.<anonymous>.<anonymous> (Badge.kt:76)");
                }
                C16671b.b(this.f170814a, this.f170815b.getIconTemplate(), null, null, composer, 0, 6);
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

        a() {
        }

        public final void a(Modifier it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1294338475, i10, -1, "com.meijer.mobile.android_acres_library.composables.BadgeScopeImpl.getComposer.<anonymous> (Badge.kt:63)");
            }
            LocalThemeScope localThemeScope = i.this.getLocalThemeScope();
            i iVar = i.this;
            d.e(iVar.getTemplate(), iVar.l(), ComposableLambdaKt.c(1255803174, true, new C2741a(iVar, localThemeScope), composer, 54), ComposableLambdaKt.c(-123982139, true, new b(localThemeScope, iVar), composer, 54), composer, 3456);
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

    public i(LocalThemeScope localThemeScope, Integer num, int i10, q1.Badge template, Function0<Unit> onClick, q1.h.DrawableIcon iconTemplate) {
        Intrinsics.j(localThemeScope, "localThemeScope");
        Intrinsics.j(template, "template");
        Intrinsics.j(onClick, "onClick");
        Intrinsics.j(iconTemplate, "iconTemplate");
        this.localThemeScope = localThemeScope;
        this.quantity = num;
        this.maxQuantity = i10;
        this.template = template;
        this.onClick = onClick;
        this.iconTemplate = iconTemplate;
    }

    /* renamed from: A0, reason: from getter */
    public Integer getQuantity() {
        return this.quantity;
    }

    /* renamed from: B0, reason: from getter */
    public q1.Badge getTemplate() {
        return this.template;
    }

    @Override // Ji.b
    public Function3<Modifier, Composer, Integer, Unit> a() {
        return ComposableLambdaKt.composableLambdaInstance(-1294338475, true, new a());
    }

    @Override // Ji.h, Ai.InterfaceC2817g1
    /* renamed from: c, reason: from getter */
    public LocalThemeScope getLocalThemeScope() {
        return this.localThemeScope;
    }

    public Function0<Unit> l() {
        return this.onClick;
    }

    /* renamed from: y0, reason: from getter */
    public q1.h.DrawableIcon getIconTemplate() {
        return this.iconTemplate;
    }

    /* renamed from: z0, reason: from getter */
    public int getMaxQuantity() {
        return this.maxQuantity;
    }
}
