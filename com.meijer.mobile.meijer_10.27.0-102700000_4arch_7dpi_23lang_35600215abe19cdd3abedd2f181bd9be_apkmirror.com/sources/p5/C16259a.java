package p5;

import android.graphics.drawable.Drawable;
import c5.EnumC6361g;
import e5.C13624b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import l5.AbstractC15373i;
import l5.C15370f;
import l5.C15380p;
import m5.EnumC15558h;
import p5.InterfaceC16261c;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\rB-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lp5/a;", "Lp5/c;", "Lp5/d;", "target", "Ll5/i;", "result", "", "durationMillis", "", "preferExactIntrinsicSize", "<init>", "(Lp5/d;Ll5/i;IZ)V", "", "a", "()V", "Lp5/d;", "b", "Ll5/i;", "c", "I", "()I", "d", "Z", "()Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: p5.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16259a implements InterfaceC16261c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16262d target;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15373i result;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean preferExactIntrinsicSize;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lp5/a$a;", "Lp5/c$a;", "", "durationMillis", "", "preferExactIntrinsicSize", "<init>", "(IZ)V", "Lp5/d;", "target", "Ll5/i;", "result", "Lp5/c;", "a", "(Lp5/d;Ll5/i;)Lp5/c;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "c", "I", "getDurationMillis", "d", "Z", "getPreferExactIntrinsicSize", "()Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: p5.a$a, reason: collision with other inner class name */
    public static final class C2413a implements InterfaceC16261c.a {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int durationMillis;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean preferExactIntrinsicSize;

        /* JADX WARN: Multi-variable type inference failed */
        @JvmOverloads
        public C2413a() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C2413a)) {
                return false;
            }
            C2413a c2413a = (C2413a) other;
            return this.durationMillis == c2413a.durationMillis && this.preferExactIntrinsicSize == c2413a.preferExactIntrinsicSize;
        }

        @JvmOverloads
        public C2413a(int i10, boolean z10) {
            this.durationMillis = i10;
            this.preferExactIntrinsicSize = z10;
            if (i10 <= 0) {
                throw new IllegalArgumentException("durationMillis must be > 0.");
            }
        }

        @Override // p5.InterfaceC16261c.a
        public InterfaceC16261c a(InterfaceC16262d target, AbstractC15373i result) {
            return !(result instanceof C15380p) ? InterfaceC16261c.a.f155497b.a(target, result) : ((C15380p) result).getDataSource() == EnumC6361g.f61478a ? InterfaceC16261c.a.f155497b.a(target, result) : new C16259a(target, result, this.durationMillis, this.preferExactIntrinsicSize);
        }

        public int hashCode() {
            return (this.durationMillis * 31) + Boolean.hashCode(this.preferExactIntrinsicSize);
        }

        public /* synthetic */ C2413a(int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 100 : i10, (i11 & 2) != 0 ? false : z10);
        }
    }

    @Override // p5.InterfaceC16261c
    public void a() {
        Drawable drawableD = this.target.d();
        Drawable drawable = this.result.getDrawable();
        EnumC15558h scale = this.result.getRequest().getScale();
        int i10 = this.durationMillis;
        AbstractC15373i abstractC15373i = this.result;
        C13624b c13624b = new C13624b(drawableD, drawable, scale, i10, ((abstractC15373i instanceof C15380p) && ((C15380p) abstractC15373i).getIsPlaceholderCached()) ? false : true, this.preferExactIntrinsicSize);
        AbstractC15373i abstractC15373i2 = this.result;
        if (abstractC15373i2 instanceof C15380p) {
            this.target.a(c13624b);
        } else {
            if (!(abstractC15373i2 instanceof C15370f)) {
                throw new NoWhenBranchMatchedException();
            }
            this.target.c(c13624b);
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
    public C16259a(InterfaceC16262d interfaceC16262d, AbstractC15373i abstractC15373i, int i10, boolean z10) {
        this.target = interfaceC16262d;
        this.result = abstractC15373i;
        this.durationMillis = i10;
        this.preferExactIntrinsicSize = z10;
        if (i10 > 0) {
        } else {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }
}
