package q5;

import android.graphics.drawable.Drawable;
import d5.EnumC13623g;
import f5.C13954b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.AbstractC15670i;
import m5.C15667f;
import m5.C15677p;
import n5.EnumC15911h;
import q5.InterfaceC16606c;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\rB-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lq5/a;", "Lq5/c;", "Lq5/d;", "target", "Lm5/i;", "result", "", "durationMillis", "", "preferExactIntrinsicSize", "<init>", "(Lq5/d;Lm5/i;IZ)V", "", "a", "()V", "Lq5/d;", "b", "Lm5/i;", "c", "I", "()I", "d", "Z", "()Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: q5.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16604a implements InterfaceC16606c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16607d target;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15670i result;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean preferExactIntrinsicSize;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lq5/a$a;", "Lq5/c$a;", "", "durationMillis", "", "preferExactIntrinsicSize", "<init>", "(IZ)V", "Lq5/d;", "target", "Lm5/i;", "result", "Lq5/c;", "a", "(Lq5/d;Lm5/i;)Lq5/c;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "c", "I", "getDurationMillis", "d", "Z", "getPreferExactIntrinsicSize", "()Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: q5.a$a, reason: collision with other inner class name */
    public static final class C2453a implements InterfaceC16606c.a {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int durationMillis;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean preferExactIntrinsicSize;

        /* JADX WARN: Multi-variable type inference failed */
        @JvmOverloads
        public C2453a() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C2453a)) {
                return false;
            }
            C2453a c2453a = (C2453a) other;
            return this.durationMillis == c2453a.durationMillis && this.preferExactIntrinsicSize == c2453a.preferExactIntrinsicSize;
        }

        @JvmOverloads
        public C2453a(int i10, boolean z10) {
            this.durationMillis = i10;
            this.preferExactIntrinsicSize = z10;
            if (i10 <= 0) {
                throw new IllegalArgumentException("durationMillis must be > 0.");
            }
        }

        @Override // q5.InterfaceC16606c.a
        public InterfaceC16606c a(InterfaceC16607d target, AbstractC15670i result) {
            return !(result instanceof C15677p) ? InterfaceC16606c.a.f157901b.a(target, result) : ((C15677p) result).getDataSource() == EnumC13623g.f128045a ? InterfaceC16606c.a.f157901b.a(target, result) : new C16604a(target, result, this.durationMillis, this.preferExactIntrinsicSize);
        }

        public int hashCode() {
            return (this.durationMillis * 31) + Boolean.hashCode(this.preferExactIntrinsicSize);
        }

        public /* synthetic */ C2453a(int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 100 : i10, (i11 & 2) != 0 ? false : z10);
        }
    }

    @Override // q5.InterfaceC16606c
    public void a() {
        Drawable drawableD = this.target.d();
        Drawable drawable = this.result.getDrawable();
        EnumC15911h scale = this.result.getRequest().getScale();
        int i10 = this.durationMillis;
        AbstractC15670i abstractC15670i = this.result;
        C13954b c13954b = new C13954b(drawableD, drawable, scale, i10, ((abstractC15670i instanceof C15677p) && ((C15677p) abstractC15670i).getIsPlaceholderCached()) ? false : true, this.preferExactIntrinsicSize);
        AbstractC15670i abstractC15670i2 = this.result;
        if (abstractC15670i2 instanceof C15677p) {
            this.target.a(c13954b);
        } else {
            if (!(abstractC15670i2 instanceof C15667f)) {
                throw new NoWhenBranchMatchedException();
            }
            this.target.c(c13954b);
        }
    }

    /* renamed from: b, reason: from getter */
    public final int getDurationMillis() {
        return this.durationMillis;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getPreferExactIntrinsicSize() {
        return this.preferExactIntrinsicSize;
    }

    @JvmOverloads
    public C16604a(InterfaceC16607d interfaceC16607d, AbstractC15670i abstractC15670i, int i10, boolean z10) {
        this.target = interfaceC16607d;
        this.result = abstractC15670i;
        this.durationMillis = i10;
        this.preferExactIntrinsicSize = z10;
        if (i10 > 0) {
        } else {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }
}
