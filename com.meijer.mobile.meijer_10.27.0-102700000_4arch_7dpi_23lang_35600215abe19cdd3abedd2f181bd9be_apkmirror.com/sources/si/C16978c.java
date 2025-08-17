package si;

import Ii.h;
import Ji.LocalThemeScope;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.t1;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lsi/c;", "LIi/h;", "", "Lji/q1$l;", "template", "LJi/M;", "localThemeScope", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/window/h;", "properties", "content", "<init>", "(Lji/q1$l;LJi/M;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/h;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "a", "()Lkotlin/jvm/functions/Function3;", "b", "Lji/q1$l;", "A0", "()Lji/q1$l;", "c", "LJi/M;", "()LJi/M;", "d", "Lkotlin/jvm/functions/Function0;", "y0", "()Lkotlin/jvm/functions/Function0;", "e", "Landroidx/compose/ui/window/h;", "z0", "()Landroidx/compose/ui/window/h;", "f", "Lkotlin/jvm/functions/Function2;", "getContent", "()Lkotlin/jvm/functions/Function2;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: si.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C16978c implements h, Ii.b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q1.ModalTemplate template;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final LocalThemeScope localThemeScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onDismissRequest;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.window.h properties;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Function2<Composer, Integer, Unit> content;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: si.c$a */
    static final class a implements Function3<Modifier, Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: si.c$a$a, reason: collision with other inner class name */
        static final class C2505a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C16978c f160552a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: si.c$a$a$a, reason: collision with other inner class name */
            static final class C2506a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C16978c f160553a;

                C2506a(C16978c c16978c) {
                    this.f160553a = c16978c;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(150538680, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.modal.ModalScopeImpl.getComposer.<anonymous>.<anonymous>.<anonymous> (ModalScopes.kt:43)");
                    }
                    this.f160553a.getContent().invoke(composer, 0);
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

            C2505a(C16978c c16978c) {
                this.f160552a = c16978c;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(529617012, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.modal.ModalScopeImpl.getComposer.<anonymous>.<anonymous> (ModalScopes.kt:33)");
                }
                t1.a(this.f160552a.getTemplate().getModifier().then(D.k(J.h(Modifier.INSTANCE, 0.0f, 1, null), H1.h.p(16), 0.0f, 2, null)), this.f160552a.getTemplate().getShape(), this.f160552a.getLocalThemeScope().getAdsColors().getAdsColorUIBackground01().getColor(), 0L, null, this.f160552a.getTemplate().getElevation(), ComposableLambdaKt.c(150538680, true, new C2506a(this.f160552a), composer, 54), composer, 1572864, 24);
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
                ComposerKt.U(2117937707, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.modal.ModalScopeImpl.getComposer.<anonymous> (ModalScopes.kt:29)");
            }
            androidx.compose.ui.window.a.a(C16978c.this.y0(), C16978c.this.getProperties(), ComposableLambdaKt.c(529617012, true, new C2505a(C16978c.this), composer, 54), composer, 384, 0);
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

    /* JADX WARN: Multi-variable type inference failed */
    public C16978c(q1.ModalTemplate template, LocalThemeScope localThemeScope, Function0<Unit> onDismissRequest, androidx.compose.ui.window.h properties, Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.j(template, "template");
        Intrinsics.j(localThemeScope, "localThemeScope");
        Intrinsics.j(onDismissRequest, "onDismissRequest");
        Intrinsics.j(properties, "properties");
        Intrinsics.j(content, "content");
        this.template = template;
        this.localThemeScope = localThemeScope;
        this.onDismissRequest = onDismissRequest;
        this.properties = properties;
        this.content = content;
    }

    /* renamed from: A0, reason: from getter */
    public q1.ModalTemplate getTemplate() {
        return this.template;
    }

    @Override // Ii.b
    public Function3<Modifier, Composer, Integer, Unit> a() {
        return ComposableLambdaKt.composableLambdaInstance(2117937707, true, new a());
    }

    @Override // Ii.h
    /* renamed from: c, reason: from getter */
    public LocalThemeScope getLocalThemeScope() {
        return this.localThemeScope;
    }

    public final Function2<Composer, Integer, Unit> getContent() {
        return this.content;
    }

    public final Function0<Unit> y0() {
        return this.onDismissRequest;
    }

    /* renamed from: z0, reason: from getter */
    public final androidx.compose.ui.window.h getProperties() {
        return this.properties;
    }
}
