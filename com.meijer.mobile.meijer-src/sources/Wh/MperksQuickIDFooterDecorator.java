package Wh;

import Gh.h;
import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0018"}, d2 = {"LWh/a;", "", "", "isMperksQuickIDEnabled", "Lbk/a;", "heading", "description", "<init>", "(ZLbk/a;Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "Lbk/a;", "()Lbk/a;", "c", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Wh.a, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class MperksQuickIDFooterDecorator {

    /* renamed from: d, reason: collision with root package name */
    public static final int f41064d = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMperksQuickIDEnabled;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a heading;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a description;

    public MperksQuickIDFooterDecorator() {
        this(false, null, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksQuickIDFooterDecorator)) {
            return false;
        }
        MperksQuickIDFooterDecorator mperksQuickIDFooterDecorator = (MperksQuickIDFooterDecorator) other;
        return this.isMperksQuickIDEnabled == mperksQuickIDFooterDecorator.isMperksQuickIDEnabled && Intrinsics.e(this.heading, mperksQuickIDFooterDecorator.heading) && Intrinsics.e(this.description, mperksQuickIDFooterDecorator.description);
    }

    public MperksQuickIDFooterDecorator(boolean z10, AbstractC6392a heading, AbstractC6392a description) {
        Intrinsics.j(heading, "heading");
        Intrinsics.j(description, "description");
        this.isMperksQuickIDEnabled = z10;
        this.heading = heading;
        this.description = description;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getHeading() {
        return this.heading;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isMperksQuickIDEnabled) * 31) + this.heading.hashCode()) * 31) + this.description.hashCode();
    }

    public String toString() {
        return "MperksQuickIDFooterDecorator(isMperksQuickIDEnabled=" + this.isMperksQuickIDEnabled + ", heading=" + this.heading + ", description=" + this.description + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MperksQuickIDFooterDecorator(boolean z10, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        z10 = (i10 & 1) != 0 ? false : z10;
        if ((i10 & 2) != 0) {
            if (z10) {
                abstractC6392a = AbstractC6392a.INSTANCE.d(h.f12787R3, new Object[0]);
            } else {
                abstractC6392a = AbstractC6392a.INSTANCE.d(h.f12773P3, new Object[0]);
            }
        }
        if ((i10 & 4) != 0) {
            if (z10) {
                abstractC6392a2 = AbstractC6392a.INSTANCE.d(h.f12780Q3, new Object[0]);
            } else {
                abstractC6392a2 = AbstractC6392a.INSTANCE.d(h.f12766O3, new Object[0]);
            }
        }
        this(z10, abstractC6392a, abstractC6392a2);
    }
}
