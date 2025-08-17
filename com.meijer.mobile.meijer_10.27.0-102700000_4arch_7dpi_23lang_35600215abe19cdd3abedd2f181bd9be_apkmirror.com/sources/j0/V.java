package j0;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.L0;
import androidx.compose.ui.platform.N0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lj0/O;", "insets", "a", "(Landroidx/compose/ui/Modifier;Lj0/O;)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class V {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class a extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC14806O f139089f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC14806O interfaceC14806O) {
            super(1);
            this.f139089f = interfaceC14806O;
        }

        public final void a(N0 n02) {
            n02.b("insetsBottomHeight");
            n02.getProperties().c("insets", this.f139089f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj0/O;", "LH1/d;", "it", "", "a", "(Lj0/O;LH1/d;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function2<InterfaceC14806O, H1.d, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f139090f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(InterfaceC14806O interfaceC14806O, H1.d dVar) {
            return Integer.valueOf(interfaceC14806O.d(dVar));
        }
    }

    public static final Modifier a(Modifier modifier, InterfaceC14806O interfaceC14806O) {
        return modifier.then(new C14818j(interfaceC14806O, L0.b() ? new a(interfaceC14806O) : L0.a(), b.f139090f));
    }
}
