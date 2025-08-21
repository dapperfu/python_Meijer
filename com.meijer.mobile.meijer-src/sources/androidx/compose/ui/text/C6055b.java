package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00008\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\u001aG\u0010\u0007\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0001\u0018\u00010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u0000*\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u0013\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0001\u0018\u00010\u0000*\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0015\u001a\u00020\t*\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aK\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0018\u00010\u0000\"\u0004\b\u0000\u0010\u00172\u0016\u0010\u0018\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a/\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u000f\u0010!\u001a\u00020\tH\u0000¢\u0006\u0004\b!\u0010\"\"\u0014\u0010%\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"", "Landroidx/compose/ui/text/AnnotatedString$d;", "Landroidx/compose/ui/text/s;", "spanStyles", "Landroidx/compose/ui/text/n;", "paragraphStyles", "Landroidx/compose/ui/text/AnnotatedString$a;", "d", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Landroidx/compose/ui/text/AnnotatedString;", "defaultParagraphStyle", "j", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/n;)Ljava/util/List;", "", "start", "end", "Lkotlin/Function1;", "", "predicate", "g", "(Landroidx/compose/ui/text/AnnotatedString;IILkotlin/jvm/functions/Function1;)Ljava/util/List;", "k", "(Landroidx/compose/ui/text/AnnotatedString;II)Landroidx/compose/ui/text/AnnotatedString;", "T", "ranges", "f", "(Ljava/util/List;II)Ljava/util/List;", "lStart", "lEnd", "rStart", "rEnd", "i", "(IIII)Z", "e", "()Landroidx/compose/ui/text/AnnotatedString;", "a", "Landroidx/compose/ui/text/AnnotatedString;", "EmptyAnnotatedString", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.text.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6055b {

    /* renamed from: a, reason: collision with root package name */
    private static final AnnotatedString f52660a = new AnnotatedString("", null, 2, 0 == true ? 1 : 0);

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.text.b$a */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Integer.valueOf(((AnnotatedString.Range) t10).h()), Integer.valueOf(((AnnotatedString.Range) t11).h()));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$a;", "it", "", "a", "(Landroidx/compose/ui/text/AnnotatedString$a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.text.b$b, reason: collision with other inner class name */
    static final class C1085b extends Lambda implements Function1<AnnotatedString.a, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final C1085b f52661f = new C1085b();

        C1085b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AnnotatedString.a aVar) {
            return Boolean.valueOf(!(aVar instanceof ParagraphStyle));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<AnnotatedString.Range<T>> f(List<? extends AnnotatedString.Range<? extends T>> list, int i10, int i11) {
        if (!(i10 <= i11)) {
            A1.a.a("start (" + i10 + ") should be less than or equal to end (" + i11 + ')');
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            AnnotatedString.Range<? extends T> range = list.get(i12);
            if (i(i10, i11, range.h(), range.f())) {
                arrayList.add(new AnnotatedString.Range(range.g(), Math.max(i10, range.h()) - i10, Math.min(i11, range.f()) - i10, range.getTag()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private static final List<AnnotatedString.Range<? extends AnnotatedString.a>> g(AnnotatedString annotatedString, int i10, int i11, Function1<? super AnnotatedString.a, Boolean> function1) {
        List<AnnotatedString.Range<? extends AnnotatedString.a>> listC;
        if (i10 == i11 || (listC = annotatedString.c()) == null) {
            return null;
        }
        if (i10 != 0 || i11 < annotatedString.getText().length()) {
            ArrayList arrayList = new ArrayList(listC.size());
            int size = listC.size();
            for (int i12 = 0; i12 < size; i12++) {
                AnnotatedString.Range<? extends AnnotatedString.a> range = listC.get(i12);
                if ((function1 != null ? function1.invoke(range.g()).booleanValue() : true) && i(i10, i11, range.h(), range.f())) {
                    arrayList.add(new AnnotatedString.Range(range.g(), RangesKt.o(range.h(), i10, i11) - i10, RangesKt.o(range.f(), i10, i11) - i10, range.getTag()));
                }
            }
            return arrayList;
        }
        if (function1 == null) {
            return listC;
        }
        ArrayList arrayList2 = new ArrayList(listC.size());
        int size2 = listC.size();
        for (int i13 = 0; i13 < size2; i13++) {
            AnnotatedString.Range<? extends AnnotatedString.a> range2 = listC.get(i13);
            if (function1.invoke(range2.g()).booleanValue()) {
                arrayList2.add(range2);
            }
        }
        return arrayList2;
    }

    public static final boolean i(int i10, int i11, int i12, int i13) {
        return ((i10 < i13) & (i12 < i11)) | (((i10 == i11) | (i12 == i13)) & (i10 == i12));
    }

    public static final AnnotatedString e() {
        return f52660a;
    }

    static /* synthetic */ List h(AnnotatedString annotatedString, int i10, int i11, Function1 function1, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            function1 = null;
        }
        return g(annotatedString, i10, i11, function1);
    }

    public static final List<AnnotatedString.Range<ParagraphStyle>> j(AnnotatedString annotatedString, ParagraphStyle nVar) {
        List listM;
        List<AnnotatedString.Range<ParagraphStyle>> listG = annotatedString.g();
        if (listG == null || (listM = CollectionsKt.Z0(listG, new a())) == null) {
            listM = CollectionsKt.m();
        }
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int size = listM.size();
        int iF = 0;
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range range = (AnnotatedString.Range) listM.get(i10);
            AnnotatedString.Range rangeE = AnnotatedString.Range.e(range, nVar.l((ParagraphStyle) range.g()), 0, 0, null, 14, null);
            while (iF < rangeE.h() && !arrayDeque.isEmpty()) {
                AnnotatedString.Range range2 = (AnnotatedString.Range) arrayDeque.last();
                if (rangeE.h() < range2.f()) {
                    arrayList.add(new AnnotatedString.Range(range2.g(), iF, rangeE.h()));
                    iF = rangeE.h();
                } else {
                    arrayList.add(new AnnotatedString.Range(range2.g(), iF, range2.f()));
                    iF = range2.f();
                    while (!arrayDeque.isEmpty() && iF == ((AnnotatedString.Range) arrayDeque.last()).f()) {
                        arrayDeque.removeLast();
                    }
                }
            }
            if (iF < rangeE.h()) {
                arrayList.add(new AnnotatedString.Range(nVar, iF, rangeE.h()));
                iF = rangeE.h();
            }
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayDeque.r();
            if (range3 == null) {
                arrayDeque.add(new AnnotatedString.Range(rangeE.g(), rangeE.h(), rangeE.f()));
            } else if (range3.h() == rangeE.h() && range3.f() == rangeE.f()) {
                arrayDeque.removeLast();
                arrayDeque.add(new AnnotatedString.Range(((ParagraphStyle) range3.g()).l((ParagraphStyle) rangeE.g()), rangeE.h(), rangeE.f()));
            } else if (range3.h() == range3.f()) {
                arrayList.add(new AnnotatedString.Range(range3.g(), range3.h(), range3.f()));
                arrayDeque.removeLast();
                arrayDeque.add(new AnnotatedString.Range(rangeE.g(), rangeE.h(), rangeE.f()));
            } else {
                if (range3.f() < rangeE.f()) {
                    throw new IllegalArgumentException();
                }
                arrayDeque.add(new AnnotatedString.Range(((ParagraphStyle) range3.g()).l((ParagraphStyle) rangeE.g()), rangeE.h(), rangeE.f()));
            }
        }
        while (iF <= annotatedString.getText().length() && !arrayDeque.isEmpty()) {
            AnnotatedString.Range range4 = (AnnotatedString.Range) arrayDeque.last();
            arrayList.add(new AnnotatedString.Range(range4.g(), iF, range4.f()));
            iF = range4.f();
            while (!arrayDeque.isEmpty() && iF == ((AnnotatedString.Range) arrayDeque.last()).f()) {
                arrayDeque.removeLast();
            }
        }
        if (iF < annotatedString.getText().length()) {
            arrayList.add(new AnnotatedString.Range(nVar, iF, annotatedString.getText().length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.Range(nVar, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString k(AnnotatedString annotatedString, int i10, int i11) {
        String strSubstring;
        if (i10 != i11) {
            strSubstring = annotatedString.getText().substring(i10, i11);
            Intrinsics.i(strSubstring, "substring(...)");
        } else {
            strSubstring = "";
        }
        List<AnnotatedString.Range<? extends AnnotatedString.a>> listG = g(annotatedString, i10, i11, C1085b.f52661f);
        if (listG == null) {
            listG = CollectionsKt.m();
        }
        return new AnnotatedString(strSubstring, listG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<? extends AnnotatedString.a>> d(List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<ParagraphStyle>> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        if (list2.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(list.get(i10));
        }
        int size2 = list2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList.add(list2.get(i11));
        }
        return arrayList;
    }
}
