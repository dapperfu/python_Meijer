package w1;

import android.text.SegmentFinder;
import kotlin.Metadata;
import v1.C17601c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw1/a;", "", "<init>", "()V", "Lw1/f;", "Landroid/text/SegmentFinder;", "a", "(Lw1/f;)Landroid/text/SegmentFinder;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17811a {

    /* renamed from: a, reason: collision with root package name */
    public static final C17811a f166848a = new C17811a();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"w1/a$a", "Landroid/text/SegmentFinder;", "", "offset", "previousStartBoundary", "(I)I", "previousEndBoundary", "nextStartBoundary", "nextEndBoundary", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w1.a$a, reason: collision with other inner class name */
    public static final class C2648a extends SegmentFinder {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17816f f166849a;

        C2648a(InterfaceC17816f interfaceC17816f) {
            this.f166849a = interfaceC17816f;
        }

        public int nextEndBoundary(int offset) {
            return this.f166849a.c(offset);
        }

        public int nextStartBoundary(int offset) {
            return this.f166849a.a(offset);
        }

        public int previousEndBoundary(int offset) {
            return this.f166849a.d(offset);
        }

        public int previousStartBoundary(int offset) {
            return this.f166849a.b(offset);
        }
    }

    public final SegmentFinder a(InterfaceC17816f interfaceC17816f) {
        return C17601c.a(new C2648a(interfaceC17816f));
    }

    private C17811a() {
    }
}
