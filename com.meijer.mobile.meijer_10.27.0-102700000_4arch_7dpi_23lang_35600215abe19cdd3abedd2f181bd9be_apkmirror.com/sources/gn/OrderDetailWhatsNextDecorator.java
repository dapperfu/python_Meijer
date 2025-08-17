package gn;

import Tq.PointOfService;
import ak.AbstractC5607a;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.checkout.review.StoreDecorator;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import ej.DeliveryMode;
import es.AbstractC13757b;
import gj.OrderDetail;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0002\u001c\u0017B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001d\u0010'R\u0014\u0010)\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010*\u001a\u00020\u00048CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010+\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010'R\u0011\u0010-\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b,\u0010'R\u0011\u0010.\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b%\u0010'R\u0017\u00102\u001a\b\u0012\u0004\u0012\u0002000/8F¢\u0006\u0006\u001a\u0004\b!\u00101¨\u00063"}, d2 = {"Lgn/o;", "Les/b;", "Lak/a;", "title", "", BarcodePickDeserializer.FIELD_ICON, "Lej/h;", "deliveryMode", "Lcom/meijer/mobile/meijer/activity/checkout/review/X1;", PlaceTypes.STORE, "", "visibility", "<init>", "(Lak/a;ILej/h;Lcom/meijer/mobile/meijer/activity/checkout/review/X1;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lak/a;", "c", "()Lak/a;", "I", "a", "d", "Lej/h;", "getDeliveryMode", "()Lej/h;", "e", "Lcom/meijer/mobile/meijer/activity/checkout/review/X1;", "getStore", "()Lcom/meijer/mobile/meijer/activity/checkout/review/X1;", "f", "Z", "()Z", "g", "hasPickupHelpNumber", "pickupHelpNumberMessage", "isPickUpMeijerOrder", "h", "isPickUpShiptOrder", "isDeliveryShiptOrder", "", "Lgn/o$b;", "()Ljava/util/List;", "whatsNextItems", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gn.o, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class OrderDetailWhatsNextDecorator extends AbstractC13757b {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f133931i = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int icon;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryMode deliveryMode;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final StoreDecorator store;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean visibility;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean hasPickupHelpNumber;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lgn/o$a;", "", "<init>", "()V", "Lgj/c;", "order", "", "b", "(Lgj/c;)Z", "Lgn/o;", "a", "(Lgj/c;)Lgn/o;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gn.o$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gn.o$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2109a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[gj.f.values().length];
                try {
                    iArr[gj.f.f133633p.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[gj.f.f133634q.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[gj.f.f133632o.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[gj.f.f133631n.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[gj.f.f133635r.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public final OrderDetailWhatsNextDecorator a(OrderDetail order) {
            Intrinsics.j(order, "order");
            return new OrderDetailWhatsNextDecorator(AbstractC5607a.INSTANCE.d(Y.f99890Wh, new Object[0]), Bj.i.f2756k0, order.getDeliveryMode(), StoreDecorator.Companion.c(StoreDecorator.INSTANCE, order.getPointOfService(), null, 2, null), OrderDetailWhatsNextDecorator.INSTANCE.b(order));
        }

        private final boolean b(OrderDetail order) {
            String curbsidePartner;
            PointOfService pointOfService = order.getPointOfService();
            String deliveryPartner = null;
            if (pointOfService != null) {
                curbsidePartner = pointOfService.getCurbsidePartner();
            } else {
                curbsidePartner = null;
            }
            if (curbsidePartner != null && curbsidePartner.length() != 0) {
                PointOfService pointOfService2 = order.getPointOfService();
                if (pointOfService2 != null) {
                    deliveryPartner = pointOfService2.getDeliveryPartner();
                }
                if (deliveryPartner != null && deliveryPartner.length() != 0) {
                    int i10 = C2109a.$EnumSwitchMapping$0[order.getOrderStatus().ordinal()];
                    if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001e"}, d2 = {"Lgn/o$b;", "", "Lak/a;", "stepNumber", "instruction", "stepNumberContentDescription", "", "isURLProvided", "pickupHelpNumber", "<init>", "(Lak/a;Lak/a;Lak/a;ZLak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "c", "()Lak/a;", "b", "getStepNumberContentDescription", "d", "Z", "()Z", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gn.o$b, reason: from toString */
    public static final /* data */ class WhatsNextItemDecorator {

        /* renamed from: f, reason: collision with root package name */
        public static final int f133938f = AbstractC5607a.f45514b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a stepNumber;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a instruction;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a stepNumberContentDescription;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isURLProvided;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a pickupHelpNumber;

        public WhatsNextItemDecorator(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, boolean z10, AbstractC5607a abstractC5607a4) {
            this.stepNumber = abstractC5607a;
            this.instruction = abstractC5607a2;
            this.stepNumberContentDescription = abstractC5607a3;
            this.isURLProvided = z10;
            this.pickupHelpNumber = abstractC5607a4;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WhatsNextItemDecorator)) {
                return false;
            }
            WhatsNextItemDecorator whatsNextItemDecorator = (WhatsNextItemDecorator) other;
            return Intrinsics.e(this.stepNumber, whatsNextItemDecorator.stepNumber) && Intrinsics.e(this.instruction, whatsNextItemDecorator.instruction) && Intrinsics.e(this.stepNumberContentDescription, whatsNextItemDecorator.stepNumberContentDescription) && this.isURLProvided == whatsNextItemDecorator.isURLProvided && Intrinsics.e(this.pickupHelpNumber, whatsNextItemDecorator.pickupHelpNumber);
        }

        /* renamed from: a, reason: from getter */
        public final AbstractC5607a getInstruction() {
            return this.instruction;
        }

        /* renamed from: b, reason: from getter */
        public final AbstractC5607a getPickupHelpNumber() {
            return this.pickupHelpNumber;
        }

        /* renamed from: c, reason: from getter */
        public final AbstractC5607a getStepNumber() {
            return this.stepNumber;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getIsURLProvided() {
            return this.isURLProvided;
        }

        public int hashCode() {
            AbstractC5607a abstractC5607a = this.stepNumber;
            int iHashCode = (abstractC5607a == null ? 0 : abstractC5607a.hashCode()) * 31;
            AbstractC5607a abstractC5607a2 = this.instruction;
            int iHashCode2 = (iHashCode + (abstractC5607a2 == null ? 0 : abstractC5607a2.hashCode())) * 31;
            AbstractC5607a abstractC5607a3 = this.stepNumberContentDescription;
            int iHashCode3 = (((iHashCode2 + (abstractC5607a3 == null ? 0 : abstractC5607a3.hashCode())) * 31) + Boolean.hashCode(this.isURLProvided)) * 31;
            AbstractC5607a abstractC5607a4 = this.pickupHelpNumber;
            return iHashCode3 + (abstractC5607a4 != null ? abstractC5607a4.hashCode() : 0);
        }

        public String toString() {
            return "WhatsNextItemDecorator(stepNumber=" + this.stepNumber + ", instruction=" + this.instruction + ", stepNumberContentDescription=" + this.stepNumberContentDescription + ", isURLProvided=" + this.isURLProvided + ", pickupHelpNumber=" + this.pickupHelpNumber + ')';
        }

        public /* synthetic */ WhatsNextItemDecorator(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, boolean z10, AbstractC5607a abstractC5607a4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC5607a, abstractC5607a2, abstractC5607a3, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : abstractC5607a4);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetailWhatsNextDecorator)) {
            return false;
        }
        OrderDetailWhatsNextDecorator orderDetailWhatsNextDecorator = (OrderDetailWhatsNextDecorator) other;
        return Intrinsics.e(this.title, orderDetailWhatsNextDecorator.title) && this.icon == orderDetailWhatsNextDecorator.icon && Intrinsics.e(this.deliveryMode, orderDetailWhatsNextDecorator.deliveryMode) && Intrinsics.e(this.store, orderDetailWhatsNextDecorator.store) && this.visibility == orderDetailWhatsNextDecorator.visibility;
    }

    public OrderDetailWhatsNextDecorator(AbstractC5607a title, int i10, DeliveryMode deliveryMode, StoreDecorator storeDecorator, boolean z10) {
        Intrinsics.j(title, "title");
        this.title = title;
        this.icon = i10;
        this.deliveryMode = deliveryMode;
        this.store = storeDecorator;
        this.visibility = z10;
        String pickupHelpNumber = storeDecorator != null ? storeDecorator.getPickupHelpNumber() : null;
        this.hasPickupHelpNumber = !(pickupHelpNumber == null || pickupHelpNumber.length() == 0);
    }

    private final int b() {
        return this.hasPickupHelpNumber ? Y.f100258pa : Y.f100278qa;
    }

    /* renamed from: a, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC5607a getTitle() {
        return this.title;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getVisibility() {
        return this.visibility;
    }

    public final List<WhatsNextItemDecorator> e() {
        String pickupHelpNumber;
        if (!g()) {
            if (h()) {
                AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
                return CollectionsKt.p(new WhatsNextItemDecorator(companion.d(Y.f100098h9, new Object[0]), companion.d(Y.f100338ta, new Object[0]), companion.d(Y.f100383vf, new Object[0]), false, null, 24, null), new WhatsNextItemDecorator(companion.d(Y.f100118i9, new Object[0]), companion.d(Y.f100358ua, new Object[0]), companion.d(Y.f100403wf, new Object[0]), false, null, 24, null), new WhatsNextItemDecorator(companion.d(Y.f100137j9, new Object[0]), companion.d(Y.f100378va, new Object[0]), companion.d(Y.f100423xf, new Object[0]), false, null, 24, null), new WhatsNextItemDecorator(companion.d(Y.f100157k9, new Object[0]), companion.d(Y.f100398wa, new Object[0]), companion.d(Y.f100443yf, new Object[0]), false, null, 24, null), new WhatsNextItemDecorator(companion.d(Y.f100177l9, new Object[0]), companion.d(Y.f100418xa, new Object[0]), companion.d(Y.f100463zf, new Object[0]), false, null, 24, null), new WhatsNextItemDecorator(companion.d(Y.f100197m9, new Object[0]), companion.d(Y.f100438ya, new Object[0]), companion.d(Y.f99470Af, new Object[0]), false, null, 24, null), new WhatsNextItemDecorator(companion.d(Y.f100217n9, new Object[0]), companion.d(Y.f100458za, new Object[0]), companion.d(Y.f99489Bf, new Object[0]), false, null, 24, null));
            }
            if (!f()) {
                return CollectionsKt.m();
            }
            AbstractC5607a.Companion companion2 = AbstractC5607a.INSTANCE;
            return CollectionsKt.p(new WhatsNextItemDecorator(companion2.d(Y.f100098h9, new Object[0]), companion2.d(Y.f100099ha, new Object[0]), companion2.d(Y.f100383vf, new Object[0]), false, null, 24, null), new WhatsNextItemDecorator(companion2.d(Y.f100118i9, new Object[0]), companion2.d(Y.f100119ia, new Object[0]), companion2.d(Y.f100403wf, new Object[0]), false, null, 24, null), new WhatsNextItemDecorator(companion2.d(Y.f100137j9, new Object[0]), companion2.d(Y.f100138ja, new Object[0]), companion2.d(Y.f100423xf, new Object[0]), false, null, 24, null), new WhatsNextItemDecorator(companion2.d(Y.f100157k9, new Object[0]), companion2.d(Y.f100158ka, new Object[0]), companion2.d(Y.f100443yf, new Object[0]), false, null, 24, null), new WhatsNextItemDecorator(companion2.d(Y.f100177l9, new Object[0]), companion2.d(Y.f100178la, new Object[0]), companion2.d(Y.f100463zf, new Object[0]), false, null, 24, null));
        }
        AbstractC5607a.Companion companion3 = AbstractC5607a.INSTANCE;
        WhatsNextItemDecorator whatsNextItemDecorator = new WhatsNextItemDecorator(companion3.d(Y.f100098h9, new Object[0]), companion3.d(Y.f100198ma, new Object[0]), companion3.d(Y.f100383vf, new Object[0]), false, null, 16, null);
        WhatsNextItemDecorator whatsNextItemDecorator2 = new WhatsNextItemDecorator(companion3.d(Y.f100118i9, new Object[0]), companion3.d(Y.f100218na, new Object[0]), companion3.d(Y.f100403wf, new Object[0]), false, null, 16, null);
        WhatsNextItemDecorator whatsNextItemDecorator3 = new WhatsNextItemDecorator(companion3.d(Y.f100137j9, new Object[0]), companion3.d(Y.f100238oa, new Object[0]), companion3.d(Y.f100423xf, new Object[0]), false, null, 16, null);
        AbstractC5607a abstractC5607aD = companion3.d(Y.f100157k9, new Object[0]);
        AbstractC5607a abstractC5607aD2 = companion3.d(b(), new Object[0]);
        AbstractC5607a abstractC5607aD3 = companion3.d(Y.f100443yf, new Object[0]);
        boolean z10 = this.hasPickupHelpNumber;
        Fk.a aVar = Fk.a.f10894a;
        StoreDecorator storeDecorator = this.store;
        if (storeDecorator == null || (pickupHelpNumber = storeDecorator.getPickupHelpNumber()) == null) {
            pickupHelpNumber = "";
        }
        return CollectionsKt.p(whatsNextItemDecorator, whatsNextItemDecorator2, whatsNextItemDecorator3, new WhatsNextItemDecorator(abstractC5607aD, abstractC5607aD2, abstractC5607aD3, z10, companion3.c(aVar.a(pickupHelpNumber))), new WhatsNextItemDecorator(companion3.d(Y.f100177l9, new Object[0]), companion3.d(Y.f100298ra, new Object[0]), companion3.d(Y.f100463zf, new Object[0]), false, null, 16, null), new WhatsNextItemDecorator(companion3.d(Y.f100197m9, new Object[0]), companion3.d(Y.f100318sa, new Object[0]), companion3.d(Y.f99470Af, new Object[0]), false, null, 16, null));
    }

    public final boolean f() {
        DeliveryMode deliveryMode = this.deliveryMode;
        if (!Intrinsics.e(deliveryMode != null ? deliveryMode.getCode() : null, "delivery")) {
            return false;
        }
        StoreDecorator storeDecorator = this.store;
        return Intrinsics.e(storeDecorator != null ? storeDecorator.getDeliveryPartner() : null, "SHIPT");
    }

    public final boolean g() {
        DeliveryMode deliveryMode = this.deliveryMode;
        if (!Intrinsics.e(deliveryMode != null ? deliveryMode.getCode() : null, "pickup")) {
            return false;
        }
        StoreDecorator storeDecorator = this.store;
        if (Intrinsics.e(storeDecorator != null ? storeDecorator.getCurbsidePartner() : null, "MEIJER")) {
            return true;
        }
        StoreDecorator storeDecorator2 = this.store;
        if (Intrinsics.e(storeDecorator2 != null ? storeDecorator2.getCurbsidePartner() : null, "MI9")) {
            return true;
        }
        StoreDecorator storeDecorator3 = this.store;
        return Intrinsics.e(storeDecorator3 != null ? storeDecorator3.getCurbsidePartner() : null, "MFC");
    }

    public final boolean h() {
        DeliveryMode deliveryMode = this.deliveryMode;
        if (!Intrinsics.e(deliveryMode != null ? deliveryMode.getCode() : null, "pickup")) {
            return false;
        }
        StoreDecorator storeDecorator = this.store;
        return Intrinsics.e(storeDecorator != null ? storeDecorator.getCurbsidePartner() : null, "SHIPT");
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + Integer.hashCode(this.icon)) * 31;
        DeliveryMode deliveryMode = this.deliveryMode;
        int iHashCode2 = (iHashCode + (deliveryMode == null ? 0 : deliveryMode.hashCode())) * 31;
        StoreDecorator storeDecorator = this.store;
        return ((iHashCode2 + (storeDecorator != null ? storeDecorator.hashCode() : 0)) * 31) + Boolean.hashCode(this.visibility);
    }

    public String toString() {
        return "OrderDetailWhatsNextDecorator(title=" + this.title + ", icon=" + this.icon + ", deliveryMode=" + this.deliveryMode + ", store=" + this.store + ", visibility=" + this.visibility + ')';
    }
}
