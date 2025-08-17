package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.L0;
import androidx.compose.ui.platform.N0;
import j0.InterfaceC14810b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0004*\u00020\u0004H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/layout/j;", "Lj0/b;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "LP0/e;", "alignment", "g", "(Landroidx/compose/ui/Modifier;LP0/e;)Landroidx/compose/ui/Modifier;", "h", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.layout.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5664j implements InterfaceC14810b {

    /* renamed from: a, reason: collision with root package name */
    public static final C5664j f48612a = new C5664j();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.layout.j$a */
    public static final class a extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ P0.e f48613f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(P0.e eVar) {
            super(1);
            this.f48613f = eVar;
        }

        public final void a(N0 n02) {
            n02.b("align");
            n02.c(this.f48613f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.layout.j$b */
    public static final class b extends Lambda implements Function1<N0, Unit> {
        public b() {
            super(1);
        }

        public final void a(N0 n02) {
            n02.b("matchParentSize");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f142422a;
        }
    }

    @Override // j0.InterfaceC14810b
    public Modifier g(Modifier modifier, P0.e eVar) {
        return modifier.then(new BoxChildDataElement(eVar, false, L0.b() ? new a(eVar) : L0.a()));
    }

    @Override // j0.InterfaceC14810b
    public Modifier h(Modifier modifier) {
        return modifier.then(new BoxChildDataElement(P0.e.INSTANCE.e(), true, L0.b() ? new b() : L0.a()));
    }

    private C5664j() {
    }
}
