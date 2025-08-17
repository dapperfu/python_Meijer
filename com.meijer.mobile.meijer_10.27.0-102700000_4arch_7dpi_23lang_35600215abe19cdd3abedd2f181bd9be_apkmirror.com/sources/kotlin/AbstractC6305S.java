package kotlin;

import Z.K;
import Z.r;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.AbstractC6303P;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u00028\u0001*\u00028\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0004¢\u0006\u0004\b\t\u0010\nR,\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R,\u0010\u0015\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b8G@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0010\"\u0004\b\u0014\u0010\u0012R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\u0082\u0001\u0001\u001b¨\u0006\u001c"}, d2 = {"Lc0/S;", "T", "Lc0/P;", "E", "", "<init>", "()V", "Lc0/C;", "easing", "e", "(Lc0/P;Lc0/C;)Lc0/P;", "", "<set-?>", "a", "I", "b", "()I", "d", "(I)V", "durationMillis", "setDelayMillis", "delayMillis", "LZ/K;", "c", "LZ/K;", "()LZ/K;", "keyframes", "Lc0/Q$b;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: c0.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6305S<T, E extends AbstractC6303P<T>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int durationMillis;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int delayMillis;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final K<E> keyframes;

    public /* synthetic */ AbstractC6305S(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC6305S() {
        this.durationMillis = HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES;
        this.keyframes = r.c();
    }

    /* renamed from: a, reason: from getter */
    public final int getDelayMillis() {
        return this.delayMillis;
    }

    /* renamed from: b, reason: from getter */
    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final K<E> c() {
        return this.keyframes;
    }

    public final void d(int i10) {
        this.durationMillis = i10;
    }

    public final E e(E e10, InterfaceC6290C interfaceC6290C) {
        e10.c(interfaceC6290C);
        return e10;
    }
}
