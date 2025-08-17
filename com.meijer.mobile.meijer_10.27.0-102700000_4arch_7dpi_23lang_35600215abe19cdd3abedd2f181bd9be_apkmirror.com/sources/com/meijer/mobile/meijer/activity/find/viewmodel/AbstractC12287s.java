package com.meijer.mobile.meijer.activity.find.viewmodel;

import Ok.Coupon;
import Qo.l;
import android.net.Uri;
import hi.AbstractC14481h;
import hi.TrackingData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/s;", "", "<init>", "()V", "g", "e", "b", "f", "c", "h", "a", "i", "d", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/s$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/s$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/s$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/s$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/s$e;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/s$f;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/s$g;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/s$h;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/s$i;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC12287s {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0017\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/s$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/s;", "", "titleResId", "messageResId", "positiveButtonResId", "negativeButtonResId", "LOk/a;", "coupon", "Lhi/f;", "trackingData", "<init>", "(IIIILOk/a;Lhi/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "e", "b", "c", "d", "LOk/a;", "()LOk/a;", "f", "Lhi/f;", "()Lhi/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.s$a, reason: from toString */
    public static final /* data */ class ClipCouponFailedEvent extends AbstractC12287s {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int titleResId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int messageResId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int positiveButtonResId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int negativeButtonResId;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Coupon coupon;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClipCouponFailedEvent)) {
                return false;
            }
            ClipCouponFailedEvent clipCouponFailedEvent = (ClipCouponFailedEvent) other;
            return this.titleResId == clipCouponFailedEvent.titleResId && this.messageResId == clipCouponFailedEvent.messageResId && this.positiveButtonResId == clipCouponFailedEvent.positiveButtonResId && this.negativeButtonResId == clipCouponFailedEvent.negativeButtonResId && Intrinsics.e(this.coupon, clipCouponFailedEvent.coupon) && Intrinsics.e(this.trackingData, clipCouponFailedEvent.trackingData);
        }

        public int hashCode() {
            int iHashCode = ((((((((Integer.hashCode(this.titleResId) * 31) + Integer.hashCode(this.messageResId)) * 31) + Integer.hashCode(this.positiveButtonResId)) * 31) + Integer.hashCode(this.negativeButtonResId)) * 31) + this.coupon.hashCode()) * 31;
            TrackingData trackingData = this.trackingData;
            return iHashCode + (trackingData == null ? 0 : trackingData.hashCode());
        }

        public String toString() {
            return "ClipCouponFailedEvent(titleResId=" + this.titleResId + ", messageResId=" + this.messageResId + ", positiveButtonResId=" + this.positiveButtonResId + ", negativeButtonResId=" + this.negativeButtonResId + ", coupon=" + this.coupon + ", trackingData=" + this.trackingData + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClipCouponFailedEvent(int i10, int i11, int i12, int i13, Coupon coupon, TrackingData trackingData) {
            super(null);
            Intrinsics.j(coupon, "coupon");
            this.titleResId = i10;
            this.messageResId = i11;
            this.positiveButtonResId = i12;
            this.negativeButtonResId = i13;
            this.coupon = coupon;
            this.trackingData = trackingData;
        }

        /* renamed from: a, reason: from getter */
        public final Coupon getCoupon() {
            return this.coupon;
        }

        /* renamed from: b, reason: from getter */
        public final int getMessageResId() {
            return this.messageResId;
        }

        /* renamed from: c, reason: from getter */
        public final int getNegativeButtonResId() {
            return this.negativeButtonResId;
        }

        /* renamed from: d, reason: from getter */
        public final int getPositiveButtonResId() {
            return this.positiveButtonResId;
        }

        /* renamed from: e, reason: from getter */
        public final int getTitleResId() {
            return this.titleResId;
        }

        /* renamed from: f, reason: from getter */
        public final TrackingData getTrackingData() {
            return this.trackingData;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/s$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/s;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.s$b */
    public static final /* data */ class b extends AbstractC12287s {

        /* renamed from: a, reason: collision with root package name */
        public static final b f108974a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -1944598205;
        }

        public String toString() {
            return "ExitSearchEvent";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/s$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/s;", "LQo/l$k;", "filterAndSortState", "<init>", "(LQo/l$k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LQo/l$k;", "()LQo/l$k;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.s$c, reason: from toString */
    public static final /* data */ class LaunchFilterAndSort extends AbstractC12287s {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final l.k filterAndSortState;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LaunchFilterAndSort) && Intrinsics.e(this.filterAndSortState, ((LaunchFilterAndSort) other).filterAndSortState);
        }

        public int hashCode() {
            return this.filterAndSortState.hashCode();
        }

        public String toString() {
            return "LaunchFilterAndSort(filterAndSortState=" + this.filterAndSortState + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LaunchFilterAndSort(l.k filterAndSortState) {
            super(null);
            Intrinsics.j(filterAndSortState, "filterAndSortState");
            this.filterAndSortState = filterAndSortState;
        }

        /* renamed from: a, reason: from getter */
        public final l.k getFilterAndSortState() {
            return this.filterAndSortState;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/s$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/s;", "", "errorMessageId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.s$d, reason: from toString */
    public static final /* data */ class LoginRequiredEvent extends AbstractC12287s {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int errorMessageId;

        public LoginRequiredEvent(int i10) {
            super(null);
            this.errorMessageId = i10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoginRequiredEvent) && this.errorMessageId == ((LoginRequiredEvent) other).errorMessageId;
        }

        public int hashCode() {
            return Integer.hashCode(this.errorMessageId);
        }

        public String toString() {
            return "LoginRequiredEvent(errorMessageId=" + this.errorMessageId + ')';
        }

        /* renamed from: a, reason: from getter */
        public final int getErrorMessageId() {
            return this.errorMessageId;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/s$e;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/s;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.s$e */
    public static final /* data */ class e extends AbstractC12287s {

        /* renamed from: a, reason: collision with root package name */
        public static final e f108977a = new e();

        private e() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        public int hashCode() {
            return 1990512114;
        }

        public String toString() {
            return "StartBarcodeScanIntentEvent";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/s$f;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/s;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.s$f */
    public static final /* data */ class f extends AbstractC12287s {

        /* renamed from: a, reason: collision with root package name */
        public static final f f108978a = new f();

        private f() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        public int hashCode() {
            return 867494414;
        }

        public String toString() {
            return "ToCartEvent";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/s$g;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/s;", "", "shouldShow", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.s$g, reason: from toString */
    public static final /* data */ class ToggleKeyboardEvent extends AbstractC12287s {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldShow;

        public ToggleKeyboardEvent(boolean z10) {
            super(null);
            this.shouldShow = z10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ToggleKeyboardEvent) && this.shouldShow == ((ToggleKeyboardEvent) other).shouldShow;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldShow);
        }

        public String toString() {
            return "ToggleKeyboardEvent(shouldShow=" + this.shouldShow + ')';
        }

        /* renamed from: a, reason: from getter */
        public final boolean getShouldShow() {
            return this.shouldShow;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/s$h;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/s;", "LOk/c;", "coupon", "Lhi/f;", "trackingData", "<init>", "(LOk/c;Lhi/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LOk/c;", "()LOk/c;", "b", "Lhi/f;", "()Lhi/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.s$h, reason: from toString */
    public static final /* data */ class ViewCouponDetails extends AbstractC12287s {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Ok.c coupon;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TrackingData trackingData;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewCouponDetails)) {
                return false;
            }
            ViewCouponDetails viewCouponDetails = (ViewCouponDetails) other;
            return Intrinsics.e(this.coupon, viewCouponDetails.coupon) && Intrinsics.e(this.trackingData, viewCouponDetails.trackingData);
        }

        public int hashCode() {
            int iHashCode = this.coupon.hashCode() * 31;
            TrackingData trackingData = this.trackingData;
            return iHashCode + (trackingData == null ? 0 : trackingData.hashCode());
        }

        public String toString() {
            return "ViewCouponDetails(coupon=" + this.coupon + ", trackingData=" + this.trackingData + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewCouponDetails(Ok.c coupon, TrackingData trackingData) {
            super(null);
            Intrinsics.j(coupon, "coupon");
            this.coupon = coupon;
            this.trackingData = trackingData;
        }

        /* renamed from: a, reason: from getter */
        public final Ok.c getCoupon() {
            return this.coupon;
        }

        /* renamed from: b, reason: from getter */
        public final TrackingData getTrackingData() {
            return this.trackingData;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/s$i;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/s;", "Landroid/net/Uri;", "uri", "Lhi/h;", "trackingState", "", "carouselTitle", "", "isFromSeeMoreItems", "<init>", "(Landroid/net/Uri;Lhi/h;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "b", "Lhi/h;", "()Lhi/h;", "Ljava/lang/String;", "d", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.s$i, reason: from toString */
    public static final /* data */ class ViewPersonalizedProducts extends AbstractC12287s {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Uri uri;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC14481h trackingState;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String carouselTitle;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFromSeeMoreItems;

        public ViewPersonalizedProducts(Uri uri, AbstractC14481h abstractC14481h, String str, boolean z10) {
            super(null);
            this.uri = uri;
            this.trackingState = abstractC14481h;
            this.carouselTitle = str;
            this.isFromSeeMoreItems = z10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewPersonalizedProducts)) {
                return false;
            }
            ViewPersonalizedProducts viewPersonalizedProducts = (ViewPersonalizedProducts) other;
            return Intrinsics.e(this.uri, viewPersonalizedProducts.uri) && Intrinsics.e(this.trackingState, viewPersonalizedProducts.trackingState) && Intrinsics.e(this.carouselTitle, viewPersonalizedProducts.carouselTitle) && this.isFromSeeMoreItems == viewPersonalizedProducts.isFromSeeMoreItems;
        }

        public int hashCode() {
            Uri uri = this.uri;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            AbstractC14481h abstractC14481h = this.trackingState;
            int iHashCode2 = (iHashCode + (abstractC14481h == null ? 0 : abstractC14481h.hashCode())) * 31;
            String str = this.carouselTitle;
            return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isFromSeeMoreItems);
        }

        public String toString() {
            return "ViewPersonalizedProducts(uri=" + this.uri + ", trackingState=" + this.trackingState + ", carouselTitle=" + this.carouselTitle + ", isFromSeeMoreItems=" + this.isFromSeeMoreItems + ')';
        }

        /* renamed from: a, reason: from getter */
        public final String getCarouselTitle() {
            return this.carouselTitle;
        }

        /* renamed from: b, reason: from getter */
        public final AbstractC14481h getTrackingState() {
            return this.trackingState;
        }

        /* renamed from: c, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getIsFromSeeMoreItems() {
            return this.isFromSeeMoreItems;
        }
    }

    public /* synthetic */ AbstractC12287s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC12287s() {
    }
}
