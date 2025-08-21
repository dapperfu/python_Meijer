package com.scandit.datacapture.barcode.spark.ui;

import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanAnalyticsManager;
import com.scandit.datacapture.core.internal.sdk.analytics.NativePropertyBehaviorSubject;
import com.scandit.datacapture.core.internal.sdk.analytics.NativePropertyPushSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/ui/PropertyPushSource;", "Lcom/scandit/datacapture/core/internal/sdk/analytics/NativePropertyPushSource;", "Lcom/scandit/datacapture/barcode/internal/module/spark/data/SparkScanAnalyticsManager;", "analyticsManager", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/spark/data/SparkScanAnalyticsManager;)V", "", "identifier", "Lcom/scandit/datacapture/core/internal/sdk/analytics/NativePropertyBehaviorSubject;", "getBehaviorSubject", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/internal/sdk/analytics/NativePropertyBehaviorSubject;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class PropertyPushSource extends NativePropertyPushSource {

    /* renamed from: a, reason: collision with root package name */
    private final SparkScanAnalyticsManager f124874a;

    public PropertyPushSource(SparkScanAnalyticsManager analyticsManager) {
        Intrinsics.j(analyticsManager, "analyticsManager");
        this.f124874a = analyticsManager;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.analytics.NativePropertyPushSource
    public NativePropertyBehaviorSubject getBehaviorSubject(String identifier) {
        return this.f124874a.a(identifier);
    }
}
