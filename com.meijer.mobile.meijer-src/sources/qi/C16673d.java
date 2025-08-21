package qi;

import Ji.h;
import Ki.C;
import Ki.LocalThemeScope;
import Ki.T;
import V0.C5489q0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import ki.q1;
import kotlin.C17972T0;
import kotlin.C18054z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16335d;
import qi.C16673d;
import r1.C16819m;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u00012\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lqi/d;", "", "LKi/M;", "localThemeScope", "Lki/q1$h;", "template", "", "contentDescription", "<init>", "(LKi/M;Lki/q1$h;Ljava/lang/String;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "", "a", "()Lkotlin/jvm/functions/Function3;", "b", "LKi/M;", "c", "()LKi/M;", "Lki/q1$h;", "z0", "()Lki/q1$h;", "d", "Ljava/lang/String;", "y0", "()Ljava/lang/String;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qi.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C16673d implements h, Ji.b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LocalThemeScope localThemeScope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q1.h template;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String contentDescription;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: qi.d$a */
    static final class a implements Function3<Modifier, Composer, Integer, Unit> {
        public final void b(Modifier it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1471197766, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.icon.IconScopeImpl.getComposer.<anonymous> (Icon.kt:121)");
            }
            if (C16673d.this.getTemplate() instanceof q1.h.AnimatedIcon) {
                composer.startReplaceGroup(1688672233);
                C17972T0.a(androidx.compose.foundation.b.d(((q1.h.AnimatedIcon) C16673d.this.getTemplate()).getModifier(), C16673d.this.getLocalThemeScope().getAdsColors().getAdsColorTransparent().getColor(), null, 2, null), C16673d.this.getLocalThemeScope().getAdsColors().getAdsColorBrandPrimary().getColor(), H1.h.p(2), 0L, 0, composer, 384, 24);
                composer.P();
            } else if (!(C16673d.this.getTemplate() instanceof q1.h.DrawableIcon) || Intrinsics.e(((q1.h.DrawableIcon) C16673d.this.getTemplate()).getIcon(), C.d.f17039c)) {
                composer.startReplaceGroup(1689524392);
                composer.P();
            } else {
                composer.startReplaceGroup(1689086176);
                Z0.c cVarC = C16335d.c(((q1.h.DrawableIcon) C16673d.this.getTemplate()).getIcon().getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), composer, 0);
                String contentDescription = C16673d.this.getContentDescription();
                Modifier modifierD = androidx.compose.foundation.b.d(((q1.h.DrawableIcon) C16673d.this.getTemplate()).getModifier(), C16673d.this.getLocalThemeScope().getAdsColors().getAdsColorTransparent().getColor(), null, 2, null);
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(C16673d.this);
                final C16673d c16673d = C16673d.this;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: qi.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C16673d.a.c(c16673d, (u) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierD2 = C16819m.d(modifierD, false, (Function1) objB, 1, null);
                T color = ((q1.h.DrawableIcon) C16673d.this.getTemplate()).getColor();
                C18054z0.a(cVarC, contentDescription, modifierD2, color != null ? color.getColor() : C5489q0.INSTANCE.j(), composer, 0, 0);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(C16673d c16673d, u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            String contentDescription = ((q1.h.DrawableIcon) c16673d.getTemplate()).getContentDescription();
            if (contentDescription != null) {
                s.g0(semantics, contentDescription);
            }
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
            b(modifier, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public C16673d(LocalThemeScope localThemeScope, q1.h template, String str) {
        Intrinsics.j(localThemeScope, "localThemeScope");
        Intrinsics.j(template, "template");
        this.localThemeScope = localThemeScope;
        this.template = template;
        this.contentDescription = str;
    }

    @Override // Ji.b
    public Function3<Modifier, Composer, Integer, Unit> a() {
        return ComposableLambdaKt.composableLambdaInstance(-1471197766, true, new a());
    }

    @Override // Ji.h, Ai.InterfaceC2817g1
    /* renamed from: c, reason: from getter */
    public LocalThemeScope getLocalThemeScope() {
        return this.localThemeScope;
    }

    /* renamed from: y0, reason: from getter */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    /* renamed from: z0, reason: from getter */
    public q1.h getTemplate() {
        return this.template;
    }

    public /* synthetic */ C16673d(LocalThemeScope localThemeScope, q1.h hVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(localThemeScope, hVar, (i10 & 4) != 0 ? null : str);
    }
}
