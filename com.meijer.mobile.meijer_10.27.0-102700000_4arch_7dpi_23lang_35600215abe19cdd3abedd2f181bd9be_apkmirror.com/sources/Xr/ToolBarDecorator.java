package Xr;

import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LXr/e;", "", "Lak/a;", "title", "<init>", "(Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "()Lak/a;", "coupon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Xr.e, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class ToolBarDecorator {

    /* renamed from: b, reason: collision with root package name */
    public static final int f39815b = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a title;

    /* JADX WARN: Multi-variable type inference failed */
    public ToolBarDecorator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ToolBarDecorator) && Intrinsics.e(this.title, ((ToolBarDecorator) other).title);
    }

    public ToolBarDecorator(AbstractC5607a abstractC5607a) {
        this.title = abstractC5607a;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getTitle() {
        return this.title;
    }

    public int hashCode() {
        AbstractC5607a abstractC5607a = this.title;
        if (abstractC5607a == null) {
            return 0;
        }
        return abstractC5607a.hashCode();
    }

    public String toString() {
        return "ToolBarDecorator(title=" + this.title + ')';
    }

    public /* synthetic */ ToolBarDecorator(AbstractC5607a abstractC5607a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : abstractC5607a);
    }
}
