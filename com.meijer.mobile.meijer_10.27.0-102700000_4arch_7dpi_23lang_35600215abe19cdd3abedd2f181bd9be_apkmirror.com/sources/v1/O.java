package v1;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ#\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0013R\u0014\u0010%\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010$R\u0013\u0010'\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010&R\u0011\u0010)\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010\fR\u0011\u0010+\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b*\u0010\f¨\u0006,"}, d2 = {"Lv1/O;", "", "", "charSequence", "Landroid/text/TextPaint;", "textPaint", "", "textDirectionHeuristic", "<init>", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V", "", "c", "()F", "b", "start", "end", "g", "(II)F", "a", "Ljava/lang/CharSequence;", "Landroid/text/TextPaint;", "I", "d", "F", "_maxIntrinsicWidth", "e", "_minIntrinsicWidth", "Landroid/text/BoringLayout$Metrics;", "f", "Landroid/text/BoringLayout$Metrics;", "_boringMetrics", "", "Z", "boringMetricsIsInit", "h", "_charSequenceForIntrinsicWidth", "()Ljava/lang/CharSequence;", "charSequenceForIntrinsicWidth", "()Landroid/text/BoringLayout$Metrics;", "boringMetrics", "j", "minIntrinsicWidth", "i", "maxIntrinsicWidth", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CharSequence charSequence;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextPaint textPaint;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int textDirectionHeuristic;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float _maxIntrinsicWidth = Float.NaN;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float _minIntrinsicWidth = Float.NaN;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private BoringLayout.Metrics _boringMetrics;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean boringMetricsIsInit;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private CharSequence _charSequenceForIntrinsicWidth;

    private final float c() {
        BreakIterator lineInstance = BreakIterator.getLineInstance(this.textPaint.getTextLocale());
        CharSequence charSequence = this.charSequence;
        int i10 = 0;
        lineInstance.setText(new C17455I(charSequence, 0, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new Comparator() { // from class: v1.N
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return O.d((Pair) obj, (Pair) obj2);
            }
        });
        int next = lineInstance.next();
        while (true) {
            int i11 = i10;
            i10 = next;
            if (i10 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i11), Integer.valueOf(i10)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.d()).intValue() - ((Number) pair.c()).intValue() < i10 - i11) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i11), Integer.valueOf(i10)));
                }
            }
            next = lineInstance.next();
        }
        if (priorityQueue.isEmpty()) {
            return 0.0f;
        }
        Iterator it = priorityQueue.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Pair pair2 = (Pair) it.next();
        float fG = g(((Number) pair2.a()).intValue(), ((Number) pair2.b()).intValue());
        while (it.hasNext()) {
            Pair pair3 = (Pair) it.next();
            fG = Math.max(fG, g(((Number) pair3.a()).intValue(), ((Number) pair3.b()).intValue()));
        }
        return fG;
    }

    private final CharSequence f() {
        CharSequence charSequence = this._charSequenceForIntrinsicWidth;
        if (charSequence != null) {
            Intrinsics.g(charSequence);
            return charSequence;
        }
        if (!P.f164353a) {
            return this.charSequence;
        }
        CharSequence charSequenceE = P.e(this.charSequence);
        this._charSequenceForIntrinsicWidth = charSequenceE;
        return charSequenceE;
    }

    static /* synthetic */ float h(O o10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = o10.f().length();
        }
        return o10.g(i10, i11);
    }

    public final BoringLayout.Metrics e() {
        if (!this.boringMetricsIsInit) {
            this._boringMetrics = C17470k.f164365a.c(this.charSequence, this.textPaint, q0.k(this.textDirectionHeuristic));
            this.boringMetricsIsInit = true;
        }
        return this._boringMetrics;
    }

    public final float i() {
        if (!Float.isNaN(this._maxIntrinsicWidth)) {
            return this._maxIntrinsicWidth;
        }
        float fB = b();
        this._maxIntrinsicWidth = fB;
        return fB;
    }

    public final float j() {
        if (!Float.isNaN(this._minIntrinsicWidth)) {
            return this._minIntrinsicWidth;
        }
        float fC = c();
        this._minIntrinsicWidth = fC;
        return fC;
    }

    public O(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.charSequence = charSequence;
        this.textPaint = textPaint;
        this.textDirectionHeuristic = i10;
    }

    private final float b() {
        int i10;
        BoringLayout.Metrics metricsE = e();
        if (metricsE != null) {
            i10 = metricsE.width;
        } else {
            i10 = -1;
        }
        float fCeil = i10;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(h(this, 0, 0, 3, null));
        }
        if (P.d(fCeil, this.charSequence, this.textPaint)) {
            return fCeil + 0.5f;
        }
        return fCeil;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(Pair pair, Pair pair2) {
        return (((Number) pair.d()).intValue() - ((Number) pair.c()).intValue()) - (((Number) pair2.d()).intValue() - ((Number) pair2.c()).intValue());
    }

    private final float g(int start, int end) {
        return Layout.getDesiredWidth(f(), start, end, this.textPaint);
    }
}
