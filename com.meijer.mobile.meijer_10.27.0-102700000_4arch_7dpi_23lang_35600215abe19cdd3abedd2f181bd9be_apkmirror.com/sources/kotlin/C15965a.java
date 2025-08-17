package kotlin;

import H1.y;
import f1.C13832e;
import f1.InterfaceC13828a;
import java.util.concurrent.CancellationException;
import kotlin.EnumC13827z;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\t*\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\u00020\f*\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Lo0/a;", "Lf1/a;", "Lo0/C;", "state", "Lf0/z;", "orientation", "<init>", "(Lo0/C;Lf0/z;)V", "LU0/f;", "", "b", "(J)F", "LH1/y;", "a", "(JLf0/z;)J", "available", "Lf1/e;", "source", "E1", "(JI)J", "consumed", "L0", "(JJI)J", "b0", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo0/C;", "getState", "()Lo0/C;", "Lf0/z;", "getOrientation", "()Lf0/z;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C15965a implements InterfaceC13828a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15962C state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final EnumC13827z orientation;

    private final float b(long j10) {
        return Float.intBitsToFloat((int) (this.orientation == EnumC13827z.f130586b ? j10 >> 32 : j10 & 4294967295L));
    }

    @Override // f1.InterfaceC13828a
    public long E1(long available, int source) {
        if (!C13832e.f(source, C13832e.INSTANCE.d()) || Math.abs(this.state.w()) <= 1.0E-6d) {
            return U0.f.INSTANCE.c();
        }
        float fW = this.state.w() * this.state.I();
        float pageSize = ((this.state.C().getPageSize() + this.state.C().getPageSpacing()) * (-Math.signum(this.state.w()))) + fW;
        if (this.state.w() > 0.0f) {
            pageSize = fW;
            fW = pageSize;
        }
        EnumC13827z enumC13827z = this.orientation;
        EnumC13827z enumC13827z2 = EnumC13827z.f130586b;
        float fIntBitsToFloat = -this.state.f(-RangesKt.n(Float.intBitsToFloat((int) (enumC13827z == enumC13827z2 ? available >> 32 : available & 4294967295L)), fW, pageSize));
        float fIntBitsToFloat2 = this.orientation == enumC13827z2 ? fIntBitsToFloat : Float.intBitsToFloat((int) (available >> 32));
        if (this.orientation != EnumC13827z.f130585a) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (available & 4294967295L));
        }
        return U0.f.f(available, fIntBitsToFloat2, fIntBitsToFloat);
    }

    @Override // f1.InterfaceC13828a
    public long L0(long consumed, long available, int source) {
        if (!C13832e.f(source, C13832e.INSTANCE.c()) || b(available) == 0.0f) {
            return U0.f.INSTANCE.c();
        }
        throw new CancellationException("Scroll cancelled");
    }

    public final long a(long j10, EnumC13827z enumC13827z) {
        return enumC13827z == EnumC13827z.f130585a ? y.e(j10, 0.0f, 0.0f, 2, null) : y.e(j10, 0.0f, 0.0f, 1, null);
    }

    @Override // f1.InterfaceC13828a
    public Object b0(long j10, long j11, Continuation<? super y> continuation) {
        return y.b(a(j11, this.orientation));
    }

    public C15965a(AbstractC15962C abstractC15962C, EnumC13827z enumC13827z) {
        this.state = abstractC15962C;
        this.orientation = enumC13827z;
    }
}
