package com.meijer.mobile.meijer.activity.find.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006\""}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/model/ChartData;", "", "type", "Lcom/meijer/mobile/meijer/activity/find/model/ChartDataType;", "value", "", "startAngle", "", "endAngle", "<init>", "(Lcom/meijer/mobile/meijer/activity/find/model/ChartDataType;DII)V", "getType", "()Lcom/meijer/mobile/meijer/activity/find/model/ChartDataType;", "getValue", "()D", "getStartAngle", "()I", "setStartAngle", "(I)V", "getEndAngle", "setEndAngle", "sweepAngle", "getSweepAngle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ChartData {
    public static final int $stable = 8;
    private int endAngle;
    private int startAngle;
    private final int sweepAngle;
    private final ChartDataType type;
    private final double value;

    public ChartData(ChartDataType type, double d10, int i10, int i11) {
        Intrinsics.j(type, "type");
        this.type = type;
        this.value = d10;
        this.startAngle = i10;
        this.endAngle = i11;
        this.sweepAngle = i11 - i10;
    }

    public static /* synthetic */ ChartData copy$default(ChartData chartData, ChartDataType chartDataType, double d10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            chartDataType = chartData.type;
        }
        if ((i12 & 2) != 0) {
            d10 = chartData.value;
        }
        if ((i12 & 4) != 0) {
            i10 = chartData.startAngle;
        }
        if ((i12 & 8) != 0) {
            i11 = chartData.endAngle;
        }
        return chartData.copy(chartDataType, d10, i10, i11);
    }

    /* renamed from: component1, reason: from getter */
    public final ChartDataType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final int getStartAngle() {
        return this.startAngle;
    }

    /* renamed from: component4, reason: from getter */
    public final int getEndAngle() {
        return this.endAngle;
    }

    public final ChartData copy(ChartDataType type, double value, int startAngle, int endAngle) {
        Intrinsics.j(type, "type");
        return new ChartData(type, value, startAngle, endAngle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartData)) {
            return false;
        }
        ChartData chartData = (ChartData) other;
        return this.type == chartData.type && Double.compare(this.value, chartData.value) == 0 && this.startAngle == chartData.startAngle && this.endAngle == chartData.endAngle;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + Double.hashCode(this.value)) * 31) + Integer.hashCode(this.startAngle)) * 31) + Integer.hashCode(this.endAngle);
    }

    public String toString() {
        return "ChartData(type=" + this.type + ", value=" + this.value + ", startAngle=" + this.startAngle + ", endAngle=" + this.endAngle + ')';
    }

    public final int getEndAngle() {
        return this.endAngle;
    }

    public final int getStartAngle() {
        return this.startAngle;
    }

    public final int getSweepAngle() {
        return this.sweepAngle;
    }

    public final ChartDataType getType() {
        return this.type;
    }

    public final double getValue() {
        return this.value;
    }

    public final void setEndAngle(int i10) {
        this.endAngle = i10;
    }

    public final void setStartAngle(int i10) {
        this.startAngle = i10;
    }

    public /* synthetic */ ChartData(ChartDataType chartDataType, double d10, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(chartDataType, d10, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }
}
