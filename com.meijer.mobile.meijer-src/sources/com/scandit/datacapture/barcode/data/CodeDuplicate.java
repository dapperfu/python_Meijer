package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.core.time.TimeInterval;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u0012\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/barcode/data/CodeDuplicate;", "", "Lcom/scandit/datacapture/core/time/TimeInterval;", "a", "Lcom/scandit/datacapture/core/time/TimeInterval;", "getReportDataAndSymbologyOnlyOnce", "()Lcom/scandit/datacapture/core/time/TimeInterval;", "getReportDataAndSymbologyOnlyOnce$annotations", "()V", "reportDataAndSymbologyOnlyOnce", "b", "getDefaultDuplicateFilter", "getDefaultDuplicateFilter$annotations", "defaultDuplicateFilter", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class CodeDuplicate {
    public static final CodeDuplicate INSTANCE = new CodeDuplicate();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final TimeInterval reportDataAndSymbologyOnlyOnce;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final TimeInterval defaultDuplicateFilter;

    @JvmStatic
    public static /* synthetic */ void getDefaultDuplicateFilter$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getReportDataAndSymbologyOnlyOnce$annotations() {
    }

    static {
        TimeInterval.Companion companion = TimeInterval.INSTANCE;
        reportDataAndSymbologyOnlyOnce = companion.millis(-1L);
        defaultDuplicateFilter = companion.millis(-2L);
    }

    public static final TimeInterval getDefaultDuplicateFilter() {
        return defaultDuplicateFilter;
    }

    public static final TimeInterval getReportDataAndSymbologyOnlyOnce() {
        return reportDataAndSymbologyOnlyOnce;
    }

    private CodeDuplicate() {
    }
}
