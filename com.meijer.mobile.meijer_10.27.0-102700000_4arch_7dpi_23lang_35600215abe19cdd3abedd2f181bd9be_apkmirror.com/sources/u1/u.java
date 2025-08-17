package u1;

import androidx.collection.LruCache;
import androidx.compose.ui.text.TextLayoutInput;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lu1/u;", "", "", "capacity", "<init>", "(I)V", "Landroidx/compose/ui/text/v;", "key", "Lu1/v;", "a", "(Landroidx/compose/ui/text/v;)Lu1/v;", "value", "", "b", "(Landroidx/compose/ui/text/v;Lu1/v;)V", "Landroidx/collection/LruCache;", "Lu1/c;", "Landroidx/collection/LruCache;", "cache", "Lu1/c;", "singleSizeCacheInput", "c", "Lu1/v;", "singleSizeCacheResult", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LruCache<C17211c, TextLayoutResult> cache;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private C17211c singleSizeCacheInput;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private TextLayoutResult singleSizeCacheResult;

    public final TextLayoutResult a(TextLayoutInput key) {
        TextLayoutResult textLayoutResultD;
        C17211c c17211c = new C17211c(key);
        LruCache<C17211c, TextLayoutResult> lruCache = this.cache;
        if (lruCache != null) {
            textLayoutResultD = lruCache.d(c17211c);
        } else {
            if (!Intrinsics.e(this.singleSizeCacheInput, c17211c)) {
                return null;
            }
            textLayoutResultD = this.singleSizeCacheResult;
        }
        if (textLayoutResultD == null || textLayoutResultD.getMultiParagraph().getIntrinsics().a()) {
            return null;
        }
        return textLayoutResultD;
    }

    public final void b(TextLayoutInput key, TextLayoutResult value) {
        LruCache<C17211c, TextLayoutResult> lruCache = this.cache;
        if (lruCache != null) {
            lruCache.f(new C17211c(key), value);
        } else {
            this.singleSizeCacheInput = new C17211c(key);
            this.singleSizeCacheResult = value;
        }
    }

    public u(int i10) {
        LruCache<C17211c, TextLayoutResult> lruCache;
        if (i10 != 1) {
            lruCache = new LruCache<>(i10);
        } else {
            lruCache = null;
        }
        this.cache = lruCache;
    }
}
