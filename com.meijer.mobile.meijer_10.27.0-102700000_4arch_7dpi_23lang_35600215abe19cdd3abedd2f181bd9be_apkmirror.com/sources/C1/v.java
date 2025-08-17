package C1;

import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.f;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R&\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R&\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0004\u0012\u00020\u00170\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0019"}, d2 = {"LC1/v;", "", "<init>", "()V", "Landroidx/compose/ui/text/B;", "urlAnnotation", "Landroid/text/style/URLSpan;", "c", "(Landroidx/compose/ui/text/B;)Landroid/text/style/URLSpan;", "Landroidx/compose/ui/text/AnnotatedString$d;", "Landroidx/compose/ui/text/f$b;", "urlRange", "b", "(Landroidx/compose/ui/text/AnnotatedString$d;)Landroid/text/style/URLSpan;", "Landroidx/compose/ui/text/f;", "linkRange", "Landroid/text/style/ClickableSpan;", "a", "(Landroidx/compose/ui/text/AnnotatedString$d;)Landroid/text/style/ClickableSpan;", "Ljava/util/WeakHashMap;", "Ljava/util/WeakHashMap;", "spansByAnnotation", "urlSpansByAnnotation", "LC1/m;", "linkSpansWithListenerByAnnotation", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WeakHashMap<UrlAnnotation, URLSpan> spansByAnnotation = new WeakHashMap<>();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final WeakHashMap<AnnotatedString.Range<f.b>, URLSpan> urlSpansByAnnotation = new WeakHashMap<>();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final WeakHashMap<AnnotatedString.Range<androidx.compose.ui.text.f>, m> linkSpansWithListenerByAnnotation = new WeakHashMap<>();

    public final ClickableSpan a(AnnotatedString.Range<androidx.compose.ui.text.f> linkRange) {
        WeakHashMap<AnnotatedString.Range<androidx.compose.ui.text.f>, m> weakHashMap = this.linkSpansWithListenerByAnnotation;
        m mVar = weakHashMap.get(linkRange);
        if (mVar == null) {
            mVar = new m(linkRange.g());
            weakHashMap.put(linkRange, mVar);
        }
        return mVar;
    }

    public final URLSpan b(AnnotatedString.Range<f.b> urlRange) {
        WeakHashMap<AnnotatedString.Range<f.b>, URLSpan> weakHashMap = this.urlSpansByAnnotation;
        URLSpan uRLSpan = weakHashMap.get(urlRange);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(urlRange.g().getUrl());
            weakHashMap.put(urlRange, uRLSpan);
        }
        return uRLSpan;
    }

    public final URLSpan c(UrlAnnotation urlAnnotation) {
        WeakHashMap<UrlAnnotation, URLSpan> weakHashMap = this.spansByAnnotation;
        URLSpan uRLSpan = weakHashMap.get(urlAnnotation);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(urlAnnotation.getUrl());
            weakHashMap.put(urlAnnotation, uRLSpan);
        }
        return uRLSpan;
    }
}
