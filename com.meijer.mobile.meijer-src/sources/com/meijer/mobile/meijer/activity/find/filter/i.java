package com.meijer.mobile.meijer.activity.find.filter;

import Qo.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/i;", "", "<init>", "()V", "b", "a", "c", "Lcom/meijer/mobile/meijer/activity/find/filter/i$a;", "Lcom/meijer/mobile/meijer/activity/find/filter/i$b;", "Lcom/meijer/mobile/meijer/activity/find/filter/i$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class i {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/i$a;", "Lcom/meijer/mobile/meijer/activity/find/filter/i;", "LQo/l$k;", "query", "<init>", "(LQo/l$k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LQo/l$k;", "()LQo/l$k;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.filter.i$a, reason: from toString */
    public static final /* data */ class FinishWithResult extends i {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final l.k query;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FinishWithResult) && Intrinsics.e(this.query, ((FinishWithResult) other).query);
        }

        public int hashCode() {
            return this.query.hashCode();
        }

        public String toString() {
            return "FinishWithResult(query=" + this.query + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FinishWithResult(l.k query) {
            super(null);
            Intrinsics.j(query, "query");
            this.query = query;
        }

        /* renamed from: a, reason: from getter */
        public final l.k getQuery() {
            return this.query;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/i$b;", "Lcom/meijer/mobile/meijer/activity/find/filter/i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class b extends i {

        /* renamed from: a, reason: collision with root package name */
        public static final b f107570a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -652573071;
        }

        public String toString() {
            return "GoBackWithoutResolution";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/i$c;", "Lcom/meijer/mobile/meijer/activity/find/filter/i;", "", "title", "message", "positiveButtonText", "negativeButtonText", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.filter.i$c, reason: from toString */
    public static final /* data */ class ShowSaveChangesDialogEvent extends i {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int title;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int message;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int positiveButtonText;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int negativeButtonText;

        public ShowSaveChangesDialogEvent(int i10, int i11, int i12, int i13) {
            super(null);
            this.title = i10;
            this.message = i11;
            this.positiveButtonText = i12;
            this.negativeButtonText = i13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowSaveChangesDialogEvent)) {
                return false;
            }
            ShowSaveChangesDialogEvent showSaveChangesDialogEvent = (ShowSaveChangesDialogEvent) other;
            return this.title == showSaveChangesDialogEvent.title && this.message == showSaveChangesDialogEvent.message && this.positiveButtonText == showSaveChangesDialogEvent.positiveButtonText && this.negativeButtonText == showSaveChangesDialogEvent.negativeButtonText;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.title) * 31) + Integer.hashCode(this.message)) * 31) + Integer.hashCode(this.positiveButtonText)) * 31) + Integer.hashCode(this.negativeButtonText);
        }

        public String toString() {
            return "ShowSaveChangesDialogEvent(title=" + this.title + ", message=" + this.message + ", positiveButtonText=" + this.positiveButtonText + ", negativeButtonText=" + this.negativeButtonText + ')';
        }

        /* renamed from: a, reason: from getter */
        public final int getMessage() {
            return this.message;
        }

        /* renamed from: b, reason: from getter */
        public final int getNegativeButtonText() {
            return this.negativeButtonText;
        }

        /* renamed from: c, reason: from getter */
        public final int getPositiveButtonText() {
            return this.positiveButtonText;
        }

        /* renamed from: d, reason: from getter */
        public final int getTitle() {
            return this.title;
        }
    }

    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private i() {
    }
}
