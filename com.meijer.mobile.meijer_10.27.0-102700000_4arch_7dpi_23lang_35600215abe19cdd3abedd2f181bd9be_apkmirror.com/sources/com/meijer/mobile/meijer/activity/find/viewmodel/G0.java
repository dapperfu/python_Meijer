package com.meijer.mobile.meijer.activity.find.viewmodel;

import ej.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0010\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;", "", "<init>", "()V", "i", "g", "m", "d", "p", "o", "b", "k", "a", "n", "h", "l", "c", "j", "e", "f", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$e;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$f;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$g;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$h;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$i;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$j;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$k;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$l;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$m;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$n;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$o;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$p;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class G0 {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;", "", "messageResId", "actionResId", "Lej/i;", "entry", "<init>", "(IILej/i;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Lej/i;", "()Lej/i;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.G0$a, reason: from toString */
    public static final /* data */ class AddToCartSuccessEvent extends G0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int messageResId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int actionResId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Entry entry;

        public AddToCartSuccessEvent(int i10, int i11, Entry entry) {
            super(null);
            this.messageResId = i10;
            this.actionResId = i11;
            this.entry = entry;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddToCartSuccessEvent)) {
                return false;
            }
            AddToCartSuccessEvent addToCartSuccessEvent = (AddToCartSuccessEvent) other;
            return this.messageResId == addToCartSuccessEvent.messageResId && this.actionResId == addToCartSuccessEvent.actionResId && Intrinsics.e(this.entry, addToCartSuccessEvent.entry);
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.messageResId) * 31) + Integer.hashCode(this.actionResId)) * 31;
            Entry entry = this.entry;
            return iHashCode + (entry == null ? 0 : entry.hashCode());
        }

        public String toString() {
            return "AddToCartSuccessEvent(messageResId=" + this.messageResId + ", actionResId=" + this.actionResId + ", entry=" + this.entry + ')';
        }

        /* renamed from: a, reason: from getter */
        public final int getActionResId() {
            return this.actionResId;
        }

        /* renamed from: b, reason: from getter */
        public final Entry getEntry() {
            return this.entry;
        }

        /* renamed from: c, reason: from getter */
        public final int getMessageResId() {
            return this.messageResId;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;", "Lmk/c;", "product", "<init>", "(Lmk/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmk/c;", "()Lmk/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.G0$b, reason: from toString */
    public static final /* data */ class FavoriteListItemAdded extends G0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final mk.c product;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FavoriteListItemAdded) && Intrinsics.e(this.product, ((FavoriteListItemAdded) other).product);
        }

        public int hashCode() {
            return this.product.hashCode();
        }

        public String toString() {
            return "FavoriteListItemAdded(product=" + this.product + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FavoriteListItemAdded(mk.c product) {
            super(null);
            Intrinsics.j(product, "product");
            this.product = product;
        }

        /* renamed from: a, reason: from getter */
        public final mk.c getProduct() {
            return this.product;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;", "", "isSuccess", "LKp/a;", "feedbackVote", "<init>", "(ZLKp/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "LKp/a;", "()LKp/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.G0$c, reason: from toString */
    public static final /* data */ class FeedbackSubmissionEvent extends G0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSuccess;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Kp.a feedbackVote;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeedbackSubmissionEvent)) {
                return false;
            }
            FeedbackSubmissionEvent feedbackSubmissionEvent = (FeedbackSubmissionEvent) other;
            return this.isSuccess == feedbackSubmissionEvent.isSuccess && this.feedbackVote == feedbackSubmissionEvent.feedbackVote;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isSuccess) * 31) + this.feedbackVote.hashCode();
        }

        public String toString() {
            return "FeedbackSubmissionEvent(isSuccess=" + this.isSuccess + ", feedbackVote=" + this.feedbackVote + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeedbackSubmissionEvent(boolean z10, Kp.a feedbackVote) {
            super(null);
            Intrinsics.j(feedbackVote, "feedbackVote");
            this.isSuccess = z10;
            this.feedbackVote = feedbackVote;
        }

        /* renamed from: a, reason: from getter */
        public final Kp.a getFeedbackVote() {
            return this.feedbackVote;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class d extends G0 {
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$e;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class e extends G0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f107899a = new e();

        private e() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        public int hashCode() {
            return -1334610378;
        }

        public String toString() {
            return "ProductAddedWithBackup";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$f;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class f extends G0 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f107900a = new f();

        private f() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        public int hashCode() {
            return 909998556;
        }

        public String toString() {
            return "ProductAddedWithoutBackup";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$g;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;", "Lmk/f;", "product", "", "messageResId", "<init>", "(Lmk/f;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmk/f;", "b", "()Lmk/f;", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.G0$g, reason: from toString */
    public static final /* data */ class ProductLoadError extends G0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final mk.f product;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int messageResId;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductLoadError)) {
                return false;
            }
            ProductLoadError productLoadError = (ProductLoadError) other;
            return Intrinsics.e(this.product, productLoadError.product) && this.messageResId == productLoadError.messageResId;
        }

        public int hashCode() {
            return (this.product.hashCode() * 31) + Integer.hashCode(this.messageResId);
        }

        public String toString() {
            return "ProductLoadError(product=" + this.product + ", messageResId=" + this.messageResId + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProductLoadError(mk.f product, int i10) {
            super(null);
            Intrinsics.j(product, "product");
            this.product = product;
            this.messageResId = i10;
        }

        /* renamed from: a, reason: from getter */
        public final int getMessageResId() {
            return this.messageResId;
        }

        /* renamed from: b, reason: from getter */
        public final mk.f getProduct() {
            return this.product;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$h;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;", "", "shouldRefresh", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.G0$h, reason: from toString */
    public static final /* data */ class RefreshCartOnListPageEvent extends G0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldRefresh;

        public RefreshCartOnListPageEvent(boolean z10) {
            super(null);
            this.shouldRefresh = z10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RefreshCartOnListPageEvent) && this.shouldRefresh == ((RefreshCartOnListPageEvent) other).shouldRefresh;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldRefresh);
        }

        public String toString() {
            return "RefreshCartOnListPageEvent(shouldRefresh=" + this.shouldRefresh + ')';
        }

        /* renamed from: a, reason: from getter */
        public final boolean getShouldRefresh() {
            return this.shouldRefresh;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$i;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;", "", "messageResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.G0$i, reason: from toString */
    public static final /* data */ class RequireLogin extends G0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int messageResId;

        public RequireLogin(int i10) {
            super(null);
            this.messageResId = i10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RequireLogin) && this.messageResId == ((RequireLogin) other).messageResId;
        }

        public int hashCode() {
            return Integer.hashCode(this.messageResId);
        }

        public String toString() {
            return "RequireLogin(messageResId=" + this.messageResId + ')';
        }

        /* renamed from: a, reason: from getter */
        public final int getMessageResId() {
            return this.messageResId;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$j;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class j extends G0 {

        /* renamed from: a, reason: collision with root package name */
        public static final j f107905a = new j();

        private j() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof j);
        }

        public int hashCode() {
            return 272836285;
        }

        public String toString() {
            return "ReviewSubmittedSuccessEvent";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$k;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;", "Lmk/c;", "product", "<init>", "(Lmk/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmk/c;", "()Lmk/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.G0$k, reason: from toString */
    public static final /* data */ class ShoppingListItemAdded extends G0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final mk.c product;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShoppingListItemAdded) && Intrinsics.e(this.product, ((ShoppingListItemAdded) other).product);
        }

        public int hashCode() {
            return this.product.hashCode();
        }

        public String toString() {
            return "ShoppingListItemAdded(product=" + this.product + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShoppingListItemAdded(mk.c product) {
            super(null);
            Intrinsics.j(product, "product");
            this.product = product;
        }

        /* renamed from: a, reason: from getter */
        public final mk.c getProduct() {
            return this.product;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$l;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;", "", "title", "message", "positiveButtonText", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.G0$l, reason: from toString */
    public static final /* data */ class ShowError extends G0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int title;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int message;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int positiveButtonText;

        public ShowError(int i10, int i11, int i12) {
            super(null);
            this.title = i10;
            this.message = i11;
            this.positiveButtonText = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowError)) {
                return false;
            }
            ShowError showError = (ShowError) other;
            return this.title == showError.title && this.message == showError.message && this.positiveButtonText == showError.positiveButtonText;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.title) * 31) + Integer.hashCode(this.message)) * 31) + Integer.hashCode(this.positiveButtonText);
        }

        public String toString() {
            return "ShowError(title=" + this.title + ", message=" + this.message + ", positiveButtonText=" + this.positiveButtonText + ')';
        }

        /* renamed from: a, reason: from getter */
        public final int getMessage() {
            return this.message;
        }

        /* renamed from: b, reason: from getter */
        public final int getPositiveButtonText() {
            return this.positiveButtonText;
        }

        /* renamed from: c, reason: from getter */
        public final int getTitle() {
            return this.title;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$m;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;", "", "messageResId", "titleResId", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.G0$m, reason: from toString */
    public static final /* data */ class UpdateShoppingOrFavoriteListFailed extends G0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int messageResId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int titleResId;

        public UpdateShoppingOrFavoriteListFailed(int i10, int i11) {
            super(null);
            this.messageResId = i10;
            this.titleResId = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateShoppingOrFavoriteListFailed)) {
                return false;
            }
            UpdateShoppingOrFavoriteListFailed updateShoppingOrFavoriteListFailed = (UpdateShoppingOrFavoriteListFailed) other;
            return this.messageResId == updateShoppingOrFavoriteListFailed.messageResId && this.titleResId == updateShoppingOrFavoriteListFailed.titleResId;
        }

        public int hashCode() {
            return (Integer.hashCode(this.messageResId) * 31) + Integer.hashCode(this.titleResId);
        }

        public String toString() {
            return "UpdateShoppingOrFavoriteListFailed(messageResId=" + this.messageResId + ", titleResId=" + this.titleResId + ')';
        }

        /* renamed from: a, reason: from getter */
        public final int getMessageResId() {
            return this.messageResId;
        }

        /* renamed from: b, reason: from getter */
        public final int getTitleResId() {
            return this.titleResId;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$n;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;", "", "messageResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.G0$n, reason: from toString */
    public static final /* data */ class UpdateToCartFailedEvent extends G0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int messageResId;

        public UpdateToCartFailedEvent(int i10) {
            super(null);
            this.messageResId = i10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateToCartFailedEvent) && this.messageResId == ((UpdateToCartFailedEvent) other).messageResId;
        }

        public int hashCode() {
            return Integer.hashCode(this.messageResId);
        }

        public String toString() {
            return "UpdateToCartFailedEvent(messageResId=" + this.messageResId + ')';
        }

        /* renamed from: a, reason: from getter */
        public final int getMessageResId() {
            return this.messageResId;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$o;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;", "Lmk/f;", "product", "<init>", "(Lmk/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmk/f;", "()Lmk/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.G0$o, reason: from toString */
    public static final /* data */ class ViewOnFavoriteList extends G0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final mk.f product;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewOnFavoriteList) && Intrinsics.e(this.product, ((ViewOnFavoriteList) other).product);
        }

        public int hashCode() {
            return this.product.hashCode();
        }

        public String toString() {
            return "ViewOnFavoriteList(product=" + this.product + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewOnFavoriteList(mk.f product) {
            super(null);
            Intrinsics.j(product, "product");
            this.product = product;
        }

        /* renamed from: a, reason: from getter */
        public final mk.f getProduct() {
            return this.product;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0$p;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;", "Lmk/f;", "product", "<init>", "(Lmk/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmk/f;", "()Lmk/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.G0$p, reason: from toString */
    public static final /* data */ class ViewOnShoppingList extends G0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final mk.f product;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewOnShoppingList) && Intrinsics.e(this.product, ((ViewOnShoppingList) other).product);
        }

        public int hashCode() {
            return this.product.hashCode();
        }

        public String toString() {
            return "ViewOnShoppingList(product=" + this.product + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewOnShoppingList(mk.f product) {
            super(null);
            Intrinsics.j(product, "product");
            this.product = product;
        }

        /* renamed from: a, reason: from getter */
        public final mk.f getProduct() {
            return this.product;
        }
    }

    public /* synthetic */ G0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private G0() {
    }
}
