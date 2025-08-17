package l0;

import java.util.List;
import kotlin.InterfaceC13787E;
import kotlin.InterfaceC15723I;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll0/A;", "state", "Lf0/E;", "scrollScope", "Ln0/I;", "a", "(Ll0/A;Lf0/E;)Ln0/I;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y {

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u001a"}, d2 = {"l0/y$a", "Ln0/I;", "Lf0/E;", "", "pixels", "e", "(F)F", "", "index", "offset", "", "d", "(II)V", "targetIndex", "targetOffset", "f", "(II)I", "h", "()I", "firstVisibleItemIndex", "g", "firstVisibleItemScrollOffset", "b", "lastVisibleItemIndex", "a", "itemCount", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a implements InterfaceC15723I, InterfaceC13787E {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ InterfaceC13787E f148386a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C15339A f148387b;

        a(InterfaceC13787E interfaceC13787E, C15339A c15339a) {
            this.f148387b = c15339a;
            this.f148386a = interfaceC13787E;
        }

        @Override // kotlin.InterfaceC15723I
        public int a() {
            return this.f148387b.x().getTotalItemsCount();
        }

        @Override // kotlin.InterfaceC15723I
        public int b() {
            InterfaceC15349i interfaceC15349i = (InterfaceC15349i) CollectionsKt.F0(this.f148387b.x().h());
            if (interfaceC15349i != null) {
                return interfaceC15349i.getIndex();
            }
            return 0;
        }

        @Override // kotlin.InterfaceC15723I
        public void d(int index, int offset) {
            this.f148387b.M(index, offset, true);
        }

        @Override // kotlin.InterfaceC13787E
        public float e(float pixels) {
            return this.f148386a.e(pixels);
        }

        @Override // kotlin.InterfaceC15723I
        public int f(int targetIndex, int targetOffset) {
            InterfaceC15349i interfaceC15349i;
            n nVarX = this.f148387b.x();
            int iA = 0;
            if (nVarX.h().isEmpty()) {
                return 0;
            }
            int iH = h();
            if (targetIndex > b() || iH > targetIndex) {
                iA = (o.a(nVarX) * (targetIndex - h())) - g();
            } else {
                List<InterfaceC15349i> listH = nVarX.h();
                int size = listH.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        interfaceC15349i = null;
                        break;
                    }
                    interfaceC15349i = listH.get(i10);
                    if (interfaceC15349i.getIndex() == targetIndex) {
                        break;
                    }
                    i10++;
                }
                InterfaceC15349i interfaceC15349i2 = interfaceC15349i;
                if (interfaceC15349i2 != null) {
                    iA = interfaceC15349i2.getOffset();
                }
            }
            return iA + targetOffset;
        }

        @Override // kotlin.InterfaceC15723I
        public int g() {
            return this.f148387b.t();
        }

        @Override // kotlin.InterfaceC15723I
        public int h() {
            return this.f148387b.s();
        }
    }

    public static final InterfaceC15723I a(C15339A c15339a, InterfaceC13787E interfaceC13787E) {
        return new a(interfaceC13787E, c15339a);
    }
}
