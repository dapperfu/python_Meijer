package com.scandit.datacapture.barcode.spark.serialization;

import com.scandit.datacapture.barcode.data.CapturePreset;
import com.scandit.datacapture.barcode.spark.capture.SparkScanSettings;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f123919a = new a();

    public a() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Set set = (Set) obj;
        return set != null ? new SparkScanSettings((Set<? extends CapturePreset>) set) : new SparkScanSettings();
    }
}
