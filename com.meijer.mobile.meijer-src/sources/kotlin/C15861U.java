package kotlin;

import Z.W;
import Z.i0;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\"\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0019"}, d2 = {"Ln0/U;", "", "<init>", "()V", "contentType", "Ln0/b;", "a", "(Ljava/lang/Object;)Ln0/b;", "", "b", "(Ljava/lang/Object;)J", "c", "timeNanos", "", "d", "(Ljava/lang/Object;J)V", "e", "Ln0/b;", "overallAverage", "LZ/W;", "LZ/W;", "averagesByContentType", "Ljava/lang/Object;", "lastUsedContentType", "lastUsedAverage", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: n0.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15861U {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15869b overallAverage = new C15869b();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final W<Object, C15869b> averagesByContentType = i0.c();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Object lastUsedContentType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private C15869b lastUsedAverage;

    private final C15869b a(Object contentType) {
        C15869b c15869b = this.lastUsedAverage;
        if (this.lastUsedContentType == contentType && c15869b != null) {
            return c15869b;
        }
        W<Object, C15869b> w10 = this.averagesByContentType;
        C15869b c15869bE = w10.e(contentType);
        if (c15869bE == null) {
            c15869bE = this.overallAverage.b();
            w10.x(contentType, c15869bE);
        }
        C15869b c15869b2 = c15869bE;
        this.lastUsedContentType = contentType;
        this.lastUsedAverage = c15869b2;
        return c15869b2;
    }

    public final void d(Object contentType, long timeNanos) {
        this.overallAverage.e(timeNanos);
        a(contentType).e(timeNanos);
    }

    public final void e(Object contentType, long timeNanos) {
        this.overallAverage.f(timeNanos);
        a(contentType).f(timeNanos);
    }

    public final long b(Object contentType) {
        return a(contentType).getCompositionTimeNanos();
    }

    public final long c(Object contentType) {
        return a(contentType).getMeasureTimeNanos();
    }
}
