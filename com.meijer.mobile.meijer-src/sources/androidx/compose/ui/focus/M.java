package androidx.compose.ui.focus;

import androidx.compose.ui.node.C5955i;
import androidx.compose.ui.node.InterfaceC5954h;
import androidx.compose.ui.platform.C6034t0;
import d1.C13592a;
import d1.InterfaceC13593b;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\f"}, d2 = {"Landroidx/compose/ui/focus/M;", "", "", "value", "e", "(I)I", "Landroidx/compose/ui/node/h;", "node", "", "d", "(ILandroidx/compose/ui/node/h;)Z", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final int f50845b = e(1);

    /* renamed from: c, reason: collision with root package name */
    private static final int f50846c = e(0);

    /* renamed from: d, reason: collision with root package name */
    private static final int f50847d = e(2);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/focus/M$a;", "", "<init>", "()V", "Landroidx/compose/ui/focus/M;", "Always", "I", "a", "()I", "SystemDefined", "c", "Never", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.focus.M$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int a() {
            return M.f50845b;
        }

        public final int b() {
            return M.f50847d;
        }

        public final int c() {
            return M.f50846c;
        }
    }

    private static int e(int i10) {
        return i10;
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean d(int i10, InterfaceC5954h interfaceC5954h) {
        if (f(i10, f50845b)) {
            return true;
        }
        if (f(i10, f50846c)) {
            return !C13592a.f(((InterfaceC13593b) C5955i.a(interfaceC5954h, C6034t0.l())).a(), C13592a.INSTANCE.b());
        }
        if (f(i10, f50847d)) {
            return false;
        }
        throw new IllegalStateException("Unknown Focusability");
    }
}
