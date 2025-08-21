package z;

import C.P;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import java.nio.BufferUnderflowException;

/* renamed from: z.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18390g {
    public static boolean a(InterfaceC18386c interfaceC18386c) {
        return b(false, interfaceC18386c);
    }

    public static boolean b(boolean z10, InterfaceC18386c interfaceC18386c) {
        Boolean bool;
        try {
            bool = (Boolean) interfaceC18386c.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e10) {
            if (androidx.camera.camera2.internal.compat.quirk.b.b(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                P.a("FlashAvailability", String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                P.d("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e10);
            }
            if (z10) {
                throw e10;
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            P.l("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
