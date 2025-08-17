package Bm;

import ak.AbstractC5607a;
import com.meijer.mobile.meijer.Y;
import ij.FulfillmentSlot;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import tl.FulfillmentDay;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0010\u0013B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"LBm/n;", "", "LBm/n$b;", "noSlotsTodayDisclaimer", "<init>", "(LBm/n$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LBm/n$b;", "()LBm/n$b;", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Bm.n, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class FulfillmentSlotErrorDecorator {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f3178c = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DisclaimerDecorator noSlotsTodayDisclaimer;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000e\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LBm/n$a;", "", "<init>", "()V", "Ltl/c;", "todayFulfillmentDay", "", "isDelivery", "LBm/n;", "b", "(Ltl/c;Z)LBm/n;", "", "daysAndSlots", "hasMultipleFulfillmentPartnersOptions", "a", "(Ljava/util/List;ZZ)LBm/n;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bm.n$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final FulfillmentSlotErrorDecorator a(List<FulfillmentDay> daysAndSlots, boolean isDelivery, boolean hasMultipleFulfillmentPartnersOptions) {
            Object[] objArr;
            AbstractC5607a abstractC5607aD;
            AbstractC5607a abstractC5607aD2;
            AbstractC5607a abstractC5607aD3;
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
                    AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
                    abstractC5607aD3 = companion.d(Y.f99919Y8, new Object[0]);
                    abstractC5607aD2 = companion.d(Y.f99900X8, new Object[0]);
                    return new FulfillmentSlotErrorDecorator(new DisclaimerDecorator(abstractC5607aD3, abstractC5607aD2));
                }
                AbstractC5607a.Companion companion2 = AbstractC5607a.INSTANCE;
                abstractC5607aD = companion2.d(Y.f99919Y8, new Object[0]);
                abstractC5607aD2 = isDelivery ? companion2.d(Y.f99824T8, Integer.valueOf(i10)) : companion2.d(Y.f99843U8, Integer.valueOf(i10));
            } else if (i10 > 1) {
                AbstractC5607a.Companion companion3 = AbstractC5607a.INSTANCE;
                abstractC5607aD = companion3.d(Y.f99919Y8, new Object[0]);
                abstractC5607aD2 = isDelivery ? companion3.d(Y.f99862V8, Integer.valueOf(i10)) : companion3.d(Y.f99881W8, Integer.valueOf(i10));
            } else {
                AbstractC5607a.Companion companion4 = AbstractC5607a.INSTANCE;
                abstractC5607aD = companion4.d(Y.f99978b9, new Object[0]);
                abstractC5607aD2 = isDelivery ? companion4.d(Y.f99938Z8, new Object[0]) : companion4.d(Y.f99958a9, new Object[0]);
            }
            abstractC5607aD3 = abstractC5607aD;
            return new FulfillmentSlotErrorDecorator(new DisclaimerDecorator(abstractC5607aD3, abstractC5607aD2));
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
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            return new FulfillmentSlotErrorDecorator(new DisclaimerDecorator(companion.d(Y.f99978b9, new Object[0]), isDelivery ? companion.d(Y.f99938Z8, new Object[0]) : companion.d(Y.f99958a9, new Object[0])));
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"LBm/n$b;", "", "Lak/a;", "title", "body", "<init>", "(Lak/a;Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "b", "()Lak/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bm.n$b, reason: from toString */
    public static final /* data */ class DisclaimerDecorator {

        /* renamed from: c, reason: collision with root package name */
        public static final int f3180c = AbstractC5607a.f45514b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a title;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a body;

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

        public DisclaimerDecorator(AbstractC5607a title, AbstractC5607a body) {
            Intrinsics.j(title, "title");
            Intrinsics.j(body, "body");
            this.title = title;
            this.body = body;
        }

        /* renamed from: a, reason: from getter */
        public final AbstractC5607a getBody() {
            return this.body;
        }

        /* renamed from: b, reason: from getter */
        public final AbstractC5607a getTitle() {
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
