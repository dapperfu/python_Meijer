package com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt;

import Ik.Validation;
import com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.M;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B9\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u00002\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010.\u001a\u0004\b/\u00100R$\u00104\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000102018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u00103¨\u00065"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/b;", "", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$a;", "date", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$e;", "txNumber", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$d;", "tmNumber", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$b;", "stNumber", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$c;", "time", "<init>", "(Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$a;Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$e;Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$d;Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$b;Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$c;)V", "field", "l", "(Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M;)Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/b;", "e", "(Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$a;Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$e;Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$d;Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$b;Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$c;)Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$a;", "g", "()Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$a;", "b", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$e;", "k", "()Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$e;", "c", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$d;", "j", "()Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$d;", "d", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$b;", "h", "()Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$b;", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$c;", "i", "()Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/M$c;", "", "LIk/b;", "()Ljava/util/List;", "validations", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class FuelReceiptDecorator implements Ik.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final M.Date date;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final M.TxNumber txNumber;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final M.TmNumber tmNumber;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final M.StNumber stNumber;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final M.Time time;

    public FuelReceiptDecorator() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ FuelReceiptDecorator f(FuelReceiptDecorator fuelReceiptDecorator, M.Date date, M.TxNumber txNumber, M.TmNumber tmNumber, M.StNumber stNumber, M.Time time, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            date = fuelReceiptDecorator.date;
        }
        if ((i10 & 2) != 0) {
            txNumber = fuelReceiptDecorator.txNumber;
        }
        if ((i10 & 4) != 0) {
            tmNumber = fuelReceiptDecorator.tmNumber;
        }
        if ((i10 & 8) != 0) {
            stNumber = fuelReceiptDecorator.stNumber;
        }
        if ((i10 & 16) != 0) {
            time = fuelReceiptDecorator.time;
        }
        M.Time time2 = time;
        M.TmNumber tmNumber2 = tmNumber;
        return fuelReceiptDecorator.e(date, txNumber, tmNumber2, stNumber, time2);
    }

    public final FuelReceiptDecorator e(M.Date date, M.TxNumber txNumber, M.TmNumber tmNumber, M.StNumber stNumber, M.Time time) {
        Intrinsics.j(date, "date");
        Intrinsics.j(txNumber, "txNumber");
        Intrinsics.j(tmNumber, "tmNumber");
        Intrinsics.j(stNumber, "stNumber");
        Intrinsics.j(time, "time");
        return new FuelReceiptDecorator(date, txNumber, tmNumber, stNumber, time);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuelReceiptDecorator)) {
            return false;
        }
        FuelReceiptDecorator fuelReceiptDecorator = (FuelReceiptDecorator) other;
        return Intrinsics.e(this.date, fuelReceiptDecorator.date) && Intrinsics.e(this.txNumber, fuelReceiptDecorator.txNumber) && Intrinsics.e(this.tmNumber, fuelReceiptDecorator.tmNumber) && Intrinsics.e(this.stNumber, fuelReceiptDecorator.stNumber) && Intrinsics.e(this.time, fuelReceiptDecorator.time);
    }

    public int hashCode() {
        return (((((((this.date.hashCode() * 31) + this.txNumber.hashCode()) * 31) + this.tmNumber.hashCode()) * 31) + this.stNumber.hashCode()) * 31) + this.time.hashCode();
    }

    public String toString() {
        return "FuelReceiptDecorator(date=" + this.date + ", txNumber=" + this.txNumber + ", tmNumber=" + this.tmNumber + ", stNumber=" + this.stNumber + ", time=" + this.time + ')';
    }

    public FuelReceiptDecorator(M.Date date, M.TxNumber txNumber, M.TmNumber tmNumber, M.StNumber stNumber, M.Time time) {
        Intrinsics.j(date, "date");
        Intrinsics.j(txNumber, "txNumber");
        Intrinsics.j(tmNumber, "tmNumber");
        Intrinsics.j(stNumber, "stNumber");
        Intrinsics.j(time, "time");
        this.date = date;
        this.txNumber = txNumber;
        this.tmNumber = tmNumber;
        this.stNumber = stNumber;
        this.time = time;
    }

    @Override // Ik.a
    public List<Validation<? extends Object>> a() {
        return CollectionsKt.p(this.date.c(), this.txNumber.c(), this.tmNumber.c(), this.stNumber.c(), this.time.c());
    }

    /* renamed from: g, reason: from getter */
    public final M.Date getDate() {
        return this.date;
    }

    /* renamed from: h, reason: from getter */
    public final M.StNumber getStNumber() {
        return this.stNumber;
    }

    /* renamed from: i, reason: from getter */
    public final M.Time getTime() {
        return this.time;
    }

    /* renamed from: j, reason: from getter */
    public final M.TmNumber getTmNumber() {
        return this.tmNumber;
    }

    /* renamed from: k, reason: from getter */
    public final M.TxNumber getTxNumber() {
        return this.txNumber;
    }

    public FuelReceiptDecorator l(M<?> field) {
        Intrinsics.j(field, "field");
        if (field instanceof M.Date) {
            M.Date date = (M.Date) field;
            return date.c().e().length() <= 6 ? f(this, date.f(), null, null, null, null, 30, null) : f(this, this.date.f(), null, null, null, null, 30, null);
        }
        if (field instanceof M.TxNumber) {
            M.TxNumber txNumber = (M.TxNumber) field;
            return txNumber.c().e().length() <= 6 ? f(this, null, txNumber.f(), null, null, null, 29, null) : f(this, null, this.txNumber.f(), null, null, null, 29, null);
        }
        if (field instanceof M.TmNumber) {
            M.TmNumber tmNumber = (M.TmNumber) field;
            return tmNumber.c().e().length() <= 4 ? f(this, null, null, tmNumber.f(), null, null, 27, null) : f(this, null, null, this.tmNumber.f(), null, null, 27, null);
        }
        if (field instanceof M.StNumber) {
            M.StNumber stNumber = (M.StNumber) field;
            return stNumber.c().e().length() <= 5 ? f(this, null, null, null, stNumber.f(), null, 23, null) : f(this, null, null, null, this.stNumber.f(), null, 23, null);
        }
        if (!(field instanceof M.Time)) {
            throw new NoWhenBranchMatchedException();
        }
        M.Time time = (M.Time) field;
        return time.c().e().length() <= 6 ? f(this, null, null, null, null, time.f(), 15, null) : f(this, null, null, null, null, this.time.f(), 15, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ FuelReceiptDecorator(M.Date date, M.TxNumber txNumber, M.TmNumber tmNumber, M.StNumber stNumber, M.Time time, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        int i11 = 1;
        this((i10 & 1) != 0 ? new M.Date(null, i11, 0 == true ? 1 : 0) : date, (i10 & 2) != 0 ? new M.TxNumber(0 == true ? 1 : 0, i11, 0 == true ? 1 : 0) : txNumber, (i10 & 4) != 0 ? new M.TmNumber(0 == true ? 1 : 0, i11, 0 == true ? 1 : 0) : tmNumber, (i10 & 8) != 0 ? new M.StNumber(0 == true ? 1 : 0, i11, 0 == true ? 1 : 0) : stNumber, (i10 & 16) != 0 ? new M.Time(0 == true ? 1 : 0, i11, 0 == true ? 1 : 0) : time);
    }
}
