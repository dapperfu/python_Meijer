package p2;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.Sequence;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroid/view/ViewGroup;", "", "index", "Landroid/view/View;", "a", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "", "d", "(Landroid/view/ViewGroup;)Ljava/util/Iterator;", "Lkotlin/sequences/Sequence;", "b", "(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;", "children", "c", "descendants", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: p2.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16349c0 {

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"p2/c0$a", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "", "iterator", "()Ljava/util/Iterator;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: p2.c0$a */
    public static final class a implements Sequence<View> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f156050a;

        a(ViewGroup viewGroup) {
            this.f156050a = viewGroup;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<View> iterator() {
            return C16349c0.d(this.f156050a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "child", "", "a", "(Landroid/view/View;)Ljava/util/Iterator;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: p2.c0$b */
    static final class b extends Lambda implements Function1<View, Iterator<? extends View>> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f156051f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<View> invoke(View view) {
            Sequence<View> sequenceB;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (sequenceB = C16349c0.b(viewGroup)) == null) {
                return null;
            }
            return sequenceB.iterator();
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u000e"}, d2 = {"p2/c0$c", "", "Landroid/view/View;", "", "hasNext", "()Z", "a", "()Landroid/view/View;", "", "remove", "()V", "", "I", "index", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: p2.c0$c */
    public static final class c implements Iterator<View>, KMutableIterator {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f156053b;

        c(ViewGroup viewGroup) {
            this.f156053b = viewGroup;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f156053b;
            int i10 = this.index;
            this.index = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f156053b.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f156053b;
            int i10 = this.index - 1;
            this.index = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: p2.c0$d */
    public static final class d implements Sequence<View> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f156054a;

        public d(ViewGroup viewGroup) {
            this.f156054a = viewGroup;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<View> iterator() {
            return new U(C16349c0.b(this.f156054a).iterator(), b.f156051f);
        }
    }

    public static final Sequence<View> b(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final Sequence<View> c(ViewGroup viewGroup) {
        return new d(viewGroup);
    }

    public static final Iterator<View> d(ViewGroup viewGroup) {
        return new c(viewGroup);
    }

    public static final View a(ViewGroup viewGroup, int i10) {
        View childAt = viewGroup.getChildAt(i10);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + viewGroup.getChildCount());
    }
}
