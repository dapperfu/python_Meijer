package Cm;

import bk.AbstractC6392a;
import com.meijer.mobile.meijer.Y;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jj.FulfillmentSlot;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ul.FulfillmentDay;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0010\u0013B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"LCm/n;", "", "LCm/n$b;", "noSlotsTodayDisclaimer", "<init>", "(LCm/n$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCm/n$b;", "()LCm/n$b;", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Cm.n, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class FulfillmentSlotErrorDecorator {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f5223c = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DisclaimerDecorator noSlotsTodayDisclaimer;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000e\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LCm/n$a;", "", "<init>", "()V", "Lul/c;", "todayFulfillmentDay", "", "isDelivery", "LCm/n;", "b", "(Lul/c;Z)LCm/n;", "", "daysAndSlots", "hasMultipleFulfillmentPartnersOptions", "a", "(Ljava/util/List;ZZ)LCm/n;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Cm.n$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final FulfillmentSlotErrorDecorator a(List<FulfillmentDay> daysAndSlots, boolean isDelivery, boolean hasMultipleFulfillmentPartnersOptions) {
            Object[] objArr;
            AbstractC6392a abstractC6392aD;
            AbstractC6392a abstractC6392aD2;
            AbstractC6392a abstractC6392aD3;
            List<FulfillmentSlot> listD;
            Intrinsics.j(daysAndSlots, "daysAndSlots");
            int size = daysAndSlots.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size && !daysAndSlots.get(i11).e(); i11++) {
                i10++;
            }
            List<FulfillmentDay> list = daysAndSlots;
            int i12 = 1;
            if ((list instanceof Collection) && list.isEmpty()) {
                objArr = true;
            } else {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((FulfillmentDay) it.next()).e()) {
                        objArr = false;
                        break;
                    }
                }
                objArr = true;
            }
            FulfillmentDay fulfillmentDay = (FulfillmentDay) CollectionsKt.u0(daysAndSlots);
            if (fulfillmentDay != null && (listD = fulfillmentDay.d()) != null) {
                List<FulfillmentSlot> list2 = listD;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (((FulfillmentSlot) it2.next()).s()) {
                            return new FulfillmentSlotErrorDecorator(null, i12, 0 == true ? 1 : 0);
                        }
                    }
                }
            }
            if (objArr == true) {
                if (hasMultipleFulfillmentPartnersOptions) {
                    AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
                    abstractC6392aD3 = companion.d(Y.f100840b9, new Object[0]);
                    abstractC6392aD2 = companion.d(Y.f100820a9, new Object[0]);
                    return new FulfillmentSlotErrorDecorator(new DisclaimerDecorator(abstractC6392aD3, abstractC6392aD2));
                }
                AbstractC6392a.Companion companion2 = AbstractC6392a.INSTANCE;
                abstractC6392aD = companion2.d(Y.f100840b9, new Object[0]);
                abstractC6392aD2 = isDelivery ? companion2.d(Y.f100743W8, Integer.valueOf(i10)) : companion2.d(Y.f100762X8, Integer.valueOf(i10));
            } else if (i10 > 1) {
                AbstractC6392a.Companion companion3 = AbstractC6392a.INSTANCE;
                abstractC6392aD = companion3.d(Y.f100840b9, new Object[0]);
                abstractC6392aD2 = isDelivery ? companion3.d(Y.f100781Y8, Integer.valueOf(i10)) : companion3.d(Y.f100800Z8, Integer.valueOf(i10));
            } else {
                AbstractC6392a.Companion companion4 = AbstractC6392a.INSTANCE;
                abstractC6392aD = companion4.d(Y.f100900e9, new Object[0]);
                abstractC6392aD2 = isDelivery ? companion4.d(Y.f100860c9, new Object[0]) : companion4.d(Y.f100880d9, new Object[0]);
            }
            abstractC6392aD3 = abstractC6392aD;
            return new FulfillmentSlotErrorDecorator(new DisclaimerDecorator(abstractC6392aD3, abstractC6392aD2));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final FulfillmentSlotErrorDecorator b(FulfillmentDay todayFulfillmentDay, boolean isDelivery) {
            if (todayFulfillmentDay != null) {
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (!todayFulfillmentDay.e()) {
                    todayFulfillmentDay = null;
                }
                FulfillmentSlotErrorDecorator fulfillmentSlotErrorDecorator = todayFulfillmentDay != null ? new FulfillmentSlotErrorDecorator(objArr2 == true ? 1 : 0, 1, objArr == true ? 1 : 0) : null;
                if (fulfillmentSlotErrorDecorator != null) {
                    return fulfillmentSlotErrorDecorator;
                }
            }
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            return new FulfillmentSlotErrorDecorator(new DisclaimerDecorator(companion.d(Y.f100900e9, new Object[0]), isDelivery ? companion.d(Y.f100860c9, new Object[0]) : companion.d(Y.f100880d9, new Object[0])));
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"LCm/n$b;", "", "Lbk/a;", "title", "body", "<init>", "(Lbk/a;Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "b", "()Lbk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Cm.n$b, reason: from toString */
    public static final /* data */ class DisclaimerDecorator {

        /* renamed from: c, reason: collision with root package name */
        public static final int f5225c = AbstractC6392a.f60445b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a title;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a body;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisclaimerDecorator)) {
                return false;
            }
            DisclaimerDecorator disclaimerDecorator = (DisclaimerDecorator) other;
            return Intrinsics.e(this.title, disclaimerDecorator.title) && Intrinsics.e(this.body, disclaimerDecorator.body);
        }

        public DisclaimerDecorator(AbstractC6392a title, AbstractC6392a body) {
            Intrinsics.j(title, "title");
            Intrinsics.j(body, "body");
            this.title = title;
            this.body = body;
        }

        /* renamed from: a, reason: from getter */
        public final AbstractC6392a getBody() {
            return this.body;
        }

        /* renamed from: b, reason: from getter */
        public final AbstractC6392a getTitle() {
            return this.title;
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.body.hashCode();
        }

        public String toString() {
            return "DisclaimerDecorator(title=" + this.title + ", body=" + this.body + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FulfillmentSlotErrorDecorator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FulfillmentSlotErrorDecorator) && Intrinsics.e(this.noSlotsTodayDisclaimer, ((FulfillmentSlotErrorDecorator) other).noSlotsTodayDisclaimer);
    }

    public FulfillmentSlotErrorDecorator(DisclaimerDecorator disclaimerDecorator) {
        this.noSlotsTodayDisclaimer = disclaimerDecorator;
    }

    /* renamed from: a, reason: from getter */
    public final DisclaimerDecorator getNoSlotsTodayDisclaimer() {
        return this.noSlotsTodayDisclaimer;
    }

    public int hashCode() {
        DisclaimerDecorator disclaimerDecorator = this.noSlotsTodayDisclaimer;
        if (disclaimerDecorator == null) {
            return 0;
        }
        return disclaimerDecorator.hashCode();
    }

    public String toString() {
        return "FulfillmentSlotErrorDecorator(noSlotsTodayDisclaimer=" + this.noSlotsTodayDisclaimer + ')';
    }

    public /* synthetic */ FulfillmentSlotErrorDecorator(DisclaimerDecorator disclaimerDecorator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : disclaimerDecorator);
    }
}
