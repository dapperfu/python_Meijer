package W2;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.F0;
import androidx.compose.runtime.G0;
import androidx.compose.runtime.r;
import androidx.view.h0;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00048G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LW2/b;", "", "<init>", "()V", "Landroidx/lifecycle/h0;", "viewModelStoreOwner", "Landroidx/compose/runtime/G0;", "d", "(Landroidx/lifecycle/h0;)Landroidx/compose/runtime/G0;", "Landroidx/compose/runtime/F0;", "b", "Landroidx/compose/runtime/F0;", "LocalViewModelStoreOwner", "c", "(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/h0;", "current", "lifecycle-viewmodel-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f40696a = new b();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final F0<h0> LocalViewModelStoreOwner = r.d(null, new Function0() { // from class: W2.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return b.b();
        }
    }, 1, null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f40698c = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 b() {
        return null;
    }

    public final G0<h0> d(h0 viewModelStoreOwner) {
        return LocalViewModelStoreOwner.d(viewModelStoreOwner);
    }

    private b() {
    }

    @JvmName
    public final h0 c(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-584162872, i10, -1, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:34)");
        }
        h0 h0VarA = (h0) composer.o(LocalViewModelStoreOwner);
        if (h0VarA == null) {
            composer.startReplaceGroup(1260197609);
            h0VarA = c.a(composer, 0);
        } else {
            composer.startReplaceGroup(1260196493);
        }
        composer.P();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return h0VarA;
    }
}
