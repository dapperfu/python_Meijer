package Wr;

import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJD\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b%\u0010$¨\u0006&"}, d2 = {"LWr/a;", "", "", "shouldShow", "Lbk/a;", "countdownText", "LWr/b;", "countdownStyle", "", "progress", "target", "<init>", "(ZLbk/a;LWr/b;DD)V", "a", "(ZLbk/a;LWr/b;DD)LWr/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "Lbk/a;", "d", "()Lbk/a;", "c", "LWr/b;", "()LWr/b;", "D", "e", "()D", "g", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Wr.a, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class CouponSavingsCountdownDecorator {

    /* renamed from: f, reason: collision with root package name */
    public static final int f41421f = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldShow;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a countdownText;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b countdownStyle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double progress;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double target;

    public CouponSavingsCountdownDecorator() {
        this(false, null, null, 0.0d, 0.0d, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponSavingsCountdownDecorator)) {
            return false;
        }
        CouponSavingsCountdownDecorator couponSavingsCountdownDecorator = (CouponSavingsCountdownDecorator) other;
        return this.shouldShow == couponSavingsCountdownDecorator.shouldShow && Intrinsics.e(this.countdownText, couponSavingsCountdownDecorator.countdownText) && this.countdownStyle == couponSavingsCountdownDecorator.countdownStyle && Double.compare(this.progress, couponSavingsCountdownDecorator.progress) == 0 && Double.compare(this.target, couponSavingsCountdownDecorator.target) == 0;
    }

    public CouponSavingsCountdownDecorator(boolean z10, AbstractC6392a abstractC6392a, b countdownStyle, double d10, double d11) {
        Intrinsics.j(countdownStyle, "countdownStyle");
        this.shouldShow = z10;
        this.countdownText = abstractC6392a;
        this.countdownStyle = countdownStyle;
        this.progress = d10;
        this.target = d11;
    }

    public static /* synthetic */ CouponSavingsCountdownDecorator b(CouponSavingsCountdownDecorator couponSavingsCountdownDecorator, boolean z10, AbstractC6392a abstractC6392a, b bVar, double d10, double d11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = couponSavingsCountdownDecorator.shouldShow;
        }
        if ((i10 & 2) != 0) {
            abstractC6392a = couponSavingsCountdownDecorator.countdownText;
        }
        if ((i10 & 4) != 0) {
            bVar = couponSavingsCountdownDecorator.countdownStyle;
        }
        if ((i10 & 8) != 0) {
            d10 = couponSavingsCountdownDecorator.progress;
        }
        if ((i10 & 16) != 0) {
            d11 = couponSavingsCountdownDecorator.target;
        }
        double d12 = d11;
        b bVar2 = bVar;
        return couponSavingsCountdownDecorator.a(z10, abstractC6392a, bVar2, d10, d12);
    }

    public final CouponSavingsCountdownDecorator a(boolean shouldShow, AbstractC6392a countdownText, b countdownStyle, double progress, double target) {
        Intrinsics.j(countdownStyle, "countdownStyle");
        return new CouponSavingsCountdownDecorator(shouldShow, countdownText, countdownStyle, progress, target);
    }

    /* renamed from: c, reason: from getter */
    public final b getCountdownStyle() {
        return this.countdownStyle;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC6392a getCountdownText() {
        return this.countdownText;
    }

    /* renamed from: e, reason: from getter */
    public final double getProgress() {
        return this.progress;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    /* renamed from: g, reason: from getter */
    public final double getTarget() {
        return this.target;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.shouldShow) * 31;
        AbstractC6392a abstractC6392a = this.countdownText;
        return ((((((iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31) + this.countdownStyle.hashCode()) * 31) + Double.hashCode(this.progress)) * 31) + Double.hashCode(this.target);
    }

    public String toString() {
        return "CouponSavingsCountdownDecorator(shouldShow=" + this.shouldShow + ", countdownText=" + this.countdownText + ", countdownStyle=" + this.countdownStyle + ", progress=" + this.progress + ", target=" + this.target + ')';
    }

    public /* synthetic */ CouponSavingsCountdownDecorator(boolean z10, AbstractC6392a abstractC6392a, b bVar, double d10, double d11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : abstractC6392a, (i10 & 4) != 0 ? b.f41428b : bVar, (i10 & 8) != 0 ? 0.0d : d10, (i10 & 16) != 0 ? 0.0d : d11);
    }
}
