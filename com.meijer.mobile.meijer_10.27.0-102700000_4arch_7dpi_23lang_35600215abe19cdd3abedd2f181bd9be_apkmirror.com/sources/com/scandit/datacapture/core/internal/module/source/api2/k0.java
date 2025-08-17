package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import com.scandit.datacapture.core.internal.sdk.source.api2.CameraApi2InfoProvider;
import com.scandit.datacapture.core.logger.CameraInfoProviderEvent;
import com.scandit.datacapture.core.logger.SdcLogger;
import java.util.ArrayList;
import kotlin.ExceptionsKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class k0 implements CameraApi2InfoProvider {

    /* renamed from: a, reason: collision with root package name */
    public final CameraManager f124923a;

    @Override // com.scandit.datacapture.core.internal.sdk.source.api2.CameraApi2InfoProvider
    public final Iterable cameraInfos() throws CameraAccessException {
        String strC0;
        Object[] objArr = null;
        try {
            String[] cameraIdList = this.f124923a.getCameraIdList();
            if (cameraIdList.length == 0) {
                SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new CameraInfoProviderEvent(2, 0, "No exception thrown, 0 cameras available", null, 8, null));
                return CollectionsKt.m();
            }
            ArrayList arrayList = new ArrayList(cameraIdList.length);
            for (String str : cameraIdList) {
                CameraCharacteristics cameraCharacteristics = this.f124923a.getCameraCharacteristics(str);
                Intrinsics.i(cameraCharacteristics, "getCameraCharacteristics(...)");
                arrayList.add(new j0(str, cameraCharacteristics));
            }
            return arrayList;
        } catch (CameraAccessException e10) {
            Intrinsics.j(e10, "e");
            e10.printStackTrace();
            int length = 0 != 0 ? objArr.length : -1;
            String strB = ExceptionsKt.b(e10);
            StringBuilder sb2 = new StringBuilder("Camera id list: ");
            if (0 == 0 || (strC0 = ArraysKt.C0(null, null, null, null, 0, null, null, 63, null)) == null) {
                strC0 = "null list";
            }
            sb2.append(strC0);
            sb2.append(';');
            SdcLogger.INSTANCE.get().onEvent$scandit_capture_core(new CameraInfoProviderEvent(2, length, strB, sb2.toString()));
            return CollectionsKt.m();
        }
    }

    public k0(CameraManager cameraManager) {
        Intrinsics.j(cameraManager, "cameraManager");
        this.f124923a = cameraManager;
    }
}
