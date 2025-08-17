package gn;

import ak.AbstractC5607a;
import com.meijer.mobile.meijer.Y;
import ej.H;
import ej.TransactionDetail;
import j$.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vk.C17590a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\nB3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lgn/c;", "", "Lak/a;", "transactionId", "date", "amount", "Lej/H;", "type", "<init>", "(Lak/a;Lak/a;Lak/a;Lej/H;)V", "a", "Lak/a;", "c", "()Lak/a;", "b", "d", "Lej/H;", "getType", "()Lej/H;", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gn.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14282c {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f133825f = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a transactionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a date;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a amount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final H type;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\r\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgn/c$a;", "", "<init>", "()V", "Lej/H;", "type", "j$/time/OffsetDateTime", "date", "Lak/a;", "b", "(Lej/H;Lj$/time/OffsetDateTime;)Lak/a;", "Lej/I;", "Lgn/c;", "a", "(Lej/I;)Lgn/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gn.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gn.c$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2105a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[H.values().length];
                try {
                    iArr[H.f128847b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[H.f128848c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[H.f128849d.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[H.f128850e.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        private final AbstractC5607a b(H type, OffsetDateTime date) {
            String str;
            int i10 = C2105a.$EnumSwitchMapping$0[type.ordinal()];
            if (i10 == 1) {
                AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
                int i11 = Y.f99951a2;
                str = date != null ? date.format(C17590a.DATE_FORMAT_MM_DD_YYYY) : null;
                return companion.d(i11, str != null ? str : "");
            }
            if (i10 != 2 && i10 != 3 && i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC5607a.Companion companion2 = AbstractC5607a.INSTANCE;
            int i12 = Y.f99912Y1;
            str = date != null ? date.format(C17590a.DATE_FORMAT_MM_DD_YYYY) : null;
            return companion2.d(i12, str != null ? str : "");
        }

        public final C14282c a(TransactionDetail transactionDetail) {
            Intrinsics.j(transactionDetail, "<this>");
            String id2 = transactionDetail.getId();
            AbstractC5607a abstractC5607aD = id2 != null ? AbstractC5607a.INSTANCE.d(Y.f100412x4, id2) : null;
            AbstractC5607a abstractC5607aB = b(transactionDetail.getType(), transactionDetail.getDate());
            Double amount = transactionDetail.getAmount();
            return new C14282c(abstractC5607aD, abstractC5607aB, amount != null ? AbstractC5607a.INSTANCE.d(Y.f99971b2, Double.valueOf(amount.doubleValue())) : null, transactionDetail.getType());
        }
    }

    public C14282c(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, H type) {
        Intrinsics.j(type, "type");
        this.transactionId = abstractC5607a;
        this.date = abstractC5607a2;
        this.amount = abstractC5607a3;
        this.type = type;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getAmount() {
        return this.amount;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getDate() {
        return this.date;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC5607a getTransactionId() {
        return this.transactionId;
    }
}
