package u1;

import androidx.compose.ui.text.ParagraphInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a<\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0013\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0013\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"", "Landroidx/compose/ui/text/k;", "paragraphInfoList", "", "index", "a", "(Ljava/util/List;I)I", "", "y", "c", "(Ljava/util/List;F)I", "Landroidx/compose/ui/text/y;", "range", "Lkotlin/Function1;", "", "action", "d", "(Ljava/util/List;JLkotlin/jvm/functions/Function1;)V", "lineIndex", "b", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: u1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17340e {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/k;", "it", "", "a", "(Landroidx/compose/ui/text/k;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: u1.e$a */
    static final class a extends Lambda implements Function1<ParagraphInfo, CharSequence> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f163631f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(ParagraphInfo paragraphInfo) {
            return '[' + paragraphInfo.getStartIndex() + ", " + paragraphInfo.getEndIndex() + ')';
        }
    }

    public static final int c(List<ParagraphInfo> list, float f10) {
        if (f10 <= 0.0f) {
            return 0;
        }
        if (f10 >= ((ParagraphInfo) CollectionsKt.D0(list)).getBottom()) {
            return CollectionsKt.o(list);
        }
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i11);
            char c10 = paragraphInfo.getTop() > f10 ? (char) 1 : paragraphInfo.getBottom() <= f10 ? (char) 65535 : (char) 0;
            if (c10 < 0) {
                i10 = i11 + 1;
            } else {
                if (c10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final int a(List<ParagraphInfo> list, int i10) {
        boolean z10;
        int i11;
        char c10;
        int endIndex = ((ParagraphInfo) CollectionsKt.D0(list)).getEndIndex();
        boolean z11 = false;
        if (i10 <= ((ParagraphInfo) CollectionsKt.D0(list)).getEndIndex()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            A1.a.a("Index " + i10 + " should be less or equal than last line's end " + endIndex);
        }
        int size = list.size() - 1;
        int i12 = 0;
        while (true) {
            if (i12 <= size) {
                i11 = (i12 + size) >>> 1;
                ParagraphInfo paragraphInfo = list.get(i11);
                if (paragraphInfo.getStartIndex() > i10) {
                    c10 = 1;
                } else if (paragraphInfo.getEndIndex() <= i10) {
                    c10 = 65535;
                } else {
                    c10 = 0;
                }
                if (c10 < 0) {
                    i12 = i11 + 1;
                } else {
                    if (c10 <= 0) {
                        break;
                    }
                    size = i11 - 1;
                }
            } else {
                i11 = -(i12 + 1);
                break;
            }
        }
        if (i11 >= 0 && i11 < list.size()) {
            z11 = true;
        }
        if (!z11) {
            A1.a.a("Found paragraph index " + i11 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i10 + ", paragraphs=[" + J1.a.e(list, null, null, null, 0, null, a.f163631f, 31, null) + ']');
        }
        return i11;
    }

    public static final int b(List<ParagraphInfo> list, int i10) {
        char c10;
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i12);
            if (paragraphInfo.getStartLineIndex() > i10) {
                c10 = 1;
            } else if (paragraphInfo.getEndLineIndex() <= i10) {
                c10 = 65535;
            } else {
                c10 = 0;
            }
            if (c10 < 0) {
                i11 = i12 + 1;
            } else if (c10 > 0) {
                size = i12 - 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    public static final void d(List<ParagraphInfo> list, long j10, Function1<? super ParagraphInfo, Unit> function1) {
        int size = list.size();
        for (int iA = a(list, androidx.compose.ui.text.y.l(j10)); iA < size; iA++) {
            ParagraphInfo paragraphInfo = list.get(iA);
            if (paragraphInfo.getStartIndex() < androidx.compose.ui.text.y.k(j10)) {
                if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                    function1.invoke(paragraphInfo);
                }
            } else {
                return;
            }
        }
    }
}
