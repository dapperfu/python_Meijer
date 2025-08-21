package tl;

import fj.DeliveryMode;
import fj.ShoppingCart;
import j$.time.Instant;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jj.FulfillmentSlot;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u0018"}, d2 = {"Ltl/b;", "", "<init>", "()V", "Lfj/C;", "cart", "j$/time/Instant", "now", "Ltl/a;", "b", "(Lfj/C;Lj$/time/Instant;)Ltl/a;", "a", "(Lfj/C;)Ltl/a;", "", "Ljj/c;", "slots", "", "error", "c", "(Lfj/C;Ljava/util/List;Ljava/lang/Throwable;Lj$/time/Instant;)Ltl/a;", "", "", "Ljava/util/Map;", "map", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: tl.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C17271b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, FulfillmentSlotSet> map = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\n\u001a\u00020\u0006*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u000b"}, d2 = {"Ltl/b$a;", "", "<init>", "()V", "Lfj/C;", "cart", "", "b", "(Lfj/C;)Ljava/lang/String;", "a", "mapKey", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tl.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String a(ShoppingCart shoppingCart) {
            Intrinsics.j(shoppingCart, "<this>");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(shoppingCart.u());
            sb2.append(':');
            DeliveryMode deliveryMode = shoppingCart.getDeliveryMode();
            sb2.append(deliveryMode != null ? deliveryMode.getCode() : null);
            return sb2.toString();
        }

        public final String b(ShoppingCart cart) {
            Intrinsics.j(cart, "cart");
            return a(cart);
        }
    }

    public final synchronized FulfillmentSlotSet a(ShoppingCart cart) {
        FulfillmentSlotSet fulfillmentSlotSet;
        try {
            Intrinsics.j(cart, "cart");
            Map<String, FulfillmentSlotSet> map = this.map;
            String strA = INSTANCE.a(cart);
            fulfillmentSlotSet = map.get(strA);
            if (fulfillmentSlotSet == null) {
                int iU = cart.u();
                DeliveryMode deliveryMode = cart.getDeliveryMode();
                String code = deliveryMode != null ? deliveryMode.getCode() : null;
                if (code == null) {
                    code = "";
                }
                Instant MIN = Instant.MIN;
                Intrinsics.i(MIN, "MIN");
                FulfillmentSlotSet fulfillmentSlotSet2 = new FulfillmentSlotSet(iU, code, null, null, MIN, null, 44, null);
                map.put(strA, fulfillmentSlotSet2);
                fulfillmentSlotSet = fulfillmentSlotSet2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return fulfillmentSlotSet;
    }

    public final synchronized FulfillmentSlotSet c(ShoppingCart cart, List<FulfillmentSlot> slots, Throwable error, Instant now) {
        Instant instant;
        try {
            Intrinsics.j(cart, "cart");
            Intrinsics.j(now, "now");
            if (error == null && slots == null) {
                this.map.remove(INSTANCE.a(cart));
                instant = now;
            } else {
                Map<String, FulfillmentSlotSet> map = this.map;
                String strA = INSTANCE.a(cart);
                FulfillmentSlotSet fulfillmentSlotSetB = b(cart, now);
                if (slots == null) {
                    slots = fulfillmentSlotSetB.p();
                    if (fulfillmentSlotSetB.s(now)) {
                        slots = null;
                    }
                    if (slots == null) {
                        slots = CollectionsKt.m();
                    }
                }
                instant = now;
                map.put(strA, FulfillmentSlotSet.h(fulfillmentSlotSetB, 0, null, slots, error, instant, error == null ? FulfillmentSlotSet.INSTANCE.a(now) : fulfillmentSlotSetB.getExpiresAt(), 3, null));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return b(cart, instant);
    }

    private final FulfillmentSlotSet b(ShoppingCart cart, Instant now) {
        Map<String, FulfillmentSlotSet> map = this.map;
        String strA = INSTANCE.a(cart);
        int iU = cart.u();
        DeliveryMode deliveryMode = cart.getDeliveryMode();
        String code = deliveryMode != null ? deliveryMode.getCode() : null;
        if (code == null) {
            code = "";
        }
        Instant MIN = Instant.MIN;
        Intrinsics.i(MIN, "MIN");
        return map.getOrDefault(strA, new FulfillmentSlotSet(iU, code, null, null, MIN, FulfillmentSlotSet.INSTANCE.a(now), 12, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FulfillmentSlotSet d(C17271b c17271b, ShoppingCart shoppingCart, List list, Throwable th2, Instant instant, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = null;
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        if ((i10 & 8) != 0) {
            instant = Instant.now();
        }
        return c17271b.c(shoppingCart, list, th2, instant);
    }
}
