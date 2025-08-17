package com.scandit.datacapture.core.internal.sdk.source.api2;

import android.util.Rational;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/source/api2/CameraApi2Info;", "", "characteristics", "Lcom/scandit/datacapture/core/internal/sdk/source/api2/CameraCharacteristicsWrapper;", "getCharacteristics", "()Lcom/scandit/datacapture/core/internal/sdk/source/api2/CameraCharacteristicsWrapper;", "compensationStep", "Landroid/util/Rational;", "getCompensationStep", "()Landroid/util/Rational;", "facing", "", "getFacing", "()I", "focusCalibration", "getFocusCalibration", PreferencesHelper.PREF_ID, "", "getId", "()Ljava/lang/String;", "isTimestampRealtime", "", "()Z", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CameraApi2Info {
    CameraCharacteristicsWrapper getCharacteristics();

    Rational getCompensationStep();

    int getFacing();

    int getFocusCalibration();

    String getId();

    boolean isTimestampRealtime();
}
