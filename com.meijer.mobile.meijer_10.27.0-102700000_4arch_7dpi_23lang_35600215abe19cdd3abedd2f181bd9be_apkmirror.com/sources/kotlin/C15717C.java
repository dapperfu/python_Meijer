package kotlin;

import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR+\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\r¨\u0006\u001a"}, d2 = {"Ln0/C;", "Landroidx/compose/runtime/z1;", "Lkotlin/ranges/IntRange;", "", "firstVisibleItem", "slidingWindowSize", "extraItemCount", "<init>", "(III)V", "", "l", "(I)V", "a", "I", "b", "<set-?>", "c", "Landroidx/compose/runtime/l0;", "f", "()Lkotlin/ranges/IntRange;", "k", "(Lkotlin/ranges/IntRange;)V", "value", "d", "lastFirstVisibleItem", "e", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: n0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15717C implements z1<IntRange> {

    /* renamed from: e, reason: collision with root package name */
    private static final a f150779e = new a(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int slidingWindowSize;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int extraItemCount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 value;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int lastFirstVisibleItem;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ln0/C$a;", "", "<init>", "()V", "", "firstVisibleItem", "slidingWindowSize", "extraItemCount", "Lkotlin/ranges/IntRange;", "b", "(III)Lkotlin/ranges/IntRange;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: n0.C$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final IntRange b(int firstVisibleItem, int slidingWindowSize, int extraItemCount) {
            int i10 = (firstVisibleItem / slidingWindowSize) * slidingWindowSize;
            return RangesKt.x(Math.max(i10 - extraItemCount, 0), i10 + slidingWindowSize + extraItemCount);
        }

        private a() {
        }
    }

    private void k(IntRange intRange) {
        this.value.setValue(intRange);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.z1
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public IntRange getValue() {
        return (IntRange) this.value.getValue();
    }

    public final void l(int firstVisibleItem) {
        if (firstVisibleItem != this.lastFirstVisibleItem) {
            this.lastFirstVisibleItem = firstVisibleItem;
            k(f150779e.b(firstVisibleItem, this.slidingWindowSize, this.extraItemCount));
        }
    }

    public C15717C(int i10, int i11, int i12) {
        this.slidingWindowSize = i11;
        this.extraItemCount = i12;
        this.value = o1.i(f150779e.b(i10, i11, i12), o1.r());
        this.lastFirstVisibleItem = i10;
    }
}
