package kotlin;

import Z.AbstractC5517o;
import Z.C5518p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b`\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J'\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJU\u0010\u0013\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Ln0/a0;", "", "", "firstVisibleItemIndex", "lastVisibleItemIndex", "LZ/o;", "stickyItems", "b", "(IILZ/o;)LZ/o;", "", "Ln0/y;", "visibleStickyItems", "itemIndex", "itemSize", "itemOffset", "beforeContentPadding", "afterContentPadding", "layoutWidth", "layoutHeight", "a", "(Ljava/util/List;IIIIIII)I", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: n0.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC15741a0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f150879a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ln0/a0$a;", "", "<init>", "()V", "Ln0/a0;", "b", "Ln0/a0;", "a", "()Ln0/a0;", "StickToTopPlacement", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: n0.a0$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f150879a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final InterfaceC15741a0 StickToTopPlacement = new C2326a();

        @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JU\u0010\r\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"n0/a0$a$a", "Ln0/a0;", "", "Ln0/y;", "visibleStickyItems", "", "itemIndex", "itemSize", "itemOffset", "beforeContentPadding", "afterContentPadding", "layoutWidth", "layoutHeight", "a", "(Ljava/util/List;IIIIIII)I", "firstVisibleItemIndex", "lastVisibleItemIndex", "LZ/o;", "stickyItems", "b", "(IILZ/o;)LZ/o;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: n0.a0$a$a, reason: collision with other inner class name */
        public static final class C2326a implements InterfaceC15741a0 {
            @Override // kotlin.InterfaceC15741a0
            public int a(List<? extends InterfaceC15765y> visibleStickyItems, int itemIndex, int itemSize, int itemOffset, int beforeContentPadding, int afterContentPadding, int layoutWidth, int layoutHeight) {
                InterfaceC15765y interfaceC15765y;
                int size = visibleStickyItems.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        interfaceC15765y = null;
                        break;
                    }
                    interfaceC15765y = visibleStickyItems.get(i10);
                    if (interfaceC15765y.getIndex() != itemIndex) {
                        break;
                    }
                    i10++;
                }
                InterfaceC15765y interfaceC15765y2 = interfaceC15765y;
                int iC = interfaceC15765y2 != null ? C15726L.c(interfaceC15765y2) : Integer.MIN_VALUE;
                int iMax = itemOffset == Integer.MIN_VALUE ? -beforeContentPadding : Math.max(-beforeContentPadding, itemOffset);
                return iC != Integer.MIN_VALUE ? Math.min(iMax, iC - itemSize) : iMax;
            }

            @Override // kotlin.InterfaceC15741a0
            public AbstractC5517o b(int firstVisibleItemIndex, int lastVisibleItemIndex, AbstractC5517o stickyItems) {
                int i10;
                if (lastVisibleItemIndex - firstVisibleItemIndex < 0 || (i10 = stickyItems._size) == 0) {
                    return C5518p.a();
                }
                IntRange intRangeX = RangesKt.x(0, i10);
                int first = intRangeX.getFirst();
                int last = intRangeX.getLast();
                int iE = -1;
                if (first <= last) {
                    while (stickyItems.e(first) <= firstVisibleItemIndex) {
                        iE = stickyItems.e(first);
                        if (first == last) {
                            break;
                        }
                        first++;
                    }
                }
                return iE == -1 ? C5518p.a() : C5518p.b(iE);
            }

            C2326a() {
            }
        }

        public final InterfaceC15741a0 a() {
            return StickToTopPlacement;
        }

        private Companion() {
        }
    }

    int a(List<? extends InterfaceC15765y> visibleStickyItems, int itemIndex, int itemSize, int itemOffset, int beforeContentPadding, int afterContentPadding, int layoutWidth, int layoutHeight);

    AbstractC5517o b(int firstVisibleItemIndex, int lastVisibleItemIndex, AbstractC5517o stickyItems);
}
