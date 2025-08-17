package com.meijer.mobile.core.design.widget.stepperview;

import Wj.ValueState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0006\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/core/design/widget/stepperview/a;", "", "LWj/t;", "valueState", "<init>", "(LWj/t;)V", "a", "LWj/t;", "()LWj/t;", "c", "e", "b", "d", "Lcom/meijer/mobile/core/design/widget/stepperview/a$a;", "Lcom/meijer/mobile/core/design/widget/stepperview/a$b;", "Lcom/meijer/mobile/core/design/widget/stepperview/a$c;", "Lcom/meijer/mobile/core/design/widget/stepperview/a$d;", "Lcom/meijer/mobile/core/design/widget/stepperview/a$e;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ValueState valueState;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/core/design/widget/stepperview/a$a;", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "LWj/t;", "valueState", "<init>", "(LWj/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LWj/t;", "a", "()LWj/t;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.core.design.widget.stepperview.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class Loading extends a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ValueState valueState;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.e(this.valueState, ((Loading) other).valueState);
        }

        public int hashCode() {
            return this.valueState.hashCode();
        }

        public String toString() {
            return "Loading(valueState=" + this.valueState + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(ValueState valueState) {
            super(valueState, null);
            Intrinsics.j(valueState, "valueState");
            this.valueState = valueState;
        }

        @Override // com.meijer.mobile.core.design.widget.stepperview.a
        /* renamed from: a, reason: from getter */
        public ValueState getValueState() {
            return this.valueState;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/core/design/widget/stepperview/a$b;", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "LWj/t;", "valueState", "<init>", "(LWj/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LWj/t;", "a", "()LWj/t;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.core.design.widget.stepperview.a$b, reason: from toString */
    public static final /* data */ class MultipleQuantity extends a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ValueState valueState;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MultipleQuantity) && Intrinsics.e(this.valueState, ((MultipleQuantity) other).valueState);
        }

        public int hashCode() {
            return this.valueState.hashCode();
        }

        public String toString() {
            return "MultipleQuantity(valueState=" + this.valueState + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultipleQuantity(ValueState valueState) {
            super(valueState, null);
            Intrinsics.j(valueState, "valueState");
            this.valueState = valueState;
        }

        @Override // com.meijer.mobile.core.design.widget.stepperview.a
        /* renamed from: a, reason: from getter */
        public ValueState getValueState() {
            return this.valueState;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/core/design/widget/stepperview/a$c;", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "LWj/t;", "valueState", "<init>", "(LWj/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LWj/t;", "a", "()LWj/t;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.core.design.widget.stepperview.a$c, reason: from toString */
    public static final /* data */ class NotAdded extends a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ValueState valueState;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotAdded) && Intrinsics.e(this.valueState, ((NotAdded) other).valueState);
        }

        public int hashCode() {
            return this.valueState.hashCode();
        }

        public String toString() {
            return "NotAdded(valueState=" + this.valueState + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotAdded(ValueState valueState) {
            super(valueState, null);
            Intrinsics.j(valueState, "valueState");
            this.valueState = valueState;
        }

        @Override // com.meijer.mobile.core.design.widget.stepperview.a
        /* renamed from: a, reason: from getter */
        public ValueState getValueState() {
            return this.valueState;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/core/design/widget/stepperview/a$d;", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "LWj/t;", "valueState", "<init>", "(LWj/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LWj/t;", "a", "()LWj/t;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.core.design.widget.stepperview.a$d, reason: from toString */
    public static final /* data */ class ShowQuantity extends a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ValueState valueState;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowQuantity) && Intrinsics.e(this.valueState, ((ShowQuantity) other).valueState);
        }

        public int hashCode() {
            return this.valueState.hashCode();
        }

        public String toString() {
            return "ShowQuantity(valueState=" + this.valueState + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowQuantity(ValueState valueState) {
            super(valueState, null);
            Intrinsics.j(valueState, "valueState");
            this.valueState = valueState;
        }

        @Override // com.meijer.mobile.core.design.widget.stepperview.a
        /* renamed from: a, reason: from getter */
        public ValueState getValueState() {
            return this.valueState;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/core/design/widget/stepperview/a$e;", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "LWj/t;", "valueState", "<init>", "(LWj/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LWj/t;", "a", "()LWj/t;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.core.design.widget.stepperview.a$e, reason: from toString */
    public static final /* data */ class SingleQuantity extends a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ValueState valueState;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SingleQuantity) && Intrinsics.e(this.valueState, ((SingleQuantity) other).valueState);
        }

        public int hashCode() {
            return this.valueState.hashCode();
        }

        public String toString() {
            return "SingleQuantity(valueState=" + this.valueState + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SingleQuantity(ValueState valueState) {
            super(valueState, null);
            Intrinsics.j(valueState, "valueState");
            this.valueState = valueState;
        }

        @Override // com.meijer.mobile.core.design.widget.stepperview.a
        /* renamed from: a, reason: from getter */
        public ValueState getValueState() {
            return this.valueState;
        }
    }

    public /* synthetic */ a(ValueState valueState, DefaultConstructorMarker defaultConstructorMarker) {
        this(valueState);
    }

    private a(ValueState valueState) {
        this.valueState = valueState;
    }

    /* renamed from: a, reason: from getter */
    public ValueState getValueState() {
        return this.valueState;
    }
}
