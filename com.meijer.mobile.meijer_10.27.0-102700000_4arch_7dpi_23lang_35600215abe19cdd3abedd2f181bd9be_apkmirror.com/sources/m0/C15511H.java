package m0;

import i0.C14589e;
import java.util.ArrayList;
import java.util.List;
import kotlin.InterfaceC15745e;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0019\n\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010 R\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010 R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010(R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R*\u0010/\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010 \u001a\u0004\b#\u0010-\"\u0004\b*\u0010.R\u0014\u00100\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010-R\u0011\u00101\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b%\u0010-¨\u00062"}, d2 = {"Lm0/H;", "", "Lm0/i;", "gridContent", "<init>", "(Lm0/i;)V", "", "currentSlotsPerLine", "", "Lm0/c;", "b", "(I)Ljava/util/List;", "", "g", "()V", "lineIndex", "Lm0/H$c;", "c", "(I)Lm0/H$c;", "itemIndex", "d", "(I)I", "maxSpan", "i", "(II)I", "a", "Lm0/i;", "Ljava/util/ArrayList;", "Lm0/H$a;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "buckets", "I", "lastLineIndex", "lastLineStartItemIndex", "e", "lastLineStartKnownSpan", "f", "cachedBucketIndex", "", "Ljava/util/List;", "cachedBucket", "h", "previousDefaultSpans", "value", "()I", "(I)V", "slotsPerLine", "bucketSize", "totalSize", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: m0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15511H {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15523i gridContent;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<a> buckets;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int lastLineIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int lastLineStartItemIndex;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int lastLineStartKnownSpan;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int cachedBucketIndex;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<Integer> cachedBucket;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private List<C15517c> previousDefaultSpans;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int slotsPerLine;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lm0/H$a;", "", "", "firstItemIndex", "firstItemKnownSpan", "<init>", "(II)V", "a", "I", "()I", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m0.H$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int firstItemIndex;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int firstItemKnownSpan;

        public a(int i10, int i11) {
            this.firstItemIndex = i10;
            this.firstItemKnownSpan = i11;
        }

        /* renamed from: a, reason: from getter */
        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        /* renamed from: b, reason: from getter */
        public final int getFirstItemKnownSpan() {
            return this.firstItemKnownSpan;
        }

        public /* synthetic */ a(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i12 & 2) != 0 ? 0 : i11);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000e\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u0005\u0010\n¨\u0006\u000f"}, d2 = {"Lm0/H$b;", "Lm0/p;", "<init>", "()V", "", "b", "I", "getMaxCurrentLineSpan", "()I", "a", "(I)V", "maxCurrentLineSpan", "c", "getMaxLineSpan", "maxLineSpan", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m0.H$b */
    private static final class b implements InterfaceC15530p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f149522a = new b();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static int maxCurrentLineSpan;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static int maxLineSpan;

        public void a(int i10) {
            maxCurrentLineSpan = i10;
        }

        public void b(int i10) {
            maxLineSpan = i10;
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lm0/H$c;", "", "", "firstItemIndex", "", "Lm0/c;", "spans", "<init>", "(ILjava/util/List;)V", "a", "I", "()I", "b", "Ljava/util/List;", "()Ljava/util/List;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m0.H$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int firstItemIndex;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<C15517c> spans;

        /* renamed from: a, reason: from getter */
        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final List<C15517c> b() {
            return this.spans;
        }

        public c(int i10, List<C15517c> list) {
            this.firstItemIndex = i10;
            this.spans = list;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm0/H$a;", "it", "", "a", "(Lm0/H$a;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m0.H$d */
    static final class d extends Lambda implements Function1<a, Integer> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f149527f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10) {
            super(1);
            this.f149527f = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(a aVar) {
            return Integer.valueOf(aVar.getFirstItemIndex() - this.f149527f);
        }
    }

    private final List<C15517c> b(int currentSlotsPerLine) {
        if (currentSlotsPerLine == this.previousDefaultSpans.size()) {
            return this.previousDefaultSpans;
        }
        ArrayList arrayList = new ArrayList(currentSlotsPerLine);
        for (int i10 = 0; i10 < currentSlotsPerLine; i10++) {
            arrayList.add(C15517c.a(C15510G.a(1)));
        }
        this.previousDefaultSpans = arrayList;
        return arrayList;
    }

    private final void g() {
        this.buckets.clear();
        int i10 = 0;
        this.buckets.add(new a(i10, i10, 2, null));
        this.lastLineIndex = 0;
        this.lastLineStartItemIndex = 0;
        this.lastLineStartKnownSpan = 0;
        this.cachedBucketIndex = -1;
        this.cachedBucket.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m0.C15511H.c c(int r11) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C15511H.c(int):m0.H$c");
    }

    /* renamed from: e, reason: from getter */
    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public final int f() {
        return this.gridContent.k().getSize();
    }

    public final void h(int i10) {
        if (i10 != this.slotsPerLine) {
            this.slotsPerLine = i10;
            g();
        }
    }

    public final int i(int itemIndex, int maxSpan) {
        b bVar = b.f149522a;
        bVar.a(maxSpan);
        bVar.b(this.slotsPerLine);
        InterfaceC15745e.a<C15522h> aVar = this.gridContent.k().get(itemIndex);
        return C15517c.d(aVar.c().b().invoke(bVar, Integer.valueOf(itemIndex - aVar.getStartIndex())).getPackedValue());
    }

    public C15511H(C15523i c15523i) {
        this.gridContent = c15523i;
        ArrayList<a> arrayList = new ArrayList<>();
        int i10 = 0;
        arrayList.add(new a(i10, i10, 2, null));
        this.buckets = arrayList;
        this.cachedBucketIndex = -1;
        this.cachedBucket = new ArrayList();
        this.previousDefaultSpans = CollectionsKt.m();
    }

    private final int a() {
        return ((int) Math.sqrt((f() * 1.0d) / this.slotsPerLine)) + 1;
    }

    public final int d(int itemIndex) {
        boolean z10;
        boolean z11;
        int i10;
        int i11 = 0;
        if (f() <= 0) {
            return 0;
        }
        if (itemIndex < f()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C14589e.a("ItemIndex > total count");
        }
        if (!this.gridContent.getHasCustomSpans()) {
            return itemIndex / this.slotsPerLine;
        }
        int iK = CollectionsKt.k(this.buckets, 0, 0, new d(itemIndex), 3, null);
        int i12 = 2;
        if (iK < 0) {
            iK = (-iK) - 2;
        }
        int iA = a() * iK;
        int firstItemIndex = this.buckets.get(iK).getFirstItemIndex();
        if (firstItemIndex <= itemIndex) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            C14589e.a("currentItemIndex > itemIndex");
        }
        int i13 = 0;
        while (firstItemIndex < itemIndex) {
            int i14 = firstItemIndex + 1;
            int i15 = i(firstItemIndex, this.slotsPerLine - i13);
            i13 += i15;
            int i16 = this.slotsPerLine;
            if (i13 >= i16) {
                if (i13 == i16) {
                    iA++;
                    i13 = 0;
                } else {
                    iA++;
                    i13 = i15;
                }
            }
            if (iA % a() == 0 && iA / a() >= this.buckets.size()) {
                ArrayList<a> arrayList = this.buckets;
                if (i13 > 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                arrayList.add(new a(i14 - i10, i11, i12, null));
            }
            firstItemIndex = i14;
        }
        if (i13 + i(itemIndex, this.slotsPerLine - i13) > this.slotsPerLine) {
            return iA + 1;
        }
        return iA;
    }
}
