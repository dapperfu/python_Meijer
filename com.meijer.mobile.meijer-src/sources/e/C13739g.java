package e;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.F0;
import androidx.compose.runtime.r;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import g.InterfaceC14279f;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Le/g;", "", "<init>", "()V", "Landroidx/compose/runtime/F0;", "Lg/f;", "b", "Landroidx/compose/runtime/F0;", "LocalComposition", "a", "(Landroidx/compose/runtime/Composer;I)Lg/f;", "current", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: e.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13739g {

    /* renamed from: a, reason: collision with root package name */
    public static final C13739g f128999a = new C13739g();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final F0<InterfaceC14279f> LocalComposition = r.d(null, a.f129001f, 1, null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg/f;", "c", "()Lg/f;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: e.g$a */
    static final class a extends Lambda implements Function0<InterfaceC14279f> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f129001f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC14279f invoke() {
            return null;
        }
    }

    private C13739g() {
    }

    @JvmName
    public final InterfaceC14279f a(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(1418020823, i10, -1, "androidx.activity.compose.LocalActivityResultRegistryOwner.<get-current> (ActivityResultRegistry.kt:48)");
        }
        InterfaceC14279f interfaceC14279f = (InterfaceC14279f) composer.o(LocalComposition);
        if (interfaceC14279f == null) {
            composer.startReplaceGroup(1006590171);
            Object baseContext = (Context) composer.o(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (baseContext instanceof ContextWrapper) {
                    if (baseContext instanceof InterfaceC14279f) {
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                } else {
                    baseContext = null;
                    break;
                }
            }
            interfaceC14279f = (InterfaceC14279f) baseContext;
        } else {
            composer.startReplaceGroup(1006589303);
        }
        composer.P();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return interfaceC14279f;
    }
}
