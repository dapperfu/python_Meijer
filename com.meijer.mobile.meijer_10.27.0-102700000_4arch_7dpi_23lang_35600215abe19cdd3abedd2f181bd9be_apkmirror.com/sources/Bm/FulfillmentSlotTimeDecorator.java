package Bm;

import ak.AbstractC5607a;
import com.meijer.mobile.meijer.Y;
import ij.FulfillmentSlot;
import io.constructor.data.local.PreferencesHelper;
import j$.time.LocalTime;
import j$.time.format.DateTimeFormatter;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vk.C17590a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010%\u001a\u00020\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u001b\u0010(\u001a\u00060\bj\u0002`&8\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b#\u0010\u0012¨\u0006)"}, d2 = {"LBm/q;", "", "Lij/c;", "timeSlot", "<init>", "(Lij/c;)V", "j$/time/LocalTime", "time", "", "i", "(Lj$/time/LocalTime;)Ljava/lang/String;", "", "h", "()Z", "item", "g", "(LBm/q;)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lij/c;", "e", "()Lij/c;", "Lak/a;", "b", "Lkotlin/Lazy;", "f", "()Lak/a;", "timeSlotText", "c", "d", "readOnlyTimeSlotText", "Lcom/meijer/mobile/core/model/common/ResourceId;", "Ljava/lang/String;", PreferencesHelper.PREF_ID, "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Bm.q, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class FulfillmentSlotTimeDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FulfillmentSlot timeSlot;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy timeSlotText;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy readOnlyTimeSlotText;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String id;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FulfillmentSlotTimeDecorator) && Intrinsics.e(this.timeSlot, ((FulfillmentSlotTimeDecorator) other).timeSlot);
    }

    public FulfillmentSlotTimeDecorator(FulfillmentSlot timeSlot) {
        Intrinsics.j(timeSlot, "timeSlot");
        this.timeSlot = timeSlot;
        this.timeSlotText = LazyKt.b(new Function0() { // from class: Bm.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FulfillmentSlotTimeDecorator.k(this.f3183a);
            }
        });
        this.readOnlyTimeSlotText = LazyKt.b(new Function0() { // from class: Bm.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FulfillmentSlotTimeDecorator.j(this.f3184a);
            }
        });
        this.id = timeSlot.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5607a j(FulfillmentSlotTimeDecorator fulfillmentSlotTimeDecorator) {
        String strI = fulfillmentSlotTimeDecorator.i(fulfillmentSlotTimeDecorator.timeSlot.getStartTime());
        String strI2 = fulfillmentSlotTimeDecorator.i(fulfillmentSlotTimeDecorator.timeSlot.getEndTime());
        int length = strI.length() + 1 + strI2.length();
        if (length < 9) {
            int i10 = 9 - length;
            for (int i11 = 0; i11 < i10; i11++) {
                strI2 = strI2 + ' ';
            }
        }
        return AbstractC5607a.INSTANCE.d(Y.f99809Sc, strI, strI2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ak.AbstractC5607a k(Bm.FulfillmentSlotTimeDecorator r11) {
        /*
            int r0 = Hl.h.f12796i0
            ak.a$a r1 = ak.AbstractC5607a.INSTANCE
            int r2 = com.meijer.mobile.meijer.Y.f100066fh
            ij.c r3 = r11.timeSlot
            j$.time.LocalTime r3 = r3.getStartTime()
            int r4 = r3.getHour()
            r5 = 0
            r6 = 12
            if (r4 != r6) goto L1c
            int r4 = r3.getMinute()
            if (r4 != 0) goto L1c
            r3 = r5
        L1c:
            r4 = 0
            java.lang.String r7 = "toLowerCase(...)"
            java.lang.String r8 = "US"
            if (r3 == 0) goto L51
            ij.c r9 = r11.timeSlot
            j$.time.LocalTime r9 = r9.getStartTime()
            int r9 = r9.getMinute()
            if (r9 != 0) goto L36
            vk.a r9 = vk.C17590a.f164803a
            j$.time.format.DateTimeFormatter r9 = r9.C()
            goto L3c
        L36:
            vk.a r9 = vk.C17590a.f164803a
            j$.time.format.DateTimeFormatter r9 = r9.q()
        L3c:
            java.lang.String r3 = r3.format(r9)
            if (r3 == 0) goto L51
            java.util.Locale r9 = java.util.Locale.US
            kotlin.jvm.internal.Intrinsics.i(r9, r8)
            java.lang.String r3 = r3.toLowerCase(r9)
            kotlin.jvm.internal.Intrinsics.i(r3, r7)
            if (r3 == 0) goto L51
            goto L57
        L51:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            ak.a r3 = r1.d(r0, r3)
        L57:
            ij.c r9 = r11.timeSlot
            j$.time.LocalTime r9 = r9.getEndTime()
            int r10 = r9.getHour()
            if (r10 != r6) goto L6a
            int r6 = r9.getMinute()
            if (r6 != 0) goto L6a
            goto L6b
        L6a:
            r5 = r9
        L6b:
            if (r5 == 0) goto L9b
            ij.c r11 = r11.timeSlot
            j$.time.LocalTime r11 = r11.getEndTime()
            int r11 = r11.getMinute()
            if (r11 != 0) goto L80
            vk.a r11 = vk.C17590a.f164803a
            j$.time.format.DateTimeFormatter r11 = r11.C()
            goto L86
        L80:
            vk.a r11 = vk.C17590a.f164803a
            j$.time.format.DateTimeFormatter r11 = r11.q()
        L86:
            java.lang.String r11 = r5.format(r11)
            if (r11 == 0) goto L9b
            java.util.Locale r5 = java.util.Locale.US
            kotlin.jvm.internal.Intrinsics.i(r5, r8)
            java.lang.String r11 = r11.toLowerCase(r5)
            kotlin.jvm.internal.Intrinsics.i(r11, r7)
            if (r11 == 0) goto L9b
            goto La1
        L9b:
            java.lang.Object[] r11 = new java.lang.Object[r4]
            ak.a r11 = r1.d(r0, r11)
        La1:
            java.lang.Object[] r11 = new java.lang.Object[]{r3, r11}
            ak.a r11 = r1.d(r2, r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Bm.FulfillmentSlotTimeDecorator.k(Bm.q):ak.a");
    }

    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final AbstractC5607a d() {
        return (AbstractC5607a) this.readOnlyTimeSlotText.getValue();
    }

    /* renamed from: e, reason: from getter */
    public final FulfillmentSlot getTimeSlot() {
        return this.timeSlot;
    }

    public final AbstractC5607a f() {
        return (AbstractC5607a) this.timeSlotText.getValue();
    }

    public final boolean g(FulfillmentSlotTimeDecorator item) {
        return Intrinsics.e(this.timeSlot.getId(), item != null ? item.id : null) && this.timeSlot.getIsSlotSelected() == item.h();
    }

    public final boolean h() {
        return this.timeSlot.getIsSlotSelected();
    }

    public int hashCode() {
        return this.timeSlot.hashCode();
    }

    public String toString() {
        return "FulfillmentSlotTimeDecorator(timeSlot=" + this.timeSlot + ')';
    }

    private final String i(LocalTime time) {
        DateTimeFormatter dateTimeFormatterQ;
        if (time.getHour() == 12 && time.getMinute() == 0) {
            time = null;
        }
        if (time != null) {
            if (this.timeSlot.getEndTime().getMinute() == 0) {
                dateTimeFormatterQ = C17590a.f164803a.C();
            } else {
                dateTimeFormatterQ = C17590a.f164803a.q();
            }
            String str = time.format(dateTimeFormatterQ);
            if (str != null) {
                Locale US = Locale.US;
                Intrinsics.i(US, "US");
                String lowerCase = str.toLowerCase(US);
                Intrinsics.i(lowerCase, "toLowerCase(...)");
                if (lowerCase != null) {
                    return lowerCase;
                }
                return "Noon";
            }
            return "Noon";
        }
        return "Noon";
    }
}
