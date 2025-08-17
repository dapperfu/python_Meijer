package com.meijer.mobile.mperks.ux.transactionHistory;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import no.ExpandableTransactionDetailItem;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/mperks/ux/transactionHistory/H;", "", "<init>", "()V", "d", "a", "c", "b", "Lcom/meijer/mobile/mperks/ux/transactionHistory/H$a;", "Lcom/meijer/mobile/mperks/ux/transactionHistory/H$b;", "Lcom/meijer/mobile/mperks/ux/transactionHistory/H$c;", "Lcom/meijer/mobile/mperks/ux/transactionHistory/H$d;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class H {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/mperks/ux/transactionHistory/H$a;", "Lcom/meijer/mobile/mperks/ux/transactionHistory/H;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class a extends H {

        /* renamed from: a, reason: collision with root package name */
        public static final a f114671a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 555887858;
        }

        public String toString() {
            return "NoTransactionsState";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/mperks/ux/transactionHistory/H$b;", "Lcom/meijer/mobile/mperks/ux/transactionHistory/H;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class b extends H {

        /* renamed from: a, reason: collision with root package name */
        public static final b f114672a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 329449374;
        }

        public String toString() {
            return "TransactionErrorState";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/mperks/ux/transactionHistory/H$c;", "Lcom/meijer/mobile/mperks/ux/transactionHistory/H;", "", "Lno/b;", "expandableTransactions", "", "continuationToken", "", "indexToScroll", "", "isScrollToBottom", "<init>", "(Ljava/util/List;Ljava/lang/String;IZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "c", "I", "d", "Z", "()Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.mperks.ux.transactionHistory.H$c, reason: from toString */
    public static final /* data */ class TransactionListState extends H {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ExpandableTransactionDetailItem> expandableTransactions;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String continuationToken;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int indexToScroll;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isScrollToBottom;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransactionListState)) {
                return false;
            }
            TransactionListState transactionListState = (TransactionListState) other;
            return Intrinsics.e(this.expandableTransactions, transactionListState.expandableTransactions) && Intrinsics.e(this.continuationToken, transactionListState.continuationToken) && this.indexToScroll == transactionListState.indexToScroll && this.isScrollToBottom == transactionListState.isScrollToBottom;
        }

        public int hashCode() {
            int iHashCode = this.expandableTransactions.hashCode() * 31;
            String str = this.continuationToken;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.indexToScroll)) * 31) + Boolean.hashCode(this.isScrollToBottom);
        }

        public String toString() {
            return "TransactionListState(expandableTransactions=" + this.expandableTransactions + ", continuationToken=" + this.continuationToken + ", indexToScroll=" + this.indexToScroll + ", isScrollToBottom=" + this.isScrollToBottom + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionListState(List<ExpandableTransactionDetailItem> expandableTransactions, String str, int i10, boolean z10) {
            super(null);
            Intrinsics.j(expandableTransactions, "expandableTransactions");
            this.expandableTransactions = expandableTransactions;
            this.continuationToken = str;
            this.indexToScroll = i10;
            this.isScrollToBottom = z10;
        }

        /* renamed from: a, reason: from getter */
        public final String getContinuationToken() {
            return this.continuationToken;
        }

        public final List<ExpandableTransactionDetailItem> b() {
            return this.expandableTransactions;
        }

        /* renamed from: c, reason: from getter */
        public final int getIndexToScroll() {
            return this.indexToScroll;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getIsScrollToBottom() {
            return this.isScrollToBottom;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/mperks/ux/transactionHistory/H$d;", "Lcom/meijer/mobile/mperks/ux/transactionHistory/H;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class d extends H {

        /* renamed from: a, reason: collision with root package name */
        public static final d f114677a = new d();

        private d() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return -1961894617;
        }

        public String toString() {
            return "TransactionLoading";
        }
    }

    public /* synthetic */ H(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private H() {
    }
}
