package j4;

import L0.l;
import L0.m;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import kotlin.AbstractC14656B;
import kotlin.C14667h;
import kotlin.C14670k;
import kotlin.C14675p;
import kotlin.C14680u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\n\u001a\u00020\t2\"\u0010\b\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005\"\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u00030\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Li4/k;", "Landroidx/compose/runtime/z1;", "Li4/h;", "d", "(Li4/k;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "", "Li4/B;", "Li4/p;", "navigators", "Li4/u;", "e", "([Li4/B;Landroidx/compose/runtime/Composer;I)Li4/u;", "Landroid/content/Context;", "context", "c", "(Landroid/content/Context;)Li4/u;", "LL0/k;", "a", "(Landroid/content/Context;)LL0/k;", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class j {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Bundle;", "it", "Li4/u;", "a", "(Landroid/os/Bundle;)Li4/u;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension
    static final class b extends Lambda implements Function1<Bundle, C14680u> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f139899f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(1);
            this.f139899f = context;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C14680u invoke(Bundle bundle) {
            C14680u c14680uC = j.c(this.f139899f);
            c14680uC.i0(bundle);
            return c14680uC;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li4/u;", "c", "()Li4/u;"}, k = 3, mv = {1, 8, 0})
    static final class c extends Lambda implements Function0<C14680u> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f139900f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.f139900f = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C14680u invoke() {
            return j.c(this.f139900f);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "Li4/u;", "it", "Landroid/os/Bundle;", "a", "(LL0/m;Li4/u;)Landroid/os/Bundle;"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements Function2<m, C14680u, Bundle> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f139898f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke(m mVar, C14680u c14680u) {
            return c14680u.k0();
        }
    }

    private static final L0.k<C14680u, ?> a(Context context) {
        return l.a(a.f139898f, new b(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C14680u c(Context context) {
        C14680u c14680u = new C14680u(context);
        c14680u.get_navigatorProvider().b(new d(c14680u.get_navigatorProvider()));
        c14680u.get_navigatorProvider().b(new e());
        c14680u.get_navigatorProvider().b(new g());
        return c14680u;
    }

    public static final z1<C14667h> d(C14670k c14670k, Composer composer, int i10) {
        composer.startReplaceableGroup(-120375203);
        if (ComposerKt.M()) {
            ComposerKt.U(-120375203, i10, -1, "androidx.navigation.compose.currentBackStackEntryAsState (NavHostController.kt:41)");
        }
        z1<C14667h> z1VarA = o1.a(c14670k.D(), null, null, composer, 56, 2);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.U();
        return z1VarA;
    }

    public static final C14680u e(AbstractC14656B<? extends C14675p>[] abstractC14656BArr, Composer composer, int i10) {
        composer.startReplaceableGroup(-312215566);
        if (ComposerKt.M()) {
            ComposerKt.U(-312215566, i10, -1, "androidx.navigation.compose.rememberNavController (NavHostController.kt:57)");
        }
        Context context = (Context) composer.o(AndroidCompositionLocals_androidKt.g());
        C14680u c14680u = (C14680u) L0.c.c(Arrays.copyOf(abstractC14656BArr, abstractC14656BArr.length), a(context), null, new c(context), composer, 72, 4);
        for (AbstractC14656B<? extends C14675p> abstractC14656B : abstractC14656BArr) {
            c14680u.get_navigatorProvider().b(abstractC14656B);
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.U();
        return c14680u;
    }
}
