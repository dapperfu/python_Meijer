package e;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.F0;
import androidx.compose.runtime.r;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.C5754N;
import androidx.view.J;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Le/h;", "", "<init>", "()V", "Landroidx/compose/runtime/F0;", "Landroidx/activity/J;", "b", "Landroidx/compose/runtime/F0;", "LocalOnBackPressedDispatcherOwner", "a", "(Landroidx/compose/runtime/Composer;I)Landroidx/activity/J;", "current", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: e.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13740h {

    /* renamed from: a, reason: collision with root package name */
    public static final C13740h f129002a = new C13740h();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final F0<J> LocalOnBackPressedDispatcherOwner = r.d(null, a.f129004f, 1, null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/activity/J;", "c", "()Landroidx/activity/J;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: e.h$a */
    static final class a extends Lambda implements Function0<J> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f129004f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final J invoke() {
            return null;
        }
    }

    private C13740h() {
    }

    @JvmName
    public final J a(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-2068013981, i10, -1, "androidx.activity.compose.LocalOnBackPressedDispatcherOwner.<get-current> (BackHandler.kt:50)");
        }
        J jA = (J) composer.o(LocalOnBackPressedDispatcherOwner);
        if (jA == null) {
            composer.startReplaceGroup(544166745);
            jA = C5754N.a((View) composer.o(AndroidCompositionLocals_androidKt.k()));
            composer.P();
        } else {
            composer.startReplaceGroup(544164296);
            composer.P();
        }
        if (jA == null) {
            composer.startReplaceGroup(544168748);
            Object baseContext = (Context) composer.o(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (baseContext instanceof ContextWrapper) {
                    if (baseContext instanceof J) {
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                } else {
                    baseContext = null;
                    break;
                }
            }
            jA = (J) baseContext;
            composer.P();
        } else {
            composer.startReplaceGroup(544164377);
            composer.P();
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return jA;
    }
}
